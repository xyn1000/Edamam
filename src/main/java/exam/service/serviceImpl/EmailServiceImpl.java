package exam.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import exam.Constants;
import exam.service.EmailService;
import okhttp3.*;

import java.io.IOException;

public class EmailServiceImpl implements EmailService {
    OkHttpClient client = new OkHttpClient();

    @Override
    public boolean emailRequest(String token, JSONObject obj) {
        String url = "https://api.sendgrid.com/v3/mail/send";
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(obj.toString(),mediaType);
        Request request = new Request.Builder().url(url).post(body).addHeader("Authorization", "Bearer " + token).build();
        try{
            Response response = client.newCall(request).execute();
            ResponseBody responseBody = response.body();
            if (body != null){
                System.out.println(responseBody.string());
                System.out.println(response.code());
            }
            if (response.code()==202){
                return true;
            }else{
                return false;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }

    }
