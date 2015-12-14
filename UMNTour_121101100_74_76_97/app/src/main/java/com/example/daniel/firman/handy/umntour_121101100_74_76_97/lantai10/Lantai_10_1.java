package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_10_1 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivMoveLift, ivStairsUp, ivStairsDown, ivEnter1012;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_10_1);

        floorInformation = 10;
        String information = "Consists of 12 Regular Classrooms and 2 Big Classrooms.";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_10_3.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_10_6.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivMoveLift = (ImageButton) findViewById(R.id.ivMoveLift);
        ivMoveLift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_10_2.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivStairsDown = (ImageButton) findViewById(R.id.ivStairDown);
        ivStairsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "Do you want to go downstairs?";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_change_floor, Lantai_10_1.this, floorInformation - 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivStairsUp = (ImageButton) findViewById(R.id.ivStairUp);
        ivStairsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "Do you want to go upstairs?";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_change_floor, Lantai_10_1.this, floorInformation + 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter1012 = (ImageButton) findViewById(R.id.ivEnter1012);
        ivEnter1012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C1012\nRegular Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_10_1.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
