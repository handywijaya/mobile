package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;

public class Lantai_6_2 extends TourClassActivity {

    ImageButton ivMoveBackward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_6_2);

        //lantai berapa
        floorInformation = 6;

        //informasi yang mau dimasukkan
        String information = "Consists of 10 Big Classrooms and is connected to the Annex (Decoration Room).";

        setUpLayout(information);

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_1.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        animateFadeInBegin();
    }
}
