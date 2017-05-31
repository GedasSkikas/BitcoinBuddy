package com.example.Gedas.myapplication;

import com.example.Gedas.myapplication.model.RestClient;
import com.example.Gedas.myapplication.model.btc.CurrentPriceData;
import com.example.Gedas.myapplication.model.map.LocationInformation;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;


public class ExampleUnitTest {

    @Test
     public void RestfulResponseTest() {
        RestClient restClient = new RestClient(); //creating a new RestClient should be kept at a minimum, im pretty sure it takes a lot of resources
        Call<CurrentPriceData> call = restClient.getApiService().getCurrentPriceInUSD(); // <-- this is how the rest calls are used
        Response<CurrentPriceData> data;
        try{
            data = call.execute();
        }
        catch(IOException e){
            fail(e.getMessage());
        }
    }

    @Test
    public void RestfulMapTest() {
        RestClient restClient = new RestClient();

        Call<LocationInformation> call = restClient.getApiServiceMap().getLocationInformation();
        call.enqueue(new Callback<LocationInformation>() {
            @Override
            public void onResponse(Call<LocationInformation> call, Response<LocationInformation> response) {
                assertNotNull(response.body().getData());
            }

            @Override
            public void onFailure(Call<LocationInformation> call, Throwable t) {
                fail(t.getMessage());
            }
        });
    }
}