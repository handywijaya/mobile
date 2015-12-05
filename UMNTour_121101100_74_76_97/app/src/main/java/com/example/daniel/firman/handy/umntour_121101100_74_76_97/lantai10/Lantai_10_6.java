package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasRegular;

public class Lantai_10_6 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivEnter1014, ivEnter1003, ivEnter1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_10_6);

        floorInformation = 10;
        String information = "Consists of normal and big classrooms";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_10_1.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_10_5.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivEnter1014 = (ImageButton) findViewById(R.id.ivEnter1014);
        ivEnter1014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="C1014\nBig Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_10_6.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter1003 = (ImageButton) findViewById(R.id.ivEnter1003);
        ivEnter1003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info="C1003 & C1004\nBig Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_10_6.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter1001 = (ImageButton) findViewById(R.id.ivEnter1001);
        ivEnter1001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), KelasRegular.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        animateFadeInBegin();
    }

}
