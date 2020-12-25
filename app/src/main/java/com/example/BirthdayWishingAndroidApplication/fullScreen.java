package com.example.BirthdayWishingAndroidApplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class fullScreen extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        imageView = (ImageView) findViewById(R.id.image_view);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full Image");
        Intent i = getIntent();

        int pos = i.getExtras().getInt("l");
        image image = new image(this);

        imageView.setImageResource(image.imageArray[pos]);

    }
}