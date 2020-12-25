package com.example.BirthdayWishingAndroidApplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class image1 extends BaseAdapter {

    private Context mContext1;

    public image1(Context mContext) {
        this.mContext1 = mContext;
    }

    static  public int[] imageArray1 = {
            R.drawable.im1, R.drawable.im2, R.drawable.im3, R.drawable.im4, R.drawable.im5,
            R.drawable.im6
    };


    @Override
    public int getCount() {
        return imageArray1.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray1[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView1 = new ImageView(mContext1);

        imageView1.setImageResource(imageArray1[i]);
        imageView1.setLayoutParams(new GridView.LayoutParams(350, 350));
        imageView1.setScaleType(ImageView.ScaleType.CENTER_CROP);


        return imageView1;
    }
}
