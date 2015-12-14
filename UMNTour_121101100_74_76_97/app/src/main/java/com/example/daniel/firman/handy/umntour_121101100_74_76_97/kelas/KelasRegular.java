package com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai10.Lantai_10_6;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai8.Lantai_8_3;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai9.Lantai_9_6;

public class KelasRegular extends TourClassActivity {

    ImageButton ivOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas_regular);

        String lantai = getIntent().getStringExtra("Lantai");
        String ruang = getIntent().getStringExtra("Ruang");

        //lantai berapa
        floorInformation = Integer.parseInt(lantai);

        //informasi yang mau dimasukkan
        String information = "C"+ Integer.parseInt(ruang) + "\nRegular Classroom\nUsed for lectures from any faculty";

        setUpLayout(information);

        ivOut = (ImageButton) findViewById(R.id.ivOut);
        ivOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    if (floorInformation == 8)
                        i = new Intent(getApplicationContext(), Lantai_8_3.class);
                    else if (floorInformation == 9)
                        i = new Intent(getApplicationContext(), Lantai_9_6.class);
                    else if (floorInformation == 10)
                        i = new Intent(getApplicationContext(), Lantai_10_6.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });

        animateFadeInBegin();
    }

}
