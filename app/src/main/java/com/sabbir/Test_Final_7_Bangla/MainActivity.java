package com.sabbir.Test_Final_7_Bangla;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

//Pushing my second commit
//Trying third commit to push directly
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ImageView image1, image2, image3;
    private int[] imageArray;
    private int currentIndex;
    private int startIndex;
    private int endIndex;
    private int value;

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.7F);

    public boolean one = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        //.....Not working but why !!!?
        if(!one) {
            overridePendingTransition(R.anim.right_to, R.anim.left);
            setContentView(R.layout.activity_main);
            one=false;
        }
        else
            setContentView(R.layout.activity_main);
        */

        //.....For slide show of front page.....
        image1 = (ImageView) findViewById(R.id.imageView);
        imageArray = new int[2];
        imageArray[0] = R.drawable.front_page_2;
        imageArray[1] = R.drawable.front_page_1;
        startIndex = 0;
        endIndex = 1;
        nextImage();


        //.....Button Clicks.....

        Button mButton1 = (Button) findViewById(R.id.button1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent i = new Intent(view.getContext(), Home_button_1_fire.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });

        Button mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                //Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_LONG).show();
                Intent i = new Intent(view.getContext(), Home_button_2_water.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });

        /*Button mButton3 = (Button) findViewById(R.id.button3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent i = new Intent(view.getContext(), Home_button_3_eye.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
*/
        Button mButton4 = (Button) findViewById(R.id.button4);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent i = new Intent(view.getContext(), Home_button_4_attack.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });

        Button mButton5 = (Button) findViewById(R.id.button5);
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent i = new Intent(view.getContext(), Home_button_5_accidents.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        //Caution
        /*
        Button mButton6 = (Button) findViewById(R.id.button6);
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent i = new Intent(view.getContext(), Home_button_6_caution_daily_work.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        */

        //common disease
        Button mButton7 = (Button) findViewById(R.id.button7);
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent i = new Intent(view.getContext(), Home_button_6_emergecy_number.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });

        //Fever
        /*
        Button mButton8 = (Button) findViewById(R.id.button8);
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent i = new Intent(view.getContext(), Home_button_8_fever.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });
        */

        Button mButton9 = (Button) findViewById(R.id.button9);
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent i = new Intent(view.getContext(), Home_button_9_psychology.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });

        /*
        Button mButton10 = (Button) findViewById(R.id.button10);
        mButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });*/

        Button mButton11 = (Button) findViewById(R.id.button11);
        mButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(buttonClick);
                Intent i = new Intent(view.getContext(), Home_button_11_map_home.class);
                startActivity(i);
                //overridePendingTransition(R.anim.right_to, R.anim.left);
            }
        });


        //.....Making the important texts of button's bold.....

        String text1 = "আগুন থেকে ঘটা দুর্ঘটনা";
        mButton1.setText(setSpannableString(text1, 0, text1.length())); // আগুন ৫ ঘর !
        String text2 = "পানি সম্পর্কিত দুর্ঘটনা";
        mButton2.setText(setSpannableString(text2, 0, text2.length())); // আগুন ৫ ঘর !
        //String text3 = "চোখ সংক্রান্ত সমস্যা";
        //mButton3.setText(setSpannableString(text3, 0, text3.length())); // আগুন ৫ ঘর !
        String text4 = "জীবজন্তুর আক্রমণ";
        mButton4.setText(setSpannableString(text4, 0, text4.length())); // আগুন ৫ ঘর !
        //String text5 = "সাধারণ দুর্ঘটনা ও করণীয়";
        String text5 = "দুর্ঘটনা ও অসুস্থতা";
        mButton5.setText(setSpannableString(text5, 0, text5.length())); // আগুন ৫ ঘর !
        //String text6 = "দৈনন্দিন কাজে সতর্কতা";
        //mButton6.setText(setSpannableString(text6, 0, text6.length())); // আগুন ৫ ঘর !
        //String text7 = "সাধারণ রোগ ও পরামর্শ";
        String text7 = "ইমার্জেন্সি নাম্বার";
        mButton7.setText(setSpannableString(text7, 0, text7.length())); // আগুন ৫ ঘর !
        //String text8 = "বিভিন্ন ধরনের জ্বর";
        //mButton8.setText(setSpannableString(text8, 0, text8.length())); // আগুন ৫ ঘর !
        String text9 = "মানসিক সমস্যা ও প্রতিকার";
        mButton9.setText(setSpannableString(text9, 0, text9.length())); // আগুন ৫ ঘর !
        //String text10 = "ফার্স্ট এইড বক্স";
        //mButton10.setText(setSpannableString(text10, 0, text10.length())); // আগুন ৫ ঘর !
        String text11 = "লোকেশন সংক্রান্ত সাহায্য";
        mButton11.setText(setSpannableString(text11, 0, text11.length())); // আগুন ৫ ঘর !


        //.....These 7 lines are for that top left_to icon for drawer and the top toolbar.....
        //.....This will toggle the icon when drawer is opened.....
        //.....drawer_layout is the whole first activity_main layout id

        //Toolbar toolbar = (Toolbar) findViewById(toolbar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //next comment line is auto generated while removing deprecation warning
        //noinspection deprecation
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        //.....This nav view holds the upper and lower part of the drawer.....

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    //.....Representing the slideshow of two images of fire.....
    public void nextImage() {
        image1.setImageResource(imageArray[currentIndex]);
        currentIndex++;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (currentIndex > endIndex) {
                    //water
                    image1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(view.getContext(), Home_image_2_safe_water.class);
                            startActivity(i);
                            //overridePendingTransition(R.anim.right_to, R.anim.left);
                        }
                    });
                    currentIndex--;
                    value = 5000;
                    previousImage();
                } else {
                    //flu
                    image1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i = new Intent(view.getContext(), Home_image_1_flu.class);
                            startActivity(i);
                            //overridePendingTransition(R.anim.right_to, R.anim.left);
                        }
                    });
                    value = 10000;
                    nextImage();
                }
            }
        }, value); // here 1000(1 second) interval to change from current  to next image

    }

    public void previousImage() {
        image1.setImageResource(imageArray[currentIndex]);
        currentIndex--;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (currentIndex < startIndex) {
                    currentIndex++;
                    //value = 2500;
                    nextImage();
                } else {
                    //value = 5000;
                    previousImage(); // here 1000(1 second) interval to change from current  to previous image
                }
            }
        }, 0);
    }


    //.....Making the important texts of button's bold.....
    public SpannableString setSpannableString(String textString, int start, int end) {

        SpannableString spanString = new SpannableString(textString);
        spanString.setSpan(new StyleSpan(Typeface.NORMAL), start, end, 0);
        return spanString;
    }


    //........This handles click on the drawer button items........

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.what) {
            // Handle the what action
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            //drawer.closeDrawer(GravityCompat.START);

            Intent i = new Intent(MainActivity.this, Navigation_1_what.class);
            startActivity(i);
            overridePendingTransition(R.anim.right_to, R.anim.left);

        } else if (id == R.id.why) {
            /*
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            Toast.makeText(MainActivity.this, "clicked navigation drawer", Toast.LENGTH_LONG).show();
            */
            Intent i = new Intent(MainActivity.this, Navigation_2_why.class);
            startActivity(i);
            overridePendingTransition(R.anim.right_to, R.anim.left);

        } else if (id == R.id.objective) {
            Intent i = new Intent(MainActivity.this, Navigation_3_target.class);
            startActivity(i);
            overridePendingTransition(R.anim.right_to, R.anim.left);

        } else if (id == R.id.emergency) {
            Intent i = new Intent(MainActivity.this, Navigation_4_emergency.class);
            startActivity(i);
            overridePendingTransition(R.anim.right_to, R.anim.left);

        } else if (id == R.id.awareness) {
            Intent i = new Intent(MainActivity.this, Navigation_5_awareness.class);
            startActivity(i);
            overridePendingTransition(R.anim.right_to, R.anim.left);

        } else if (id == R.id.share) {
            //.....To close the drawer after click.....
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            }
            ApplicationInfo app = getApplicationContext().getApplicationInfo();
            String filePath = app.sourceDir;

            Intent intent = new Intent(Intent.ACTION_SEND);
            // MIME of .apk is "application/vnd.android.package-archive".
            // but Bluetooth does not accept this. Let's use "*/*" instead.
            intent.setType("*/*");
            // Append file and send Intent
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filePath)));
            startActivity(Intent.createChooser(intent, "Share this app via"));

        } else if (id == R.id.app_info) {
            Intent i = new Intent(MainActivity.this, Navigation_6_about.class);
            startActivity(i);
            overridePendingTransition(R.anim.right_to, R.anim.left);

        } else if (id == R.id.more_apps) {
            //.....Opens the google play store page for "first aid" apps, Internet is needed.....
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=first%20aid&c=apps&hl=en"));
            startActivity(intent);
        }
        //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //drawer.closeDrawer(GravityCompat.START);
        return true;
    }












    //............Menu item selection activity, top right icon............

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.exit1) {
            moveTaskToBack(true); //left does not properly works without it. !
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
            return true;
        }

        if (id == R.id.about) {
            Intent i = new Intent(MainActivity.this, Navigation_6_about.class);
            startActivity(i);
            overridePendingTransition(R.anim.right_to, R.anim.left);
        }

        if (id == R.id.share) {
            //.....To close the drawer after click.....
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            }
            ApplicationInfo app = getApplicationContext().getApplicationInfo();
            String filePath = app.sourceDir;

            Intent intent = new Intent(Intent.ACTION_SEND);
            // MIME of .apk is "application/vnd.android.package-archive".
            // but Bluetooth does not accept this. Let's use "*/*" instead.
            intent.setType("*/*");
            // Append file and send Intent
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filePath)));
            startActivity(Intent.createChooser(intent, "Share this app via"));
        }

        return super.onOptionsItemSelected(item);
    }


    //.....If the drawer is open then clicking back on phone will close it if not then left the app.....
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            moveTaskToBack(true); //left does not properly works without it. !
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
        //overridePendingTransition(R.anim.left_to, R.anim.right);

        //.....To finish and exit the main activity.....
        //finish();

        /*
        moveTaskToBack(true); //left does not properly works without it. !
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
        */
    }
}
