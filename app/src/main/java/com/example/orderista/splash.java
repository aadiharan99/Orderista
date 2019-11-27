package com.example.orderista;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class splash extends AppCompatActivity {

    private Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);



            /** Duration of wait **/
            final int SPLASH_DISPLAY_LENGTH = 1000;

            /** Called when the activity is first created. */


                /* New Handler to start the Menu-Activity
                 * and close this Splash-Screen after some seconds.*/
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {


                            /* Create an Intent that will start the Menu-Activity. */
                            Intent mainIntent = new Intent(splash.this, Login_1.class);
                            splash.this.startActivity(mainIntent);
                            splash.this.finish();
                        }
                    }, SPLASH_DISPLAY_LENGTH);
                }
                    }









