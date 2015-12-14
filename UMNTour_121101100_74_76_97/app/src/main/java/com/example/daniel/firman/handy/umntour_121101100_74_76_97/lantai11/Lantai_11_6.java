package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai11;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_11_6 extends TourClassActivity {

    ImageButton ivMoveForward, ivMoveBackward, ivEnter1101, ivEnter1104, ivEnter1114;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_11_6);

        floorInformation = 11;
        String information = "Consists of 12 Regular Classrooms and 2 Big Classrooms.";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_11_1.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_11_5.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivEnter1101 = (ImageButton) findViewById(R.id.ivEnter1101);
        ivEnter1101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C1101 and C1102\nRegular Classrooms";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_11_6.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter1104 = (ImageButton) findViewById(R.id.ivEnter1104);
        ivEnter1104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C1104\nRegular Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_11_6.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter1114 = (ImageButton) findViewById(R.id.ivEnter1114);
        ivEnter1114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C1114\nBig Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_11_6.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
