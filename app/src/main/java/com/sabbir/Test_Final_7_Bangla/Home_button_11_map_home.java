package com.sabbir.Test_Final_7_Bangla;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

/**
 * Created by Sabbir on 029  29 03 17  Mar.
 */

public class Home_button_11_map_home extends AppCompatActivity{

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.7F);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        //.....These two lines make the title bar shadow disappear :).....
        if(getSupportActionBar() != null){
            getSupportActionBar().setElevation(0);
        }
        */
        setContentView(R.layout.home_button_11_map_home);

        final Button button1 = (Button) findViewById(R.id.map);
        final Button button2 = (Button) findViewById(R.id.hospital);
        final Button button3 = (Button) findViewById(R.id.pharmacies);
        final Button button4 = (Button) findViewById(R.id.fire_station);
        final Button button5 = (Button) findViewById(R.id.atm);
        final Button button6 = (Button) findViewById(R.id.car_repair);
        final Button button7 = (Button) findViewById(R.id.railway_station);
        final Button button8 = (Button) findViewById(R.id.bus_station);
        final Button button9 = (Button) findViewById(R.id.food);
        final Button button10 = (Button) findViewById(R.id.police_station);
        final Button button11 = (Button) findViewById(R.id.hardware_store);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button2.setSelected(false);
                button3.setSelected(false);
                button4.setSelected(false);
                button5.setSelected(false);
                button6.setSelected(false);
                button7.setSelected(false);
                button8.setSelected(false);
                button9.setSelected(false);
                button10.setSelected(false);
                button11.setSelected(false);
                Intent i = new Intent(view.getContext(), Home_button_11_map_home_1_map_msg.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button1.setSelected(false);
                button3.setSelected(false);
                button4.setSelected(false);
                button5.setSelected(false);
                button6.setSelected(false);
                button7.setSelected(false);
                button8.setSelected(false);
                button9.setSelected(false);
                button10.setSelected(false);
                button11.setSelected(false);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                //i.setData(Uri.parse("http://stackoverflow.com/questions/9157490/android-no-activity-found-to-handle-intent-error-how-it-will-resolve"));
                //i.setData(Uri.parse("https://www.google.com/maps/search/hospital"));
                i.setData(Uri.parse("https://www.google.com/maps/search/hospital"));
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button2.setSelected(false);
                button1.setSelected(false);
                button4.setSelected(false);
                button5.setSelected(false);
                button6.setSelected(false);
                button7.setSelected(false);
                button8.setSelected(false);
                button9.setSelected(false);
                button10.setSelected(false);
                button11.setSelected(false);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.google.com/maps/search/pharmacies"));
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button2.setSelected(false);
                button3.setSelected(false);
                button1.setSelected(false);
                button5.setSelected(false);
                button6.setSelected(false);
                button7.setSelected(false);
                button8.setSelected(false);
                button9.setSelected(false);
                button10.setSelected(false);
                button11.setSelected(false);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.google.com/maps/search/fire+station"));
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button2.setSelected(false);
                button3.setSelected(false);
                button4.setSelected(false);
                button1.setSelected(false);
                button6.setSelected(false);
                button7.setSelected(false);
                button8.setSelected(false);
                button9.setSelected(false);
                button10.setSelected(false);
                button11.setSelected(false);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.google.com/maps/search/atm"));
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button2.setSelected(false);
                button3.setSelected(false);
                button4.setSelected(false);
                button5.setSelected(false);
                button1.setSelected(false);
                button7.setSelected(false);
                button8.setSelected(false);
                button9.setSelected(false);
                button10.setSelected(false);
                button11.setSelected(false);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.google.com/maps/search/car+repair"));
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button2.setSelected(false);
                button3.setSelected(false);
                button4.setSelected(false);
                button5.setSelected(false);
                button6.setSelected(false);
                button1.setSelected(false);
                button8.setSelected(false);
                button9.setSelected(false);
                button10.setSelected(false);
                button11.setSelected(false);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.google.com/maps/search/railway"));
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button2.setSelected(false);
                button3.setSelected(false);
                button4.setSelected(false);
                button5.setSelected(false);
                button6.setSelected(false);
                button7.setSelected(false);
                button1.setSelected(false);
                button9.setSelected(false);
                button10.setSelected(false);
                button11.setSelected(false);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.google.com/maps/search/bus+station"));
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button2.setSelected(false);
                button3.setSelected(false);
                button4.setSelected(false);
                button5.setSelected(false);
                button6.setSelected(false);
                button7.setSelected(false);
                button8.setSelected(false);
                button1.setSelected(false);
                button10.setSelected(false);
                button11.setSelected(false);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.google.com/maps/search/food"));
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button2.setSelected(false);
                button3.setSelected(false);
                button4.setSelected(false);
                button5.setSelected(false);
                button6.setSelected(false);
                button7.setSelected(false);
                button8.setSelected(false);
                button9.setSelected(false);
                button1.setSelected(false);
                button11.setSelected(false);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.google.com/maps/search/police+station"));
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                button2.setSelected(false);
                button3.setSelected(false);
                button4.setSelected(false);
                button5.setSelected(false);
                button6.setSelected(false);
                button7.setSelected(false);
                button8.setSelected(false);
                button9.setSelected(false);
                button10.setSelected(false);
                button1.setSelected(false);
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.google.com/maps/search/hardware+store"));
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
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
