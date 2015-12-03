package com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_4;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_5;

public class KelasBesar extends TourClassActivity {

    ImageButton ivOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas_besar);

        //lantai berapa
        floorInformation = 6;

        //informasi yang mau dimasukkan
        String information = "Consists of Big Classrooms";

        setUpLayout(information);

        ivOut = (ImageButton) findViewById(R.id.ivOut);
        ivOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_4.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });
    }

}
