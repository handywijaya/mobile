package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasBesarTengah;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasRegular;

public class Lantai_9_6 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivEnter913, ivEnter901, ivEnter903;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_9_6);

        floorInformation = 9;
        String information = "Consists of 12 Regular Classrooms and 2 Big Classrooms.";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_9_1.class);
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
                    i = new Intent(getApplicationContext(), Lantai_9_5.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleOutBegin(v);
                }
            }
        });

        ivEnter901 = (ImageButton) findViewById(R.id.ivEnter901);
        ivEnter901.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), KelasRegular.class);
                    i.putExtra("Lantai", "9");
                    i.putExtra("Ruang", "901");
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });

        ivEnter903 = (ImageButton) findViewById(R.id.ivEnter903);
        ivEnter903.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C903 and C904\nRegular Classrooms";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_9_6.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        ivEnter913 = (ImageButton) findViewById(R.id.ivEnter913);
        ivEnter913.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), KelasBesarTengah.class);
                    i.putExtra("Lantai", "9");
                    i.putExtra("Ruang", "913");
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });

        animateFadeInBegin();
    }

}
