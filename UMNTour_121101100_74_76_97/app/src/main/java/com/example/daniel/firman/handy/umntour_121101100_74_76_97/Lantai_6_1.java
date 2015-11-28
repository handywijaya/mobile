package com.example.daniel.firman.handy.umntour_121101100_74_76_97;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class Lantai_6_1 extends TourClassActivity implements TourClassInterface {

    public ImageView ivStairsDown, ivStairsUp, ivMoveForward, ivMoveBackward, ivMoveToilet;

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Do you want to go back to Home?")
                .setCancelable(false)
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()     {
                    public void onClick(DialogInterface arg0, int arg1) {
                        i = new Intent(getApplicationContext(), MainActivity.class);
                        animateFadeOutBegin();
                    }
                }).create().show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_6_1);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
            }
        });

        getButtonsFromXml();

        bg = (ImageView) findViewById(R.id.bg);

        /*ivStairsDown = (ImageView) findViewById(R.id.ivStairDown);
        ivStairsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This stairs connects the 5th floor and the 3rd floor of tower C.", Toast.LENGTH_SHORT).show();
            }
        });

        ivStairsUp = (ImageView) findViewById(R.id.ivStairUp);
        ivStairsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This stairs moves you to the 6th floor of tower C", Toast.LENGTH_SHORT).show();
            }
        });

        ivMoveForward = (ImageView) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lantai_6_3.class);
                startActivity(i);
                finish();
            }
        });

        ivMoveBackward = (ImageView) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lantai_6_8.class);
                startActivity(i);
                finish();
            }
        });*/

        ivMoveToilet = (ImageView) findViewById(R.id.ivMoveToilet);
        ivMoveToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), Lantai_6_2.class);
                animateFadeOutBegin();
            }
        });

        animateFadeInBegin();
    }

    @Override
    public void animateFadeOutBegin() {
        Animation fadeOut = new AlphaAnimation(1,0);

        AnimationSet animation = new AnimationSet(false); // change to false
        animation.addAnimation(fadeOut);
        animation.setDuration(1000);
        animation.setRepeatCount(1);
        bg.startAnimation(animation);

        //ditambahin mulai baris ini
        //ivStairsDown.startAnimation(animation);
        //ivStairsUp.startAnimation(animation);
        //ivMoveForward.startAnimation(animation);
        //ivMoveBackward.startAnimation(animation);
        ivMoveToilet.startAnimation(animation);

        fab.startAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bg.setVisibility(View.INVISIBLE);
                startActivity(i);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    @Override
    public void animateFadeInBegin() {
        Animation fadeIn = new AlphaAnimation(0,1);

        AnimationSet animation = new AnimationSet(false); // change to false
        animation.addAnimation(fadeIn);
        animation.setDuration(1000);
        animation.setRepeatCount(1);
        bg.startAnimation(animation);

        //tambahin mulai baris ini
        //ivStairsDown.startAnimation(animation);
        //ivStairsUp.startAnimation(animation);
        //ivMoveForward.startAnimation(animation);
        //ivMoveBackward.startAnimation(animation);
        ivMoveToilet.startAnimation(animation);

        fab.startAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
