
package com.example.Gedas.myapplication.model.btc;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-04-28T16:07+0100")
public class CurrentPriceData$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.Gedas.myapplication.model.btc.CurrentPriceData>
{

    private com.example.Gedas.myapplication.model.btc.CurrentPriceData currentPriceData$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static CurrentPriceData$$Parcelable.Creator$$3 CREATOR = new CurrentPriceData$$Parcelable.Creator$$3();

    public CurrentPriceData$$Parcelable(android.os.Parcel parcel$$11) {
        currentPriceData$$0 = new com.example.Gedas.myapplication.model.btc.CurrentPriceData();
        com.example.Gedas.myapplication.model.btc.Bpi bpi$$3;
        if (parcel$$11 .readInt() == -1) {
            bpi$$3 = null;
        } else {
            bpi$$3 = readcom_example_Gedas_myapplication_model_btc_Bpi(parcel$$11);
        }
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.CurrentPriceData.class, currentPriceData$$0, "bpi", bpi$$3);
        com.example.Gedas.myapplication.model.btc.CoinDeskTime coinDeskTime$$3;
        if (parcel$$11 .readInt() == -1) {
            coinDeskTime$$3 = null;
        } else {
            coinDeskTime$$3 = readcom_example_Gedas_myapplication_model_btc_CoinDeskTime(parcel$$11);
        }
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.CurrentPriceData.class, currentPriceData$$0, "time", coinDeskTime$$3);
    }

    public CurrentPriceData$$Parcelable(com.example.Gedas.myapplication.model.btc.CurrentPriceData currentPriceData$$1) {
        currentPriceData$$0 = currentPriceData$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$12, int flags) {
        if (InjectionUtil.getField(com.example.Gedas.myapplication.model.btc.Bpi.class, com.example.Gedas.myapplication.model.btc.CurrentPriceData.class, currentPriceData$$0, "bpi") == null) {
            parcel$$12 .writeInt(-1);
        } else {
            parcel$$12 .writeInt(1);
            writecom_example_Gedas_myapplication_model_btc_Bpi(InjectionUtil.getField(com.example.Gedas.myapplication.model.btc.Bpi.class, com.example.Gedas.myapplication.model.btc.CurrentPriceData.class, currentPriceData$$0, "bpi"), parcel$$12);
        }
        if (InjectionUtil.getField(com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, com.example.Gedas.myapplication.model.btc.CurrentPriceData.class, currentPriceData$$0, "time") == null) {
            parcel$$12 .writeInt(-1);
        } else {
            parcel$$12 .writeInt(1);
            writecom_example_Gedas_myapplication_model_btc_CoinDeskTime(InjectionUtil.getField(com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, com.example.Gedas.myapplication.model.btc.CurrentPriceData.class, currentPriceData$$0, "time"), parcel$$12);
        }
    }

    private com.example.Gedas.myapplication.model.btc.Bpi readcom_example_Gedas_myapplication_model_btc_Bpi(android.os.Parcel parcel$$13) {
        com.example.Gedas.myapplication.model.btc.Bpi bpi$$2;
        bpi$$2 = new com.example.Gedas.myapplication.model.btc.Bpi();
        com.example.Gedas.myapplication.model.btc.Currency currency$$6;
        if (parcel$$13 .readInt() == -1) {
            currency$$6 = null;
        } else {
            currency$$6 = readcom_example_Gedas_myapplication_model_btc_Currency(parcel$$13);
        }
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Bpi.class, bpi$$2, "usd", currency$$6);
        return bpi$$2;
    }

    private com.example.Gedas.myapplication.model.btc.Currency readcom_example_Gedas_myapplication_model_btc_Currency(android.os.Parcel parcel$$14) {
        com.example.Gedas.myapplication.model.btc.Currency currency$$5;
        currency$$5 = new com.example.Gedas.myapplication.model.btc.Currency();
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$5, "symbol", parcel$$14 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$5, "code", parcel$$14 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$5, "rate", parcel$$14 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$5, "rateFloat", parcel$$14 .readFloat());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.Currency.class, currency$$5, "description", parcel$$14 .readString());
        return currency$$5;
    }

    private com.example.Gedas.myapplication.model.btc.CoinDeskTime readcom_example_Gedas_myapplication_model_btc_CoinDeskTime(android.os.Parcel parcel$$15) {
        com.example.Gedas.myapplication.model.btc.CoinDeskTime coinDeskTime$$2;
        coinDeskTime$$2 = new com.example.Gedas.myapplication.model.btc.CoinDeskTime();
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$2, "updateduk", parcel$$15 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$2, "updatedISO", parcel$$15 .readString());
        InjectionUtil.setField(com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$2, "updated", parcel$$15 .readString());
        return coinDeskTime$$2;
    }

    private void writecom_example_Gedas_myapplication_model_btc_Bpi(com.example.Gedas.myapplication.model.btc.Bpi bpi$$4, android.os.Parcel parcel$$16) {
        if (InjectionUtil.getField(com.example.Gedas.myapplication.model.btc.Currency.class, com.example.Gedas.myapplication.model.btc.Bpi.class, bpi$$4, "usd") == null) {
            parcel$$16 .writeInt(-1);
        } else {
            parcel$$16 .writeInt(1);
            writecom_example_Gedas_myapplication_model_btc_Currency(InjectionUtil.getField(com.example.Gedas.myapplication.model.btc.Currency.class, com.example.Gedas.myapplication.model.btc.Bpi.class, bpi$$4, "usd"), parcel$$16);
        }
    }

    private void writecom_example_Gedas_myapplication_model_btc_Currency(com.example.Gedas.myapplication.model.btc.Currency currency$$7, android.os.Parcel parcel$$17) {
        parcel$$17 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$7, "symbol"));
        parcel$$17 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$7, "code"));
        parcel$$17 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$7, "rate"));
        parcel$$17 .writeFloat(InjectionUtil.getField(float.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$7, "rateFloat"));
        parcel$$17 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.Currency.class, currency$$7, "description"));
    }

    private void writecom_example_Gedas_myapplication_model_btc_CoinDeskTime(com.example.Gedas.myapplication.model.btc.CoinDeskTime coinDeskTime$$4, android.os.Parcel parcel$$18) {
        parcel$$18 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$4, "updateduk"));
        parcel$$18 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$4, "updatedISO"));
        parcel$$18 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.Gedas.myapplication.model.btc.CoinDeskTime.class, coinDeskTime$$4, "updated"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.Gedas.myapplication.model.btc.CurrentPriceData getParcel() {
        return currentPriceData$$0;
    }

    private final static class Creator$$3
        implements Creator<CurrentPriceData$$Parcelable>
    {


        @Override
        public CurrentPriceData$$Parcelable createFromParcel(android.os.Parcel parcel$$19) {
            return new CurrentPriceData$$Parcelable(parcel$$19);
        }

        @Override
        public CurrentPriceData$$Parcelable[] newArray(int size) {
            return new CurrentPriceData$$Parcelable[size] ;
        }

    }

}
