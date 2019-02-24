package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Calendar;

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

        /*String URL = "https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b6907d289e10d714a6e88b30761fae22";
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        JsonObjectRequest objectRequest = new JsonRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e("Rest Response")

                    }
                },
                    new Response.ErrorListener(){
                        @Override
                        public void onErrorReponse(VolleyError error)
                        {

                        }
                    }
    }

    private class JsonObjectRequest {
    }
        )*/

        /*       Weather
         relativeLayout = (RelativeLayout) findViewById(R.id.layout);
        relativeLayout.setBackgroundResource(R.drawable.img1); */



    }

}
