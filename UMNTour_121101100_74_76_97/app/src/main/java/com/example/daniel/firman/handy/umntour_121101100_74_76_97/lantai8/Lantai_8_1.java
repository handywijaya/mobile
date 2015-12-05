package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_8_1 extends TourClassActivity {

    public ImageButton ivStairsDown, ivMoveForward, ivMoveBackward, ivMoveToilet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_8_1);

        floorInformation = 8;
        String information = "Consists of normal and big classrooms";
        setUpLayout(information);

        ivStairsDown = (ImageButton) findViewById(R.id.ivStairDown);
        ivStairsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "Do you want to go downstairs?";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_change_floor, Lantai_8_1.this, floorInformation - 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_8_3.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_8_8.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivMoveToilet = (ImageButton) findViewById(R.id.ivMoveToilet);
        ivMoveToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "This way leads to the toilet";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_8_1.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
