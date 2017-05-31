
package com.example.Gedas.myapplication.model.btc;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-04-28T16:07+0100")
public class CoinDeskTime$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.Gedas.myapplication.model.btc.CoinDeskTime>
{

    private com.example.Gedas.myapplication.model.btc.CoinDeskTime coinDeskTime$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static CoinDeskTime$$Parcelable.Creator$$1 CREATOR = new CoinDeskTime$$Parcelable.Creator$$1();

    public CoinDeskTime$$Parcelable(android.os.Parcel parcel$$5) {
        coinDeskTime$$0 = new com.example.Gedas.myapplication.model.btc.CoinDeskTime();
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$0, "updateduk", parcel$$5 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$0, "updatedISO", parcel$$5 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$0, "updated", parcel$$5 .readString());
    }

    public CoinDeskTime$$Parcelable(com.example.Gedas.myapplication.model.btc.CoinDeskTime coinDeskTime$$1) {
        coinDeskTime$$0 = coinDeskTime$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$6, int flags) {
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$0, "updateduk"));
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$0, "updatedISO"));
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$0, "updated"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.Gedas.myapplication.model.btc.CoinDeskTime getParcel() {
        return coinDeskTime$$0;
    }

    private final static class Creator$$1
        implements Creator<CoinDeskTime$$Parcelable>
    {


        @Override
        public CoinDeskTime$$Parcelable createFromParcel(android.os.Parcel parcel$$7) {
            return new CoinDeskTime$$Parcelable(parcel$$7);
        }

        @Override
        public CoinDeskTime$$Parcelable[] newArray(int size) {
            return new CoinDeskTime$$Parcelable[size] ;
        }

    }

}
