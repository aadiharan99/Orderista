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

public class ghee extends AppCompatActivity {



    Spinner g1;
    Spinner g2;
    Spinner g3;
    Spinner g4;
    Spinner g5;

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;

    private FirebaseDatabase mydatabase;
    private DatabaseReference mydbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghee);

        g1=findViewById(R.id.qsp1);
        g2=findViewById(R.id.qsp2);
        g3=findViewById(R.id.qsp3);
        g4=findViewById(R.id.qsp4);
        g5=findViewById(R.id.qsp5);

        t1= findViewById(R.id.ghp1);
        t2= findViewById(R.id.ghp2);
        t3= findViewById(R.id.ghp3);
        t4=findViewById(R.id.ghp4);
        t5= findViewById(R.id.ghp5);

        b1= findViewById(R.id.qbtn1);
        b2= findViewById(R.id.qbtn2);
        b3= findViewById(R.id.qbtn3);
        b4=findViewById(R.id.qbtn4);
        b5= findViewById(R.id.qbtn5);

        mydatabase=FirebaseDatabase.getInstance();
        mydbref =mydatabase.getReference();
        final FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();


        g1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(g1.getSelectedItem());
                if (str.equals("500ml")) {
                    t1.setText("₹210");
                } else if (str.equals("1L")) {
                    t1.setText("₹422");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        g2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(g2.getSelectedItem());
                if (str.equals("500ml")) {
                    t2.setText("₹203");
                } else if (str.equals("1L")) {
                    t2.setText("₹394");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        g3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(g3.getSelectedItem());
                if (str.equals("500ml")) {
                    t3.setText("₹180");
                } else if (str.equals("1L")) {
                    t3.setText("₹355");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        g4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(g4.getSelectedItem());
                if (str.equals("500ml")) {
                    t4.setText("₹190");
                } else if (str.equals("1L")) {
                    t4.setText("₹375");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        g5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(g5.getSelectedItem());
                if (str.equals("500ml")) {
                    t5.setText("₹47");
                } else if (str.equals("1L")) {
                    t5.setText("₹94");
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
                mchild.child("Items").child("47").setValue("Gowardhan Ghee"+"       "+String.valueOf(g1.getSelectedItem())+"                "+t1.getText());
                String dp47=t1.getText().toString();
                mchild.child("Price").child("47").setValue(dp47.substring(1));


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("48").setValue("Amul Pure Ghee"+"       "+String.valueOf(g2.getSelectedItem())+"                "+t2.getText());
                String dp48=t2.getText().toString();
                mchild.child("Price").child("48").setValue(dp48.substring(1));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("49").setValue("Premia Cow Ghee"+"      "+String.valueOf(g3.getSelectedItem())+"                "+t3.getText());
                String dp49=t3.getText().toString();
                mchild.child("Price").child("49").setValue(dp49.substring(1));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("50").setValue("Mother Dairy"+"         "+String.valueOf(g4.getSelectedItem())+"                "+t4.getText());
                String dp50=t4.getText().toString();
                mchild.child("Price").child("50").setValue(dp50.substring(1));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("51").setValue("Dalda"+"                "+String.valueOf(g5.getSelectedItem())+"                "+t5.getText());
                String dp51=t5.getText().toString();
                mchild.child("Price").child("51").setValue(dp51.substring(1));
            }
        });


    }
}
