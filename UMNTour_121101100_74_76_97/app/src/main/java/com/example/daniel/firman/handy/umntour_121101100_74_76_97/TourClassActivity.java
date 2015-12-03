package com.example.daniel.firman.handy.umntour_121101100_74_76_97;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.external.BlurDialog;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai6.Lantai_6_1;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.lantai7.Lantai_7_1;

/**
 * Created by Handy on 11/28/2015.
 */
public class TourClassActivity extends AppCompatActivity {
    Boolean isFabOpen = false;
    protected FloatingActionButton fab,fab1,fab2,fab3;
    Animation fab_open,fab_close,rotate_forward,rotate_backward;
    protected ImageView bg;
    protected Intent i;
    protected RelativeLayout layout;
    protected int floorInformation;
    protected BlurDialog blurDialog;

    @Override
    public void onBackPressed() {
        int info1 = 6;
        String info2 = "Info";
        blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_home, TourClassActivity.this, info1, info2);
        blurDialog.show(getFragmentManager(), "blur_sample");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
    }

    protected void setUpLayout(final String info2) {
        layout = (RelativeLayout) findViewById(R.id.layout);
        bg = (ImageView) findViewById(R.id.bg);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);

        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_backward);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_home, TourClassActivity.this, floorInformation, info2);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_about_us, TourClassActivity.this, floorInformation, info2);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blurDialog = new BlurDialog().newInstance(R.layout.dialog_fragment_information, TourClassActivity.this, floorInformation, info2);
                blurDialog.show(getFragmentManager(), "blur_sample");
            }
        });
    }

    protected void animateFadeOutBegin() {
        Animation fadeOut = new AlphaAnimation(1,0);
        fadeOut.setDuration(1000);
        fadeOut.setFillAfter(true);

        bg.startAnimation(fadeOut);

        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(i);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    protected void animateFadeInBegin() {
        Animation fadeIn = new AlphaAnimation(0,1);
        fadeIn.setDuration(1000);
        fadeIn.setFillAfter(true);

        bg.startAnimation(fadeIn);
        setButtonInvis(layout);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animateFadeInButtonBegin(layout);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

    protected void animateFadeOutButtonBegin(ViewGroup v) {
        Animation fadeOut = new AlphaAnimation(1,0);
        fadeOut.setDuration(400);
        fadeOut.setFillAfter(true);

        for (int i = 0; i < v.getChildCount(); i++) {
            View child = v.getChildAt(i);
            if(child instanceof ViewGroup)
                animateFadeOutButtonBegin((ViewGroup) child);
            else if(child instanceof FloatingActionButton) {
                if(child.getId() == R.id.fab) child.startAnimation(fadeOut);
                if(isFabOpen) child.startAnimation(fadeOut);
            }
            else if(child instanceof ImageButton)
                child.startAnimation(fadeOut);
        }
    }

    protected void animateFadeInButtonBegin(ViewGroup v) {

        Animation fadeIn = new AlphaAnimation(0,1);
        fadeIn.setDuration(400);
        fadeIn.setFillAfter(true);

        for (int i = 0; i < v.getChildCount(); i++) {
            View child = v.getChildAt(i);
            if(child instanceof ViewGroup)
                animateFadeInButtonBegin((ViewGroup) child);
            else if(child instanceof FloatingActionButton) {
                if(child.getId() == R.id.fab) child.startAnimation(fadeIn);
            }
            else if(child instanceof ImageButton) {
                child.startAnimation(fadeIn);
            }
        }

    }

    protected void animateScaleOutBegin(View v) {
        Animation scaleOut = new ScaleAnimation(1, 1f, 1, 1f, v.getX(), v.getY());
        scaleOut.setDuration(400);
        bg.startAnimation(scaleOut);

        scaleOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animateFadeOutBegin();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    protected void animateScaleInBegin(View v) {
        Animation scaleIn = new ScaleAnimation(1, 3f, 1, 3f, v.getX(), v.getY());
        scaleIn.setDuration(1000);
        bg.startAnimation(scaleIn);

        scaleIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animateFadeOutBegin();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void animateFab() {
        if(isFabOpen){

            fab.startAnimation(rotate_backward);
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);
            fab3.startAnimation(fab_close);
            fab1.setClickable(false);
            fab2.setClickable(false);
            fab3.setClickable(false);
            isFabOpen = false;

        } else {

            fab.startAnimation(rotate_forward);
            fab1.startAnimation(fab_open);
            fab2.startAnimation(fab_open);
            fab3.startAnimation(fab_open);
            fab1.setClickable(true);
            fab2.setClickable(true);
            fab3.setClickable(true);
            isFabOpen = true;
            Log.d("Raj", "open");

        }
    }

    public void goHome() {
        i = new Intent(getApplicationContext(), MainActivity.class);
        animateFadeOutButtonBegin(layout);
        animateFadeOutBegin();
    }

    public void changeFloor(int floor) {
        switch(floor) {
            case 6 :
                i = new Intent(getApplicationContext(), Lantai_6_1.class);
                animateFadeOutBegin();
                break;
            case 7 :
                i = new Intent(getApplicationContext(), Lantai_7_1.class);
                animateFadeOutBegin();
                break;
            case 8 :
                /*i = new Intent(getApplicationContext(), Lantai_8_1.class);
                animateFadeOutBegin();
                break;*/
            case 9 :
                /*i = new Intent(getApplicationContext(), Lantai_9_1.class);
                animateFadeOutBegin();
                break;*/
            case 10 :
                /*i = new Intent(getApplicationContext(), Lantai_10_1.class);
                animateFadeOutBegin();
                break;*/
            case 11 :
                /*i = new Intent(getApplicationContext(), Lantai_11_1.class);
                animateFadeOutBegin();*/
                break;
        }

    }

    protected void setButtonInvis(ViewGroup v) {
        for (int i = 0; i < v.getChildCount(); i++) {
            View child = v.getChildAt(i);
            if(child instanceof ViewGroup)
                setButtonInvis((ViewGroup) child);
            else if(child instanceof ImageButton)
                child.setVisibility(View.INVISIBLE);
        }
    }
}
