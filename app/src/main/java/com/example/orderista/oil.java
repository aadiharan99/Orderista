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

public class oil extends AppCompatActivity {

    Spinner p1;
    Spinner p2;
    Spinner p3;
    Spinner p4;
    Spinner p5;
    Spinner p6;
    Spinner p7;
    Spinner p8;

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;

    TextView pp;

    private FirebaseDatabase mydatabase;
    private DatabaseReference mydbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil);
        mydatabase=FirebaseDatabase.getInstance();
        mydbref =mydatabase.getReference();
        final FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();

        p1= findViewById(R.id.wsp1);
        p4= findViewById(R.id.wsp4);
        p5= findViewById(R.id.wsp5);
        p2= findViewById(R.id.wsp2);
        p3= findViewById(R.id.wsp3);
        p6= findViewById(R.id.wsp6);
        p7= findViewById(R.id.wsp7);
        p8= findViewById(R.id.wsp8);

        t1= findViewById(R.id.op1);
        t2= findViewById(R.id.op2);
        t3= findViewById(R.id.op3);
        t4= findViewById(R.id.op4);
        t5= findViewById(R.id.op5);
        t6= findViewById(R.id.op6);
        t7= findViewById(R.id.op7);
        t8= findViewById(R.id.op8);

        b1= findViewById(R.id.wbtn1);
        b2= findViewById(R.id.wbtn2);
        b3= findViewById(R.id.wbtn3);
        b4= findViewById(R.id.wbtn4);
        b5= findViewById(R.id.wbtn5);
        b6= findViewById(R.id.wbtn6);
        b7= findViewById(R.id.wbtn7);
        b8= findViewById(R.id.wbtn8);



        p1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String str = String.valueOf(p1.getSelectedItem());
                if (str.equals("500ml")) {
                    t1.setText("₹43");
                } else if (str.equals("1L")) {
                    t1.setText("₹86");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        p2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String str = String.valueOf(p2.getSelectedItem());
                if (str.equals("500ml")) {
                    t2.setText("₹49");
                } else if (str.equals("1L")) {
                    t2.setText("₹98");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        p3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String str = String.valueOf(p3.getSelectedItem());
                if (str.equals("500ml")) {
                    t3.setText("₹43");
                } else if (str.equals("1L")) {
                    t3.setText("₹85");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        p4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String str = String.valueOf(p4.getSelectedItem());
                if (str.equals("500ml")) {
                    t4.setText("₹51");
                } else if (str.equals("1L")) {
                    t4.setText("₹101");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        p5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String str = String.valueOf(p5.getSelectedItem());
                if (str.equals("500ml")) {
                    t5.setText("₹74");
                } else if (str.equals("1L")) {
                    t5.setText("₹148");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        p6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String str = String.valueOf(p6.getSelectedItem());
                if (str.equals("500ml")) {
                    t6.setText("₹55");
                } else if (str.equals("1L")) {
                    t6.setText("₹110");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        p7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String str = String.valueOf(p7.getSelectedItem());
                if (str.equals("500ml")) {
                    t7.setText("₹100");
                } else if (str.equals("1L")) {
                    t7.setText("₹200");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        p8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String str = String.valueOf(p8.getSelectedItem());
                if (str.equals("500ml")) {
                    t8.setText("₹58");
                } else if (str.equals("1L")) {
                    t8.setText("₹115");
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

                mchild.child("Items").child("33").setValue("Sunday Sunflower Oil"+"  "+String.valueOf(p1.getSelectedItem())+"                "+t1.getText());
                String dp33=t1.getText().toString();
                mchild.child("Price").child("33").setValue(dp33.substring(1));


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("34").setValue("Fortune Sunflower Oil"+" "+String.valueOf(p2.getSelectedItem())+"                "+t2.getText());
                String dp34=t2.getText().toString();
                mchild.child("Price").child("34").setValue(dp34.substring(1));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("35").setValue("Sunrich Sunflower Oil"+" "+String.valueOf(p3.getSelectedItem())+"                "+t3.getText());
                String dp35=t3.getText().toString();
                mchild.child("Price").child("35").setValue(dp35.substring(1));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("36").setValue("Gemini Sunflower Oil"+" "+String.valueOf(p4.getSelectedItem())+"                "+t4.getText());
                String dp36=t4.getText().toString();
                mchild.child("Price").child("36").setValue(dp36.substring(1));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("37").setValue("Saffola Gold"+"         "+String.valueOf(p5.getSelectedItem())+"                "+t5.getText());
                String dp37=t5.getText().toString();
                mchild.child("Price").child("37").setValue(dp37.substring(1));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("38").setValue("Saffola Active"+"       "+String.valueOf(p6.getSelectedItem())+"                "+t6.getText());
                String dp38=t6.getText().toString();
                mchild.child("Price").child("38").setValue(dp38.substring(1));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("39").setValue("Sundrop Heart"+"        "+String.valueOf(p7.getSelectedItem())+"                "+t7.getText());
                String dp39=t7.getText().toString();
                mchild.child("Price").child("39").setValue(dp39.substring(1));
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("40").setValue("Fortune Rice Bran"+"    "+String.valueOf(p8.getSelectedItem())+"                "+t8.getText());
                String dp40=t8.getText().toString();
                mchild.child("Price").child("40").setValue(dp40.substring(1));
            }
        });

    }
}
