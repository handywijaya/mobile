package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;

public class Lantai_10_1 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivMoveLift, ivStairsUp, ivStairsDown, ivEnter912;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_10_1);

        floorInformation = 1;
        String information = "Consists of normal and big classrooms";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //i = new Intent();
            }
        });

        animateFadeInBegin();
    }

}
