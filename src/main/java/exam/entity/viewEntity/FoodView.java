package exam.entity.viewEntity;

import exam.entity.Food;
import javafx.beans.property.SimpleStringProperty;

/**
 * The view entity contains food information and will be used in the controller
 */
public class FoodView {
    private SimpleStringProperty foodId;
    private SimpleStringProperty uri;
    private SimpleStringProperty label;
    private SimpleStringProperty category;
    private SimpleStringProperty categoryLabel;
    private SimpleStringProperty image;
    private SimpleStringProperty brand;
    private SimpleStringProperty nutrients;

    public FoodView(Food food) {
        this.foodId = new SimpleStringProperty(food.getFoodId());
        this.uri = new SimpleStringProperty(food.getUri());
        this.label = new SimpleStringProperty(food.getLabel());
        this.category = new SimpleStringProperty(food.getCategory());
        this.categoryLabel = new SimpleStringProperty(food.getCategoryLabel());
        this.image = new SimpleStringProperty(food.getImage());
        this.brand = new SimpleStringProperty(food.getBrand());

        StringBuilder sb = new StringBuilder();
        if(food.getNutrients().size()!=0){
            for (String key : food.getNutrients().keySet()) {
                Double value = food.getNutrients().get(key);
                sb.append(key).append(": ").append(value).append("\n");
            }
        }
        this.nutrients = new SimpleStringProperty(sb.toString());
    }



    public String getFoodId() {
        return foodId.get();
    }

    public SimpleStringProperty foodIdProperty() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId.set(foodId);
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

    public String getLabel() {
        return label.get();
    }

    public SimpleStringProperty labelProperty() {
        return label;
    }

    public void setLabel(String label) {
        this.label.set(label);
    }

    public String getCategory() {
        return category.get();
    }

    public SimpleStringProperty categoryProperty() {
        return category;
    }

    public void setCategory(String category) {
        this.category.set(category);
    }

    public String getCategoryLabel() {
        return categoryLabel.get();
    }

    public SimpleStringProperty categoryLabelProperty() {
        return categoryLabel;
    }

    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel.set(categoryLabel);
    }

    public String getImage() {
        return image.get();
    }

    public SimpleStringProperty imageProperty() {
        return image;
    }

    public void setImage(String image) {
        this.image.set(image);
    }

    public String getBrand() {
        return brand.get();
    }

    public SimpleStringProperty brandProperty() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand.set(brand);
    }

    public String getNutrients() {
        return nutrients.get();
    }

    public SimpleStringProperty nutrientsProperty() {
        return nutrients;
    }

    public void setNutrients(String nutrients) {
        this.nutrients.set(nutrients);
    }
}
