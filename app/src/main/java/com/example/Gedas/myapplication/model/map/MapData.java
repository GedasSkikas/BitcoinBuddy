package com.example.Gedas.myapplication.model.map;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;


@Parcel
public class MapData {

    @SerializedName("lat")
    private double latMap;

    @SerializedName("lon")
    private double lonMap;

    @SerializedName("name")
    private String name;


    public double getLatMap() {
        return latMap;
    }

    public void setLatMap(double latMap) {
        this.latMap = latMap;
    }

    public double getLonMap() {
        return lonMap;
    }

    public void setLonMap(double longMap) {
        this.lonMap = longMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String type) {
        this.name = type;
    }


}
