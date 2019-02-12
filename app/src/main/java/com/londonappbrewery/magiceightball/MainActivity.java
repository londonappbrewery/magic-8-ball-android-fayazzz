package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask = (Button) findViewById(R.id.btn_ask);
        final ImageView main_image =(ImageView) findViewById(R.id.img_main);

        final int[] int_arr ={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumber = new Random();

                main_image.setImageResource(int_arr[randomNumber.nextInt(5)]);
            }
        });
    }
}
