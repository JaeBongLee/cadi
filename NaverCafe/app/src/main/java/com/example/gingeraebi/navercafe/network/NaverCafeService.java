package com.example.gingeraebi.navercafe.network;

import com.example.gingeraebi.navercafe.vo.Content;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NaverCafeService {
    @GET("/contents")
    Call<List<Content>> getContents();

}
