
package com.example.Gedas.myapplication.model.btc;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-04-28T16:07+0100")
public class Currency$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.Gedas.myapplication.model.btc.Currency>
{

    private com.example.Gedas.myapplication.model.btc.Currency currency$$3;
    @SuppressWarnings("UnusedDeclaration")
    public final static Currency$$Parcelable.Creator$$2 CREATOR = new Currency$$Parcelable.Creator$$2();

    public Currency$$Parcelable(android.os.Parcel parcel$$8) {
        currency$$3 = new com.example.Gedas.myapplication.model.btc.Currency();
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$3, "symbol", parcel$$8 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$3, "code", parcel$$8 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$3, "rate", parcel$$8 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$3, "rateFloat", parcel$$8 .readFloat());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$3, "description", parcel$$8 .readString());
    }

    public Currency$$Parcelable(com.example.Gedas.myapplication.model.btc.Currency currency$$4) {
        currency$$3 = currency$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$9, int flags) {
        parcel$$9 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$3, "symbol"));
        parcel$$9 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$3, "code"));
        parcel$$9 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$3, "rate"));
        parcel$$9 .writeFloat(InjectionUtil.getField(float.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$3, "rateFloat"));
        parcel$$9 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$3, "description"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.Gedas.myapplication.model.btc.Currency getParcel() {
        return currency$$3;
    }

    private final static class Creator$$2
        implements Creator<Currency$$Parcelable>
    {


        @Override
        public Currency$$Parcelable createFromParcel(android.os.Parcel parcel$$10) {
            return new Currency$$Parcelable(parcel$$10);
        }

        @Override
        public Currency$$Parcelable[] newArray(int size) {
            return new Currency$$Parcelable[size] ;
        }

    }

}
