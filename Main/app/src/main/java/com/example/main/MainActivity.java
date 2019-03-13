package com.example.main;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Bitmap> images = new ArrayList<>();
    private ImageView mImageView;
    private int index = 0;

    private String button_1_DA = "Næste";
    private String button_2_DA = "Tilbage";
    private String button_1_EN = "Next";
    private String button_2_EN = "Prev";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Manual loading of images
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        images.add(BitmapFactory.decodeResource(getResources(), R.drawable.a));
        images.add(BitmapFactory.decodeResource(getResources(), R.drawable.b));
        images.add(BitmapFactory.decodeResource(getResources(), R.drawable.c));
        mImageView = findViewById(R.id.imageView);

        setImage();
    }
    public void setImage() {
        mImageView.setImageBitmap(images.get(index));
    }
    public void nextClick(View view) {
        if (index >= images.size() - 1) {
            index = 0;
        } else {
            index++;
        }
        setImage();
    }

    public void previousClick(View view) {
        if (index <= 0) {
            index = images.size() - 1;
        } else {
            index--;
        }
        setImage();
    }
}

