package com.example.BirthdayWishingAndroidApplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class yourMemories extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_memories);

        gridView = (GridView) findViewById(R.id.grid1);
        // set ImageAdapter and next to the new path
        gridView.setAdapter(new image(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(),fullScreen.class);
                intent.putExtra("l",i);
                startActivity(intent);

            }
        });
    }
}