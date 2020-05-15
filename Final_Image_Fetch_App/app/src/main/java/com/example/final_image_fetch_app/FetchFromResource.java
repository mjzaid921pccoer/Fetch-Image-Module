package com.example.final_image_fetch_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FetchFromResource {
    String ROOT_URL="http://www.fabridgeengg.com/Root_NavlakhUmbre/Fetch-Image-Server/";
    //getImgPath.php
    @GET("getImgPath.php")
    Call<List<MyObjects>> getMyObjects();
}
