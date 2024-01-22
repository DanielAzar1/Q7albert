package com.example.q7albert;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    ImageButton imgBtn;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBtn = findViewById(R.id.imgBtn);
        img = findViewById(R.id.img);
    }

    public void ace(View view) {
        img.setVisibility(View.VISIBLE);
        int diceRoll = rand.nextInt(3) + 1;
        if (diceRoll == 1)
        {
            img.setImageResource(R.drawable.img1);
            imgBtn.setImageResource(R.drawable.button1);
        }
        if (diceRoll == 2)
        {
            img.setImageResource(R.drawable.img2);
            imgBtn.setImageResource(R.drawable.button2);
        }
        if (diceRoll == 3)
        {
            img.setImageResource(R.drawable.img2);
            imgBtn.setImageResource(R.drawable.button3);
        }

    }
}