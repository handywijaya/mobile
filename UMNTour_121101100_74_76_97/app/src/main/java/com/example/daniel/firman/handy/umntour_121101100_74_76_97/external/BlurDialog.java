package com.example.daniel.firman.handy.umntour_121101100_74_76_97.external;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daniel.firman.handy.umntour_121101100_74_76_97.R;
import com.example.daniel.firman.handy.umntour_121101100_74_76_97.TourClassActivity;

import java.util.ArrayList;
import java.util.List;

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
    static int floor;
    static String information;
    List<Integer> floorList;
    List<String> textFloorList;
    Button btnYes, btnNo, btnClose;

    public static BlurDialog newInstance(int layoutId, TourClassActivity tourClassActivity, int floorInformation, String info) {
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
        floor = floorInformation;
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
        View view = getActivity().getLayoutInflater().inflate(layoutInt, null);

        switch(layoutInt) {
            case R.layout.dialog_fragment_home :
                btnYes = (Button) view.findViewById(R.id.btnYes);
                btnNo = (Button) view.findViewById(R.id.btnNo);
                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.goHome();
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });
                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });
                break;
            case R.layout.dialog_fragment_about_us :
                btnClose = (Button) view.findViewById(R.id.btnClose);
                btnClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });
                break;
            case R.layout.dialog_fragment_information :
                TextView tvFloor = (TextView) view.findViewById(R.id.tvFloor);
                tvFloor.setText(floor + "th Floor");
                TextView tvInfo = (TextView) view.findViewById(R.id.tvInfo);
                tvInfo.setText(information);
                btnClose = (Button) view.findViewById(R.id.btnClose);
                btnClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });
                break;
            case R.layout.dialog_fragment_change_floor:
                btnYes = (Button) view.findViewById(R.id.btnYes);
                btnNo = (Button) view.findViewById(R.id.btnNo);
                TextView tvChangeFloor = (TextView) view.findViewById(R.id.tvChangeFloor);
                tvChangeFloor.setText(information);
                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.changeFloor(floor);
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });
                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });
                break;
            case R.layout.dialog_fragment_other_floor:
                TextView tv = (TextView) view.findViewById(R.id.textView);
                tv.setText(information);
                btnClose = (Button) view.findViewById(R.id.btnClose);
                btnClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });
                break;
            case R.layout.dialog_fragment_start:
                btnClose = (Button) view.findViewById(R.id.btnClose);
                btnClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });
                break;
            case R.layout.dialog_fragment_credit:
                btnClose = (Button) view.findViewById(R.id.btnClose);
                btnClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });
                break;
            case R.layout.dialog_fragment_exit:
                btnYes = (Button) view.findViewById(R.id.btnYes);
                btnNo = (Button) view.findViewById(R.id.btnNo);
                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.exitApp();
                        fragment.dismiss();
                    }
                });
                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });
                break;
            case R.layout.dialog_fragment_elevator:
                textFloorList = new ArrayList<>();
                floorList = new ArrayList<>();
                for(int j = 6; j < 12; j++) {
                    if(j == floor) continue;
                    else {
                        textFloorList.add(j + "th Floor");
                        floorList.add(j);
                    }
                }

                Button btn1 = (Button) view.findViewById(R.id.btn1);
                btn1.setText(textFloorList.get(0));
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.changeFloorElevator(floorList.get(0));
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });

                Button btn2 = (Button) view.findViewById(R.id.btn2);
                btn2.setText(textFloorList.get(1));
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.changeFloorElevator(floorList.get(1));
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });

                Button btn3 = (Button) view.findViewById(R.id.btn3);
                btn3.setText(textFloorList.get(2));
                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.changeFloorElevator(floorList.get(2));
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });

                Button btn4 = (Button) view.findViewById(R.id.btn4);
                btn4.setText(textFloorList.get(3));
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.changeFloorElevator(floorList.get(3));
                        tourClass.setButtonClickOn();
                        fragment.dismiss();
                    }
                });

                Button btn5 = (Button) view.findViewById(R.id.btn5);
                btn5.setText(textFloorList.get(4));
                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tourClass.changeFloorElevator(floorList.get(4));
                        tourClass.setButtonClickOn();
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
