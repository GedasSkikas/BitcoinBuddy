package com.example.Gedas.myapplication.model.btc;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Bpi {

    @SerializedName("USD")
    private Currency usd;

    public Currency getUsd() {
        return usd;
    }

    public void setUsd(Currency usd) {
        this.usd = usd;
    }
}
