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
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas.KelasLukis;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_1;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_4;

public class Lantai_7_2 extends TourClassActivity {

    ImageButton ivMoveBackward, ivMoveForward, ivHelp, ivRuangLukis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_7_2);

        //lantai berapa
        floorInformation = 7;

        //informasi yang mau dimasukkan
        String information = "Consists of 4 Big Classrooms, 2 Laboratory Rooms,"+"\n"+"2 Mac Laboratory Rooms, and 2 Painting Rooms";

        setUpLayout(information);

        ivHelp = (ImageButton) findViewById(R.id.ivHelpLukis);
        ivHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "C703\nPainting Room";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, Lantai_7_2.this, floorInformation, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        ivRuangLukis = (ImageButton) findViewById(R.id.ivLukis);
        ivRuangLukis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), KelasLukis.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });

        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_7_3.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });

        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_7_1.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleOutBegin(v);
                }
            }
        });

        animateFadeInBegin();
    }

}
