
package com.example.Gedas.myapplication.model.map;

import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-05-05T11:43+0100")
public class LocationInformation$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.Gedas.myapplication.model.map.LocationInformation>
{

    private com.example.Gedas.myapplication.model.map.LocationInformation locationInformation$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static LocationInformation$$Parcelable.Creator$$4 CREATOR = new LocationInformation$$Parcelable.Creator$$4();

    public LocationInformation$$Parcelable(android.os.Parcel parcel$$20) {
        locationInformation$$0 = new com.example.Gedas.myapplication.model.map.LocationInformation();
        int int$$0 = parcel$$20 .readInt();
        ArrayList<com.example.Gedas.myapplication.model.map.MapData> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<com.example.Gedas.myapplication.model.map.MapData>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.example.Gedas.myapplication.model.map.MapData mapData$$1;
                if (parcel$$20 .readInt() == -1) {
                    mapData$$1 = null;
                } else {
                    mapData$$1 = readcom_example_Gedas_myapplication_model_map_MapData(parcel$$20);
                }
                list$$0 .add(mapData$$1);
            }
        }
        InjectionUtil.setField(com.example.Gedas.myapplication.model.map.LocationInformation.class, locationInformation$$0, "data", list$$0);
    }

    public LocationInformation$$Parcelable(com.example.Gedas.myapplication.model.map.LocationInformation locationInformation$$1) {
        locationInformation$$0 = locationInformation$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$21, int flags) {
        if (InjectionUtil.getField(java.util.List.class, com.example.Gedas.myapplication.model.map.LocationInformation.class, locationInformation$$0, "data") == null) {
            parcel$$21 .writeInt(-1);
        } else {
            parcel$$21 .writeInt(InjectionUtil.getField(java.util.List.class, com.example.Gedas.myapplication.model.map.LocationInformation.class, locationInformation$$0, "data").size());
            for (com.example.Gedas.myapplication.model.map.MapData mapData$$2 : ((java.util.List<com.example.Gedas.myapplication.model.map.MapData> ) InjectionUtil.getField(java.util.List.class, com.example.Gedas.myapplication.model.map.LocationInformation.class, locationInformation$$0, "data"))) {
                if (mapData$$2 == null) {
                    parcel$$21 .writeInt(-1);
                } else {
                    parcel$$21 .writeInt(1);
                    writecom_example_Gedas_myapplication_model_map_MapData(mapData$$2, parcel$$21);
                }
            }
        }
    }

    private com.example.Gedas.myapplication.model.map.MapData readcom_example_Gedas_myapplication_model_map_MapData(android.os.Parcel parcel$$22) {
        com.example.Gedas.myapplication.model.map.MapData mapData$$0;
        mapData$$0 = new com.example.Gedas.myapplication.model.map.MapData();
        InjectionUtil.setField(com.example.Gedas.myapplication.model.map.MapData.class, mapData$$0, "latMap", parcel$$22 .readDouble());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.map.MapData.class, mapData$$0, "name", parcel$$22 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.map.MapData.class, mapData$$0, "lonMap", parcel$$22 .readDouble());
        return mapData$$0;
    }

    private void writecom_example_Gedas_myapplication_model_map_MapData(com.example.Gedas.myapplication.model.map.MapData mapData$$3, android.os.Parcel parcel$$23) {
        parcel$$23 .writeDouble(InjectionUtil.getField(double.class, com.example.Gedas.myapplication.model.map.MapData.class, mapData$$3, "latMap"));
        parcel$$23 .writeString(InjectionUtil.getField(String.class, com.example.Gedas.myapplication.model.map.MapData.class, mapData$$3, "name"));
        parcel$$23 .writeDouble(InjectionUtil.getField(double.class, com.example.Gedas.myapplication.model.map.MapData.class, mapData$$3, "lonMap"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.Gedas.myapplication.model.map.LocationInformation getParcel() {
        return locationInformation$$0;
    }

    private final static class Creator$$4
        implements Creator<LocationInformation$$Parcelable>
    {


        @Override
        public LocationInformation$$Parcelable createFromParcel(android.os.Parcel parcel$$24) {
            return new LocationInformation$$Parcelable(parcel$$24);
        }

        @Override
        public LocationInformation$$Parcelable[] newArray(int size) {
            return new LocationInformation$$Parcelable[size] ;
        }

    }

}
