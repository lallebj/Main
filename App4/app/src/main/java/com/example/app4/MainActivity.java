package com.example.app4;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int[] sequence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateSequence(){
        for (int i = 0; i < 1000; i++){
            sequence[i] = (int) Math.random()*100;
        }
    }
}

