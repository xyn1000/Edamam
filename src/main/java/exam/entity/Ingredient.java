package exam.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * The type Ingredient contains the information which will be sent to API for nutrition data.
 */
public class Ingredient {
    @JSONField(name = "quantity")
    private Double quantity;

    @JSONField(name = "foodId")
    private String foodId;

    @JSONField(name = "measureURI")
    private String measureURI;

    public Ingredient() {
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getMeasureURI() {
        return measureURI;
    }

    public void setMeasureURI(String measureURI) {
        this.measureURI = measureURI;
    }
}
