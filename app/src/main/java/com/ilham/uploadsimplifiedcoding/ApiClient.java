package com.ilham.uploadsimplifiedcoding;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit;
    private static String BASE_URL = "http://192.168.43.140/AndroidImageUpload/";
    public static final String UPLOAD_URL = "http://192.168.43.140/AndroidImageUpload/upload.php";
    public static final String IMAGES_URL = "http://192.168.94.1/AndroidImageUpload/getImages.php";

    public static Retrofit getRetrofit(){
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return retrofit;
    }
}
