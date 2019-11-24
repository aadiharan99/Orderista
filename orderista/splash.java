package com.example.orderista;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p002v7.app.AppCompatActivity;

public class splash extends AppCompatActivity {
    private Handler handler = new Handler();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView((int) C0781R.layout.activity_splash);
        this.handler.postDelayed(new Runnable() {
            public void run() {
                splash.this.startActivity(new Intent(splash.this, Login_1.class));
                splash.this.finish();
            }
        }, 1000);
    }
}
