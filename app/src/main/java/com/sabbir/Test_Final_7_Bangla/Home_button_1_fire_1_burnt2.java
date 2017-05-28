package com.sabbir.Test_Final_7_Bangla;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;


/**
 * Created by Sabbir on 019  19 02 17  Feb.
 */
public class Home_button_1_fire_1_burnt2 extends AppCompatActivity implements View.OnClickListener {

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.5F);
    private boolean viewGroupIsVisible = true,
            viewGroupIsVisible2 = true,
            viewGroupIsVisible3 = true;
    private View mViewGroup,
                mViewGroup2,
                mViewGroup3;
    private TextView mTextView, mTextView2,
                    mTextView3, mTextView4,
                    mTextView5, mTextView6;



    @Override
    public void onCreate(Bundle savedInstanceState) {

        final View mViewGroupR1, mViewGroupR2, mViewGroupR3;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_button_1_fire_1_burnt);


        // For container 1
        mViewGroup = findViewById(R.id.container1);
        mViewGroup.setOnClickListener(this);
        mViewGroupR1 = findViewById(R.id.relative1);
        mViewGroupR1.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView3_2);
        mTextView2 = (TextView) findViewById(R.id.textView3);


        // for container 2
        mViewGroup2 = findViewById(R.id.container2);
        mViewGroup2.setVisibility(View.GONE);
        mViewGroup2.setOnClickListener(this);
        mViewGroupR2 = findViewById(R.id.relative2);
        mViewGroupR2.setOnClickListener(this);

        mTextView3 = (TextView) findViewById(R.id.textView7);
        mTextView4 = (TextView) findViewById(R.id.textView8);


        // for container 3
        mViewGroup3 = findViewById(R.id.container3);
        mViewGroup3.setVisibility(View.GONE);
        mViewGroup3.setOnClickListener(this);
        mViewGroupR3 = findViewById(R.id.relative3);
        mViewGroupR3.setOnClickListener(this);

        mTextView5 = (TextView) findViewById(R.id.textView9);
        mTextView6 = (TextView) findViewById(R.id.textView10);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //we have to switch this ones code because the container is opened by default
            case R.id.relative1:
                if (viewGroupIsVisible) {
                    mViewGroup.setVisibility(View.GONE);
                    mTextView.setText("\u25BC");
                } else {
                    mViewGroup.setVisibility(View.VISIBLE);
                    mTextView.setText("\u25B2");/*
                    mViewGroup2.setVisibility(View.GONE);
                    mTextView4.setText("\u25BC");
                    viewGroupIsVisible2 = !viewGroupIsVisible2;
                    mViewGroup3.setVisibility(View.GONE);
                    mTextView6.setText("\u25BC");
                    viewGroupIsVisible3 = !viewGroupIsVisible3;
                    */
                }
                viewGroupIsVisible = !viewGroupIsVisible;
                v.startAnimation(buttonClick);
                break;

            case R.id.container1:
                if (viewGroupIsVisible) {
                    mViewGroup.setVisibility(View.GONE);
                    mTextView.setText("\u25BC");
                } else {
                    mViewGroup.setVisibility(View.VISIBLE);
                    mTextView.setText("\u25B2");
                }
                viewGroupIsVisible = !viewGroupIsVisible;
                //v.startAnimation(buttonClick);
                break;




            //This container will be closed by default
            case R.id.relative2:
                if (viewGroupIsVisible2) {
                    mViewGroup2.setVisibility(View.VISIBLE);
                    mTextView4.setText("\u25B2");
                    /*mViewGroup.setVisibility(View.GONE);
                    mTextView.setText("\u25BC");
                    viewGroupIsVisible = !viewGroupIsVisible;
                    mViewGroup3.setVisibility(View.GONE);
                    mTextView6.setText("\u25BC");
                    viewGroupIsVisible3 = !viewGroupIsVisible3;
                    */
                } else {
                    mViewGroup2.setVisibility(View.GONE);
                    mTextView4.setText("\u25BC");
                }
                viewGroupIsVisible2 = !viewGroupIsVisible2;
                v.startAnimation(buttonClick);
                break;

            case R.id.container2:
                if (viewGroupIsVisible2) {
                    mViewGroup2.setVisibility(View.VISIBLE);
                    mTextView4.setText("\u25B2");
                } else {
                    mViewGroup2.setVisibility(View.GONE);
                    mTextView4.setText("\u25BC");
                }
                viewGroupIsVisible2 = !viewGroupIsVisible2;
                //v.startAnimation(buttonClick);
                break;




            //This container will be closed by default
            case R.id.relative3:
                if (viewGroupIsVisible3) {
                    mViewGroup3.setVisibility(View.VISIBLE);
                    mTextView6.setText("\u25B2");/*
                    mViewGroup.setVisibility(View.GONE);
                    mTextView.setText("\u25BC");
                    viewGroupIsVisible = !viewGroupIsVisible;
                    mViewGroup2.setVisibility(View.GONE);
                    mTextView4.setText("\u25BC");
                    viewGroupIsVisible2 = !viewGroupIsVisible2;
                    */
                } else {
                    mViewGroup3.setVisibility(View.GONE);
                    mTextView6.setText("\u25BC");
                }
                viewGroupIsVisible3 = !viewGroupIsVisible3;
                v.startAnimation(buttonClick);
                break;

            case R.id.container3:
                if (viewGroupIsVisible3) {
                    mViewGroup3.setVisibility(View.VISIBLE);
                    mTextView6.setText("\u25B2");
                } else {
                    mViewGroup3.setVisibility(View.GONE);
                    mTextView6.setText("\u25BC");
                }
                viewGroupIsVisible3 = !viewGroupIsVisible3;
                //v.startAnimation(buttonClick);
                break;
        }
    }

    //.....This works for the arrow title bar back button.....
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                overridePendingTransition(R.anim.left_to, R.anim.right);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.left_to, R.anim.right);
    }
}
