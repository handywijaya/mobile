package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai7;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_1;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_2;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_3;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_8;

public class Lantai_7_1 extends TourClassActivity {

    public ImageButton ivStairsDown, ivStairsUp, ivMoveForward, ivMoveBackward, ivHelpToilet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_7_1);
        //lantai berapa
        floorInformation = 7;

        //informasi yang mau dimasukkan
        String information = "Consists of Big Classrooms, Laboratory Room,"+"\n"+"Mac Laboratory Room, and Painting Room";

        setUpLayout(information);

        ivStairsDown = (ImageButton) findViewById(R.id.ivStairDown);
        ivStairsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="Do you want to go downstairs?";

                //kalo turun kasi floorInformation - 1
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_change_floor, Lantai_7_1.this, floorInformation - 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivStairsUp = (ImageButton) findViewById(R.id.ivStairUp);
        ivStairsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //keterangan dialog fragment
                String info = "Do you want to go upstairs?";

                //kalo naek kasi floorInformation + 1
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_change_floor, Lantai_8_1.this, floorInformation + 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        //selain backward pake scale in
        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_2.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        //backward pake scale out
        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_6.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });


        ivHelpToilet = (ImageButton) findViewById(R.id.ivMoveToilet);
        ivHelpToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "This leads to toilet";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_7_1.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
