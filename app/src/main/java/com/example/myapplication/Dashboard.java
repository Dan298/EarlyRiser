package com.example.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.text.format.Time;
import android.util.Log;
import android.text.Layout;
import android.widget.TextView;
import android.widget.Toolbar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.lang.String;

public class Dashboard extends AppCompatActivity {

    private TextView alarmtime;
    private TextView Date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Calendar now = Calendar.getInstance();
        String time = now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE);
        alarmtime = (TextView) findViewById(R.id.alarmtime);
        alarmtime.setText(time);
        String myDate = now.get(Calendar.MONTH)+ "," + now.get(Calendar.DATE);
        Date = (TextView) findViewById(R.id.Date);
        Date.setText(myDate);



    }

}
