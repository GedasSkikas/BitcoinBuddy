package com.example.Gedas.myapplication.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RestClient {
    private static final String BASE_URL_BTC = "http://api.coindesk.com/v1/bpi/";
    private static final String BASE_URL_MAP = "http://coinmap.org/api/";
    private ApiService apiService;
    private ApiServiceMap apiServiceMap;

    public RestClient() {
        Retrofit restAdapterBtc = new Retrofit.Builder()

                .baseUrl(BASE_URL_BTC)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Retrofit restAdapterMap = new Retrofit.Builder()
                .baseUrl(BASE_URL_MAP)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = restAdapterBtc.create(ApiService.class);
        apiServiceMap = restAdapterMap.create(ApiServiceMap.class);
    }

    public ApiService getApiService() {
        return apiService;
    }

    public ApiServiceMap getApiServiceMap() {
        return apiServiceMap;
    }
}
