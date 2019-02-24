package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.text.format.Time;
import android.util.Log;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Clock c=new Clock(this);
        c.AddClockTickListner(new OnClockTickListner() {

            @Override
            public void OnSecondTick(Time currentTime) {
                Log.d("Tick Test per Second", DateFormat.format("h:mm:ss aa ", currentTime.toMillis(true)).toString());

            }

            @Override
            public void OnMinuteTick(Time currentTime) {
                Log.d("Tick Test per Minute",DateFormat.format("h:mm aa", currentTime.toMillis(true)).toString());

            }
        });

    }


}