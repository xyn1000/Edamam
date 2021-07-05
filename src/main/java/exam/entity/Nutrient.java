package exam.entity;


/**
 * The type Nutrient contains nutrient information
 */
public class Nutrient {
    private String name; //ENERC_KCAL or FAT
    private String label;
    private double quantity;
    private String unit;

    public Nutrient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
