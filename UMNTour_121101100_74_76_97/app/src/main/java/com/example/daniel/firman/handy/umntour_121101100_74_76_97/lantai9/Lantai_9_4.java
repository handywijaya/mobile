package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_9_4 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivEnter907, ivEnter909, ivEnter914;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_9_4);

        floorInformation = 9;
        String information = "Consists of normal and big classrooms";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_9_5.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_9_3.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivEnter907 = (ImageButton) findViewById(R.id.ivEnter907);
        ivEnter907.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C907 & C908\nNormal Classrooms";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_9_4.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter909 = (ImageButton) findViewById(R.id.ivEnter909);
        ivEnter909.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C909\nNormal Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_9_4.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter914 = (ImageButton) findViewById(R.id.ivEnter914);
        ivEnter914.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C914\nBig Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_9_4.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
