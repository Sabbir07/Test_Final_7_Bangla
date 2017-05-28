package com.sabbir.Test_Final_7_Bangla;

import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

import static com.sabbir.Test_Final_7_Bangla.R.id.map;

/**
 * Created by Sabbir on 028  28 03 17  Mar.
 */

public class Home_button_11_map_home_1_map_msg extends FragmentActivity
        implements GooglePlayServicesClient.ConnectionCallbacks,
        com.google.android.gms.location.LocationListener,
        GooglePlayServicesClient.OnConnectionFailedListener {
    private GoogleMap myMap;            // home_button_11_map_home_1_map reference
    private LocationClient myLocationClient;
    private static final LocationRequest REQUEST = LocationRequest.create()
            .setInterval(1000)         // 5 seconds (...isn't it 10 seconds?!)
            .setFastestInterval(16)    // 16ms = 60fps
            .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    private boolean one = true;


    /**
     * onResume will be Called when the activity is starting.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //final String[] phoneNumber1 = {""};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_button_11_map_home_1_map);


        getMapReference();



        Button button1 = (Button) findViewById(R.id.button);
        //button1.setOnClickListener(this);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                //String phoneNumber1="+8801762868159";
                //Toast.makeText(MainActivity_2.this, "Message Sent to Friend", Toast.LENGTH_LONG).show();
                final AlertDialog.Builder alert = new AlertDialog.Builder(Home_button_11_map_home_1_map_msg.this);

                alert.setTitle("ইমার্জেন্সি");
                alert.setMessage("মেসেজের মাধ্যমে নিচের এই নাম্বারে কোওর্ডিনেট পাঠানঃ");

                // Set an EditText view to get user input
                final EditText input = new EditText(Home_button_11_map_home_1_map_msg.this);
                alert.setView(input);

                alert.setPositiveButton("পাঠান", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        final String phoneNumber1 = String.valueOf(input.getText());
                        //these bellow codes are for confirmation of operation
                        AlertDialog.Builder alert2 = new AlertDialog.Builder(Home_button_11_map_home_1_map_msg.this);

                        alert2.setTitle("নাম্বার ঠিক আছে কিনা দেখুন");
                        alert2.setMessage("মোবাইল নাম্বার:  " + phoneNumber1);

                        alert2.setPositiveButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog2, int whichButton2) {
                                Toast.makeText(Home_button_11_map_home_1_map_msg.this, phoneNumber1 + " নাম্বারে মেসেজ পাঠানো হয়েছে", Toast.LENGTH_LONG).show();
                                sendLocationSMS(phoneNumber1, myMap.getMyLocation());
                            }
                        });

                        alert2.setNegativeButton("বাতিল", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog2, int whichButton2) {
                                // Canceled.
                            }
                        });
                        //view.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

                        alert2.show();
                    }
                });

                alert.setNeutralButton("বাবাকে পাঠান", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        final String phoneNumber0 = "01762868159";
                        AlertDialog.Builder alert2 = new AlertDialog.Builder(Home_button_11_map_home_1_map_msg.this);

                        alert2.setTitle("বাবার নাম্বারে কোওর্ডিনেট পাঠান");
                        alert2.setMessage("মোবাইল নাম্বার:  " + phoneNumber0);

                        alert2.setPositiveButton("ঠিক আছে", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog2, int whichButton2) {
                                Toast.makeText(Home_button_11_map_home_1_map_msg.this, "বাবার নাম্বারে মেসেজ পাঠানো হয়েছে", Toast.LENGTH_LONG).show();
                                sendLocationSMS(phoneNumber0, myMap.getMyLocation());
                            }
                        });

                        alert2.setNegativeButton("বাতিল", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog2, int whichButton2) {
                                // Canceled.
                            }
                        });

                        alert2.show();
                    }
                });

                alert.setNegativeButton("বাতিল", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                    }
                });

                alert.show();
            }
        });
    }


    private void sendLocationSMS(String phoneNumber, Location currentLocation) {

        SmsManager smsManager = SmsManager.getDefault();
        StringBuffer smsBody = new StringBuffer(); //keep it like this, I mean stringbuffer
        //smsBody.append("http://maps.google.com?q=<" + currentLocation.getLatitude() + ">,<" + currentLocation.getLongitude() + ">");
        smsBody.append("I need emergency help. My coordinates are here:");
        smsBody.append("\n\n");
        //smsBody.append("maps.google.com?q=<" + currentLocation.getLatitude() + ">,<" + currentLocation.getLongitude() + ">");
        //smsBody.append("http://maps.google.com/maps?saddr=" + currentLocation.getLatitude() + "," + currentLocation.getLongitude());
        //smsBody.append("http://maps.google.com/maps?saddr=" + "22.8456" + "," + "89.5403");
        //smsBody.append("http://maps.google.com/maps?place=" + "22.8456" + "," + "89.5403");


        //.....This one is perfect, just what I need.....
        //.....Khulna's coordinate for example only.....
        //smsBody.append("https://www.google.com/maps/place/" + "22.8456" + "," + "89.5403");
        //.....Kazla mor.....
        //smsBody.append("https://www.google.com/maps/place/" + "24.364455" + "," + "88.632814");

        //...My current location...
        smsBody.append("https://www.google.com/maps/place/" + currentLocation.getLatitude() + "," + currentLocation.getLongitude());


        //smsBody.append("\n\n");
        //smsBody.append(currentLocation);

        //smsBody.append("\n");
        //smsBody.append(currentLocation.getLatitude());
        //smsBody.append(",");
        //smsBody.append(currentLocation.getLongitude());
        smsManager.sendTextMessage(phoneNumber, null, smsBody.toString(), null, null);
        //finish();
    }

    /**
     * onResume will be called when the Activity receives focus and is visible
     */
    @Override
    protected void onResume() {
        super.onResume();
        getMapReference();
        wakeUpLocationClient();
        myLocationClient.connect();
    }

    /**
     * onPause will be called when activity is going into the background,
     */
    @Override
    public void onPause() {
        super.onPause();
        if (myLocationClient != null) {
            myLocationClient.disconnect();
        }
    }

    /**
     * @param lat - latitude of the location to move the camera to
     * @param lng - longitude of the location to move the camera to
     *            Prepares a CameraUpdate object to be used with  callbacks
     */
    private void gotoMyLocation(double lat, double lng) {
        if (one) {
            one = false;
            changeCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder()
                    .target(new LatLng(lat, lng))   // Sets the center of the home_button_11_map_home_1_map to Mountain View
                    .zoom(7)    // Sets the zoom
                    .bearing(myMap.getCameraPosition().bearing) // Sets the orientation of the camera to east
                    .tilt(myMap.getCameraPosition().tilt)    // Sets the tilt of the camera to 30 degrees
                    .build()    // Creates a CameraPosition from the builder
            ), new GoogleMap.CancelableCallback() {
                @Override
                public void onFinish() {
                    // Your code here to do something after the Home_button_11_map_home_1_map_msg is rendered
                }

                @Override
                public void onCancel() {
                    // Your code here to do something after the Home_button_11_map_home_1_map_msg rendering is cancelled
                }
            });
        } else {
            changeCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder()
                    .target(myMap.getCameraPosition().target)   // Sets the center of the home_button_11_map_home_1_map to Mountain View
                    .zoom(myMap.getCameraPosition().zoom)    // Sets the zoom
                    .bearing(myMap.getCameraPosition().bearing) // Sets the orientation of the camera to east
                    .tilt(myMap.getCameraPosition().tilt)    // Sets the tilt of the camera to 30 degrees
                    .build()    // Creates a CameraPosition from the builder
            ), new GoogleMap.CancelableCallback() {
                @Override
                public void onFinish() {
                    // Your code here to do something after the Home_button_11_map_home_1_map_msg is rendered
                }

                @Override
                public void onCancel() {
                    // Your code here to do something after the Home_button_11_map_home_1_map_msg rendering is cancelled
                }
            });
        }
    }

    /**
     * @param location - Location object with all the information about location
     *                 Callback from LocationClient every time our location is changed
     */
    @Override
    public void onLocationChanged(final Location location) {

        gotoMyLocation(location.getLatitude(), location.getLongitude());
    }


    /**
     * When we receive focus, we need to get back our LocationClient
     * Creates a new LocationClient object if there is none
     */
    private void wakeUpLocationClient() {
        if (myLocationClient == null) {
            myLocationClient = new LocationClient(getApplicationContext(),
                    this,       // Connection Callbacks
                    this);      // OnConnectionFailedListener
        }
    }

    /**
     * Get a home_button_11_map_home_1_map object reference if none exits and enable blue arrow icon on home_button_11_map_home_1_map
     */
    private void getMapReference() {
        if (myMap == null) {
            myMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(map))
                    .getMap();
        }
        if (myMap != null) {
            myMap.setMyLocationEnabled(true);
        }
    }

    /**
     * LocationClient is connected
     */
    @Override
    public void onConnected(Bundle bundle) {
        myLocationClient.requestLocationUpdates(
                REQUEST,
                this); // LocationListener
    }

    /**
     * LocationClient is disconnected
     */
    @Override
    public void onDisconnected() {

    }


    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
    }


    private void changeCamera(CameraUpdate update, GoogleMap.CancelableCallback callback) {
        myMap.moveCamera(update);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    //This arrow is not showing because action bar is not there !
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
