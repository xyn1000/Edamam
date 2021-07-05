package exam.service.serviceImpl;


import com.alibaba.fastjson.JSONObject;
import exam.Constants;
import exam.entity.HintsWrapper;
import exam.entity.NutrientWrapper;
import exam.service.FoodService;
import exam.util.JSONUtil;
import okhttp3.*;

import java.io.IOException;
import java.util.List;

public class FoodServiceImpl implements FoodService {
    OkHttpClient client = new OkHttpClient();

    @Override
    public HintsWrapper search(String ingr, String appId, String appKey) throws IOException{
        String url = "https://api.edamam.com/api/food-database/v2/parser";
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        httpBuilder.addQueryParameter("app_id",appId);
        httpBuilder.addQueryParameter("app_key",appKey);
        httpBuilder.addQueryParameter("ingr",ingr);

        Request request = new Request.Builder().url(httpBuilder.build()).build();
        HintsWrapper hw = new HintsWrapper();

        try{
            Response response = client.newCall(request).execute();
            ResponseBody body = response.body();
            if (body!=null){
//                System.out.println(body.string());
                String tmp = body.string();
                hw.setJsonString(tmp);
                JSONUtil.jsonHintsToFoods(hw, tmp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return hw;
    }

    @Override
    public NutrientWrapper nutritionRequest(String appId, String appKey, JSONObject obj) throws IOException {
        String url = "https://api.edamam.com/api/food-database/v2/nutrients";
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        httpBuilder.addQueryParameter("app_id",appId);
        httpBuilder.addQueryParameter("app_key",appKey);
        HttpUrl httpUrl = httpBuilder.build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(obj.toString(),mediaType);
        Request request = new Request.Builder().url(httpUrl).post(body).build();
        NutrientWrapper nw = new NutrientWrapper();

        try{
            Response response = client.newCall(request).execute();
            ResponseBody responseBody = response.body();
            if (body != null){
//                System.out.println(responseBody.string());
                String tmp = responseBody.string();
                nw.setJsonString(tmp);
                JSONUtil.jsonToNutrientWrapper(nw,tmp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return nw;
    }


}
