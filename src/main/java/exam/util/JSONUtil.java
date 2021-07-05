package exam.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import exam.Constants;
import exam.entity.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Json util helps to transfer JSONObject and Object
 */
public class JSONUtil {

    /**
     * Json to Food entity.
     *
     * @param str JSON string
     * @return the food
     */
    public static Food jsonToFood(String str){
        //parsed food json object to Food.class
        Food food = new Food();
        JSONObject foodObj = JSONObject.parseObject(str);;
        String foodId = foodObj.getString("foodId");
        String uri = foodObj.getString("uri");
        String label = foodObj.getString("label");
        JSONObject nutrients = foodObj.getJSONObject("nutrients");
        String category = foodObj.getString("category");
        String categoryLabel = foodObj.getString("categoryLabel");
        String image = foodObj.getString("image");
        String brand = foodObj.getString("brand");

        food.setFoodId(foodId);
        food.setBrand(brand);
        food.setUri(uri);
        food.setLabel(label);
        food.setCategory(category);
        food.setCategoryLabel(categoryLabel);
        food.setImage(image);

        Double enerc_kcal = nutrients.getDouble("ENERC_KCAL");
        Double procnt = nutrients.getDouble("PROCNT");
        Double fat = nutrients.getDouble("FAT");
        Double chocdf = nutrients.getDouble("CHOCDF");
        Double fibtg = nutrients.getDouble("FIBTG");

        food.getNutrients().put("ENERC_KCAL",enerc_kcal);
        food.getNutrients().put("PROCNT",procnt);
        food.getNutrients().put("FAR",fat);
        food.getNutrients().put("CHOCDF",chocdf);
        food.getNutrients().put("FIBTG",fibtg);

        return food;
    }

    /**
     * Json hints to foods hints wrapper.
     *
     * @param hw  HintsWrapper entity
     * @param str JSON str
     * @return HintsWrapper entity
     */
    public static HintsWrapper jsonHintsToFoods(HintsWrapper hw, String str){
        JSONObject jsonTmp = JSONObject.parseObject(str);
        hw.setText(jsonTmp.getString("text"));
        JSONArray hintsArr = jsonTmp.getJSONArray("hints");

        for (int i=0;i<hintsArr.size();i++){
            FoodMeasuresWrapper tmp = new FoodMeasuresWrapper();
            JSONObject obj = hintsArr.getJSONObject(i);

            JSONObject jsonFood = obj.getJSONObject("food");
            Food food = JSONUtil.jsonToFood(jsonFood.toJSONString());
            tmp.setFood(food);

            JSONArray jsonMeasures = obj.getJSONArray("measures");
            for (int j=0;j<jsonMeasures.size();j++){
                String uri = jsonMeasures.getJSONObject(j).getString("uri");
                String label = jsonMeasures.getJSONObject(j).getString("label");
                Double weight = jsonMeasures.getJSONObject(j).getDouble("weight");
                Measure m = new Measure();
                m.setLabel(label);
                m.setUri(uri);
                m.setWeight(weight);
                tmp.getMeasures().add(m);
            }
            hw.getHintsList().add(tmp);
        }
        return hw;
    }

    /**
     * Get ingredient json object.
     *
     * @param ingredient the ingredient object
     * @return the json object
     */
    public static JSONObject getIngredientJSON(Ingredient ingredient){
        JSONObject wrapper = new JSONObject();
        String jsonOutput= JSON.toJSONString(ingredient);
        JSONObject rs = JSON.parseObject(jsonOutput);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(rs);
        wrapper.put("ingredients",jsonArray);
        return wrapper;
    }

    /**
     * Json to nutrient wrapper nutrient wrapper.
     *
     * @param nw  NutrientWrapper object
     * @param str json str
     * @return the nutrient wrapper
     */
    public static NutrientWrapper jsonToNutrientWrapper(NutrientWrapper nw,String str) {
        JSONObject jsonTmp = JSONObject.parseObject(str);
        nw.setUri(jsonTmp.getString("uri"));
        nw.setYield(jsonTmp.getDouble("yield"));
        nw.setCalories(jsonTmp.getDouble("calories"));
        nw.setGlycemicIndex(jsonTmp.getDouble("glycemicIndex"));
        nw.setTotalWeight(jsonTmp.getDouble("totalWeight"));
        JSONArray dietJson = jsonTmp.getJSONArray("dietLabels");
        for (int i=0;i<dietJson.size();i++){
            nw.getDietLabels().add(dietJson.getString(i));
        }
        JSONArray healthJson = jsonTmp.getJSONArray("healthLabels");
        for (int i=0;i<healthJson.size();i++){
            nw.getHealthLabels().add(healthJson.getString(i));
        }
        JSONArray cautionsJson = jsonTmp.getJSONArray("cautions");
        for (int i=0;i<cautionsJson.size();i++){
            nw.getCautions().add(cautionsJson.getString(i));
        }

        JSONObject nutrientsJSON = jsonTmp.getJSONObject("totalNutrients");

        JSONObject tmp1 = nutrientsJSON.getJSONObject("ENERC_KCAL");
        Nutrient nutrientKCAL = new Nutrient();
        nutrientKCAL.setName("ENERC_KCAL");
        nutrientKCAL.setLabel(tmp1.getString("label"));
        nutrientKCAL.setQuantity(tmp1.getDouble("quantity"));
        nutrientKCAL.setUnit(tmp1.getString("unit"));
        nw.getTotalNutrients().add(nutrientKCAL);

        JSONObject tmp2 = nutrientsJSON.getJSONObject("FAT");
        Nutrient nutrientFAT = new Nutrient();
        nutrientFAT.setName("FAT");
        nutrientFAT.setLabel(tmp2.getString("label"));
        nutrientFAT.setQuantity(tmp2.getDouble("quantity"));
        nutrientFAT.setUnit(tmp2.getString("unit"));
        nw.getTotalNutrients().add(nutrientFAT);

        nutrientsJSON = jsonTmp.getJSONObject("totalDaily");
        JSONObject tmp3 = nutrientsJSON.getJSONObject("ENERC_KCAL");
        Nutrient nutrientKCAL2 = new Nutrient();
        nutrientKCAL2.setName("ENERC_KCAL");
        nutrientKCAL2.setLabel(tmp3.getString("label"));
        nutrientKCAL2.setQuantity(tmp3.getDouble("quantity"));
        nutrientKCAL2.setUnit(tmp3.getString("unit"));
        nw.getTotalDaily().add(nutrientKCAL2);

        JSONObject tmp4 = nutrientsJSON.getJSONObject("FAT");
        Nutrient nutrientFAT2 = new Nutrient();
        nutrientFAT2.setName("FAT");
        nutrientFAT2.setLabel(tmp4.getString("label"));
        nutrientFAT2.setQuantity(tmp4.getDouble("quantity"));
        nutrientFAT2.setUnit(tmp4.getString("unit"));
        nw.getTotalDaily().add(nutrientFAT2);

        JSONArray parsed = jsonTmp.getJSONArray("ingredients").getJSONObject(0).getJSONArray("parsed");
        JSONObject f = parsed.getJSONObject(0);
        Ingredient ingredient = new Ingredient();
        ingredient.setFoodId(f.getString("foodId"));
        ingredient.setMeasureURI(f.getString("measureURI"));
        ingredient.setQuantity(f.getDouble("quantity"));
        nw.setIngredient(ingredient);
        nw.setFood(f.getString("food"));
        return nw;
    }

    /**
     * Get email content json object.
     *
     * @param nw the NutrientWrapper
     * @return the json object
     */
    public static JSONObject getEmailJSON(NutrientWrapper nw){
        JSONObject result = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append("{\n" +
                "    \"personalizations\": [\n" +
                "      {\n" +
                "        \"to\": [\n" +
                "          {\n" +
                "            \"email\":  \"");
                sb.append(Constants.receiverEmail);
                sb.append("\",\n" +
                        "            \"name\": \"");
                sb.append(Constants.receiverName);


                sb.append("\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ],\n" +
                "    \"from\": {\n" +
                "      \"email\": \"");
        sb.append(Constants.senderEmail);
        sb.append("\",\n\"name\": \"");
        sb.append(Constants.senderName);
        sb.append("\"\n" +
                "    },\n" +
                "\n" +
                "    \"subject\": \"");
        if (CacheUtil.getMaxCalorie()!=null && nw.getCalories()!=null && CacheUtil.getMaxCalorie()<nw.getCalories()){
            sb.append("*");
        }
        sb.append("Nutrition\",\n" +
                "    \"content\": [\n" +
                "      {\n" +
                "        \"type\": \"text/html\",\n" +
                "        \"value\": \"");
        sb.append(JSONUtil.getEmailValue(nw));
        sb.append("\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }");

        result = JSONObject.parseObject(sb.toString());
        return result;
    }

    /**
     * Get email value string.
     *
     * @param nw the NutrientWrapper
     * @return the json string
     */
    public static String getEmailValue(NutrientWrapper nw){
        StringBuilder str = new StringBuilder();
        if (CacheUtil.getMaxCalorie()!=null && nw.getCalories()!=null && CacheUtil.getMaxCalorie()<nw.getCalories()){
            str.append("*").append("<br>");
        }
        str.append("<p>Hello, ").append(Constants.receiverName).append("!<p>");

        str.append("Food: ").append(nw.getFood()).append("<br>");
        str.append("Food ID: ").append(nw.getIngredient().getFoodId()).append("<br>");
        str.append("Measure URI: ").append(nw.getIngredient().getMeasureURI()).append("<br>");


        str.append("Uri: ").append(nw.getUri()).append("<br>");
        if (nw.getYield()!=null){
            str.append("Yield: ").append(nw.getYield()).append("<br>");
        }
        if (nw.getCalories()!=null){
            str.append("Calories: ").append(nw.getCalories()).append("<br>");
        }
        if (nw.getGlycemicIndex()!=null){
            str.append("Glycemic Index: ").append(nw.getGlycemicIndex()).append("<br>");
        }
        if (nw.getTotalWeight()!=null){
            str.append("Total Weight: ").append(nw.getTotalWeight()).append("<br>");
        }

        str.append("<br>Diet Labels: <br>");

        for (int i=0;i<nw.getDietLabels().size();i++){
            str.append(nw.getDietLabels().get(i)).append("<br>");
        }

        str.append("<br>Health Labels: <br>");

        for (int i=0;i<nw.getHealthLabels().size();i++){
            str.append(nw.getHealthLabels().get(i)).append("<br>");
        }

        str.append("<br>Cautions: <br>");

        for (int i=0;i<nw.getCautions().size();i++){
            str.append(nw.getCautions().get(i)).append("<br>");
        }

        str.append("<br>Total Nutrients: <br>");
        for (int i=0;i<nw.getTotalNutrients().size();i++){
            str.append(nw.getTotalNutrients().get(i).getName()).append(":<br>");
            str.append("label: ").append(nw.getTotalNutrients().get(i).getLabel()).append("<br>");
            str.append("quantity: ").append(nw.getTotalNutrients().get(i).getQuantity()).append("<br>");
            str.append("unit: ").append(nw.getTotalNutrients().get(i).getUnit()).append("<br>");
            str.append("<br>");
        }

        str.append("<br>Total Daily Nutrients: <br>");
        for (int i=0;i<nw.getTotalDaily().size();i++){
            str.append(nw.getTotalDaily().get(i).getName()).append(":<br>");
            str.append("label: ").append(nw.getTotalDaily().get(i).getLabel()).append("<br>");
            str.append("quantity: ").append(nw.getTotalDaily().get(i).getQuantity()).append("<br>");
            str.append("unit: ").append(nw.getTotalDaily().get(i).getUnit()).append("<br>");
            str.append("<br>");
        }
        return str.toString();
    }
}
