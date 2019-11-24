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

public class oil extends AppCompatActivity {

    /* renamed from: b1 */
    Button f123b1;

    /* renamed from: b2 */
    Button f124b2;

    /* renamed from: b3 */
    Button f125b3;

    /* renamed from: b4 */
    Button f126b4;

    /* renamed from: b5 */
    Button f127b5;

    /* renamed from: b6 */
    Button f128b6;

    /* renamed from: b7 */
    Button f129b7;

    /* renamed from: b8 */
    Button f130b8;
    private FirebaseDatabase mydatabase;
    /* access modifiers changed from: private */
    public DatabaseReference mydbref;

    /* renamed from: p1 */
    Spinner f131p1;

    /* renamed from: p2 */
    Spinner f132p2;

    /* renamed from: p3 */
    Spinner f133p3;

    /* renamed from: p4 */
    Spinner f134p4;

    /* renamed from: p5 */
    Spinner f135p5;

    /* renamed from: p6 */
    Spinner f136p6;

    /* renamed from: p7 */
    Spinner f137p7;

    /* renamed from: p8 */
    Spinner f138p8;

    /* renamed from: pp */
    TextView f139pp;

    /* renamed from: t1 */
    TextView f140t1;

    /* renamed from: t2 */
    TextView f141t2;

    /* renamed from: t3 */
    TextView f142t3;

    /* renamed from: t4 */
    TextView f143t4;

    /* renamed from: t5 */
    TextView f144t5;

    /* renamed from: t6 */
    TextView f145t6;

    /* renamed from: t7 */
    TextView f146t7;

    /* renamed from: t8 */
    TextView f147t8;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0781R.layout.activity_oil);
        this.mydatabase = FirebaseDatabase.getInstance();
        this.mydbref = this.mydatabase.getReference();
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        this.f131p1 = (Spinner) findViewById(C0781R.C0783id.wsp1);
        this.f134p4 = (Spinner) findViewById(C0781R.C0783id.wsp4);
        this.f135p5 = (Spinner) findViewById(C0781R.C0783id.wsp5);
        this.f132p2 = (Spinner) findViewById(C0781R.C0783id.wsp2);
        this.f133p3 = (Spinner) findViewById(C0781R.C0783id.wsp3);
        this.f136p6 = (Spinner) findViewById(C0781R.C0783id.wsp6);
        this.f137p7 = (Spinner) findViewById(C0781R.C0783id.wsp7);
        this.f138p8 = (Spinner) findViewById(C0781R.C0783id.wsp8);
        this.f140t1 = (TextView) findViewById(C0781R.C0783id.op1);
        this.f141t2 = (TextView) findViewById(C0781R.C0783id.op2);
        this.f142t3 = (TextView) findViewById(C0781R.C0783id.op3);
        this.f143t4 = (TextView) findViewById(C0781R.C0783id.op4);
        this.f144t5 = (TextView) findViewById(C0781R.C0783id.op5);
        this.f145t6 = (TextView) findViewById(C0781R.C0783id.op6);
        this.f146t7 = (TextView) findViewById(C0781R.C0783id.op7);
        this.f147t8 = (TextView) findViewById(C0781R.C0783id.op8);
        this.f123b1 = (Button) findViewById(C0781R.C0783id.wbtn1);
        this.f124b2 = (Button) findViewById(C0781R.C0783id.wbtn2);
        this.f125b3 = (Button) findViewById(C0781R.C0783id.wbtn3);
        this.f126b4 = (Button) findViewById(C0781R.C0783id.wbtn4);
        this.f127b5 = (Button) findViewById(C0781R.C0783id.wbtn5);
        this.f128b6 = (Button) findViewById(C0781R.C0783id.wbtn6);
        this.f129b7 = (Button) findViewById(C0781R.C0783id.wbtn7);
        this.f130b8 = (Button) findViewById(C0781R.C0783id.wbtn8);
        this.f131p1.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(oil.this.f131p1.getSelectedItem());
                if (str.equals("500ml")) {
                    oil.this.f140t1.setText("₹43");
                } else if (str.equals("1L")) {
                    oil.this.f140t1.setText("₹86");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f132p2.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(oil.this.f132p2.getSelectedItem());
                if (str.equals("500ml")) {
                    oil.this.f141t2.setText("₹49");
                } else if (str.equals("1L")) {
                    oil.this.f141t2.setText("₹98");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f133p3.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(oil.this.f133p3.getSelectedItem());
                if (str.equals("500ml")) {
                    oil.this.f142t3.setText("₹43");
                } else if (str.equals("1L")) {
                    oil.this.f142t3.setText("₹85");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f134p4.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(oil.this.f134p4.getSelectedItem());
                if (str.equals("500ml")) {
                    oil.this.f143t4.setText("₹51");
                } else if (str.equals("1L")) {
                    oil.this.f143t4.setText("₹101");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f135p5.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(oil.this.f135p5.getSelectedItem());
                if (str.equals("500ml")) {
                    oil.this.f144t5.setText("₹74");
                } else if (str.equals("1L")) {
                    oil.this.f144t5.setText("₹148");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f136p6.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(oil.this.f136p6.getSelectedItem());
                if (str.equals("500ml")) {
                    oil.this.f145t6.setText("₹55");
                } else if (str.equals("1L")) {
                    oil.this.f145t6.setText("₹110");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f137p7.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(oil.this.f137p7.getSelectedItem());
                if (str.equals("500ml")) {
                    oil.this.f146t7.setText("₹100");
                } else if (str.equals("1L")) {
                    oil.this.f146t7.setText("₹200");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f138p8.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(oil.this.f138p8.getSelectedItem());
                if (str.equals("500ml")) {
                    oil.this.f147t8.setText("₹58");
                } else if (str.equals("1L")) {
                    oil.this.f147t8.setText("₹115");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f123b1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = oil.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("33");
                StringBuilder sb = new StringBuilder();
                sb.append("Sunday Sunflower Oil  ");
                sb.append(String.valueOf(oil.this.f131p1.getSelectedItem()));
                sb.append("                ");
                sb.append(oil.this.f140t1.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("33").setValue(oil.this.f140t1.getText().toString().substring(1));
            }
        });
        this.f124b2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = oil.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("34");
                StringBuilder sb = new StringBuilder();
                sb.append("Fortune Sunflower Oil ");
                sb.append(String.valueOf(oil.this.f132p2.getSelectedItem()));
                sb.append("                ");
                sb.append(oil.this.f141t2.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("34").setValue(oil.this.f141t2.getText().toString().substring(1));
            }
        });
        this.f125b3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = oil.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("35");
                StringBuilder sb = new StringBuilder();
                sb.append("Sunrich Sunflower Oil ");
                sb.append(String.valueOf(oil.this.f133p3.getSelectedItem()));
                sb.append("                ");
                sb.append(oil.this.f142t3.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("35").setValue(oil.this.f142t3.getText().toString().substring(1));
            }
        });
        this.f126b4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = oil.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("36");
                StringBuilder sb = new StringBuilder();
                sb.append("Gemini Sunflower Oil ");
                sb.append(String.valueOf(oil.this.f134p4.getSelectedItem()));
                sb.append("                ");
                sb.append(oil.this.f143t4.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("36").setValue(oil.this.f143t4.getText().toString().substring(1));
            }
        });
        this.f127b5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = oil.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("37");
                StringBuilder sb = new StringBuilder();
                sb.append("Saffola Gold         ");
                sb.append(String.valueOf(oil.this.f135p5.getSelectedItem()));
                sb.append("                ");
                sb.append(oil.this.f144t5.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("37").setValue(oil.this.f144t5.getText().toString().substring(1));
            }
        });
        this.f128b6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = oil.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("38");
                StringBuilder sb = new StringBuilder();
                sb.append("Saffola Active       ");
                sb.append(String.valueOf(oil.this.f136p6.getSelectedItem()));
                sb.append("                ");
                sb.append(oil.this.f145t6.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("38").setValue(oil.this.f145t6.getText().toString().substring(1));
            }
        });
        this.f129b7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = oil.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("39");
                StringBuilder sb = new StringBuilder();
                sb.append("Sundrop Heart        ");
                sb.append(String.valueOf(oil.this.f137p7.getSelectedItem()));
                sb.append("                ");
                sb.append(oil.this.f146t7.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("39").setValue(oil.this.f146t7.getText().toString().substring(1));
            }
        });
        this.f130b8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = oil.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("40");
                StringBuilder sb = new StringBuilder();
                sb.append("Fortune Rice Bran    ");
                sb.append(String.valueOf(oil.this.f138p8.getSelectedItem()));
                sb.append("                ");
                sb.append(oil.this.f147t8.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("40").setValue(oil.this.f147t8.getText().toString().substring(1));
            }
        });
    }
}
