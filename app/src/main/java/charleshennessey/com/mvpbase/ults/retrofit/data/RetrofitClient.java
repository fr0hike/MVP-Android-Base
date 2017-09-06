package charleshennessey.com.mvpbase.ults.retrofit.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ceh024 on 9/5/17.
 */

public class RetrofitClient {
    /***************************************** Local Data *********************************************/
    private Retrofit retrofit = null;
/***************************************** Local Data *********************************************/


    /*************************************** Retrofit Client ******************************************/
    public Retrofit getClient(String baseUrl) {
        if (retrofit == null){
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
/*************************************** Retrofit Client ******************************************/
}
