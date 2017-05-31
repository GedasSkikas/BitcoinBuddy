
package org.parceler;

import java.util.HashMap;
import java.util.Map;
import com.example.Gedas.myapplication.model.btc.Bpi;
import com.example.Gedas.myapplication.model.btc.Bpi$$Parcelable;
import com.example.Gedas.myapplication.model.btc.CoinDeskTime;
import com.example.Gedas.myapplication.model.btc.CoinDeskTime$$Parcelable;
import com.example.Gedas.myapplication.model.btc.Currency;
import com.example.Gedas.myapplication.model.btc.Currency$$Parcelable;
import com.example.Gedas.myapplication.model.btc.CurrentPriceData;
import com.example.Gedas.myapplication.model.btc.CurrentPriceData$$Parcelable;
import com.example.Gedas.myapplication.model.map.LocationInformation;
import com.example.Gedas.myapplication.model.map.LocationInformation$$Parcelable;
import com.example.Gedas.myapplication.model.map.MapData;
import com.example.Gedas.myapplication.model.map.MapData$$Parcelable;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-04-28T16:07+0100")
public class Parceler$$Parcels
    implements Repository<org.parceler.Parcels.ParcelableFactory>
{

    private final Map<Class, org.parceler.Parcels.ParcelableFactory> map$$0 = new HashMap<Class, org.parceler.Parcels.ParcelableFactory>();

    public Parceler$$Parcels() {
        map$$0 .put(Currency.class, new Parceler$$Parcels.Currency$$Parcelable$$0());
        map$$0 .put(CoinDeskTime.class, new Parceler$$Parcels.CoinDeskTime$$Parcelable$$0());
        map$$0 .put(CurrentPriceData.class, new Parceler$$Parcels.CurrentPriceData$$Parcelable$$0());
        map$$0 .put(MapData.class, new Parceler$$Parcels.MapData$$Parcelable$$0());
        map$$0 .put(Bpi.class, new Parceler$$Parcels.Bpi$$Parcelable$$0());
        map$$0 .put(LocationInformation.class, new Parceler$$Parcels.LocationInformation$$Parcelable$$0());
    }

    public Map<Class, org.parceler.Parcels.ParcelableFactory> get() {
        return map$$0;
    }

    private final static class Bpi$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<Bpi>
    {


        @Override
        public Bpi$$Parcelable buildParcelable(Bpi input) {
            return new Bpi$$Parcelable(input);
        }

    }

    private final static class CoinDeskTime$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<CoinDeskTime>
    {


        @Override
        public CoinDeskTime$$Parcelable buildParcelable(CoinDeskTime input) {
            return new CoinDeskTime$$Parcelable(input);
        }

    }

    private final static class Currency$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<Currency>
    {


        @Override
        public Currency$$Parcelable buildParcelable(Currency input) {
            return new Currency$$Parcelable(input);
        }

    }

    private final static class CurrentPriceData$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<CurrentPriceData>
    {


        @Override
        public CurrentPriceData$$Parcelable buildParcelable(CurrentPriceData input) {
            return new CurrentPriceData$$Parcelable(input);
        }

    }

    private final static class LocationInformation$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<LocationInformation>
    {


        @Override
        public LocationInformation$$Parcelable buildParcelable(LocationInformation input) {
            return new LocationInformation$$Parcelable(input);
        }

    }

    private final static class MapData$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<MapData>
    {


        @Override
        public MapData$$Parcelable buildParcelable(MapData input) {
            return new MapData$$Parcelable(input);
        }

    }

}
