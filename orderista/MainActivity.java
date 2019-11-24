package com.example.orderista;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.p000v4.view.GravityCompat;
import android.support.p000v4.widget.DrawerLayout;
import android.support.p002v7.app.ActionBarDrawerToggle;
import android.support.p002v7.app.AppCompatActivity;
import android.support.p002v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.firebase.p003ui.auth.AuthUI;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements OnNavigationItemSelectedListener {

    /* renamed from: i */
    Intent f90i;
    private FirebaseAuth mAuth;
    private GoogleSignInClient mGoogleSignInClient;
    TextView txt11;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        super.onCreate(savedInstanceState);
        setContentView((int) C0781R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(C0781R.C0783id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(C0781R.C0783id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, C0781R.string.navigation_drawer_open, C0781R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        ((NavigationView) findViewById(C0781R.C0783id.nav_view)).setNavigationItemSelectedListener(this);
    }

    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(C0781R.C0783id.drawer_layout);
        if (drawer.isDrawerOpen((int) GravityCompat.START)) {
            drawer.closeDrawer((int) GravityCompat.START);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0781R.C0785menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == C0781R.C0783id.action_logout) {
            AuthUI.getInstance().signOut(this).addOnCompleteListener(new OnCompleteListener<Void>() {
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()) {
                        MainActivity mainActivity = MainActivity.this;
                        mainActivity.startActivity(new Intent(mainActivity, Login_1.class));
                        MainActivity.this.finish();
                    }
                }
            });
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == C0781R.C0783id.nav_dal) {
            startActivity(new Intent(getApplicationContext(), dal.class));
        } else if (id == C0781R.C0783id.nav_pul) {
            startActivity(new Intent(getApplicationContext(), pulses.class));
        } else if (id == C0781R.C0783id.nav_spi) {
            startActivity(new Intent(getApplicationContext(), spices.class));
        } else if (id == C0781R.C0783id.nav_cart) {
            startActivity(new Intent(getApplicationContext(), cart.class));
        } else if (id == C0781R.C0783id.nav_rice) {
            startActivity(new Intent(getApplicationContext(), rice.class));
        } else if (id == C0781R.C0783id.nav_oil) {
            startActivity(new Intent(getApplicationContext(), oil.class));
        } else if (id == C0781R.C0783id.nav_ghee) {
            startActivity(new Intent(getApplicationContext(), ghee.class));
        }
        return true;
    }
}
