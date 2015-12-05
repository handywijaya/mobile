package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasBesarTengah;

public class Lantai_10_4 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivEnter1013, ivEnter1009, ivEnter1007;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_10_4);

        floorInformation = 10;
        String information = "Consists of normal and big classrooms";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_10_5.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_10_3.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivEnter1013 = (ImageButton) findViewById(R.id.ivEnter1013);
        ivEnter1013.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), KelasBesarTengah.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivEnter1009 = (ImageButton) findViewById(R.id.ivEnter1009);
        ivEnter1009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C1009\nNormal Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_10_4.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter1007 = (ImageButton) findViewById(R.id.ivEnter1007);
        ivEnter1007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C1007 & C1008\nNormal Classrooms";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_10_4.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
