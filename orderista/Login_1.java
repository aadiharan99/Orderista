package com.example.orderista;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p002v7.app.AppCompatActivity;
import android.widget.Toast;
import com.firebase.p003ui.auth.AuthUI;
import com.firebase.p003ui.auth.AuthUI.IdpConfig;
import com.firebase.p003ui.auth.AuthUI.IdpConfig.EmailBuilder;
import com.firebase.p003ui.auth.AuthUI.IdpConfig.GoogleBuilder;
import com.firebase.p003ui.auth.AuthUI.IdpConfig.PhoneBuilder;
import com.firebase.p003ui.auth.AuthUI.SignInIntentBuilder;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Arrays;
import java.util.List;

public class Login_1 extends AppCompatActivity {
    List<IdpConfig> providers = Arrays.asList(new IdpConfig[]{new EmailBuilder().build(), new PhoneBuilder().build(), new GoogleBuilder().build()});

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseAuth instance = FirebaseAuth.getInstance();
        startActivityForResult(((SignInIntentBuilder) ((SignInIntentBuilder) AuthUI.getInstance().createSignInIntentBuilder().setIsSmartLockEnabled(false)).setAvailableProviders(this.providers)).build(), 1);
        if (FirebaseAuth.getInstance().getCurrentUser() != null) {
            startActivity(new Intent(this, MainActivity.class));
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            Toast.makeText(this, "Login Successful! Welcome!", 1).show();
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }

    public void onBackPressed() {
    }
}
