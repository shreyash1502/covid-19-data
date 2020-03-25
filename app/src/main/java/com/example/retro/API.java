package com.example.retro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    String Base_url="https://api.covid19api.com/";
    @GET("summary")
    Call<List<data>> getData();
}
