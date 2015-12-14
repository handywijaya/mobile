package com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;

public class Lantai_6_1 extends TourClassActivity {

    public ImageButton ivStairsDown, ivStairsUp, ivMoveForward, ivMoveBackward, ivMoveToilet;
    int counter = 0;
    int beginTutorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lantai_6_1);

        start = getIntent().getStringExtra("Start");

        //lantai berapa
        floorInformation = 6;

        //informasi yang mau dimasukkan
        String information = "Consists of 10 Big Classrooms and is connected to the Annex (Decoration Room).";

        setUpLayout(information);

        ivStairsDown = (ImageButton) findViewById(R.id.ivStairDown);
        ivStairsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    String info = "This stairs connects the 6th floor and the 5th floor of tower C";
                    //kalo turun kasi floorInformation - 1
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_other_floor, Lantai_6_1.this, floorInformation - 1, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        ivStairsUp = (ImageButton) findViewById(R.id.ivStairUp);
        ivStairsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    //keterangan dialog fragment
                    String info = "Do you want to go upstairs?";

                    //kalo naek kasi floorInformation + 1
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_change_floor, Lantai_6_1.this, floorInformation + 1, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
            }
        });

        //selain backward pake scale in
        ivMoveForward = (ImageButton) findViewById(R.id.ivMoveForward);
        ivMoveForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_6_3.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });

        //backward pake scale out
        ivMoveBackward = (ImageButton) findViewById(R.id.ivMoveBackward);
        ivMoveBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_6_8.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleOutBegin(v);
                }
            }
        });

        ivMoveToilet = (ImageButton) findViewById(R.id.ivMoveToilet);
        ivMoveToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonClick == 1) {
                    buttonClick = 0;
                    i = new Intent(getApplicationContext(), Lantai_6_2.class);
                    animateFadeOutButtonBegin(layout);
                    animateScaleInBegin(v);
                }
            }
        });

        animateFadeInBegin();
    }

    public void animateButtonStairsDown() {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(400);
        fadeIn.setFillAfter(true);

        ivStairsDown.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animateButtonStairsUp();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void animateButtonStairsUp() {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(400);
        fadeIn.setFillAfter(true);

        ivStairsUp.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animateButtonMoveForward();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void animateButtonMoveToilet() {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(400);
        fadeIn.setFillAfter(true);

        ivMoveToilet.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animateButtonMoveBackward();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void animateButtonMoveForward() {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(400);
        fadeIn.setFillAfter(true);

        ivMoveForward.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animateButtonMoveToilet();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void animateButtonMoveBackward() {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(400);
        fadeIn.setFillAfter(true);

        ivMoveBackward.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animateButtonFab();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void animateButtonFab() {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(400);
        fadeIn.setFillAfter(true);

        fab.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animateButtonFab3();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void animateButtonFab3() {
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(400);
        fadeIn.setFillAfter(true);

        fab3.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if(start != null) {
                    String info = "Tutorial";
                    blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_start, Lantai_6_1.this, floorInformation + 1, info);
                    blurDialog.show(getFragmentManager(), "blur_sample");
                }
                buttonClick = 1;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    @Override
    protected void animateFadeInButtonBegin(final ViewGroup v) {

        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(400);
        fadeIn.setFillAfter(true);

        if(start != null) {
            animateButtonStairsDown();
        }
        else {
            for (int i = 0; i < v.getChildCount(); i++) {
                View child = v.getChildAt(i);
                if(child instanceof ViewGroup)
                    animateFadeInButtonBegin((ViewGroup) child);
                else if(child instanceof FloatingActionButton) {
                    if(child.getId() == R.id.fab || child.getId() == R.id.fab3) child.startAnimation(fadeIn);
                }
                else if(child instanceof ImageButton) {
                    child.startAnimation(fadeIn);
                }
            }
        }
    }
}
