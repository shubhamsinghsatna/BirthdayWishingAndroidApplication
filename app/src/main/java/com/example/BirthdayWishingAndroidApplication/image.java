package com.example.BirthdayWishingAndroidApplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class image extends BaseAdapter {
    private Context mContext;

    public image(Context mContext) {
        this.mContext = mContext;
    }

    public int[] imageArray = {
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,
            R.drawable.img6
    };


    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);

        imageView.setImageResource(imageArray[i]);
        imageView.setLayoutParams(new GridView.LayoutParams(350, 350));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);


    return imageView;
    }
}
