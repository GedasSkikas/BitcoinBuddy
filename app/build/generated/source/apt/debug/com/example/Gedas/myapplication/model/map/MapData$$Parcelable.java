
package com.example.Gedas.myapplication.model.map;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-05-05T11:43+0100")
public class MapData$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.Gedas.myapplication.model.map.MapData>
{

    private com.example.Gedas.myapplication.model.map.MapData mapData$$4;
    @SuppressWarnings("UnusedDeclaration")
    public final static MapData$$Parcelable.Creator$$5 CREATOR = new MapData$$Parcelable.Creator$$5();

    public MapData$$Parcelable(android.os.Parcel parcel$$25) {
        mapData$$4 = new com.example.Gedas.myapplication.model.map.MapData();
        InjectionUtil.setField(com.example.Gedas.myapplication.model.map.MapData.class, mapData$$4, "latMap", parcel$$25 .readDouble());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.map.MapData.class, mapData$$4, "name", parcel$$25 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.map.MapData.class, mapData$$4, "lonMap", parcel$$25 .readDouble());
    }

    public MapData$$Parcelable(com.example.Gedas.myapplication.model.map.MapData mapData$$5) {
        mapData$$4 = mapData$$5;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$26, int flags) {
        parcel$$26 .writeDouble(InjectionUtil.getField(double.class, com.example.Gedas.myapplication.model.map.MapData.class, mapData$$4, "latMap"));
        parcel$$26 .writeString(InjectionUtil.getField(String.class, com.example.Gedas.myapplication.model.map.MapData.class, mapData$$4, "name"));
        parcel$$26 .writeDouble(InjectionUtil.getField(double.class, com.example.Gedas.myapplication.model.map.MapData.class, mapData$$4, "lonMap"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.Gedas.myapplication.model.map.MapData getParcel() {
        return mapData$$4;
    }

    private final static class Creator$$5
        implements Creator<MapData$$Parcelable>
    {


        @Override
        public MapData$$Parcelable createFromParcel(android.os.Parcel parcel$$27) {
            return new MapData$$Parcelable(parcel$$27);
        }

        @Override
        public MapData$$Parcelable[] newArray(int size) {
            return new MapData$$Parcelable[size] ;
        }

    }

}
