package com.example.android_bootcamp_3_8ball;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Context context = this;

    ImageView imageId;


    Button buttonId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageId = findViewById(R.id.imageId);
        buttonId = findViewById(R.id.buttonId);


        final int[] images = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};


        buttonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumGen = new Random();
                int randomNum = randomNumGen.nextInt(5);

                imageId.setImageResource(images[(randomNum)]);


                Toast.makeText(context, "AAA" + randomNum, Toast.LENGTH_SHORT).show();

            }
        });


    }
}