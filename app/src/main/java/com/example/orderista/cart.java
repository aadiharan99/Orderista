package com.example.orderista;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.util.Util;
import com.firebase.ui.database.FirebaseArray;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

import static android.location.Location.convert;

public class cart extends AppCompatActivity {

    ArrayList<String> arrayList=  new ArrayList<>();

    ArrayAdapter<String> adapter;
    ArrayList<String> plist=new ArrayList<>();










    FirebaseDatabase mydb;
    DatabaseReference mydbref;



    Button b1;


    public ListView mlist;



    TextView pp;












    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cart);
            pp=findViewById(R.id.cp2);
            b1=findViewById(R.id.cbtn1);

            mlist=findViewById(R.id.list1);
            mydb= FirebaseDatabase.getInstance();
            mydbref=mydb.getReference();
            DatabaseReference r2,r3,r4,r5;
            final FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();

            String  userid=user.getUid();



            r2=mydbref.child("users");
            r3=r2.child(userid);
            r4=r3.child("Items");
            r5=r3.child("Price");


        r4.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                String value=dataSnapshot.getValue(String.class);
                arrayList.add(value);
                adapter=new ArrayAdapter<String>(cart.this,android.R.layout.simple_list_item_1
                        ,arrayList);
                mlist.setAdapter(adapter);
                












            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        r5.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                String value1=dataSnapshot.getValue(String.class);
                plist.add(value1);
                double total=0;
                for(int i=0;i<plist.size();i++)
                {
                    total=total+Double.parseDouble(plist.get(i));
                }
                if(total>=1500)
                {
                    total=total-(0.1)*total;
                    pp.setText("Total:  "+ "₹ "+String.valueOf(total));

                }
                else if(total>=2000)
                {
                    total=total-(0.15)*total;
                    pp.setText("Total:  "+ "₹ "+String.valueOf(total));

                }
                else {
                    pp.setText("Total:  "+ "₹ "+String.valueOf(total));
                }
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        details.class);
                startActivity(intent);
            }
        });


























    }






}
