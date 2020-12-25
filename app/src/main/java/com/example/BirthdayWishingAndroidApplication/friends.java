package com.example.BirthdayWishingAndroidApplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class friends extends AppCompatActivity {

    private CardView second_friend_wish, fourth_friend_wish, third_friend_wish, first_friend_wish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        second_friend_wish = (CardView) findViewById(R.id.sayyam);
        fourth_friend_wish = (CardView) findViewById(R.id.ankit);
        third_friend_wish = (CardView) findViewById(R.id.shubham);
        first_friend_wish = (CardView) findViewById(R.id.akanksha);

        second_friend_wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSayyamDialog();
            }
        });

        fourth_friend_wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAnkitDialog();
            }
        });

        third_friend_wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showShubhamDialog();
            }
        });

        first_friend_wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAkankshaDialog();
            }
        });
    }
    public void showSayyamDialog(){
        Dialog dialog=new Dialog(friends.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.second_friend_wish);
        dialog.show();
    }

    public void showAnkitDialog(){
        Dialog dialog=new Dialog(friends.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.fourth_friend_wish);
        dialog.show();
    }

    public void showShubhamDialog(){
        Dialog dialog=new Dialog(friends.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.third_friend_wish);
        dialog.show();
    }

    public void showAkankshaDialog(){
        Dialog dialog=new Dialog(friends.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.first_friend_wish);
        dialog.show();
    }
}