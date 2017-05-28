package com.sabbir.Test_Final_7_Bangla;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Sabbir on 013  13 03 17  Mar.
 */
public class Home_image_1_flu_1_home extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_image_1_flu_1_home);
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
