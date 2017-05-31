package com.example.Gedas.myapplication.model.map;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

@Parcel
public class LocationInformation {

    @SerializedName("venues")
    private List<MapData> data;

    public List<MapData> getData() {
        return data;
    }



    public void setData(List<MapData> data) {
        this.data = data;
    }
}
