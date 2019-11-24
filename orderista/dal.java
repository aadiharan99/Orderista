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

public class dal extends AppCompatActivity {

    /* renamed from: b1 */
    Button f100b1;

    /* renamed from: b2 */
    Button f101b2;

    /* renamed from: b3 */
    Button f102b3;

    /* renamed from: b4 */
    Button f103b4;
    private FirebaseAuth mauth;
    Spinner menu1;
    Spinner menu2;
    Spinner menu3;
    Spinner menu4;
    private FirebaseDatabase mydatabase;
    /* access modifiers changed from: private */
    public DatabaseReference mydbref;

    /* renamed from: t1 */
    TextView f104t1;

    /* renamed from: t2 */
    TextView f105t2;

    /* renamed from: t3 */
    TextView f106t3;

    /* renamed from: t4 */
    TextView f107t4;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0781R.layout.activity_dal);
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        this.mydatabase = FirebaseDatabase.getInstance();
        this.mydbref = this.mydatabase.getReference();
        this.menu1 = (Spinner) findViewById(C0781R.C0783id.dsp1);
        this.menu2 = (Spinner) findViewById(C0781R.C0783id.dsp2);
        this.menu3 = (Spinner) findViewById(C0781R.C0783id.dsp3);
        this.menu4 = (Spinner) findViewById(C0781R.C0783id.dsp4);
        this.f104t1 = (TextView) findViewById(C0781R.C0783id.gp1);
        this.f105t2 = (TextView) findViewById(C0781R.C0783id.gp2);
        this.f106t3 = (TextView) findViewById(C0781R.C0783id.gp3);
        this.f107t4 = (TextView) findViewById(C0781R.C0783id.gp4);
        this.f100b1 = (Button) findViewById(C0781R.C0783id.dbtn1);
        this.f101b2 = (Button) findViewById(C0781R.C0783id.dbtn2);
        this.f102b3 = (Button) findViewById(C0781R.C0783id.dbtn3);
        this.f103b4 = (Button) findViewById(C0781R.C0783id.dbtn4);
        this.menu1.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(dal.this.menu1.getSelectedItem());
                if (str.equals("500gms")) {
                    dal.this.f104t1.setText("₹50");
                } else if (str.equals("1kg")) {
                    dal.this.f104t1.setText("₹90");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.menu2.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(dal.this.menu2.getSelectedItem());
                if (str.equals("500gms")) {
                    dal.this.f105t2.setText("₹49");
                } else if (str.equals("1kg")) {
                    dal.this.f105t2.setText("₹99");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.menu3.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(dal.this.menu3.getSelectedItem());
                if (str.equals("500gms")) {
                    dal.this.f106t3.setText("₹40");
                } else if (str.equals("1kg")) {
                    dal.this.f106t3.setText("₹78");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.menu4.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(dal.this.menu4.getSelectedItem());
                if (str.equals("500gms")) {
                    dal.this.f107t4.setText("₹55");
                } else if (str.equals("1kg")) {
                    dal.this.f107t4.setText("₹108");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f100b1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = dal.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("1");
                StringBuilder sb = new StringBuilder();
                sb.append("Tur Dal Latur        ");
                sb.append(String.valueOf(dal.this.menu1.getSelectedItem()));
                sb.append("              ");
                sb.append(dal.this.f104t1.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("1").setValue(dal.this.f104t1.getText().toString().substring(1));
            }
        });
        this.f101b2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = dal.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("2");
                StringBuilder sb = new StringBuilder();
                sb.append("Moong Dal            ");
                sb.append(String.valueOf(dal.this.menu2.getSelectedItem()));
                sb.append("             ");
                sb.append(dal.this.f105t2.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("2").setValue(dal.this.f105t2.getText().toString().substring(1));
            }
        });
        this.f102b3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = dal.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("3");
                StringBuilder sb = new StringBuilder();
                sb.append("Masoor Dal           ");
                sb.append(String.valueOf(dal.this.menu3.getSelectedItem()));
                sb.append("             ");
                sb.append(dal.this.f106t3.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("3").setValue(dal.this.f106t3.getText().toString().substring(1));
            }
        });
        this.f103b4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = dal.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("4");
                StringBuilder sb = new StringBuilder();
                sb.append("Urad Dal             ");
                sb.append(String.valueOf(dal.this.menu4.getSelectedItem()));
                sb.append("             ");
                sb.append(dal.this.f107t4.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("4").setValue(dal.this.f107t4.getText().toString().substring(1));
            }
        });
    }
}
