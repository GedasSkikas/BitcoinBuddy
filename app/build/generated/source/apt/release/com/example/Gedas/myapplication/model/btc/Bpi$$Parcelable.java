
package com.example.Gedas.myapplication.model.btc;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-04-28T16:07+0100")
public class Bpi$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.Gedas.myapplication.model.btc.Bpi>
{

    private com.example.Gedas.myapplication.model.btc.Bpi bpi$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Bpi$$Parcelable.Creator$$0 CREATOR = new Bpi$$Parcelable.Creator$$0();

    public Bpi$$Parcelable(android.os.Parcel parcel$$0) {
        bpi$$0 = new com.example.Gedas.myapplication.model.btc.Bpi();
        com.example.Gedas.myapplication.model.btc.Currency currency$$1;
        if (parcel$$0 .readInt() == -1) {
            currency$$1 = null;
        } else {
            currency$$1 = readcom_example_Gedas_myapplication_model_btc_Currency(parcel$$0);
        }
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Bpi.class, bpi$$0, "usd", currency$$1);
    }

    public Bpi$$Parcelable(com.example.Gedas.myapplication.model.btc.Bpi bpi$$1) {
        bpi$$0 = bpi$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (InjectionUtil.getField(com.example.Gedas.myapplication.model.btc.Currency.class, com.example.Gedas.myapplication.model.btc.Bpi.class, bpi$$0, "usd") == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_example_Gedas_myapplication_model_btc_Currency(InjectionUtil.getField(com.example.Gedas.myapplication.model.btc.Currency.class, com.example.Gedas.myapplication.model.btc.Bpi.class, bpi$$0, "usd"), parcel$$1);
        }
    }

    private com.example.Gedas.myapplication.model.btc.Currency readcom_example_Gedas_myapplication_model_btc_Currency(android.os.Parcel parcel$$2) {
        com.example.Gedas.myapplication.model.btc.Currency currency$$0;
        currency$$0 = new com.example.Gedas.myapplication.model.btc.Currency();
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$0, "symbol", parcel$$2 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$0, "code", parcel$$2 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$0, "rate", parcel$$2 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$0, "rateFloat", parcel$$2 .readFloat());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$0, "description", parcel$$2 .readString());
        return currency$$0;
    }

    private void writecom_example_Gedas_myapplication_model_btc_Currency(com.example.Gedas.myapplication.model.btc.Currency currency$$2, android.os.Parcel parcel$$3) {
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$2, "symbol"));
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$2, "code"));
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$2, "rate"));
        parcel$$3 .writeFloat(InjectionUtil.getField(float.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$2, "rateFloat"));
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$2, "description"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.Gedas.myapplication.model.btc.Bpi getParcel() {
        return bpi$$0;
    }

    private final static class Creator$$0
        implements Creator<Bpi$$Parcelable>
    {


        @Override
        public Bpi$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new Bpi$$Parcelable(parcel$$4);
        }

        @Override
        public Bpi$$Parcelable[] newArray(int size) {
            return new Bpi$$Parcelable[size] ;
        }

    }

}
