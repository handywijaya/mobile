package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai11;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_11_5 extends TourClassActivity {

    ImageButton ivMoveForward, ivMoveBackward, ivEnter1103, ivEnter1105, ivEnter1106;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_11_5);

        floorInformation = 11;
        String information = "Consists of 12 Regular Classrooms and 2 Big Classrooms.";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_11_6.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_11_4.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivEnter1103 = (ImageButton) findViewById(R.id.ivEnter1103);
        ivEnter1103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C1103 and C1104\nRegular Classrooms";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_11_5.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter1105 = (ImageButton) findViewById(R.id.ivEnter1105);
        ivEnter1105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C1105\nNormal Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_11_5.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter1106 = (ImageButton) findViewById(R.id.ivEnter1106);
        ivEnter1106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C1106\nNormal Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_11_5.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
