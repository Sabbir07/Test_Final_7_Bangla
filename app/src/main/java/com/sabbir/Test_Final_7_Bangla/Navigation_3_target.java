package com.sabbir.Test_Final_7_Bangla;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Sabbir on 002  24 04 17  Apr.
 */
public class Navigation_3_target extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        /*
        //.....These two lines make the title bar shadow disappear :).....
        //.....It starts a new problem, it vanishes the title bar back arrow !...
        if(getSupportActionBar() != null){
            getSupportActionBar().setElevation(0);
        }
        */

        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer_3_target);
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
        //super.onBackPressed();
        /*
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        */
        //Intent i = new Intent(this, MainActivity.class);
        //startActivity(i);
        NavUtils.navigateUpFromSameTask(this);
        overridePendingTransition(R.anim.left_to, R.anim.right);
    }
}
