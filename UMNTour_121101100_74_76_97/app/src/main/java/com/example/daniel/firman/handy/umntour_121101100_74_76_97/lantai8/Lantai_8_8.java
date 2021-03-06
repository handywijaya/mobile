package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasBesarTengah;

public class Lantai_8_8 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivEnter805, ivEnter807, ivEnter813, ivEnter814;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_8_8);

        floorInformation = 8;
        String information = "Consists of 12 Regular Classrooms and 2 Big Classrooms.";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_8_1.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_8_7.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleOutBegin(v);
                }
            }
        });

        ivEnter805 = (ImageButton) findViewById(R.id.ivEnter805);
        ivEnter805.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C805 and C806\nRegular Classrooms";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_8_8.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        ivEnter807 = (ImageButton) findViewById(R.id.ivEnter807);
        ivEnter807.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C807 and C808\nRegular Classrooms";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_8_8.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        ivEnter814 = (ImageButton) findViewById(R.id.ivEnter814);
        ivEnter814.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C814\nBig Classroom";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_8_8.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        ivEnter813 = (ImageButton) findViewById(R.id.ivEnter813);
        ivEnter813.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), KelasBesarTengah.class);
                    i.putExtra("Lantai", "8");
                    i.putExtra("Ruang", "813");
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });

        animateFadeInBegin();
    }

}
