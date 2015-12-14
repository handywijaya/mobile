package com.example.daniel.firman.handy.umntour_121101100_74_76_97.kelas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_4;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai7.Lantai_7_5;

public class KelasBesar extends TourClassActivity {

    ImageButton ivOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas_besar);

        String lantai = getIntent().getStringExtra("Lantai");
        String ruang = getIntent().getStringExtra("Ruang");

        //lantai berapa
        floorInformation = Integer.parseInt(lantai);

        String information = "C"+ Integer.parseInt(ruang) + "\nBig Classroom\n" +
                "Used for lectures from any faculty";

        setUpLayout(information);

        ivOut = (ImageButton) findViewById(R.id.ivOut);
        ivOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    if (floorInformation == 6)
                        i = new Intent(getApplicationContext(), Lantai_6_4.class);
                    else if (floorInformation == 7)
                        i = new Intent(getApplicationContext(), Lantai_7_5.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });

        animateFadeInBegin();
    }

}
