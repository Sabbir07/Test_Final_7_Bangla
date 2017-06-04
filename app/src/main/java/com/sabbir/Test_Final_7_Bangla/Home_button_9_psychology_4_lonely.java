package com.sabbir.Test_Final_7_Bangla;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

/**
 * Created by Sabbir on 017  4 06 17
 */
public class Home_button_9_psychology_4_lonely extends AppCompatActivity implements View.OnClickListener {

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.5F);
    private boolean viewGroupIsVisible1 = false,
            viewGroupIsVisible2 = false,
            viewGroupIsVisible3 = false,
            viewGroupIsVisible4 = false,
            viewGroupIsVisible5 = false;
    private View mViewGroup1,
            mViewGroup2,
            mViewGroup3,
            mViewGroup4,
            mViewGroup5;
    private TextView mTextView1, mTextView12,
            mTextView2, mTextView22,
            mTextView3, mTextView32,
            mTextView4, mTextView42,
            mTextView5, mTextView52;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        final View mViewGroupR1, mViewGroupR2, mViewGroupR3, mViewGroupR4, mViewGroupR5;
        super.onCreate(savedInstanceState);
        //.....These two lines make the title bar shadow disappear :).....
        /*if(getSupportActionBar() != null){
            getSupportActionBar().setElevation(0);
        }
        */
        setContentView(R.layout.home_button_9_psychology_4_lonely);


        //.....Container 1.....
        mViewGroupR1 = findViewById(R.id.relative1);
        mViewGroupR1.setOnClickListener(this);
        mViewGroup1 = findViewById(R.id.container1);
        mViewGroup1.setOnClickListener(this);
        mViewGroup1.setVisibility(View.GONE);

        mTextView1 = (TextView) findViewById(R.id.textView32);
        mTextView12 = (TextView) findViewById(R.id.textView3);


        //.....Container 2.....
        mViewGroupR2 = findViewById(R.id.relative2);
        mViewGroupR2.setOnClickListener(this);
        mViewGroup2 = findViewById(R.id.container2);
        mViewGroup2.setOnClickListener(this);
        mViewGroup2.setVisibility(View.GONE);

        mTextView2 = (TextView) findViewById(R.id.textView33);
        mTextView22 = (TextView) findViewById(R.id.textView22);


        //.....Container 3.....
        mViewGroupR3 = findViewById(R.id.relative3);
        mViewGroupR3.setOnClickListener(this);
        mViewGroup3 = findViewById(R.id.container3);
        mViewGroup3.setOnClickListener(this);
        mViewGroup3.setVisibility(View.GONE);

        mTextView3 = (TextView) findViewById(R.id.textView34);
        mTextView32 = (TextView) findViewById(R.id.textView42);


        //.....Container 4.....
        mViewGroupR4 = findViewById(R.id.relative4);
        mViewGroupR4.setOnClickListener(this);
        mViewGroup4 = findViewById(R.id.container4);
        mViewGroup4.setOnClickListener(this);
        mViewGroup4.setVisibility(View.GONE);

        mTextView4 = (TextView) findViewById(R.id.textView52);
        mTextView42 = (TextView) findViewById(R.id.textView5);


        /*//.....Container 5.....
        mViewGroupR5 = findViewById(R.id.relative5);
        mViewGroupR5.setOnClickListener(this);
        mViewGroup5=findViewById(R.id.container5);
        mViewGroup5.setOnClickListener(this);
        mViewGroup5.setVisibility(View.GONE);

        mTextView5 = (TextView) findViewById(R.id.textView62);
        mTextView52 = (TextView) findViewById(R.id.textView6);*/
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
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
                    if (viewGroupIsVisible4) {
                        mViewGroup4.setVisibility(View.GONE);
                        mTextView4.setText("\u25BC");
                        mTextView42.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible4 = !viewGroupIsVisible4;
                    }
                    /*if (viewGroupIsVisible5) {
                        mViewGroup5.setVisibility(View.GONE);
                        mTextView5.setText("\u25BC");
                        mTextView52.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible5 = !viewGroupIsVisible5;
                    }*/
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
                    if (viewGroupIsVisible4) {
                        mViewGroup4.setVisibility(View.GONE);
                        mTextView4.setText("\u25BC");
                        mTextView42.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible4 = !viewGroupIsVisible4;
                    }
                    /*if (viewGroupIsVisible5) {
                        mViewGroup5.setVisibility(View.GONE);
                        mTextView5.setText("\u25BC");
                        mTextView52.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible5 = !viewGroupIsVisible5;
                    }*/
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
                    if (viewGroupIsVisible4) {
                        mViewGroup4.setVisibility(View.GONE);
                        mTextView4.setText("\u25BC");
                        mTextView42.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible4 = !viewGroupIsVisible4;
                    }
                    /*if (viewGroupIsVisible5) {
                        mViewGroup5.setVisibility(View.GONE);
                        mTextView5.setText("\u25BC");
                        mTextView52.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible5 = !viewGroupIsVisible5;
                    }*/
                }
                viewGroupIsVisible3 = !viewGroupIsVisible3;
                view.startAnimation(buttonClick);
                break;


            case R.id.relative4:
                if (viewGroupIsVisible4) {
                    mViewGroup4.setVisibility(View.GONE);
                    mTextView4.setText("\u25BC");
                    mTextView42.setTypeface(null, Typeface.NORMAL);
                } else {
                    mViewGroup4.setVisibility(View.VISIBLE);
                    mTextView4.setText("\u25B2");
                    mTextView42.setTypeface(null, Typeface.BOLD);
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
                    if (viewGroupIsVisible3) {
                        mViewGroup3.setVisibility(View.GONE);
                        mTextView3.setText("\u25BC");
                        mTextView32.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible3 = !viewGroupIsVisible3;
                    }
                    /*if (viewGroupIsVisible5) {
                        mViewGroup5.setVisibility(View.GONE);
                        mTextView5.setText("\u25BC");
                        mTextView52.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible5 = !viewGroupIsVisible5;
                    }*/
                }
                viewGroupIsVisible4 = !viewGroupIsVisible4;
                view.startAnimation(buttonClick);
                break;


            /*case R.id.relative5:
                if (viewGroupIsVisible5) {
                    mViewGroup5.setVisibility(View.GONE);
                    mTextView5.setText("\u25BC");
                    mTextView52.setTypeface(null, Typeface.NORMAL);
                } else {
                    mViewGroup5.setVisibility(View.VISIBLE);
                    mTextView5.setText("\u25B2");
                    mTextView52.setTypeface(null, Typeface.BOLD);
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
                    if (viewGroupIsVisible3) {
                        mViewGroup3.setVisibility(View.GONE);
                        mTextView3.setText("\u25BC");
                        mTextView32.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible3 = !viewGroupIsVisible3;
                    }
                    if (viewGroupIsVisible4) {
                        mViewGroup4.setVisibility(View.GONE);
                        mTextView4.setText("\u25BC");
                        mTextView42.setTypeface(null, Typeface.NORMAL);
                        viewGroupIsVisible4 = !viewGroupIsVisible4;
                    }
                }
                viewGroupIsVisible5 = !viewGroupIsVisible5;
                view.startAnimation(buttonClick);
                break;*/
        }
    }

    //.....This works for the arrow title bar back button.....
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
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
