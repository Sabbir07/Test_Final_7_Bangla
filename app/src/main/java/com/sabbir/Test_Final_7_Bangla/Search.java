package com.sabbir.Test_Final_7_Bangla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Sabbir on 10/23/2017.
 */

public class Search extends AppCompatActivity{
    // List view
    private ListView lv;

    //Listview Adapter
    ArrayAdapter<String> adapter;

    //Search Edittext
    EditText inputSearch;

    // These two lines are not used so I am commenting them out
    /*//ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_layout);

        // Listview Data
        String products[] = {
                "আগুনে পুড়ে গেলে",
                "বাসা-বাড়িতে আগুন লাগলে",
                "গাড়িতে আগুন লাগা রোধে করনীয়",
                "দাবানল থেকে বাঁচতে",
                "রান্নাঘরে আগুন লাগা রোধে",

                "ডুবন্ত ব্যাক্তিকে উদ্ধার",
                "লঞ্চ/নৌকা ডুবির ক্ষেত্রে",
                "বন্যার সময়",
                "ঝড়ের সময়",

                "সাপে কাটলে",
                "কুকুর কামড়ালে",
                "বিষাক্ত পোকা কামড়ালে",
                "মৌমাছি দ্বারা আক্রান্ত হলে",

                "চোখে ময়লা পড়লে",
                "অজ্ঞান হয়ে পড়লে",
                "ফ্লু/ইনফ্লুয়েঞ্জা",
                "ঠান্ডা কফ/সর্দি কাশি",

                "অকারনে রেগে যাওয়া",
                "বিষন্নতা",
                "দুশ্চিন্তা / আতঙ্কে থাকা",
                "নিঃসঙ্গতা / একাকিত্ব",
                };

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, products);
        lv.setAdapter(adapter);


        /**
         * Enabling on item click listener
         * */
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view.findViewById(R.id.product_name);

                //
                //Fire
                //
                if (textView.getText().toString()=="আগুনে পুড়ে গেলে")
                {
                    Intent intent = new Intent(Search.this, Home_button_1_fire_1_burnt.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="বাসা-বাড়িতে আগুন লাগলে")
                {
                    Intent intent = new Intent(Search.this, Home_button_1_fire_2_home.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="গাড়িতে আগুন লাগা রোধে করনীয়")
                {
                    Intent intent = new Intent(Search.this, Home_button_1_fire_3_car.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="দাবানল থেকে বাঁচতে")
                {
                    Intent intent = new Intent(Search.this, Home_button_1_fire_4_wildfire.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="রান্নাঘরে আগুন লাগা রোধে")
                {
                    Intent intent = new Intent(Search.this, Home_button_1_fire_5_kitchen.class);
                    startActivity(intent);
                }



                //
                //.....Water
                //
                if (textView.getText().toString()=="ডুবন্ত ব্যাক্তিকে উদ্ধার")
                {
                    Intent intent = new Intent(Search.this, Home_button_2_water_1_drowning.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="লঞ্চ/নৌকা ডুবির ক্ষেত্রে")
                {
                    Intent intent = new Intent(Search.this, Home_button_2_water_2_boat.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="বন্যার সময়")
                {
                    Intent intent = new Intent(Search.this, Home_button_2_water_3_flood.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="ঝড়ের সময়")
                {
                    Intent intent = new Intent(Search.this, Home_button_2_water_4_storm.class);
                    startActivity(intent);
                }



                //
                //.....Animal Attack
                //
                if (textView.getText().toString()=="সাপে কাটলে")
                {
                    Intent intent = new Intent(Search.this, Home_button_4_attack_1_snake.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="কুকুর কামড়ালে")
                {
                    Intent intent = new Intent(Search.this, Home_button_4_attack_2_dog.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="বিষাক্ত পোকা কামড়ালে")
                {
                    Intent intent = new Intent(Search.this, Home_button_4_attack_3_insect.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="মৌমাছি দ্বারা আক্রান্ত হলে")
                {
                    Intent intent = new Intent(Search.this, Home_button_4_attack_4_bee.class);
                    startActivity(intent);
                }


                //
                //.....Accidents
                //
                if (textView.getText().toString()=="চোখে ময়লা পড়লে")
                {
                    Intent intent = new Intent(Search.this, Home_button_3_eye_1_object.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="অজ্ঞান হয়ে পড়লে")
                {
                    Intent intent = new Intent(Search.this, Home_button_5_accidents_1_unconscious.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="ফ্লু/ইনফ্লুয়েঞ্জা")
                {
                    Intent intent = new Intent(Search.this, Home_image_1_flu.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="ঠান্ডা কফ/সর্দি কাশি")
                {
                    Intent intent = new Intent(Search.this, Home_button_7_common_disease_2_cold.class);
                    startActivity(intent);
                }



                //
                //.....Psychology
                //
                if (textView.getText().toString()=="অকারনে রেগে যাওয়া")
                {
                    Intent intent = new Intent(Search.this, Home_button_9_psychology_1_anger.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="বিষন্নতা")
                {
                    Intent intent = new Intent(Search.this, Home_button_9_psychology_2_depression.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="দুশ্চিন্তা / আতঙ্কে থাকা")
                {
                    Intent intent = new Intent(Search.this, Home_button_9_psychology_3_anxiety.class);
                    startActivity(intent);
                }
                if (textView.getText().toString()=="নিঃসঙ্গতা / একাকিত্ব")
                {
                    Intent intent = new Intent(Search.this, Home_button_9_psychology_4_lonely.class);
                    startActivity(intent);
                }
            }
        });




        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Search.this.adapter.getFilter().filter(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
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
