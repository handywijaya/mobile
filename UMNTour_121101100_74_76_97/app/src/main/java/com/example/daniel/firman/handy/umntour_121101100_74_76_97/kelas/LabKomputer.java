package com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai7.Lantai_7_2;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai7.Lantai_7_3;

public class LabKomputer extends TourClassActivity {


    ImageButton ivOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_komputer);


        //lantai berapa
        floorInformation = 7;

        //informasi yang mau dimasukkan
        String information = "C702\n" +
                "Computer Laboratory";

        setUpLayout(information);

        ivOut = (ImageButton) findViewById(R.id.ivOut);
        ivOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_7_3.class);
                animateFadeOutButtonBegin(layout);
                animateScaleInBegin(v);
            }
        });

        animateFadeInBegin();
    }

}
