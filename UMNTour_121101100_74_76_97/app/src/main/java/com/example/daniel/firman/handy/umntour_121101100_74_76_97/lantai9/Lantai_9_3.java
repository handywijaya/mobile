package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_9_3 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivEnter911, ivEnter909;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_9_3);

        floorInformation = 9;
        String information = "Consists of normal and big classrooms";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_9_4.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_9_2.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivEnter911 = (ImageButton) findViewById(R.id.ivEnter911);
        ivEnter911.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C911\nNormal Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_9_3.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter909 = (ImageButton) findViewById(R.id.ivEnter909);
        ivEnter909.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C909 & C910\nNormal Classrooms";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_9_3.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
