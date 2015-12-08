package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai11;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_11_2 extends TourClassActivity {

    ImageButton ivMoveForward, ivMoveBackward, ivForbiddenElevator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_11_2);

        floorInformation = 11;
        String information = "Consists of regular and big classrooms";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_11_3.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_11_1.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivForbiddenElevator = (ImageButton) findViewById(R.id.forbidden12);
        ivForbiddenElevator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "You can reach 12th floor of C Building with elevators";

                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_other_floor, Lantai_11_2.this, floorInformation + 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
