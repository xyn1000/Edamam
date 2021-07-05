package exam.service;

import com.alibaba.fastjson.JSONObject;
import exam.entity.HintsWrapper;
import exam.entity.NutrientWrapper;

import java.io.IOException;
import java.util.List;

/**
 * The interface Food service.
 */
public interface FoodService {
    /**
     * Get Information from API.
     *
     * @param ingr   search text
     * @param appId  the app id
     * @param appKey the app key
     * @return the hints wrapper which contains Information from API
     * @throws IOException the io exception
     */
    HintsWrapper search(String ingr, String appId, String appKey) throws IOException;

    /**
     * Nutrition request to API.
     *
     * @param appId  the app id
     * @param appKey the app key
     * @param obj    the obj which contains request information
     * @return the nutrient wrapper
     * @throws IOException the io exception
     */
    NutrientWrapper nutritionRequest(String appId, String appKey, JSONObject obj) throws IOException;

}
