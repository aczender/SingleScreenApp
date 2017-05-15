package com.example.android.singlescreenapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class BusinessCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_card);

        Button coffee_history = (Button) findViewById(R.id.coffee_history);
        coffee_history.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Under construction", Toast.LENGTH_SHORT).show();
            }
        });
        Button coffee_menu = (Button) findViewById(R.id.coffee_menu);
        coffee_menu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Under construction", Toast.LENGTH_SHORT).show();
            }
        });
        Button coffee_pictures = (Button) findViewById(R.id.coffee_pictures);
        coffee_pictures.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Under construction", Toast.LENGTH_SHORT).show();
            }
        });
    }

}