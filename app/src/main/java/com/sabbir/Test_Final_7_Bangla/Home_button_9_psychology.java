package com.sabbir.Test_Final_7_Bangla;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sabbir on 006  06 04 17  Apr.
 */
public class Home_button_9_psychology extends AppCompatActivity implements View.OnClickListener{

    private ImageView image1;
    private int[] imageArray;
    private int currentIndex;
    private int startIndex;
    private int endIndex;
    private int value;


    //private Button mButton1, mButton2;
    //private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.7F);
    private View mViewGroup1, mViewGroup2,
            mViewGroup3, mViewGroup4,
            mViewGroup5, mViewGroup6,
            mViewGroup7, mViewGroup8;
    private TextView mTextView1, mTextView1_2,
            mTextView2, mTextView2_2,
            mTextView3, mTextView3_2,
            mTextView4, mTextView4_2;
    private boolean viewGroupIsVisible1 = true,
            viewGroupIsVisible2 = true,
            viewGroupIsVisible3 = true,
            viewGroupIsVisible4 = true;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_button_9_psychology);
        //overridePendingTransition(R.anim.left_to, R.anim.right);



        //.....For button clicks.....
        final Button mButton1 = (Button) findViewById(R.id.anger);
        final Button mButton2 = (Button) findViewById(R.id.depression);
        final Button mButton3 = (Button) findViewById(R.id.fear);
        final Button mButton4 = (Button) findViewById(R.id.lonely);
        //final Button mButton5 = (Button) findViewById(R.id.obsession);
        //final Button mButton6 = (Button) findViewById(R.id.sleepless);


        //.....also Handling the pressed look of button after getting back to this page.....
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                mButton2.setSelected(false);
                mButton3.setSelected(false);
                mButton4.setSelected(false);
                //mButton5.setSelected(false);
                //mButton6.setSelected(false);
                Intent i = new Intent(view.getContext(), Home_button_9_psychology_1_anger.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                mButton1.setSelected(false);
                mButton3.setSelected(false);
                mButton4.setSelected(false);
                //mButton5.setSelected(false);
                //mButton6.setSelected(false);
                Intent i = new Intent(view.getContext(), Home_button_9_psychology_2_depression.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                mButton2.setSelected(false);
                mButton1.setSelected(false);
                mButton4.setSelected(false);
                //mButton5.setSelected(false);
                //mButton6.setSelected(false);
                Intent i = new Intent(view.getContext(), Home_button_9_psychology_3_anxiety.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                mButton2.setSelected(false);
                mButton3.setSelected(false);
                mButton1.setSelected(false);
                //mButton5.setSelected(false);
                //mButton6.setSelected(false);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        /*
        mButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                mButton2.setSelected(false);
                mButton3.setSelected(false);
                mButton4.setSelected(false);
                mButton1.setSelected(false);
                mButton6.setSelected(false);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                mButton2.setSelected(false);
                mButton3.setSelected(false);
                mButton4.setSelected(false);
                mButton5.setSelected(false);
                mButton1.setSelected(false);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
*/


        // For container 1
        mViewGroup1 = findViewById(R.id.container1);
        mViewGroup1.setVisibility(View.GONE);
        mViewGroup1.setOnClickListener(this);

        mViewGroup2 = findViewById(R.id.linear1);
        mViewGroup2.setOnClickListener(this);

        mTextView1 = (TextView) findViewById(R.id.textView2);
        mTextView1_2 = (TextView) findViewById(R.id.textView1);



        // For container 2
        mViewGroup3 = findViewById(R.id.container2);
        mViewGroup3.setVisibility(View.GONE);
        mViewGroup3.setOnClickListener(this);

        mViewGroup4 = findViewById(R.id.linear2);
        mViewGroup4.setOnClickListener(this);

        mTextView2 = (TextView) findViewById(R.id.textView7);
        mTextView2_2 = (TextView) findViewById(R.id.textView6);



        // For container 3
        mViewGroup5 = findViewById(R.id.container3);
        mViewGroup5.setVisibility(View.GONE);
        mViewGroup5.setOnClickListener(this);

        mViewGroup6 = findViewById(R.id.linear3);
        mViewGroup6.setOnClickListener(this);

        mTextView3 = (TextView) findViewById(R.id.textView9);
        mTextView3_2 = (TextView) findViewById(R.id.textView8);



        // For container 4
        mViewGroup7 = findViewById(R.id.container4);
        mViewGroup7.setVisibility(View.GONE);
        mViewGroup7.setOnClickListener(this);

        mViewGroup8 = findViewById(R.id.linear4);
        mViewGroup8.setOnClickListener(this);

        mTextView4 = (TextView) findViewById(R.id.textView11);
        mTextView4_2 = (TextView) findViewById(R.id.textView10);
    }



    //.....Selecting different layout for each button click by switch.....
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            //.....Common question session.....
            //Not a good idea to bold the arrow, and make it normal again. Normal looks too much thinner
            case R.id.linear1:
                if (viewGroupIsVisible1) {
                    mViewGroup1.setVisibility(View.VISIBLE);
                    mTextView1.setText("\u21E7");
                    mTextView1_2.setTypeface(null, Typeface.BOLD);
                } else {
                    mViewGroup1.setVisibility(View.GONE);
                    mTextView1.setText("\u21E9");
                    mTextView1_2.setTypeface(null, Typeface.NORMAL);
                }
                viewGroupIsVisible1 = !viewGroupIsVisible1;
                //v.startAnimation(buttonClick);
                break;

            case  R.id.container1:
                if (viewGroupIsVisible1) {
                    mViewGroup1.setVisibility(View.VISIBLE);
                    mTextView1.setText("\u21E7");
                    mTextView1_2.setTypeface(null, Typeface.BOLD);
                } else {
                    mViewGroup1.setVisibility(View.GONE);
                    mTextView1.setText("\u21E9");
                    mTextView1_2.setTypeface(null, Typeface.NORMAL);
                }
                viewGroupIsVisible1 = !viewGroupIsVisible1;
                break;



            // For container 2
            case R.id.linear2:
                if (viewGroupIsVisible2) {
                    mViewGroup3.setVisibility(View.VISIBLE);
                    mTextView2.setText("⇧");
                    mTextView2_2.setTypeface(null, Typeface.BOLD);
                } else {
                    mViewGroup3.setVisibility(View.GONE);
                    mTextView2.setText("⇩");
                    mTextView2_2.setTypeface(null, Typeface.NORMAL);
                }
                viewGroupIsVisible2 = !viewGroupIsVisible2;
                break;

            case  R.id.container2:
                if (viewGroupIsVisible2) {
                    mViewGroup3.setVisibility(View.VISIBLE);
                    mTextView2.setText("⇧");
                    mTextView2_2.setTypeface(null, Typeface.BOLD);
                } else {
                    mViewGroup3.setVisibility(View.GONE);
                    mTextView2.setText("⇩");
                    mTextView2_2.setTypeface(null, Typeface.NORMAL);
                }
                viewGroupIsVisible2 = !viewGroupIsVisible2;
                break;



            // For container 3
            case R.id.linear3:
                if (viewGroupIsVisible3) {
                    mViewGroup5.setVisibility(View.VISIBLE);
                    mTextView3.setText("⇧");
                    mTextView3_2.setTypeface(null, Typeface.BOLD);
                } else {
                    mViewGroup5.setVisibility(View.GONE);
                    mTextView3.setText("⇩");
                    mTextView3_2.setTypeface(null, Typeface.NORMAL);
                }
                viewGroupIsVisible3 = !viewGroupIsVisible3;
                break;

            case  R.id.container3:
                if (viewGroupIsVisible3) {
                    mViewGroup5.setVisibility(View.VISIBLE);
                    mTextView3.setText("⇧");
                    mTextView3_2.setTypeface(null, Typeface.BOLD);
                } else {
                    mViewGroup5.setVisibility(View.GONE);
                    mTextView3.setText("⇩");
                    mTextView3_2.setTypeface(null, Typeface.NORMAL);
                }
                viewGroupIsVisible3 = !viewGroupIsVisible3;
                break;



            // For container 4
            case R.id.linear4:
                if (viewGroupIsVisible4) {
                    mViewGroup7.setVisibility(View.VISIBLE);
                    mTextView4.setText("⇧");
                    mTextView4_2.setTypeface(null, Typeface.BOLD);
                } else {
                    mViewGroup7.setVisibility(View.GONE);
                    mTextView4.setText("⇩");
                    mTextView4_2.setTypeface(null, Typeface.NORMAL);
                }
                viewGroupIsVisible4 = !viewGroupIsVisible4;
                break;

            case  R.id.container4:
                if (viewGroupIsVisible4) {
                    mViewGroup7.setVisibility(View.VISIBLE);
                    mTextView4.setText("⇧");
                    mTextView4_2.setTypeface(null, Typeface.BOLD);
                } else {
                    mViewGroup7.setVisibility(View.GONE);
                    mTextView4.setText("⇩");
                    mTextView4_2.setTypeface(null, Typeface.NORMAL);
                }
                viewGroupIsVisible4 = !viewGroupIsVisible4;
                break;
        }
    }

    //.....This works for the arrow title bar back button.....
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
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

