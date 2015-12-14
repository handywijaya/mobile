package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai11;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasBesarTengah;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasRegular;

public class Lantai_11_4 extends TourClassActivity {

    ImageButton ivMoveForward, ivMoveBackward, ivEnter1108, ivEnter1109, ivEnter1113;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_11_4);

        floorInformation = 11;
        String information = "Consists of 12 Regular Classrooms and 2 Big Classrooms.";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_11_5.class);
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
                    i = new Intent(getApplicationContext(), Lantai_11_3.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleOutBegin(v);
                }
            }
        });

        ivEnter1108 = (ImageButton) findViewById(R.id.ivEnter1108);
        ivEnter1108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C1108\nRegular Classroom";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_11_4.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        ivEnter1109 = (ImageButton) findViewById(R.id.ivEnter1109);
        ivEnter1109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C1109\nRegular Classroom";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_11_4.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        ivEnter1113 = (ImageButton) findViewById(R.id.ivEnter1113);
        ivEnter1113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C1113\nBig Classroom";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_11_4.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        animateFadeInBegin();
    }

}
