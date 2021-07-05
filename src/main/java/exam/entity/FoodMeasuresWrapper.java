package exam.entity;


import java.util.ArrayList;
import java.util.List;

/**
 * The type FoodMeasuresWrapper contains food and all the measures it have.
 */
public class FoodMeasuresWrapper {
    private Food food;
    private List<Measure> measures;

    public FoodMeasuresWrapper() {
        this.measures = new ArrayList<>();
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }

}
