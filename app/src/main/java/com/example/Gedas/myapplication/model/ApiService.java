package com.example.Gedas.myapplication.model;

import com.example.Gedas.myapplication.model.btc.CurrentPriceData;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiService {

    /**
     * Returns the current Price with the time when it was updated last
     * @return
     */
    @GET("currentprice/USD.json")
    Call<CurrentPriceData> getCurrentPriceInUSD();
}
