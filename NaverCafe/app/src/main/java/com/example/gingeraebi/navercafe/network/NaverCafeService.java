package com.example.gingeraebi.navercafe.network;

import com.example.gingeraebi.navercafe.vo.Content;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface NaverCafeService {
    @GET("/contents")
    Call<List<Content>> getContents();

    @POST("/contents")
    Call<Content> saveContent(@Body Content content);

}
