package exam.entity.viewEntity;

import exam.entity.NutrientWrapper;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * The view entity contains Nutrient information and will be used in the controller
 */
public class NutrientWrapperView {
    private SimpleStringProperty food;
    private SimpleStringProperty uri;
    private SimpleDoubleProperty yield;
    private SimpleDoubleProperty calories;
    private SimpleDoubleProperty glycemicIndex;
    private SimpleDoubleProperty totalWeight;

    private SimpleStringProperty dietLabels;
    private SimpleStringProperty healthLabels;
    private SimpleStringProperty cautions;

    private SimpleStringProperty totalNutrients;
    private SimpleStringProperty totalDaily;


    public NutrientWrapperView(NutrientWrapper nutrient){
        this.uri = new SimpleStringProperty(nutrient.getUri());

        if (nutrient.getYield() !=null){
            this.yield = new SimpleDoubleProperty(nutrient.getYield());
        } else {
            this.yield = new SimpleDoubleProperty();
        }

        if (nutrient.getCalories() !=null){
            this.calories = new SimpleDoubleProperty(nutrient.getCalories());
        } else {
            this.calories = new SimpleDoubleProperty();
        }

        if (nutrient.getGlycemicIndex() !=null){
            this.glycemicIndex = new SimpleDoubleProperty(nutrient.getGlycemicIndex());
        } else {
            this.glycemicIndex = new SimpleDoubleProperty();
        }

        if (nutrient.getTotalWeight() !=null){
            this.totalWeight = new SimpleDoubleProperty(nutrient.getTotalWeight());
        } else {
            this.totalWeight = new SimpleDoubleProperty();
        }

        this.food = new SimpleStringProperty(nutrient.getFood());

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<nutrient.getDietLabels().size();i++){
            sb.append(nutrient.getDietLabels().get(i)).append("\n");
        }
        this.dietLabels = new SimpleStringProperty(sb.toString());

        sb = new StringBuilder();
        for (int i=0;i<nutrient.getHealthLabels().size();i++){
            sb.append(nutrient.getHealthLabels().get(i)).append("\n");
        }
        this.healthLabels = new SimpleStringProperty(sb.toString());

        sb = new StringBuilder();
        for (int i=0;i<nutrient.getCautions().size();i++){
            sb.append(nutrient.getCautions().get(i)).append("\n");
        }
        this.cautions = new SimpleStringProperty(sb.toString());

        sb = new StringBuilder();
        for (int i=0;i<nutrient.getTotalNutrients().size();i++){
            sb.append(nutrient.getTotalNutrients().get(i).getName()).append(":\n\t");
            sb.append("label: ").append(nutrient.getTotalNutrients().get(i).getLabel()).append("\n\t");
            sb.append("quantity: ").append(nutrient.getTotalNutrients().get(i).getQuantity()).append("\n\t");
            sb.append("unit: ").append(nutrient.getTotalNutrients().get(i).getUnit()).append("\n");
        }
        this.totalNutrients = new SimpleStringProperty(sb.toString());

        sb = new StringBuilder();
        for (int i=0;i<nutrient.getTotalDaily().size();i++){
            sb.append(nutrient.getTotalDaily().get(i).getName()).append(":\n\t");
            sb.append("label: ").append(nutrient.getTotalDaily().get(i).getLabel()).append("\n\t");
            sb.append("quantity: ").append(nutrient.getTotalDaily().get(i).getQuantity()).append("\n\t");
            sb.append("unit: ").append(nutrient.getTotalDaily().get(i).getUnit()).append("\n");
        }
        this.totalDaily = new SimpleStringProperty(sb.toString());
    }

    public String getFood() {
        return food.get();
    }

    public SimpleStringProperty foodProperty() {
        return food;
    }

    public void setFood(String food) {
        this.food.set(food);
    }

    public String getUri() {
        return uri.get();
    }

    public SimpleStringProperty uriProperty() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri.set(uri);
    }

    public double getYield() {
        return yield.get();
    }

    public SimpleDoubleProperty yieldProperty() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield.set(yield);
    }

    public double getCalories() {
        return calories.get();
    }

    public SimpleDoubleProperty caloriesProperty() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories.set(calories);
    }

    public double getGlycemicIndex() {
        return glycemicIndex.get();
    }

    public SimpleDoubleProperty glycemicIndexProperty() {
        return glycemicIndex;
    }

    public void setGlycemicIndex(double glycemicIndex) {
        this.glycemicIndex.set(glycemicIndex);
    }

    public double getTotalWeight() {
        return totalWeight.get();
    }

    public SimpleDoubleProperty totalWeightProperty() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight.set(totalWeight);
    }

    public String getDietLabels() {
        return dietLabels.get();
    }

    public SimpleStringProperty dietLabelsProperty() {
        return dietLabels;
    }

    public void setDietLabels(String dietLabels) {
        this.dietLabels.set(dietLabels);
    }

    public String getHealthLabels() {
        return healthLabels.get();
    }

    public SimpleStringProperty healthLabelsProperty() {
        return healthLabels;
    }

    public void setHealthLabels(String healthLabels) {
        this.healthLabels.set(healthLabels);
    }

    public String getCautions() {
        return cautions.get();
    }

    public SimpleStringProperty cautionsProperty() {
        return cautions;
    }

    public void setCautions(String cautions) {
        this.cautions.set(cautions);
    }

    public String getTotalNutrients() {
        return totalNutrients.get();
    }

    public SimpleStringProperty totalNutrientsProperty() {
        return totalNutrients;
    }

    public void setTotalNutrients(String totalNutrients) {
        this.totalNutrients.set(totalNutrients);
    }

    public String getTotalDaily() {
        return totalDaily.get();
    }

    public SimpleStringProperty totalDailyProperty() {
        return totalDaily;
    }

    public void setTotalDaily(String totalDaily) {
        this.totalDaily.set(totalDaily);
    }
}


