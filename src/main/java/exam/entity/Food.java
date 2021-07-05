package exam.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Food contains food information
 */
public class Food {
    /**
     * The Food id.
     */
    private String foodId;
    /**
     * The Uri.
     */
    private String uri;
    /**
     * The Label.
     */
    private String label;
    /**
     * The Nutrients.
     */
    private Map<String,Double> nutrients;
    /**
     * The Category.
     */
    private String category;
    /**
     * The Category label.
     */
    private String categoryLabel;
    /**
     * The Image.
     */
    private String image;
    /**
     * The Brand.
     */
    private String brand;

    /**
     * Instantiates a new Food.
     */
    public Food() {
        this.nutrients=new HashMap<>();
    }

    /**
     * Gets food id.
     *
     * @return the food id
     */
    public String getFoodId() {
        return foodId;
    }

    /**
     * Sets food id.
     *
     * @param foodId the food id
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    /**
     * Gets uri.
     *
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets uri.
     *
     * @param uri the uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Gets label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets label.
     *
     * @param label the label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Gets nutrients.
     *
     * @return the nutrients
     */
    public Map<String, Double> getNutrients() {
        return nutrients;
    }

    /**
     * Sets nutrients.
     *
     * @param nutrients the nutrients
     */
    public void setNutrients(Map<String, Double> nutrients) {
        this.nutrients = nutrients;
    }

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets category label.
     *
     * @return the category label
     */
    public String getCategoryLabel() {
        return categoryLabel;
    }

    /**
     * Sets category label.
     *
     * @param categoryLabel the category label
     */
    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
