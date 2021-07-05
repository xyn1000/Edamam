package exam.util;

import exam.entity.FoodMeasuresWrapper;
import exam.entity.HintsWrapper;

/**
 * The type Cache util stores some static variables.
 */
public class CacheUtil {
    /**
     * The constant inputMode stores mode of the input api (online or offline).
     */
    private static String inputMode;
    /**
     * The constant outputMode stores mode of the output api (online or offline).
     */
    private static String outputMode;
    /**
     * The constant currentHintsWrapper is the latest HintWrapper return from API or database.
     */
    private static HintsWrapper currentHintsWrapper = new HintsWrapper();
    /**
     * The constant currentFoodMeasures is the Food and Measures that user wants to see.
     */
    private static FoodMeasuresWrapper currentFoodMeasures = new FoodMeasuresWrapper();

    /**
     * The constant maxCalorie is the maximum calorie set by the user.
     */
    private static Integer maxCalorie = null;

    /**
     * Get current maximum calorie.
     *
     * @return the maximum calorie
     */
    public static Integer getMaxCalorie() {
        return maxCalorie;
    }

    /**
     * Set maxCalorie.
     *
     * @param maxCalorie the maximum calorie
     */
    public static void setMaxCalorie(Integer maxCalorie) {
        CacheUtil.maxCalorie = maxCalorie;
    }

    /**
     * Set current hints wrapper.
     *
     * @param hw the hw
     */
    public static void setCurrentHintsWrapper(HintsWrapper hw){
        currentHintsWrapper = hw;
    }

    /**
     * Get current hints wrapper hints wrapper.
     *
     * @return the hints wrapper
     */
    public static HintsWrapper getCurrentHintsWrapper(){
        return CacheUtil.currentHintsWrapper;
    }

    /**
     * Set current food measures.
     *
     * @param fm the fm
     */
    public static void setCurrentFoodMeasures(FoodMeasuresWrapper fm){
        currentFoodMeasures = fm;
    }

    /**
     * Get current food measures food measures wrapper.
     *
     * @return the food measures wrapper
     */
    public static FoodMeasuresWrapper getCurrentFoodMeasures(){
        return CacheUtil.currentFoodMeasures;
    }

    /**
     * Gets input mode.
     *
     * @return the input mode
     */
    public static String getInputMode() {
        return inputMode;
    }

    /**
     * Sets input mode.
     *
     * @param inputMode the input mode
     */
    public static void setInputMode(String inputMode) {
        CacheUtil.inputMode = inputMode;
    }

    /**
     * Gets output mode.
     *
     * @return the output mode
     */
    public static String getOutputMode() {
        return outputMode;
    }

    /**
     * Sets output mode.
     *
     * @param outputMode the output mode
     */
    public static void setOutputMode(String outputMode) {
        CacheUtil.outputMode = outputMode;
    }
}
