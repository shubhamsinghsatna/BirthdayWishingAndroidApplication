package com.example.BirthdayWishingAndroidApplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class fullScreen1 extends AppCompatActivity {

    ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen1);

        imageView1 = (ImageView) findViewById(R.id.image_view1);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full Image");
        Intent i = getIntent();

        int pos = i.getExtras().getInt("l");
        image1 image = new image1(this);

        imageView1.setImageResource(image1.imageArray1[pos]);
    }
}