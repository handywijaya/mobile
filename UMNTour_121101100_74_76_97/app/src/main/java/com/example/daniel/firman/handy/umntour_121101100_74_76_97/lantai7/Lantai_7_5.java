package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai7;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_6;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_8;

public class Lantai_7_5 extends TourClassActivity {


    ImageButton ivMoveForward, ivMoveBackward, ivHelpCompLab, ivHelpBigClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_7_5);

        //lantai berapa
        floorInformation = 7;

        //informasi yang mau dimasukkan
        String information = "Consists of 4 Big Classrooms, 2 Laboratory Rooms,"+"\n"+"2 Mac Laboratory Rooms, and 2 Painting Rooms";

        setUpLayout(information);

        ivHelpCompLab = (ImageButton) findViewById(R.id.ivHelpCompLab);
        ivHelpCompLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C706 and C707\nComputer Laboratories";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_7_5.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivHelpBigClass = (ImageButton) findViewById(R.id.ivHelpBigClass);
        ivHelpBigClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C708\nBig Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_7_5.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_6.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_3.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        animateFadeInBegin();
    }

}
