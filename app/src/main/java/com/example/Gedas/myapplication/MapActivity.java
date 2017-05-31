package com.example.Gedas.myapplication;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.Gedas.myapplication.model.RestClient;
import com.example.Gedas.myapplication.model.map.LocationInformation;
import com.example.Gedas.myapplication.model.map.MapData;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    RestClient restClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        // Setting up the app logo
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.btc_final_logo);

        restClient = new RestClient();
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    /**
     * Function which sets up a Map and populates it with Markers
     * Which indicate where users can spend their Bitcoin
     */
    @Override
    public void onMapReady(final GoogleMap map) {
        try {

            GPSLocator gps = new GPSLocator(MapActivity.this);

            // Moving the map to the users location
            if (gps.canGetLocation()) {
                LatLng myLocation = new LatLng(gps.getLatitude(), gps.getLongitude());
                map.moveCamera(CameraUpdateFactory.newLatLng(myLocation));
                map.animateCamera(CameraUpdateFactory.zoomTo(10));

                // API call to get the Bitcoin shop data
                Call<LocationInformation> call = restClient.getApiServiceMap().getLocationInformation();
                call.enqueue(new Callback<LocationInformation>() {
                    @Override
                    public void onResponse(Call<LocationInformation> call, Response<LocationInformation> response) {

                        // Once the JSON data has been retrieved, use it to create markers on the map
                        // Which display each shop available
                        List<MapData> dataList = response.body().getData();
                        for (MapData data : dataList) {
                            map.addMarker(new MarkerOptions()
                                    .position(new LatLng(data.getLatMap(), data.getLonMap()))
                                    .title(data.getName()));
                        }
                    }

                    @Override
                    public void onFailure(Call<LocationInformation> call, Throwable t) {
                        Toast.makeText(MapActivity.this, "Data could not be retrieved", Toast.LENGTH_SHORT).show();
                    }
                });
            } else {
                gps.showSettingsAlert();
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }

    /**
     * Request Result function which is used in conjunction
     * With the permission request in the MainActivity class
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                } else {
                    // permission denied! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }
            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

}