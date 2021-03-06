package com.example.daniel.firman.handy.umntour_121101100_74_76_97;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_1;

public class MainActivity extends TourClassActivity {

    private ImageButton ivStart,ivCredit,ivExit;

    @Override
    public void onBackPressed() {
        String info = "Exit";
        blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_exit, MainActivity.this, floorInformation, info);
        blurDialog.show(getFragmentManager(), "blur_sample");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);

        setContentView(R.layout.activity_main);

        ivStart = (ImageButton)findViewById(R.id.btnStartTour);
        ivCredit = (ImageButton)findViewById(R.id.btnCredit);
        ivExit = (ImageButton)findViewById(R.id.btnExit);

        layout = (RelativeLayout) findViewById(R.id.layout);
        ivStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_1.class);
                i.putExtra("Start", "Begin");
                animateFadeOutButtonBegin(layout);
                animateFadeOutBegin();
            }
        });


        ivCredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "Credit";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_credit, MainActivity.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        ivExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "Exit";
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_exit, MainActivity.this, floorInformation, info);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });
        bg = (ImageView) findViewById(R.id.bg);

        animateFadeInBegin();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
