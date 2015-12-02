package com.example.daniel.firman.handy.umntour_121101100_74_76_97.external;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;

import fr.tvbarthel.lib.blurdialogfragment.BlurDialogFragment;

/**
 * Created by Handy on 12/2/2015.
 */
public class BlurDialog extends BlurDialogFragment {

    /**
     * Bundle key used to start the blur dialog with a given scale factor (float).
     */
    private static final String BUNDLE_KEY_DOWN_SCALE_FACTOR = "bundle_key_down_scale_factor";

    /**
     * Bundle key used to start the blur dialog with a given blur radius (int).
     */
    private static final String BUNDLE_KEY_BLUR_RADIUS = "bundle_key_blur_radius";

    /**
     * Bundle key used to start the blur dialog with a given dimming effect policy.
     */
    private static final String BUNDLE_KEY_DIMMING = "bundle_key_dimming_effect";

    /**
     * Bundle key used to start the blur dialog with a given debug policy.
     */
    private static final String BUNDLE_KEY_DEBUG = "bundle_key_debug_effect";

    private int mRadius;
    private float mDownScaleFactor;
    private boolean mDimming;
    private boolean mDebug;

    static int layoutInt;
    static BlurDialog fragment;
    private static TourClassActivity tourClass;
    static String floorInformation, information;
    Button btnYes, btnNo, btnClose;

    public static BlurDialog newInstance(int layoutId, TourClassActivity tourClassActivity, String floorInfo, String info) {
        fragment = new BlurDialog();
        Bundle args = new Bundle();
        args.putInt(
                BUNDLE_KEY_BLUR_RADIUS,
                18
        );
        args.putFloat(
                BUNDLE_KEY_DOWN_SCALE_FACTOR,
                12
        );
        args.putBoolean(
                BUNDLE_KEY_DIMMING,
                false
        );
        args.putBoolean(
                BUNDLE_KEY_DEBUG,
                false
        );

        layoutInt = layoutId;
        tourClass = tourClassActivity;
        floorInformation = floorInfo;
        information = info;

        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        Bundle args = getArguments();
        mRadius = args.getInt(BUNDLE_KEY_BLUR_RADIUS);
        mDownScaleFactor = args.getFloat(BUNDLE_KEY_DOWN_SCALE_FACTOR);
        mDimming = args.getBoolean(BUNDLE_KEY_DIMMING);
        mDebug = args.getBoolean(BUNDLE_KEY_DEBUG);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        final View view = getActivity().getLayoutInflater().inflate(layoutInt, null);

        switch(layoutInt) {
            case R.layout.dialog_fragment_home :
                btnYes = (Button) view.findViewById(R.id.btnYes);
                btnNo = (Button) view.findViewById(R.id.btnNo);
                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.goHome();
                        fragment.dismiss();
                    }
                });
                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fragment.dismiss();
                    }
                });
                break;
            case R.layout.dialog_fragment_about_us :
                btnClose = (Button) view.findViewById(R.id.btnClose);
                btnClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fragment.dismiss();
                    }
                });
                break;
            case R.layout.dialog_fragment_information :
                TextView tvFloor = (TextView) view.findViewById(R.id.tvFloor);
                tvFloor.setText(floorInformation);
                TextView tvInfo = (TextView) view.findViewById(R.id.tvInfo);
                tvInfo.setText(information);
                btnClose = (Button) view.findViewById(R.id.btnClose);
                btnClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fragment.dismiss();
                    }
                });
                break;
        }
        builder.setView(view);
        return builder.create();
    }

    @Override
    protected boolean isDebugEnable() {
        return mDebug;
    }

    @Override
    protected boolean isDimmingEnable() {
        return mDimming;
    }

    @Override
    protected boolean isActionBarBlurred() {
        return true;
    }

    @Override
    protected float getDownScaleFactor() {
        return mDownScaleFactor;
    }

    @Override
    protected int getBlurRadius() {
        return mRadius;
    }

}