package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;

public class Lantai_6_1 extends TourClassActivity {

    public ImageView ivStairsDown, ivStairsUp, ivMoveForward, ivMoveBackward, ivMoveToilet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_6_1);

        String floorInformation = "6th Floor";
        String information = "Consists of Big Classrooms";

        setUpLayout(floorInformation, information);

        bg = (ImageView) findViewById(R.id.bg);

        /*ivStairsDown = (ImageView) findViewById(R.id.ivStairDown);
        ivStairsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This stairs connects the 5th floor and the 3rd floor of tower C.", Toast.LENGTH_SHORT).show();
            }
        });

        ivStairsUp = (ImageView) findViewById(R.id.ivStairUp);
        ivStairsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This stairs moves you to the 6th floor of tower C", Toast.LENGTH_SHORT).show();
            }
        });

        ivMoveForward = (ImageView) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lantai_6_3.class);
                startActivity(i);
                finish();
            }
        });*/

        ivMoveBackward = (ImageView) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_2.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivMoveToilet = (ImageView) findViewById(R.id.ivMoveToilet);
        ivMoveToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_2.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        animateFadeInBegin();
    }
}
