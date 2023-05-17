package com.example.internmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static final int delay = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Start the SplashActivity and finish the MainActivity
        // Delayed transition to SplashActivity
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the SplashActivity and finish the MainActivity
                Intent intent = new Intent(MainActivity.this, Splashscreen.class);
                startActivity(intent);
                finish();
            }
        }, delay);


    }










    }
