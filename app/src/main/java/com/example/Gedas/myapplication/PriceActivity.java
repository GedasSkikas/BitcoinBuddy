package com.example.Gedas.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.Gedas.myapplication.model.RestClient;
import com.example.Gedas.myapplication.model.btc.CurrentPriceData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PriceActivity extends AppCompatActivity {
    RestClient restClient;

    public static String currentBtcValue;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        // Setting up the app logo
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.btc_final_logo);

        priceCheck();
        showCalculatedBtcPrice();

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    /**
     * Function which handles the Bitcoin price check
     */
    public void priceCheck() {
        restClient = new RestClient();

        // API call request
        Call<CurrentPriceData> call = restClient.getApiService().getCurrentPriceInUSD();
        call.enqueue(new Callback<CurrentPriceData>() {
            @Override
            public void onResponse(Call<CurrentPriceData> call, Response<CurrentPriceData> response) {
                String btcValue;

                // Once the value is received, change it to a String and display
                // It inside of a TextView on the App
                btcValue = response.body().getBpi().getUsd().getRate();
                setCurrentBtcValue(btcValue);
                String message =
                        " " + btcValue + "$";
                TextView tv = (TextView) findViewById(R.id.btcPriceDisplay);
                tv.setText(message);
            }

            @Override
            public void onFailure(Call<CurrentPriceData> call, Throwable t) {
                Toast.makeText(PriceActivity.this, "Data could not be retrieved", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Setter and Getter for the Bitcoin Price
    public static void setCurrentBtcValue(String currentBtcValue) {
        PriceActivity.currentBtcValue = currentBtcValue;
    }

    public static String getCurrentBtcValue() {
        return currentBtcValue;
    }

    /**
     * Calculator function which handles the Bitcoin price to USD conversion
     */
    public void showCalculatedBtcPrice() {
        Button btcCalculatedPriceShowBtn = (Button) findViewById(R.id.btnCalculateBtcPrice);
        btcCalculatedPriceShowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText btcPrice = (EditText) findViewById(R.id.priceTextCalculate);
                String textFromPrice = btcPrice.getText().toString();
                if (textFromPrice.matches("")) {

                    // Display an error message if Button is clicked, but no value was entered
                    Toast.makeText(PriceActivity.this, "You need to enter a value!", Toast.LENGTH_SHORT).show();
                    return;
                }
                double btcWorthPrice = Double.parseDouble(textFromPrice);
                String currentValue = getCurrentBtcValue();
                double result = Math.round(btcWorthPrice * Double.parseDouble(currentValue.replace(",", "")) * 100);
                result = result / 100;

                // Display a success message if the conversion was done in a correct manner
                Toast toast = Toast.makeText(PriceActivity.this, "Your Bitcoin is worth: " + result + " US dollars", Toast.LENGTH_LONG);

                // Set the position of the message to be at a certain location on the screen
                toast.setGravity(0, 0, 500);
                toast.show();
            }
        });
    }

}