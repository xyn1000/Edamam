package exam.entity;

import java.util.Map;

/**
 * The type Measure contains measure info of food
 */
public class Measure {
    private String label;
    private String uri;
    private Double weight;
//    private Map<Qualifier,Double> qualifiers;


    public Measure() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
