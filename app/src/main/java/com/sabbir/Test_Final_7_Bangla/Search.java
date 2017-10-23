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
        String products[] = {"RAJSHAHI - রাজশাহী",
                "Dhaka - ঢাকা",
                "Chittagong - চট্টগ্রাম",
                "Khulna - খুলনা",
                "Barishal - বরিশাল",
                "Sylhet - সিলেট",
                "Mymenshingh - ময়মনসিংহ",
                "Rangpur - রংপুর"};

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
                if (textView.getText().toString()=="Barishal - বরিশাল")
                {
                    //Intent intent = new Intent(Search.this, SecondActivityBarishal.class);
                    //startActivity(intent);
                }
                //Toast.makeText(MainActivity.this, textView.getText().toString()+ "\n" + i, Toast.LENGTH_SHORT).show();
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
