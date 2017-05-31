package com.example.Gedas.myapplication;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.Gedas.myapplication.model.RestClient;
import com.example.Gedas.myapplication.model.btc.CurrentPriceData;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AlertActivity extends AppCompatActivity {
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        // Setting up the app logo
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.btc_final_logo);

        settingUpAlerts();
    }

    /**
     * Function which sets up the user preferences
     * For the alert notifications
     */
    public void settingUpAlerts() {

        // Creating a preferences file, which will store the low/high alerts
        prefs = getSharedPreferences("MY_PREFS", Activity.MODE_PRIVATE);
        final SharedPreferences.Editor editor = prefs.edit();


        Button alertsSetBtn = (Button) findViewById(R.id.alertsSetBtn);
        alertsSetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText lowVal = (EditText) findViewById(R.id.alertLowValue);
                String textFromLow = lowVal.getText().toString();

                // Check to ensure the user has entered values
                if (textFromLow.matches("")) {

                    // Displaying an error message if the user hasn't input both values
                    Toast.makeText(AlertActivity.this, "You need to enter values first!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Changing the value low alert to an integer, so it's easier to convert later
                int lowAlertValue = new Integer(textFromLow).intValue();

                EditText highVal = (EditText) findViewById(R.id.alertHighValue);
                String textFromHigh = highVal.getText().toString();

                // Check to ensure the user has entered values
                if (textFromHigh.matches("")) {

                    // Displaying an error message if the user hasn't input both values
                    Toast.makeText(AlertActivity.this, "You need to enter values first!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Changing the value high alert to an integer, so it's easier to convert later
                int highAlertValue = new Integer(textFromHigh).intValue();


                // Entering the user inputs of low/high alert values into the previously created SharedPreferences file
                editor.putInt("LOW_ALERT", lowAlertValue);
                editor.putInt("HIGH_ALERT", highAlertValue);
                editor.commit();

                // Displaying a success message if the inputs were correctly set
                Toast toast = Toast.makeText(AlertActivity.this, "Alerts have been successfully set!", Toast.LENGTH_SHORT);
                toast.show();

                // After the alerts have been set, initiate the notification creation function
                notifier();
            }
        });

    }

    /**
     * Function which creates and notifies the phone with a notification,
     * Once set Bitcoin values were reached
     */
    public void notifier() {
        Intent intent = new Intent(this, AlertActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 01, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        final Notification.Builder builder = new Notification.Builder(this)
                .setContentTitle("Bitcoin Price Alert!")
                .setAutoCancel(true)
                .setSmallIcon(R.mipmap.btc_final_logo);
        final NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);


        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(new Runnable() {

            /**
             * A thread which constantly runs in the background
             * And checks if the current Bitcoin price aligns
             * With set alert values
             */
            @Override
            public void run() {

                // A fresh API call to check what the current Bitcoin price is
                RestClient restClient = new RestClient();
                Call<CurrentPriceData> call = restClient.getApiService().getCurrentPriceInUSD();
                call.enqueue(new Callback<CurrentPriceData>() {
                    @Override
                    public void onResponse(Call<CurrentPriceData> call, Response<CurrentPriceData> response) {

                        double currentBtcValue = Double.parseDouble(response.body().getBpi().getUsd().getRate().replace(",", ""));

                        // Notifying the phone if the value went down
                        if (currentBtcValue < prefs.getInt("LOW_ALERT", 0)) {
                            builder.setContentText("Price went down! It is currently at: " + currentBtcValue);

                            // A version check to see which API version the Android phone uses, and use
                            // The appropriate function call depending on that
                            if (android.os.Build.VERSION.SDK_INT < 16) {
                                notificationManager.notify(01, builder.getNotification());
                            } else {
                                notificationManager.notify(01, builder.build());
                            }
                        }
                        if (currentBtcValue > prefs.getInt("HIGH_ALERT", 0)) {
                            builder.setContentText("Price went up! It is currently at: " + currentBtcValue);

                            if (android.os.Build.VERSION.SDK_INT < 16) {
                                notificationManager.notify(01, builder.getNotification());
                            } else {
                                notificationManager.notify(01, builder.build());
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<CurrentPriceData> call, Throwable t) {
                        Toast.makeText(AlertActivity.this, "Data could not be retrieved", Toast.LENGTH_SHORT).show();
                    }
                });
            }
            // 360 - the amount of seconds that pass, after it reminds the user about the changed value
        }, 0, 360, TimeUnit.SECONDS);
    }
}