package com.example.Gedas.myapplication.model.btc;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Currency {
    @SerializedName("code")
    private String code;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("rate")
    private String rate;

    @SerializedName("description")
    private String description;

    @SerializedName("rate_float")
    private float rateFloat;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRateFloat() {
        return rateFloat;
    }

    public void setRateFloat(float rateFloat) {
        this.rateFloat = rateFloat;
    }
}
