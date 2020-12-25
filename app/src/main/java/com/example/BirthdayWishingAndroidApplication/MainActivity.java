package com.example.BirthdayWishingAndroidApplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sp;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=getSharedPreferences("MathsResoninngData", Context.MODE_PRIVATE);
        editor=sp.edit();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(!sp.getBoolean("Login",false)) {
                    Intent LoginIntent = new Intent(MainActivity.this, option.class);
                    startActivity(LoginIntent);
                    finish();
                }
                else {
                    Intent homeintent = new Intent(MainActivity.this, option.class);
                    startActivity(homeintent);
                    finish();
                }

            }
        }, 4000);

    }
}