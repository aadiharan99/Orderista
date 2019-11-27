package com.example.orderista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class rice extends AppCompatActivity {

    Spinner m1;
    Spinner m2;
    Spinner m3;
    Spinner m4;
    Spinner m5;
    Spinner m6;

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;


    private FirebaseDatabase mydatabase;
    private DatabaseReference mydbref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);

        

        m1=findViewById(R.id.rsp1);
        m2=findViewById(R.id.rsp2);
        m3=findViewById(R.id.asp3);
        m4=findViewById(R.id.rsp4);
        m5=findViewById(R.id.rsp5);
        m6=findViewById(R.id.rsp6);

        t1= findViewById(R.id.rp1);
        t2= findViewById(R.id.rp2);
        t3= findViewById(R.id.rp3);
        t4=findViewById(R.id.rp4);
        t5= findViewById(R.id.rp5);
        t6= findViewById(R.id.rp6);

        b1= findViewById(R.id.rbtn1);
        b2= findViewById(R.id.rbtn2);
        b3= findViewById(R.id.rbtn3);
        b4=findViewById(R.id.rbtn4);
        b5= findViewById(R.id.rbtn5);
        b6= findViewById(R.id.rbtn6);


        mydatabase=FirebaseDatabase.getInstance();
        mydbref =mydatabase.getReference();
        final FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();


        m1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(m1.getSelectedItem());
                if (str.equals("1Kg")) {
                    t1.setText("₹65");
                } else if (str.equals("5Kg")) {
                    t1.setText("₹325");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        m2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(m2.getSelectedItem());
                if (str.equals("1Kg")) {
                    t2.setText("₹91");
                } else if (str.equals("5Kg")) {
                    t2.setText("₹359");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        m3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(m3.getSelectedItem());
                if (str.equals("1Kg")) {
                    t3.setText("₹60");
                } else if (str.equals("5Kg")) {
                    t3.setText("₹279");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        m4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(m4.getSelectedItem());
                if (str.equals("1Kg")) {
                    t4.setText("₹65");
                } else if (str.equals("5Kg")) {
                    t4.setText("₹325");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        m5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(m5.getSelectedItem());
                if (str.equals("1Kg")) {
                    t5.setText("₹55");
                } else if (str.equals("5Kg")) {
                    t5.setText("₹275");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        m6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(m6.getSelectedItem());
                if (str.equals("1Kg")) {
                    t6.setText("₹84");
                } else if (str.equals("5Kg")) {
                    t6.setText("₹419");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("41").setValue("Daawat Basmati Rice"+"  "+String.valueOf(m1.getSelectedItem())+"                "+t1.getText());
                String dp41=t1.getText().toString();
                mchild.child("Price").child("41").setValue(dp41.substring(1));


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("42").setValue("India Gate Basmati Rice"+" "+String.valueOf(m2.getSelectedItem())+"                "+t2.getText());
                String dp42=t2.getText().toString();
                mchild.child("Price").child("42").setValue(dp42.substring(1));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("43").setValue("Mogra Basmati"+"        "+String.valueOf(m3.getSelectedItem())+"                "+t3.getText());
                String dp43=t3.getText().toString();
                mchild.child("Price").child("43").setValue(dp43.substring(1));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("44").setValue("Wada Kolam Rice"+"      "+String.valueOf(m4.getSelectedItem())+"                "+t4.getText());
                String dp44=t4.getText().toString();
                mchild.child("Price").child("44").setValue(dp44.substring(1));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("45").setValue("HMT Kolam"+"            "+String.valueOf(m5.getSelectedItem())+"                "+t5.getText());
                String dp45=t5.getText().toString();
                mchild.child("Price").child("45").setValue(dp45.substring(1));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("46").setValue("Kohinoor Basmati"+"     "+String.valueOf(m6.getSelectedItem())+"                "+t6.getText());
                String dp46=t6.getText().toString();
                mchild.child("Price").child("46").setValue(dp46.substring(1));
            }
        });




    }
}
