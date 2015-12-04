package com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_4;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai7.Lantai_7_2;

public class KelasLukis extends TourClassActivity {

    ImageButton ivOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas_lukis);

        //lantai berapa
        floorInformation = 7;

        //informasi yang mau dimasukkan
        String information = "C704\n" +
                "Painting Classroom";

        setUpLayout(information);

        ivOut = (ImageButton) findViewById(R.id.ivOut);
        ivOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_2.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        animateFadeInBegin();
    }

}
