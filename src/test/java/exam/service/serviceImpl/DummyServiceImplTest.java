package exam.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import exam.Constants;
import exam.entity.HintsWrapper;
import exam.entity.Ingredient;
import exam.entity.NutrientWrapper;
import exam.service.EmailService;
import exam.service.FoodService;
import exam.util.JSONUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class DummyServiceImplTest {

    @Test
    public void emailRequest() {
        EmailService es = new DummyServiceImpl();
        String tmp =  "{\n    \"personalizations\": [\n      {\n        \"to\": [\n          {\n            \"email\": \""+ Constants.receiverEmail+"\",\n            \"name\": \"Tester\"\n          }\n        ]\n      }\n    ],\n    \"from\": {\n      \"email\": \""+Constants.senderEmail+"\",\n      \"name\": \"Sharon\"\n    },\n\n    \"subject\": \"Test\",\n    \"content\": [\n      {\n        \"type\": \"text/html\",\n        \"value\": \"<p>Hello from Twilio SendGrid!</p><p>Sending with the email service trusted by developers and marketers for <strong>time-savings</strong>, <strong>scalability</strong>, and <strong>delivery expertise</strong>.</p><p>%open-track%</p>\"\n      }\n    ]\n}";
        JSONObject obj = JSONObject.parseObject(tmp);
        assertTrue(es.emailRequest(Constants.sendGridToken,obj));
    }

    @Test
    public void search() throws IOException {
        FoodService fs = new DummyServiceImpl();
        HintsWrapper hw = fs.search("apple", Constants.app_id,Constants.app_key);
        assertEquals("apple",hw.getText());
    }

    @Test
    public void nutritionRequest() throws IOException {
        FoodService fs = new DummyServiceImpl();
        Ingredient i = new Ingredient();
        i.setQuantity((double)1);
        i.setFoodId("food_bnbh4ycaqj9as0a9z7h9xb2wmgat");
        i.setMeasureURI("http://www.edamam.com/ontologies/edamam.owl#Measure_unit");
        JSONObject iJson = JSONUtil.getIngredientJSON(i);
        NutrientWrapper nw = fs.nutritionRequest(Constants.app_id,Constants.app_key,iJson);
        assertNotNull(nw);
    }
}