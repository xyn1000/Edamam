package exam.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Hints wrapper contains the list of FoodMeasuresWrapper returned from API
 */
public class HintsWrapper {
    /**
     * The Text user types in the search box.
     */
    private String text;
    /**
     * The FoodMeasuresWrapper list.
     */
    private List<FoodMeasuresWrapper> hintsList;
    /**
     * The Json string returned from the api
     */
    private String jsonString;

    /**
     * Instantiates a new Hints wrapper.
     */
    public HintsWrapper() {
        this.hintsList = new ArrayList<>();
    }

    /**
     * Gets json string.
     *
     * @return the json string
     */
    public String getJsonString() {
        return jsonString;
    }

    /**
     * Sets json string.
     *
     * @param jsonString the json string
     */
    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }


    /**
     * Gets hints list.
     *
     * @return the hints list
     */
    public List<FoodMeasuresWrapper> getHintsList() {
        return hintsList;
    }

    /**
     * Sets hints list.
     *
     * @param hintsList the hints list
     */
    public void setHintsList(List<FoodMeasuresWrapper> hintsList) {
        this.hintsList = hintsList;
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
        this.text = text;
    }
}
