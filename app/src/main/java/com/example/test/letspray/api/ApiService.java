package com.example.test.letspray.api;

import com.example.test.letspray.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("jakarta.json")
    Call<ModelJadwal> getJadwal();

}
