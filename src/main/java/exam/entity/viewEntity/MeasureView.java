package exam.entity.viewEntity;

import exam.entity.Measure;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * The view entity contains measure information and will be used in the controller
 */
public class MeasureView {
    private SimpleStringProperty uri;
    private SimpleStringProperty label;
    private SimpleDoubleProperty weight;

    public  MeasureView(Measure measure){
        this.uri = new SimpleStringProperty(measure.getUri());
        this.label = new SimpleStringProperty(measure.getLabel());
        this.weight = new SimpleDoubleProperty(measure.getWeight());
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

    public double getWeight() {
        return weight.get();
    }

    public SimpleDoubleProperty weightProperty() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight.set(weight);
    }
}
