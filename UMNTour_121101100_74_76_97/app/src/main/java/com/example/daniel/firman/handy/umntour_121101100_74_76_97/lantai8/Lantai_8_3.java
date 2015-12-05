package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasRegular;

public class Lantai_8_3 extends TourClassActivity {

    public ImageButton ivMoveLeft, ivMoveBackward, ivEnter804, ivEnter803, ivEnter802, ivEnter801;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_8_3);

        floorInformation = 8;
        String information = "Consists of regular and big classrooms";
        setUpLayout(information);

        ivMoveLeft = (ImageButton) findViewById(R.id.ivMoveLeft);
        ivMoveLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_8_4.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_8_1.class);
                animateFadeOutButtonBegin(layout);
                animateScaleOutBegin(v);
            }
        });

        ivEnter804 = (ImageButton) findViewById(R.id.ivEnter804);
        ivEnter804.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C804\nRegular Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_8_3.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter803 = (ImageButton) findViewById(R.id.ivEnter803);
        ivEnter803.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C803\nRegular Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_8_3.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter802 = (ImageButton) findViewById(R.id.ivEnter802);
        ivEnter802.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "C802\nRegular Classroom";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_8_3.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivEnter801 = (ImageButton) findViewById(R.id.ivEnter801);
        ivEnter801.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), KelasRegular.class);
                i.putExtra("Lantai", "8");
                i.putExtra("Ruang", "801");
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        animateFadeInBegin();
    }

}
