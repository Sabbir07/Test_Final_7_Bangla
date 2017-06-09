package com.sabbir.Test_Final_7_Bangla;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by Sabbir on 019  5 06 17
 */
public class Home_button_6_emergecy_number extends AppCompatActivity implements View.OnClickListener {

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.5F);
    /*private boolean viewGroupIsVisible1 = false,
            viewGroupIsVisible2 = false,
            viewGroupIsVisible3 = false;*/
    private View mViewGroup1,
            mViewGroup2,
            mViewGroup3;
    private TextView mTextView1, mTextView2,
            mTextView3, mTextView12,
            mTextView22, mTextView32;

    private boolean viewGroupIsNotVisible1 = true;

    private Button police, rab, ambulance, help_line,
                    disaster, fire_service;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        final View mViewGroupR1, mViewGroupR2, mViewGroupR3;
        super.onCreate(savedInstanceState);
        //.....These two lines make the title bar shadow disappear :).....
        /*if(getSupportActionBar() != null){
            getSupportActionBar().setElevation(0);
        }
        */
        setContentView(R.layout.home_button_6_emergency_number);

        mViewGroupR1 = findViewById(R.id.textView3);
        mViewGroupR1.setOnClickListener(this);


        mViewGroup1=findViewById(R.id.container1);
        mViewGroup1.setOnClickListener(this);
        mViewGroup1.setVisibility(View.GONE);


        fire_service = (Button) findViewById(R.id.fire_station_call);
        fire_service.setOnClickListener(this);

        rab = (Button) findViewById(R.id.rab_call);
        rab.setOnClickListener(this);

        police = (Button) findViewById(R.id.police_call);
        police.setOnClickListener(this);

        ambulance = (Button) findViewById(R.id.ambulance_call);
        ambulance.setOnClickListener(this);

        disaster = (Button) findViewById(R.id.disaster_call);
        disaster.setOnClickListener(this);

        help_line = (Button) findViewById(R.id.help_desk_call);
        help_line.setOnClickListener(this);

        /*//.....Container 1.....
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
        mTextView32 = (TextView) findViewById(R.id.textView42);*/
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            //This container will be closed by default
            case R.id.textView3:
                if (viewGroupIsNotVisible1) {
                    mViewGroup1.setVisibility(View.VISIBLE);
                    //mTextView1.setText("\u21E7");
                    //mTextView1_2.setTypeface(null, Typeface.BOLD);
                } else {
                    mViewGroup1.setVisibility(View.GONE);
                    //mTextView1.setText("\u21E9");
                    //mTextView1_2.setTypeface(null, Typeface.NORMAL);
                }
                viewGroupIsNotVisible1 = !viewGroupIsNotVisible1;
                //v.startAnimation(buttonClick);
                break;

            case  R.id.container1:
                if (viewGroupIsNotVisible1) {
                    mViewGroup1.setVisibility(View.VISIBLE);
                    //mTextView1.setText("\u21E7");
                    //mTextView1_2.setTypeface(null, Typeface.BOLD);
                } else {
                    mViewGroup1.setVisibility(View.GONE);
                    //mTextView1.setText("\u21E9");
                    //mTextView1_2.setTypeface(null, Typeface.NORMAL);
                }
                viewGroupIsNotVisible1 = !viewGroupIsNotVisible1;
                break;


            case R.id.help_desk_call:
                view.startAnimation(buttonClick);
                //...the reason of the bellow codes are
                //...jodi 23 ba er porer phone hoy tahole direct call korbe app theke ber na hoyei
                //...ar jodi mobile er version purono hoy tahole phone call korar age calling er page
                //...e giye number show korbe, direct call korbe na
                //http://stackoverflow.com/questions/35771531/call-requires-api-level-23-current-min-is-14-android-app-activityrequestperm
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                        Intent i = new Intent(Intent.ACTION_CALL);
                        String p = "tel:999";
                        i.setData(Uri.parse(p));
                        startActivity(i);
                    }
                }else {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    String p = "tel:999";
                    i.setData(Uri.parse(p));
                    startActivity(i);
                }
                break;

            case R.id.ambulance_call:
                view.startAnimation(buttonClick);
                //...the reason of the bellow codes are
                //...jodi 23 ba er porer phone hoy tahole direct call korbe app theke ber na hoyei
                //...ar jodi mobile er version purono hoy tahole phone call korar age calling er page
                //...e giye number show korbe, direct call korbe na
                //http://stackoverflow.com/questions/35771531/call-requires-api-level-23-current-min-is-14-android-app-activityrequestperm
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                        Intent i = new Intent(Intent.ACTION_CALL);
                        String p = "tel:103";
                        i.setData(Uri.parse(p));
                        startActivity(i);
                    }
                }else {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    String p = "tel:103";
                    i.setData(Uri.parse(p));
                    startActivity(i);
                }
                break;

            case R.id.fire_station_call:
                view.startAnimation(buttonClick);
                //...the reason of the bellow codes are
                //...jodi 23 ba er porer phone hoy tahole direct call korbe app theke ber na hoyei
                //...ar jodi mobile er version purono hoy tahole phone call korar age calling er page
                //...e giye number show korbe, direct call korbe na
                //http://stackoverflow.com/questions/35771531/call-requires-api-level-23-current-min-is-14-android-app-activityrequestperm
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                        Intent i = new Intent(Intent.ACTION_CALL);
                        String p = "tel:102";
                        i.setData(Uri.parse(p));
                        startActivity(i);
                    }
                }else {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    String p = "tel:102";
                    i.setData(Uri.parse(p));
                    startActivity(i);
                }
                break;

            case R.id.disaster_call:
                view.startAnimation(buttonClick);
                //...the reason of the bellow codes are
                //...jodi 23 ba er porer phone hoy tahole direct call korbe app theke ber na hoyei
                //...ar jodi mobile er version purono hoy tahole phone call korar age calling er page
                //...e giye number show korbe, direct call korbe na
                //http://stackoverflow.com/questions/35771531/call-requires-api-level-23-current-min-is-14-android-app-activityrequestperm
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                        Intent i = new Intent(Intent.ACTION_CALL);
                        String p = "tel:10941";
                        i.setData(Uri.parse(p));
                        startActivity(i);
                    }
                }else {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    String p = "tel:10941";
                    i.setData(Uri.parse(p));
                    startActivity(i);
                }
                break;

            case R.id.rab_call:
                view.startAnimation(buttonClick);
                //...the reason of the bellow codes are
                //...jodi 23 ba er porer phone hoy tahole direct call korbe app theke ber na hoyei
                //...ar jodi mobile er version purono hoy tahole phone call korar age calling er page
                //...e giye number show korbe, direct call korbe na
                //http://stackoverflow.com/questions/35771531/call-requires-api-level-23-current-min-is-14-android-app-activityrequestperm
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                        Intent i = new Intent(Intent.ACTION_CALL);
                        String p = "tel:101";
                        i.setData(Uri.parse(p));
                        startActivity(i);
                    }
                }else {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    String p = "tel:101";
                    i.setData(Uri.parse(p));
                    startActivity(i);
                }
                break;


            case R.id.police_call:
                view.startAnimation(buttonClick);
                //...the reason of the bellow codes are
                //...jodi 23 ba er porer phone hoy tahole direct call korbe app theke ber na hoyei
                //...ar jodi mobile er version purono hoy tahole phone call korar age calling er page
                //...e giye number show korbe, direct call korbe na
                //http://stackoverflow.com/questions/35771531/call-requires-api-level-23-current-min-is-14-android-app-activityrequestperm
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                        Intent i = new Intent(Intent.ACTION_CALL);
                        String p = "tel:100";
                        i.setData(Uri.parse(p));
                        startActivity(i);
                    }
                }else {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    String p = "tel:100";
                    i.setData(Uri.parse(p));
                    startActivity(i);
                }
                break;

/*
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
