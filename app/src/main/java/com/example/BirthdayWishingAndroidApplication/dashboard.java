package com.example.BirthdayWishingAndroidApplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class dashboard extends AppCompatActivity {

    private CardView dad,mom,bro,sis;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        dad= (CardView) findViewById(R.id.dad);
        mom= (CardView) findViewById(R.id.mom);
        sis= (CardView) findViewById(R.id.sis);
        bro= (CardView) findViewById(R.id.bro);

        dad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDadDialog();
            }
        });

        mom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMomDialog();
            }
        });

        sis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSisDialog();
            }
        });

        bro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBroDialog();
            }
        });
    }
    public void showDadDialog(){
        Dialog dialog=new Dialog(dashboard.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dadwish);
        dialog.show();
    }

    public void showMomDialog(){
        Dialog dialog=new Dialog(dashboard.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.momwish);
        dialog.show();
    }

    public void showSisDialog(){
        Dialog dialog=new Dialog(dashboard.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.siswish);
        dialog.show();
    }

    public void showBroDialog(){
        Dialog dialog=new Dialog(dashboard.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.browish);
        dialog.show();
    }
}