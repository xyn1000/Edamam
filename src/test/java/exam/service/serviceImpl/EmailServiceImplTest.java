package exam.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import exam.Constants;
import exam.entity.Ingredient;
import exam.entity.Nutrient;
import exam.entity.NutrientWrapper;
import exam.service.EmailService;
import exam.util.JSONUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailServiceImplTest {

    @Test
    public void emailRequest() {
        EmailService es = new EmailServiceImpl();
        String tmp =  "{\n    \"personalizations\": [\n      {\n        \"to\": [\n          {\n            \"email\": \""+Constants.receiverEmail+"\",\n            \"name\": \"Tester\"\n          }\n        ]\n      }\n    ],\n    \"from\": {\n      \"email\": \""+Constants.senderEmail+"\",\n      \"name\": \"Sharon\"\n    },\n\n    \"subject\": \"Test\",\n    \"content\": [\n      {\n        \"type\": \"text/html\",\n        \"value\": \"<p>Hello from Twilio SendGrid!</p><p>Sending with the email service trusted by developers and marketers for <strong>time-savings</strong>, <strong>scalability</strong>, and <strong>delivery expertise</strong>.</p><p>%open-track%</p>\"\n      }\n    ]\n}";
        JSONObject obj = JSONObject.parseObject(tmp);
        assertTrue(es.emailRequest(Constants.sendGridToken,obj));
    }

    @Test
    public void emailFailureRequest() {
        EmailService es = new EmailServiceImpl();
        String tmp =  "{\n    \"personalizations\": [\n      {\n        \"to\": [\n          {\n         \"email\": \""+Constants.receiverEmail+"\",\n              \"name\": \"Tester\"\n          }\n        ]\n      }\n    ],\n    \"from\": {\n      \"email\": \"fakeSender@uni.sydney.edu.au\",\n      \"name\": \"Sharon\"\n    },\n\n    \"subject\": \"Test\",\n    \"content\": [\n      {\n        \"type\": \"text/html\",\n        \"value\": \"<p>Hello from Twilio SendGrid!</p><p>Sending with the email service trusted by developers and marketers for <strong>time-savings</strong>, <strong>scalability</strong>, and <strong>delivery expertise</strong>.</p><p>%open-track%</p>\"\n      }\n    ]\n}";
        JSONObject obj = JSONObject.parseObject(tmp);
        assertFalse(es.emailRequest(Constants.sendGridToken,obj));
    }

    @Test
    public void emailJSONUTilTest(){
        EmailService es = new EmailServiceImpl();
        NutrientWrapper test=new NutrientWrapper();
        test.setFood("food");
        test.setUri("uri.com");
        test.setCalories((double)100);
        test.setGlycemicIndex((double)5);
        test.getDietLabels().add("dietLabel1");
        test.getHealthLabels().add("healthLabel1");
        test.getHealthLabels().add("healthLabel2");
        Nutrient n =new Nutrient();
        n.setName("nutrient1");
        n.setLabel("nutrientLabel");
        n.setUnit("unit1");
        n.setQuantity(2.0);
        test.getTotalNutrients().add(n);
        test.getTotalDaily().add(n);
        Ingredient i = new Ingredient();
        i.setMeasureURI("MeasureURI");
        i.setFoodId("foodid");
        test.setIngredient(i);
        JSONObject js = JSONUtil.getEmailJSON(test);
        assertTrue(es.emailRequest(Constants.sendGridToken,js));
    }
}