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

public class spices extends AppCompatActivity {

    Spinner s1;
    Spinner s2;
    Spinner s3;
    Spinner s4;
    Spinner s5;
    Spinner s6;
    Spinner s7;
    Spinner s8;
    Spinner s9;
    Spinner s10;
    Spinner s11;
    Spinner s12;
    Spinner s13;
    Spinner s14;
    Spinner s15;

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
    TextView t14;
    TextView t15;


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
    Button b14;
    Button b15;

    private   FirebaseDatabase mydatabase;
    private DatabaseReference mydbref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spices);
        final FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();

        mydatabase= FirebaseDatabase.getInstance();
        mydbref=mydatabase.getReference();
        s1= findViewById(R.id.ssp1);
        s2= findViewById(R.id.ssp2);
        s3= findViewById(R.id.ssp3);
        s4= findViewById(R.id.ssp4);
        s5= findViewById(R.id.ssp5);
        s6= findViewById(R.id.ssp6);
        s7= findViewById(R.id.ssp7);
        s8= findViewById(R.id.ssp8);
        s9= findViewById(R.id.ssp9);
        s10= findViewById(R.id.ssp10);
        s11= findViewById(R.id.ssp11);
        s12= findViewById(R.id.ssp12);
        s13= findViewById(R.id.ssp13);
        s14= findViewById(R.id.ssp14);
        s15= findViewById(R.id.ssp15);


        t1= findViewById(R.id.sp1);
        t2= findViewById(R.id.sp2);
        t3= findViewById(R.id.sp3);
        t4= findViewById(R.id.sp4);
        t5= findViewById(R.id.sp5);
        t6= findViewById(R.id.sp6);
        t7= findViewById(R.id.sp7);
        t8= findViewById(R.id.sp8);
        t9= findViewById(R.id.sp9);
        t10= findViewById(R.id.sp10);
        t11= findViewById(R.id.sp11);
        t12= findViewById(R.id.sp12);
        t13= findViewById(R.id.sp13);
        t14= findViewById(R.id.sp14);
        t15= findViewById(R.id.sp15);

        b1= findViewById(R.id.sbtn1);
        b2= findViewById(R.id.sbtn2);
        b3= findViewById(R.id.sbtn3);
        b4= findViewById(R.id.sbtn4);
        b5= findViewById(R.id.sbtn5);
        b6= findViewById(R.id.sbtn6);
        b7= findViewById(R.id.sbtn7);
        b8= findViewById(R.id.sbtn8);
        b9= findViewById(R.id.sbtn9);
        b10= findViewById(R.id.sbtn10);
        b11= findViewById(R.id.sbtn11);
        b12= findViewById(R.id.sbtn12);
        b13= findViewById(R.id.sbtn13);
        b14= findViewById(R.id.sbtn14);
        b15= findViewById(R.id.sbtn15);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String str = String.valueOf(s1.getSelectedItem());
                if (str.equals("100gms")) {
                    t1.setText("₹29");
                } else if (str.equals("200gms")) {
                    t1.setText("₹60");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s2.getSelectedItem());
                if (str.equals("100gms")) {
                    t2.setText("₹35");
                } else if (str.equals("200gms")) {
                    t2.setText("₹70");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s3.getSelectedItem());
                if (str.equals("100gms")) {
                    t3.setText("₹25");
                } else if (str.equals("200gms")) {
                    t3.setText("₹51");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s4.getSelectedItem());
                if (str.equals("100gms")) {
                    t4.setText("₹18");
                } else if (str.equals("200gms")) {
                    t4.setText("₹32");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s5.getSelectedItem());
                if (str.equals("100gms")) {
                    t5.setText("₹20");
                } else if (str.equals("200gms")) {
                    t5.setText("₹44");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s6.getSelectedItem());
                if (str.equals("100gms")) {
                    t6.setText("₹12");
                } else if (str.equals("200gms")) {
                    t6.setText("₹23");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s7.getSelectedItem());
                if (str.equals("100gms")) {
                    t7.setText("₹20");
                } else if (str.equals("200gms")) {
                    t7.setText("₹40");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s8.getSelectedItem());
                if (str.equals("100gms")) {
                    t8.setText("₹49");
                } else if (str.equals("200gms")) {
                    t8.setText("₹95");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s9.getSelectedItem());
                if (str.equals("100gms")) {
                    t9.setText("₹25");
                } else if (str.equals("200gms")) {
                    t9.setText("₹42");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s10.getSelectedItem());
                if (str.equals("100gms")) {
                    t10.setText("₹73");
                } else if (str.equals("200gms")) {
                    t10.setText("₹140");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s11.getSelectedItem());
                if (str.equals("100gms")) {
                    t11.setText("₹33");
                } else if (str.equals("200gms")) {
                    t11.setText("₹60");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s12.getSelectedItem());
                if (str.equals("100gms")) {
                    t12.setText("₹105");
                } else if (str.equals("200gms")) {
                    t12.setText("₹200");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        s13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s13.getSelectedItem());
                if (str.equals("100gms")) {
                    t13.setText("₹14");
                } else if (str.equals("200gms")) {
                    t13.setText("₹30");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s14.getSelectedItem());
                if (str.equals("100gms")) {
                    t14.setText("₹30");
                } else if (str.equals("200gms")) {
                    t14.setText("₹60");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str = String.valueOf(s15.getSelectedItem());
                if (str.equals("100gms")) {
                    t15.setText("₹35");
                } else if (str.equals("200gms")) {
                    t15.setText("₹65");
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

                mchild.child("Items").child("18").setValue("Jeera"+"                "+String.valueOf(s1.getSelectedItem())+"                "+t1.getText());
                String dp18=t1.getText().toString();
                mchild.child("Price").child("18").setValue(dp18.substring(1));
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());

                mchild.child("Items").child("19").setValue("Dry Coconut"+"          "+String.valueOf(s2.getSelectedItem())+"                "+t2.getText());
                String dp19=t2.getText().toString();
                mchild.child("Price").child("19").setValue(dp19.substring(1));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());

                mchild.child("Items").child("20").setValue("Dhaniya"+"              "+String.valueOf(s3.getSelectedItem())+"                "+t3.getText());
                String dp20=t3.getText().toString();
                mchild.child("Price").child("20").setValue(dp20.substring(1));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());

                mchild.child("Items").child("21").setValue("Haldi Powder"+"         "+String.valueOf(s4.getSelectedItem())+"                "+t4.getText());
                String dp21=t4.getText().toString();
                mchild.child("Price").child("21").setValue(dp21.substring(1));
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("22").setValue("Imli"+"                 "+String.valueOf(s5.getSelectedItem())+"                "+t5.getText());
                String dp22=t5.getText().toString();
                mchild.child("Price").child("22").setValue(dp22.substring(1));
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());

                mchild.child("Items").child("23").setValue("Rai"+"                  "+String.valueOf(s6.getSelectedItem())+"                "+t6.getText());
                String dp23=t6.getText().toString();
                mchild.child("Price").child("23").setValue(dp23.substring(1));
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("24").setValue("Dhaniya Powder"+"       "+String.valueOf(s7.getSelectedItem())+"                "+t7.getText());
                String dp24=t7.getText().toString();
                mchild.child("Price").child("24").setValue(dp24.substring(1));
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("25").setValue("Garam Masala"+"         "+String.valueOf(s8.getSelectedItem())+"                "+t8.getText());
                String dp25=t8.getText().toString();
                mchild.child("Price").child("25").setValue(dp25.substring(1));
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("26").setValue("Red Chilli Powder"+"    "+String.valueOf(s9.getSelectedItem())+"                "+t9.getText());
                String dp26=t9.getText().toString();
                mchild.child("Price").child("26").setValue(dp26.substring(1));
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("27").setValue("Black Pepper Powder"+"  "+String.valueOf(s10.getSelectedItem())+"                "+t10.getText());
                String dp27=t10.getText().toString();
                mchild.child("Price").child("27").setValue(dp27.substring(1));
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("28").setValue("Jeera Powder"+"         "+String.valueOf(s11.getSelectedItem())+"                "+t11.getText());
                String dp28=t11.getText().toString();
                mchild.child("Price").child("28").setValue(dp28.substring(1));
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("29").setValue("Hing"+"                 "+String.valueOf(s12.getSelectedItem())+"                "+t12.getText());
                String dp29=t12.getText().toString();
                mchild.child("Price").child("29").setValue(dp29.substring(1));
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("30").setValue("Methi"+"                "+String.valueOf(s13.getSelectedItem())+"                "+t13.getText());
                String dp30=t13.getText().toString();
                mchild.child("Price").child("30").setValue(dp30.substring(1));
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("31").setValue("Til"+"                  "+String.valueOf(s14.getSelectedItem())+"                "+t14.getText());
                String dp31=t14.getText().toString();
                mchild.child("Price").child("31").setValue(dp31.substring(1));
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild=mydbref.child("users").child(user.getUid());
                mchild.child("Items").child("32").setValue("Ginger Powder"+"        "+String.valueOf(s15.getSelectedItem())+"                "+t15.getText());
                String dp32=t15.getText().toString();
                mchild.child("Price").child("32").setValue(dp32.substring(1));
            }
        });










    }
}
