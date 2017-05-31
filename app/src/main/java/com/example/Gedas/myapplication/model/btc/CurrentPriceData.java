package com.example.Gedas.myapplication.model.btc;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;


@Parcel
public class CurrentPriceData {

    @SerializedName("bpi")
    private Bpi bpi;

    @SerializedName("time")
    private CoinDeskTime time;

    public CoinDeskTime getTime() {
        return time;
    }

    public void setTime(CoinDeskTime time) {
        this.time = time;
    }

    public Bpi getBpi() {
        return bpi;
    }

    public void setBpi(Bpi bpi) {
        this.bpi = bpi;
    }
}
