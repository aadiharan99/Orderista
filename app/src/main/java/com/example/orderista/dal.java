package com.example.orderista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.orderista.R.id.dsp1;
import static com.example.orderista.R.id.dtxt1;

public class dal extends AppCompatActivity {

    Spinner menu1;
    Spinner menu2;
    Spinner menu3;
    Spinner menu4;

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;

    Button b1;
    Button b2;
    Button b3;
    Button b4;


  private   FirebaseDatabase mydatabase;
  private DatabaseReference  mydbref;
  private FirebaseAuth mauth;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dal);

       final FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();


        mydatabase=FirebaseDatabase.getInstance();
        mydbref=mydatabase.getReference();

        menu1 = findViewById(R.id.dsp1);
        menu2 = findViewById(R.id.dsp2);
        menu3 = findViewById(R.id.dsp3);
        menu4 = findViewById(R.id.dsp4);

        t1= findViewById(R.id.gp1);
        t2= findViewById(R.id.gp2);
        t3= findViewById(R.id.gp3);
        t4=findViewById(R.id.gp4);

        b1=findViewById(R.id.dbtn1);
        b2=findViewById(R.id.dbtn2);
        b3=findViewById(R.id.dbtn3);
        b4=findViewById(R.id.dbtn4);

        menu1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(menu1.getSelectedItem());
                if (str.equals("500gms")) {
                    t1.setText("₹50");
                } else if (str.equals("1kg")) {
                    t1.setText("₹90");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });

        menu2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(menu2.getSelectedItem());
                if (str.equals("500gms")) {
                    t2.setText("₹49");
                } else if (str.equals("1kg")) {
                    t2.setText("₹99");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        menu3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(menu3.getSelectedItem());
                if (str.equals("500gms")) {
                    t3.setText("₹40");
                } else if (str.equals("1kg")) {
                    t3.setText("₹78");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });


        menu4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(menu4.getSelectedItem());
                if (str.equals("500gms")) {
                    t4.setText("₹55");
                } else if (str.equals("1kg")) {
                    t4.setText("₹108");
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

                   mchild.child("Items").child("1").setValue("Tur Dal Latur"+"        "+String.valueOf(menu1.getSelectedItem())+"              "+t1.getText());
                   String dp1=t1.getText().toString();
                    mchild.child("Price").child("1").setValue(dp1.substring(1));




                }
            });


        b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                    mchild.child("Items").child("2").setValue("Moong Dal"+"            "+String.valueOf(menu2.getSelectedItem())+"             "+t2.getText());
                    String dp2=t2.getText().toString();
                    mchild.child("Price").child("2").setValue(dp2.substring(1));



                }

            });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("3").setValue("Masoor Dal"+"           "+String.valueOf(menu3.getSelectedItem())+"             "+t3.getText());
                String dp3=t3.getText().toString();
                mchild.child("Price").child("3").setValue(dp3.substring(1));

            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("4").setValue("Urad Dal"+"             "+String.valueOf(menu4.getSelectedItem())+"             "+t4.getText());
                String dp4=t4.getText().toString();
                mchild.child("Price").child("4").setValue(dp4.substring(1));



            }

        });















    }





    }



