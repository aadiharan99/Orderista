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

public class pulses extends AppCompatActivity {



    Spinner p1;
    Spinner p2;
    Spinner p3;
    Spinner p4;
    Spinner p5;
    Spinner p6;
    Spinner p7;
    Spinner p8;
    Spinner p9;
    Spinner p10;
    Spinner p11;
    Spinner p12;
    Spinner p13;

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;
    TextView t11;
    TextView t12;
    TextView t13;


    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;

    private FirebaseDatabase mydatabase;
    private DatabaseReference mydbref;



    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulses);
        mydatabase=FirebaseDatabase.getInstance();
        mydbref =mydatabase.getReference();
        final FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();

        p1= findViewById(R.id.psp1);
        p2= findViewById(R.id.psp2);
        p3= findViewById(R.id.psp3);
        p4= findViewById(R.id.psp4);
        p5= findViewById(R.id.psp5);
        p6= findViewById(R.id.psp6);
        p7= findViewById(R.id.psp7);
        p8= findViewById(R.id.psp8);
        p9= findViewById(R.id.psp9);
        p10= findViewById(R.id.psp10);
        p11= findViewById(R.id.psp11);
        p12= findViewById(R.id.psp12);
        p13= findViewById(R.id.psp13);

        t1= findViewById(R.id.pp1);
        t2= findViewById(R.id.pp2);
        t3= findViewById(R.id.pp3);
        t4= findViewById(R.id.pp4);
        t5= findViewById(R.id.pp5);
        t6= findViewById(R.id.pp6);
        t7= findViewById(R.id.pp7);
        t8= findViewById(R.id.pp8);
        t9= findViewById(R.id.pp9);
        t10= findViewById(R.id.pp10);
        t11= findViewById(R.id.pp11);
        t12= findViewById(R.id.pp12);
        t13= findViewById(R.id.pp13);

        b1= findViewById(R.id.pbtn1);
        b2= findViewById(R.id.pbtn2);
        b3= findViewById(R.id.pbtn3);
        b4= findViewById(R.id.pbtn4);
        b5= findViewById(R.id.pbtn5);
        b6= findViewById(R.id.pbtn6);
        b7= findViewById(R.id.pbtn7);
        b8= findViewById(R.id.pbtn8);
        b9= findViewById(R.id.pbtn9);
        b10= findViewById(R.id.pbtn10);
        b11= findViewById(R.id.pbtn11);
        b12= findViewById(R.id.pbtn12);
        b13= findViewById(R.id.pbtn13);

       p1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


               String str = String.valueOf(p1.getSelectedItem());
               if (str.equals("500gms")) {
                   t1.setText("₹72");
               } else if (str.equals("1kg")) {
                   t1.setText("₹144");
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
                if (str.equals("500gms")) {
                    t2.setText("₹54");
                } else if (str.equals("1kg")) {
                    t2.setText("₹108");
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
                if (str.equals("500gms")) {
                    t3.setText("₹52");
                } else if (str.equals("1kg")) {
                    t3.setText("₹104");
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
                if (str.equals("500gms")) {
                    t4.setText("₹59");
                } else if (str.equals("1kg")) {
                    t4.setText("₹105");
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
                if (str.equals("500gms")) {
                    t5.setText("₹41");
                } else if (str.equals("1kg")) {
                    t5.setText("₹80");
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
                if (str.equals("500gms")) {
                    t6.setText("₹40");
                } else if (str.equals("1kg")) {
                    t6.setText("₹80");
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
                if (str.equals("500gms")) {
                    t7.setText("₹46");
                } else if (str.equals("1kg")) {
                    t7.setText("₹90");
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
                if (str.equals("500gms")) {
                    t8.setText("₹70");
                } else if (str.equals("1kg")) {
                    t8.setText("₹130");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        p9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(p9.getSelectedItem());
                if (str.equals("500gms")) {
                    t9.setText("₹35");
                } else if (str.equals("1kg")) {
                    t9.setText("₹68");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        p10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(p10.getSelectedItem());
                if (str.equals("500gms")) {
                    t10.setText("₹52");
                } else if (str.equals("1kg")) {
                    t10.setText("₹100");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        p11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(p11.getSelectedItem());
                if (str.equals("500gms")) {
                    t11.setText("₹59");
                } else if (str.equals("1kg")) {
                    t11.setText("₹110");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        p12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(p12.getSelectedItem());
                if (str.equals("500gms")) {
                    t12.setText("₹45");
                } else if (str.equals("1kg")) {
                    t12.setText("₹90");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        p13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(p13.getSelectedItem());
                if (str.equals("500gms")) {
                    t13.setText("₹35");
                } else if (str.equals("1kg")) {
                    t13.setText("₹70");
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

                mchild.child("Items").child("5").setValue("Groundnut"+"            "+String.valueOf(p1.getSelectedItem())+"                "+t1.getText());
                String dp5=t1.getText().toString();
                mchild.child("Price").child("5").setValue(dp5.substring(1));

            }

        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());

                mchild.child("Items").child("6").setValue("Whole Moong"+"          "+String.valueOf(p2.getSelectedItem())+"                "+t2.getText());
                String dp6=t2.getText().toString();
                mchild.child("Price").child("6").setValue(dp6.substring(1));



            }

        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("7").setValue("Chickpeas"+"            "+String.valueOf(p3.getSelectedItem())+"                "+t3.getText());
                String dp7=t3.getText().toString();
                mchild.child("Price").child("7").setValue(dp7.substring(1));



            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("8").setValue("White Peas"+"           "+String.valueOf(p4.getSelectedItem())+"                "+t4.getText());
                String dp8=t4.getText().toString();
                mchild.child("Price").child("8").setValue(dp8.substring(1));



            }

        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("9").setValue("Small Channa"+"         "+String.valueOf(p5.getSelectedItem())+"                "+t5.getText());
                String dp9=t5.getText().toString();
                mchild.child("Price").child("9").setValue(dp9.substring(1));



            }

        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("10").setValue("Matki"+"                "+String.valueOf(p6.getSelectedItem())+"                "+t6.getText());
                String dp10=t6.getText().toString();
                mchild.child("Price").child("10").setValue(dp10.substring(1));

            }

        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("11").setValue("Rajma Red"+"            "+String.valueOf(p7.getSelectedItem())+"                "+t7.getText());
                String dp11=t7.getText().toString();
                mchild.child("Price").child("11").setValue(dp11.substring(1));

            }

        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("12").setValue("White Rajma"+"          "+String.valueOf(p8.getSelectedItem())+"                "+t8.getText());
                String dp12=t8.getText().toString();
                mchild.child("Price").child("12").setValue(dp12.substring(1));

            }

        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("13").setValue("Masoor Whole"+"         "+String.valueOf(p9.getSelectedItem())+"                "+t9.getText());
                String dp13=t9.getText().toString();
                mchild.child("Price").child("13").setValue(dp13.substring(1));

            }

        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("14").setValue("Big Channa"+"           "+String.valueOf(p10.getSelectedItem())+"               "+t10.getText());
                String dp14=t10.getText().toString();
                mchild.child("Price").child("14").setValue(dp14.substring(1));

            }

        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());

                mchild.child("Items").child("15").setValue("Green Peas(Dry)"+"      "+String.valueOf(p11.getSelectedItem())+"               "+t11.getText());
                String dp15=t11.getText().toString();
                mchild.child("Price").child("15").setValue(dp15.substring(1));
            }

        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("16").setValue("Green Channa"+"         "+String.valueOf(p12.getSelectedItem())+"               "+t12.getText());
                String dp16=t12.getText().toString();
                mchild.child("Price").child("16").setValue(dp16.substring(1));
            }

        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("17").setValue("Soyabean"+"             "+String.valueOf(p13.getSelectedItem())+"               "+t13.getText());
                String dp17=t13.getText().toString();
                mchild.child("Price").child("17").setValue(dp17.substring(1));
            }

        });




    }
}
