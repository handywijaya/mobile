package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai7;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_1;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_7;

public class Lantai_7_6 extends TourClassActivity {

    ImageView ivMoveForward, ivMoveBackward, ivHelpCompLab2, ivHelpMacLab, ivHelpCompLab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_7_6);

        //lantai berapa
        floorInformation = 7;

        //informasi yang mau dimasukkan
        String information = "Consists of Big Classrooms, Laboratory Rooms,"+"\n"+"Mac Laboratory Rooms, and Painting Rooms";

        setUpLayout(information);
        //705
        ivHelpCompLab2 = (ImageButton) findViewById(R.id.ivHelpCompLab2);
        ivHelpCompLab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C705\nComputer Laboratory";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_7_6.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });
        //706
        ivHelpCompLab = (ImageButton) findViewById(R.id.ivHelpCompLab);
        ivHelpCompLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C706\nComputer Laboratory";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_7_6.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivHelpMacLab = (ImageButton) findViewById(R.id.ivHelpMacLab);
        ivHelpMacLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C710\nMac Laboratory";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_7_6.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_1.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_5.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        animateFadeInBegin();
    }

}
