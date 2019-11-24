package com.example.orderista;

import android.os.Bundle;
import android.support.p002v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class rice extends AppCompatActivity {

    /* renamed from: b1 */
    Button f175b1;

    /* renamed from: b2 */
    Button f176b2;

    /* renamed from: b3 */
    Button f177b3;

    /* renamed from: b4 */
    Button f178b4;

    /* renamed from: b5 */
    Button f179b5;

    /* renamed from: b6 */
    Button f180b6;

    /* renamed from: m1 */
    Spinner f181m1;

    /* renamed from: m2 */
    Spinner f182m2;

    /* renamed from: m3 */
    Spinner f183m3;

    /* renamed from: m4 */
    Spinner f184m4;

    /* renamed from: m5 */
    Spinner f185m5;

    /* renamed from: m6 */
    Spinner f186m6;
    private FirebaseDatabase mydatabase;
    /* access modifiers changed from: private */
    public DatabaseReference mydbref;

    /* renamed from: t1 */
    TextView f187t1;

    /* renamed from: t2 */
    TextView f188t2;

    /* renamed from: t3 */
    TextView f189t3;

    /* renamed from: t4 */
    TextView f190t4;

    /* renamed from: t5 */
    TextView f191t5;

    /* renamed from: t6 */
    TextView f192t6;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0781R.layout.activity_rice);
        this.f181m1 = (Spinner) findViewById(C0781R.C0783id.rsp1);
        this.f182m2 = (Spinner) findViewById(C0781R.C0783id.rsp2);
        this.f183m3 = (Spinner) findViewById(C0781R.C0783id.asp3);
        this.f184m4 = (Spinner) findViewById(C0781R.C0783id.rsp4);
        this.f185m5 = (Spinner) findViewById(C0781R.C0783id.rsp5);
        this.f186m6 = (Spinner) findViewById(C0781R.C0783id.rsp6);
        this.f187t1 = (TextView) findViewById(C0781R.C0783id.rp1);
        this.f188t2 = (TextView) findViewById(C0781R.C0783id.rp2);
        this.f189t3 = (TextView) findViewById(C0781R.C0783id.rp3);
        this.f190t4 = (TextView) findViewById(C0781R.C0783id.rp4);
        this.f191t5 = (TextView) findViewById(C0781R.C0783id.rp5);
        this.f192t6 = (TextView) findViewById(C0781R.C0783id.rp6);
        this.f175b1 = (Button) findViewById(C0781R.C0783id.rbtn1);
        this.f176b2 = (Button) findViewById(C0781R.C0783id.rbtn2);
        this.f177b3 = (Button) findViewById(C0781R.C0783id.rbtn3);
        this.f178b4 = (Button) findViewById(C0781R.C0783id.rbtn4);
        this.f179b5 = (Button) findViewById(C0781R.C0783id.rbtn5);
        this.f180b6 = (Button) findViewById(C0781R.C0783id.rbtn6);
        this.mydatabase = FirebaseDatabase.getInstance();
        this.mydbref = this.mydatabase.getReference();
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        this.f181m1.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(rice.this.f181m1.getSelectedItem());
                if (str.equals("1Kg")) {
                    rice.this.f187t1.setText("₹65");
                } else if (str.equals("5Kg")) {
                    rice.this.f187t1.setText("₹325");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f182m2.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(rice.this.f182m2.getSelectedItem());
                if (str.equals("1Kg")) {
                    rice.this.f188t2.setText("₹91");
                } else if (str.equals("5Kg")) {
                    rice.this.f188t2.setText("₹359");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f183m3.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(rice.this.f183m3.getSelectedItem());
                if (str.equals("1Kg")) {
                    rice.this.f189t3.setText("₹60");
                } else if (str.equals("5Kg")) {
                    rice.this.f189t3.setText("₹279");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f184m4.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(rice.this.f184m4.getSelectedItem());
                if (str.equals("1Kg")) {
                    rice.this.f190t4.setText("₹65");
                } else if (str.equals("5Kg")) {
                    rice.this.f190t4.setText("₹325");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f185m5.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(rice.this.f185m5.getSelectedItem());
                if (str.equals("1Kg")) {
                    rice.this.f191t5.setText("₹55");
                } else if (str.equals("5Kg")) {
                    rice.this.f191t5.setText("₹275");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f186m6.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(rice.this.f186m6.getSelectedItem());
                if (str.equals("1Kg")) {
                    rice.this.f192t6.setText("₹84");
                } else if (str.equals("5Kg")) {
                    rice.this.f192t6.setText("₹419");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f175b1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = rice.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("41");
                StringBuilder sb = new StringBuilder();
                sb.append("Daawat Basmati Rice  ");
                sb.append(String.valueOf(rice.this.f181m1.getSelectedItem()));
                sb.append("                ");
                sb.append(rice.this.f187t1.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("41").setValue(rice.this.f187t1.getText().toString().substring(1));
            }
        });
        this.f176b2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = rice.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("42");
                StringBuilder sb = new StringBuilder();
                sb.append("India Gate Basmati Rice ");
                sb.append(String.valueOf(rice.this.f182m2.getSelectedItem()));
                sb.append("                ");
                sb.append(rice.this.f188t2.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("42").setValue(rice.this.f188t2.getText().toString().substring(1));
            }
        });
        this.f177b3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = rice.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("43");
                StringBuilder sb = new StringBuilder();
                sb.append("Mogra Basmati        ");
                sb.append(String.valueOf(rice.this.f183m3.getSelectedItem()));
                sb.append("                ");
                sb.append(rice.this.f189t3.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("43").setValue(rice.this.f189t3.getText().toString().substring(1));
            }
        });
        this.f178b4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = rice.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("44");
                StringBuilder sb = new StringBuilder();
                sb.append("Wada Kolam Rice      ");
                sb.append(String.valueOf(rice.this.f184m4.getSelectedItem()));
                sb.append("                ");
                sb.append(rice.this.f190t4.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("44").setValue(rice.this.f190t4.getText().toString().substring(1));
            }
        });
        this.f179b5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = rice.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("45");
                StringBuilder sb = new StringBuilder();
                sb.append("HMT Kolam            ");
                sb.append(String.valueOf(rice.this.f185m5.getSelectedItem()));
                sb.append("                ");
                sb.append(rice.this.f191t5.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("45").setValue(rice.this.f191t5.getText().toString().substring(1));
            }
        });
        this.f180b6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = rice.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("46");
                StringBuilder sb = new StringBuilder();
                sb.append("Kohinoor Basmati     ");
                sb.append(String.valueOf(rice.this.f186m6.getSelectedItem()));
                sb.append("                ");
                sb.append(rice.this.f192t6.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("46").setValue(rice.this.f192t6.getText().toString().substring(1));
            }
        });
    }
}
