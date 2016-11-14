package com.example.user.seniorseminarproject.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.user.seniorseminarproject.R;

public class GreenZoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_zone);
    }
    public void onGreenZoneBackButtonClick(View view) {
        Intent intent = new Intent(this, ZoneInformationActivity.class);
        startActivity(intent);
    }
}
