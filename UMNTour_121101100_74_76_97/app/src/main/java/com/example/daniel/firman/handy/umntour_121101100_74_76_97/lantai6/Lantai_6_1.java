package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_6_1 extends TourClassActivity {

    public ImageButton ivStairsDown, ivStairsUp, ivMoveForward, ivMoveBackward, ivMoveToilet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_6_1);

        floorInformation = 6;
        String information = "Consists of Big Classrooms";

        setUpLayout(information);

        bg = (ImageView) findViewById(R.id.bg);

        ivStairsDown = (ImageButton) findViewById(R.id.ivStairDown);
        ivStairsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "This stairs connects the 6th floor and the 5th floor of tower C";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_other_floor, Lantai_6_1.this, floorInformation - 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivStairsUp = (ImageButton) findViewById(R.id.ivStairUp);
        ivStairsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "Do you want to go upstairs?";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_change_floor, Lantai_6_1.this, floorInformation + 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_3.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_8.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivMoveToilet = (ImageButton) findViewById(R.id.ivMoveToilet);
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
