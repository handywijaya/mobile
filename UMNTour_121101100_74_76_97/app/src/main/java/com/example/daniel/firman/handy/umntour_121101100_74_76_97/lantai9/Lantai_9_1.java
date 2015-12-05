package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_9_1 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivMoveLift, ivStairsDown, ivStairsUp, ivEnter912;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_9_1);

        floorInformation = 9;
        String information = "Consists of normal and big classrooms";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_9_3.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_9_6.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivMoveLift = (ImageButton) findViewById(R.id.ivMoveLift);
        ivMoveLift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_9_2.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivStairsUp = (ImageButton) findViewById(R.id.ivStairUp);
        ivStairsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "Do you want to go upstairs?";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_change_floor, Lantai_9_1.this, floorInformation + 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivStairsDown = (ImageButton) findViewById(R.id.ivStairDown);
        ivStairsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "Do you want to go downstairs?";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_change_floor, Lantai_9_1.this, floorInformation - 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter912 = (ImageButton) findViewById(R.id.ivEnter912);
        ivEnter912.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C912\nNormal Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_9_1.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
