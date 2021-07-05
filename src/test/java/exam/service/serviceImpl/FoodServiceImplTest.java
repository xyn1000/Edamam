package exam.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import exam.Constants;
import exam.entity.HintsWrapper;
import exam.entity.Ingredient;
import exam.entity.NutrientWrapper;
import exam.service.FoodService;
import exam.util.JSONUtil;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FoodServiceImplTest {
    private FoodService fs;

    @Before
    public void setUp() throws Exception {
        fs = new FoodServiceImpl();
    }

    @Test
    public void search() throws IOException {
        HintsWrapper hw = fs.search("pasta", Constants.app_id,Constants.app_key);
        assertEquals("pasta",hw.getText());
        assertTrue(16.8 == hw.getHintsList().get(0).getMeasures().get(0).getWeight());
        assertEquals(22,hw.getHintsList().size());
    }

    @Test
    public void nutritionRequest() throws IOException {
        Ingredient i = new Ingredient();
        i.setQuantity((double)1);
        i.setFoodId("food_bnbh4ycaqj9as0a9z7h9xb2wmgat");
        i.setMeasureURI("http://www.edamam.com/ontologies/edamam.owl#Measure_unit");
        JSONObject iJson = JSONUtil.getIngredientJSON(i);
        NutrientWrapper nw = fs.nutritionRequest(Constants.app_id,Constants.app_key,iJson);
        assertNull(nw.getYield());
        assertEquals(94, nw.getCalories(), 0.0);
        assertNull(nw.getGlycemicIndex());
        assertEquals(182.0, nw.getTotalWeight(), 0.0);
        assertEquals(0,nw.getDietLabels().size());
        assertEquals(28,nw.getHealthLabels().size());
        assertEquals(1,nw.getCautions().size());
        assertEquals("SULFITES",nw.getCautions().get(0));
        assertEquals(2,nw.getTotalNutrients().size());
        assertEquals("Energy",nw.getTotalNutrients().get(0).getLabel());
        assertEquals(94.64,nw.getTotalNutrients().get(0).getQuantity(),0.0);
        assertEquals(2,nw.getTotalDaily().size());
        assertEquals("Apples, raw, with skin",nw.getFood());
        assertNotNull(nw.getIngredient());
    }
}