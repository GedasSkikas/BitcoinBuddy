package com.example.Gedas.myapplication.model;

import com.example.Gedas.myapplication.model.map.LocationInformation;

import retrofit2.http.GET;
import retrofit2.Call;

public interface ApiServiceMap {

    @GET("v1/venues")
    Call<LocationInformation> getLocationInformation();

}
