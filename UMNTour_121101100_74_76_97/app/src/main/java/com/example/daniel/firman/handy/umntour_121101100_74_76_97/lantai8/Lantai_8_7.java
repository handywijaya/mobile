package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_8_7 extends TourClassActivity {

    public ImageButton ivMoveForward, ivMoveBackward, ivEnter812, ivEnter811, ivEnter810;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_8_7);

        floorInformation = 8;
        String information = "Consists of normal and big classrooms";
        setUpLayout(information);

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_8_8.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_8_6.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivEnter812 = (ImageButton) findViewById(R.id.ivEnter812);
        ivEnter812.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C812\nNormal Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_other_floor, Lantai_8_7.this, floorInformation - 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter811 = (ImageButton) findViewById(R.id.ivEnter811);
        ivEnter811.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C811\nNormal Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_other_floor, Lantai_8_7.this, floorInformation - 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter810 = (ImageButton) findViewById(R.id.ivEnter810);
        ivEnter810.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C809-C810\nNormal Classrooms";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_other_floor, Lantai_8_7.this, floorInformation - 1, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        animateFadeInBegin();
    }

}
