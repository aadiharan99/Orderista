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

public class ghee extends AppCompatActivity {

    /* renamed from: b1 */
    Button f108b1;

    /* renamed from: b2 */
    Button f109b2;

    /* renamed from: b3 */
    Button f110b3;

    /* renamed from: b4 */
    Button f111b4;

    /* renamed from: b5 */
    Button f112b5;

    /* renamed from: g1 */
    Spinner f113g1;

    /* renamed from: g2 */
    Spinner f114g2;

    /* renamed from: g3 */
    Spinner f115g3;

    /* renamed from: g4 */
    Spinner f116g4;

    /* renamed from: g5 */
    Spinner f117g5;
    private FirebaseDatabase mydatabase;
    /* access modifiers changed from: private */
    public DatabaseReference mydbref;

    /* renamed from: t1 */
    TextView f118t1;

    /* renamed from: t2 */
    TextView f119t2;

    /* renamed from: t3 */
    TextView f120t3;

    /* renamed from: t4 */
    TextView f121t4;

    /* renamed from: t5 */
    TextView f122t5;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0781R.layout.activity_ghee);
        this.f113g1 = (Spinner) findViewById(C0781R.C0783id.qsp1);
        this.f114g2 = (Spinner) findViewById(C0781R.C0783id.qsp2);
        this.f115g3 = (Spinner) findViewById(C0781R.C0783id.qsp3);
        this.f116g4 = (Spinner) findViewById(C0781R.C0783id.qsp4);
        this.f117g5 = (Spinner) findViewById(C0781R.C0783id.qsp5);
        this.f118t1 = (TextView) findViewById(C0781R.C0783id.ghp1);
        this.f119t2 = (TextView) findViewById(C0781R.C0783id.ghp2);
        this.f120t3 = (TextView) findViewById(C0781R.C0783id.ghp3);
        this.f121t4 = (TextView) findViewById(C0781R.C0783id.ghp4);
        this.f122t5 = (TextView) findViewById(C0781R.C0783id.ghp5);
        this.f108b1 = (Button) findViewById(C0781R.C0783id.qbtn1);
        this.f109b2 = (Button) findViewById(C0781R.C0783id.qbtn2);
        this.f110b3 = (Button) findViewById(C0781R.C0783id.qbtn3);
        this.f111b4 = (Button) findViewById(C0781R.C0783id.qbtn4);
        this.f112b5 = (Button) findViewById(C0781R.C0783id.qbtn5);
        this.mydatabase = FirebaseDatabase.getInstance();
        this.mydbref = this.mydatabase.getReference();
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        this.f113g1.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(ghee.this.f113g1.getSelectedItem());
                if (str.equals("500ml")) {
                    ghee.this.f118t1.setText("₹210");
                } else if (str.equals("1L")) {
                    ghee.this.f118t1.setText("₹422");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f114g2.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(ghee.this.f114g2.getSelectedItem());
                if (str.equals("500ml")) {
                    ghee.this.f119t2.setText("₹203");
                } else if (str.equals("1L")) {
                    ghee.this.f119t2.setText("₹394");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f115g3.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(ghee.this.f115g3.getSelectedItem());
                if (str.equals("500ml")) {
                    ghee.this.f120t3.setText("₹180");
                } else if (str.equals("1L")) {
                    ghee.this.f120t3.setText("₹355");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f116g4.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(ghee.this.f116g4.getSelectedItem());
                if (str.equals("500ml")) {
                    ghee.this.f121t4.setText("₹190");
                } else if (str.equals("1L")) {
                    ghee.this.f121t4.setText("₹375");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f117g5.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(ghee.this.f117g5.getSelectedItem());
                if (str.equals("500ml")) {
                    ghee.this.f122t5.setText("₹47");
                } else if (str.equals("1L")) {
                    ghee.this.f122t5.setText("₹94");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f108b1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = ghee.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("47");
                StringBuilder sb = new StringBuilder();
                sb.append("Gowardhan Ghee       ");
                sb.append(String.valueOf(ghee.this.f113g1.getSelectedItem()));
                sb.append("                ");
                sb.append(ghee.this.f118t1.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("47").setValue(ghee.this.f118t1.getText().toString().substring(1));
            }
        });
        this.f109b2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = ghee.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("48");
                StringBuilder sb = new StringBuilder();
                sb.append("Amul Pure Ghee       ");
                sb.append(String.valueOf(ghee.this.f114g2.getSelectedItem()));
                sb.append("                ");
                sb.append(ghee.this.f119t2.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("48").setValue(ghee.this.f119t2.getText().toString().substring(1));
            }
        });
        this.f110b3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = ghee.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("49");
                StringBuilder sb = new StringBuilder();
                sb.append("Premia Cow Ghee      ");
                sb.append(String.valueOf(ghee.this.f115g3.getSelectedItem()));
                sb.append("                ");
                sb.append(ghee.this.f120t3.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("49").setValue(ghee.this.f120t3.getText().toString().substring(1));
            }
        });
        this.f111b4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = ghee.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("50");
                StringBuilder sb = new StringBuilder();
                sb.append("Mother Dairy         ");
                sb.append(String.valueOf(ghee.this.f116g4.getSelectedItem()));
                sb.append("                ");
                sb.append(ghee.this.f121t4.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("50").setValue(ghee.this.f121t4.getText().toString().substring(1));
            }
        });
        this.f112b5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = ghee.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("51");
                StringBuilder sb = new StringBuilder();
                sb.append("Dalda                ");
                sb.append(String.valueOf(ghee.this.f117g5.getSelectedItem()));
                sb.append("                ");
                sb.append(ghee.this.f122t5.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("51").setValue(ghee.this.f122t5.getText().toString().substring(1));
            }
        });
    }
}
