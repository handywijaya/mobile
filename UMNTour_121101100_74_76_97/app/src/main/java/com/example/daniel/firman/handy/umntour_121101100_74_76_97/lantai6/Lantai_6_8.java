package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_6_8 extends TourClassActivity {

    ImageView ivMoveForward, ivMoveBackward, ivHelp1, ivHelp2, ivHelp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_6_8);

        //lantai berapa
        floorInformation = 6;

        //informasi yang mau dimasukkan
        String information = "Consists of Big Classrooms";

        setUpLayout(information);

        ivHelp1 = (ImageButton) findViewById(R.id.ivHelp1);
        ivHelp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C606 and C607\nBig Classrooms";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_6_8.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivHelp2 = (ImageButton) findViewById(R.id.ivHelp2);
        ivHelp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C608\nBig Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_6_8.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivHelp3 = (ImageButton) findViewById(R.id.ivHelp3);
        ivHelp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C608\nBig Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_6_8.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_1.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_7.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        animateFadeInBegin();
    }

}
