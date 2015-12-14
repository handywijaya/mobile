package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasRegular;

public class Lantai_10_5 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivEnter1006, ivEnter1005, ivEnter1003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_10_5);

        floorInformation = 10;
        String information = "Consists of 12 Regular Classrooms and 2 Big Classrooms.";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_10_6.class);
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
                    i = new Intent(getApplicationContext(), Lantai_10_4.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleOutBegin(v);
                }
            }
        });

        ivEnter1006 = (ImageButton) findViewById(R.id.ivEnter1006);
        ivEnter1006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C1006\nRegular Classroom";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_10_5.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        ivEnter1005 = (ImageButton) findViewById(R.id.ivEnter1005);
        ivEnter1005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C1005\nRegular Classroom";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_10_5.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        ivEnter1003 = (ImageButton) findViewById(R.id.ivEnter1003);
        ivEnter1003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C1003 and C1004\nRegular Classrooms";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_10_5.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        animateFadeInBegin();
    }

}
