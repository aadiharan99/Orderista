package com.example.orderista;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.google.firebase.auth.FirebaseAuthSettings;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;


import java.util.Arrays;
import java.util.List;

public class Login_1 extends AppCompatActivity {


    // Choose authentication providers
    List<AuthUI.IdpConfig> providers = Arrays.asList(
            new AuthUI.IdpConfig.EmailBuilder().build(),
            new AuthUI.IdpConfig.PhoneBuilder().build(),
            new AuthUI.IdpConfig.GoogleBuilder().build()
    );


    // Create and launch sign-in intent




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        FirebaseAuth auth = FirebaseAuth.getInstance();
        startActivityForResult(AuthUI.getInstance()
                .createSignInIntentBuilder()

                .setIsSmartLockEnabled(false)


                .setAvailableProviders(providers
                ).build(), 1
        );
        FirebaseUser user=FirebaseAuth.getInstance().getCurrentUser();
        if(user!=null)
        {
            startActivity(new Intent(Login_1.this,MainActivity.class));
        }



    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1)
        {
            Toast.makeText(this,"Login Successful! Welcome!",Toast.LENGTH_LONG).show();
            startActivity(new Intent(Login_1.this,MainActivity.class));

        }

    }

    @Override
    public void onBackPressed() {

    }

}