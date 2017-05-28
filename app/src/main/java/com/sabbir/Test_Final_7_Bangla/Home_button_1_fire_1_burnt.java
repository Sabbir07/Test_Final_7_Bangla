package com.sabbir.Test_Final_7_Bangla;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;


/**
 * Created by Sabbir on 019  19 02 17  Feb.
 */
public class Home_button_1_fire_1_burnt extends AppCompatActivity implements View.OnClickListener {

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.5F);
    private boolean viewGroupIsVisible1 = false,
            viewGroupIsVisible2 = false,
            viewGroupIsVisible3 = false;
    private View mViewGroup1,
            mViewGroup2,
            mViewGroup3;
    private TextView mTextView1, mTextView2,
            mTextView3, mTextView12,
            mTextView22, mTextView32;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        final View mViewGroupR1, mViewGroupR2, mViewGroupR3;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_button_1_fire_1_burnt);


        //.....Container 1.....
        mViewGroupR1 = findViewById(R.id.relative1);
        mViewGroupR1.setOnClickListener(this);
        mViewGroup1=findViewById(R.id.container1);
        mViewGroup1.setOnClickListener(this);
        mViewGroup1.setVisibility(View.GONE);

        mTextView1 = (TextView) findViewById(R.id.textView32);
        mTextView12 = (TextView) findViewById(R.id.textView3);



        //.....Container 2.....
        mViewGroupR2 = findViewById(R.id.relative2);
        mViewGroupR2.setOnClickListener(this);
        mViewGroup2=findViewById(R.id.container2);
        mViewGroup2.setOnClickListener(this);
        mViewGroup2.setVisibility(View.GONE);

        mTextView2 = (TextView) findViewById(R.id.textView33);
        mTextView22 = (TextView) findViewById(R.id.textView22);


        //.....Container 3.....
        mViewGroupR3 = findViewById(R.id.relative3);
        mViewGroupR3.setOnClickListener(this);
        mViewGroup3=findViewById(R.id.container3);
        mViewGroup3.setOnClickListener(this);
        mViewGroup3.setVisibility(View.GONE);

        mTextView3 = (TextView) findViewById(R.id.textView34);
        mTextView32 = (TextView) findViewById(R.id.textView42);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //This container will be closed by default
            case R.id.relative1:
                if (viewGroupIsVisible1) {
                    mViewGroup1.setVisibility(View.GONE);
                    mTextView1.setText("\u25BC");
                    mTextView12.setTypeface(null, Typeface.NORMAL);
                } else {
                    mViewGroup1.setVisibility(View.VISIBLE);
                    mTextView1.setText("\u25B2");
                    mTextView12.setTypeface(null, Typeface.BOLD);
                    if (viewGroupIsVisible2) {
                        mViewGroup2.setVisibility(View.GONE);
                        mTextView2.setText("\u25BC");
                        mTextView22.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible2 = !viewGroupIsVisible2;
                    }
                    if (viewGroupIsVisible3) {
                        mViewGroup3.setVisibility(View.GONE);
                        mTextView3.setText("\u25BC");
                        mTextView32.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible3 = !viewGroupIsVisible3;
                    }
                }
                viewGroupIsVisible1 = !viewGroupIsVisible1;
                view.startAnimation(buttonClick);
                break;


            case R.id.relative2:
                if (viewGroupIsVisible2) {
                    mViewGroup2.setVisibility(View.GONE);
                    mTextView2.setText("\u25BC");
                    mTextView22.setTypeface(null, Typeface.NORMAL);
                } else {
                    mViewGroup2.setVisibility(View.VISIBLE);
                    mTextView2.setText("\u25B2");
                    mTextView22.setTypeface(null, Typeface.BOLD);
                    if (viewGroupIsVisible1) {
                        mViewGroup1.setVisibility(View.GONE);
                        mTextView1.setText("\u25BC");
                        mTextView12.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible1 = !viewGroupIsVisible1;
                    }
                    if (viewGroupIsVisible3) {
                        mViewGroup3.setVisibility(View.GONE);
                        mTextView3.setText("\u25BC");
                        mTextView32.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible3 = !viewGroupIsVisible3;
                    }
                }
                viewGroupIsVisible2 = !viewGroupIsVisible2;
                view.startAnimation(buttonClick);
                break;

            case R.id.relative3:
                if (viewGroupIsVisible3) {
                    mViewGroup3.setVisibility(View.GONE);
                    mTextView3.setText("\u25BC");
                    mTextView32.setTypeface(null, Typeface.NORMAL);
                } else {
                    mViewGroup3.setVisibility(View.VISIBLE);
                    mTextView3.setText("\u25B2");
                    mTextView32.setTypeface(null, Typeface.BOLD);
                    if (viewGroupIsVisible1) {
                        mViewGroup1.setVisibility(View.GONE);
                        mTextView1.setText("\u25BC");
                        mTextView12.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible1 = !viewGroupIsVisible1;
                    }
                    if (viewGroupIsVisible2) {
                        mViewGroup2.setVisibility(View.GONE);
                        mTextView2.setText("\u25BC");
                        mTextView22.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible2 = !viewGroupIsVisible2;
                    }
                }
                viewGroupIsVisible3 = !viewGroupIsVisible3;
                view.startAnimation(buttonClick);
                break;

        }
    }



    //.....This works for the arrow title bar back button.....
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                //This is making going to previous task but change button pressed
                //NavUtils.navigateUpFromSameTask(this);

                //and this will go back too but show button pressed
                super.onBackPressed();
                //overridePendingTransition(R.anim.left_to, R.anim.right);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //overridePendingTransition(R.anim.left_to, R.anim.right);
    }
}
