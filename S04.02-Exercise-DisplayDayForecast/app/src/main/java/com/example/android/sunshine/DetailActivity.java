package com.example.android.sunshine;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private String mForecast;
    private TextView mDisplayWeatherContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent intentThatStartThisActivity = getIntent();

        mDisplayWeatherContent = (TextView) findViewById(R.id.tv_display_weather_content);

        if (intentThatStartThisActivity != null) {
            if (intentThatStartThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
                mForecast = intentThatStartThisActivity.getStringExtra(Intent.EXTRA_TEXT);
                mDisplayWeatherContent.setText(mForecast);
            }
        }


    }
}