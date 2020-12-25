package com.example.BirthdayWishingAndroidApplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class option extends AppCompatActivity {

    private CardView familyThoughts,friendsThoughts,someYourMemories,yourMemoriesWithFriends;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        familyThoughts=findViewById(R.id.familyWishes);
        friendsThoughts=findViewById(R.id.friendsWishes);
        yourMemoriesWithFriends=findViewById(R.id.yourMemoriesWithFriends);
        someYourMemories=findViewById(R.id.someYourMemories);

        familyThoughts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(option.this, dashboard.class);
                startActivity(intent1);
            }
        });

        friendsThoughts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(option.this, friends.class);
                startActivity(intent1);
            }
        });

        yourMemoriesWithFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(option.this, friendsMemories.class);
                startActivity(intent1);
            }
        });

        someYourMemories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(option.this, yourMemories.class);
                startActivity(intent1);
            }
        });

    }
}