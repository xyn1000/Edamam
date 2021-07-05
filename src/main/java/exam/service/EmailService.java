package exam.service;

import com.alibaba.fastjson.JSONObject;

/**
 * The interface Email service.
 */
public interface EmailService {
    /**
     * return a boolean to indicate if the email is successfully sent.
     *
     * @param token SendGrid token
     * @param obj   the Email JSONObject
     * @return the boolean
     */
    boolean emailRequest(String token, JSONObject obj);
}
