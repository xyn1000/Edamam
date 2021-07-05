package exam.entity;

import java.util.ArrayList;
import java.util.List;


/**
 * NutrientWrapper contains nutrition information returned from API
 */
public class NutrientWrapper {
    private String uri;
    private Double yield;
    private Double calories;
    private Double glycemicIndex;
    private Double totalWeight;
    private List<String> dietLabels;
    private List<String> healthLabels;
    private List<String> cautions;
    private List<Nutrient> totalNutrients;
    private List<Nutrient> totalDaily;

    //ingredients
    private Ingredient ingredient;
    private String food;
    private String jsonString;

    public NutrientWrapper() {
        this.dietLabels = new ArrayList<>();
        this.healthLabels = new ArrayList<>();
        this.cautions = new ArrayList<>();
        this.totalNutrients=new ArrayList<>();
        this.totalDaily=new ArrayList<>();
        this.yield=null;
        this.calories=null;
        this.glycemicIndex=null;
        this.totalWeight=null;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Double getYield() {
        return yield;
    }

    public void setYield(Double yield) {
        this.yield = yield;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getGlycemicIndex() {
        return glycemicIndex;
    }

    public void setGlycemicIndex(Double glycemicIndex) {
        this.glycemicIndex = glycemicIndex;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public List<String> getDietLabels() {
        return dietLabels;
    }

    public void setDietLabels(List<String> dietLabels) {
        this.dietLabels = dietLabels;
    }

    public List<String> getHealthLabels() {
        return healthLabels;
    }

    public void setHealthLabels(List<String> healthLabels) {
        this.healthLabels = healthLabels;
    }

    public List<String> getCautions() {
        return cautions;
    }

    public void setCautions(List<String> cautions) {
        this.cautions = cautions;
    }

    public List<Nutrient> getTotalNutrients() {
        return totalNutrients;
    }

    public void setTotalNutrients(List<Nutrient> totalNutrients) {
        this.totalNutrients = totalNutrients;
    }

    public List<Nutrient> getTotalDaily() {
        return totalDaily;
    }

    public void setTotalDaily(List<Nutrient> totalDaily) {
        this.totalDaily = totalDaily;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }
}
