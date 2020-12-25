package com.example.BirthdayWishingAndroidApplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class friendsMemories extends AppCompatActivity {

    GridView gridView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_memories);


        gridView1 = (GridView) findViewById(R.id.grid2);
        // set ImageAdapter and next to the new path
        gridView1.setAdapter(new image1(this));

        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(),fullScreen1.class);
                intent.putExtra("l",i);
                startActivity(intent);

            }
        });

    }
}