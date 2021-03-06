package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai7;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_4;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_6;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_7;

public class Lantai_7_4 extends TourClassActivity {


    ImageButton ivMoveLeft, ivMoveBackward, ivElevator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_7_4);

        //lantai berapa
        floorInformation = 7;

        //informasi yang mau dimasukkan
        String information = "Consists of 4 Big Classrooms, 2 Laboratory Rooms,"+"\n"+"2 Mac Laboratory Rooms, and 2 Painting Rooms";

        setUpLayout(information);

        ivMoveLeft = (ImageButton) findViewById(R.id.ivMoveLeft);
        ivMoveLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_7_5.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });


        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_7_3.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleOutBegin(v);
                }
            }
        });

        ivElevator = (ImageButton) findViewById(R.id.ivElevator);
        ivElevator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "Elevator";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_elevator, Lantai_7_4.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        animateFadeInBegin();
    }

}
