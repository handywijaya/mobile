package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasBesar;

public class Lantai_6_5 extends TourClassActivity {

    ImageButton ivMoveRight, ivMoveLeft, ivMoveBackward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_6_5);

        //lantai berapa
        floorInformation = 6;

        //informasi yang mau dimasukkan
        String information = "Consists of 10 Big Classrooms and is connected to the Annex (Decoration Room).";

        setUpLayout(information);

        ivMoveRight = (ImageButton) findViewById(R.id.ivMoveRight);
        ivMoveRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_6.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveLeft = (ImageButton) findViewById(R.id.ivMoveLeft);
        ivMoveLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_7.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_4.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        animateFadeInBegin();
    }

}
