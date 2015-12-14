package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai7;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasBesar;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasBesarTengah;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.LabKomputer;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.LabMac;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_3;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_5;

public class Lantai_7_3 extends TourClassActivity {

    ImageButton ivMoveForward, ivMoveBackward, ivMoveElevator, ivInBigRoom, ivInLabComp, ivInLabMac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_7_3);

        //lantai berapa
        floorInformation = 7;

        //informasi yang mau dimasukkan
        String information = "Consists of 4 Big Classrooms, 2 Laboratory Rooms,"+"\n"+"2 Mac Laboratory Rooms, and 2 Painting Rooms";

        setUpLayout(information);

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_2.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivMoveElevator = (ImageButton) findViewById(R.id.ivMoveElevator);
        ivMoveElevator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_4.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });


        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_5.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivInBigRoom = (ImageButton) findViewById(R.id.ivHelp);
        ivInBigRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C701\nBig Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_7_3.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivInLabComp = (ImageButton) findViewById(R.id.ivInLabKomp);
        ivInLabComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), LabKomputer.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });


        ivInLabMac = (ImageButton) findViewById(R.id.ivInLabMac);
        ivInLabMac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), LabMac.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        animateFadeInBegin();
    }

}
