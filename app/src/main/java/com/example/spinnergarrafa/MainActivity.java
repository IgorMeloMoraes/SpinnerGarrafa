package com.example.spinnergarrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgGarrfa;
    TextView txtHeader;
    int currentPoint;
    int nextPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgGarrfa = findViewById(R.id.garrafa);
        txtHeader = findViewById(R.id.txtHeader);

        imgGarrfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                girarGarrafa();
            }
        });
    }

    private void girarGarrafa() {
        txtHeader.setText("Gira Gira");

        nextPoint = new Random().nextInt(5000);

        int pX = imgGarrfa.getWidth() / 2;
        int pY = imgGarrfa.getHeight() / 2;

        Animation rotate = new RotateAnimation(currentPoint, nextPoint, pX, pY);

        rotate.setDuration(3000);
        rotate.setFillAfter(true);

        currentPoint = nextPoint;

        imgGarrfa.setAnimation(rotate);
    }
}