package com.example.gingeraebi.navercafe.network;


import android.content.Context;
import android.util.Log;

import com.example.gingeraebi.navercafe.vo.Content;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Proxy {

    private Context context;
    private NaverCafeService service;

    public Proxy() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.3.2:9000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(NaverCafeService.class);
    }

    public List<Content> getContents() {
        Call<List<Content>> call = service.getContents();

        try {
            List<Content> contents = call.execute().body();
            return contents;
        } catch (IOException e) {
            Log.e("Proxy", e.getMessage());
        }

        return null;
    }
}
