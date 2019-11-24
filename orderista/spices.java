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

public class spices extends AppCompatActivity {

    /* renamed from: b1 */
    Button f193b1;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;

    /* renamed from: b2 */
    Button f194b2;

    /* renamed from: b3 */
    Button f195b3;

    /* renamed from: b4 */
    Button f196b4;

    /* renamed from: b5 */
    Button f197b5;

    /* renamed from: b6 */
    Button f198b6;

    /* renamed from: b7 */
    Button f199b7;

    /* renamed from: b8 */
    Button f200b8;

    /* renamed from: b9 */
    Button f201b9;
    private FirebaseDatabase mydatabase;
    /* access modifiers changed from: private */
    public DatabaseReference mydbref;

    /* renamed from: s1 */
    Spinner f202s1;
    Spinner s10;
    Spinner s11;
    Spinner s12;
    Spinner s13;
    Spinner s14;
    Spinner s15;

    /* renamed from: s2 */
    Spinner f203s2;

    /* renamed from: s3 */
    Spinner f204s3;

    /* renamed from: s4 */
    Spinner f205s4;

    /* renamed from: s5 */
    Spinner f206s5;

    /* renamed from: s6 */
    Spinner f207s6;

    /* renamed from: s7 */
    Spinner f208s7;

    /* renamed from: s8 */
    Spinner f209s8;

    /* renamed from: s9 */
    Spinner f210s9;

    /* renamed from: t1 */
    TextView f211t1;
    TextView t10;
    TextView t11;
    TextView t12;
    TextView t13;
    TextView t14;
    TextView t15;

    /* renamed from: t2 */
    TextView f212t2;

    /* renamed from: t3 */
    TextView f213t3;

    /* renamed from: t4 */
    TextView f214t4;

    /* renamed from: t5 */
    TextView f215t5;

    /* renamed from: t6 */
    TextView f216t6;

    /* renamed from: t7 */
    TextView f217t7;

    /* renamed from: t8 */
    TextView f218t8;

    /* renamed from: t9 */
    TextView f219t9;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0781R.layout.activity_spices);
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        this.mydatabase = FirebaseDatabase.getInstance();
        this.mydbref = this.mydatabase.getReference();
        this.f202s1 = (Spinner) findViewById(C0781R.C0783id.ssp1);
        this.f203s2 = (Spinner) findViewById(C0781R.C0783id.ssp2);
        this.f204s3 = (Spinner) findViewById(C0781R.C0783id.ssp3);
        this.f205s4 = (Spinner) findViewById(C0781R.C0783id.ssp4);
        this.f206s5 = (Spinner) findViewById(C0781R.C0783id.ssp5);
        this.f207s6 = (Spinner) findViewById(C0781R.C0783id.ssp6);
        this.f208s7 = (Spinner) findViewById(C0781R.C0783id.ssp7);
        this.f209s8 = (Spinner) findViewById(C0781R.C0783id.ssp8);
        this.f210s9 = (Spinner) findViewById(C0781R.C0783id.ssp9);
        this.s10 = (Spinner) findViewById(C0781R.C0783id.ssp10);
        this.s11 = (Spinner) findViewById(C0781R.C0783id.ssp11);
        this.s12 = (Spinner) findViewById(C0781R.C0783id.ssp12);
        this.s13 = (Spinner) findViewById(C0781R.C0783id.ssp13);
        this.s14 = (Spinner) findViewById(C0781R.C0783id.ssp14);
        this.s15 = (Spinner) findViewById(C0781R.C0783id.ssp15);
        this.f211t1 = (TextView) findViewById(C0781R.C0783id.sp1);
        this.f212t2 = (TextView) findViewById(C0781R.C0783id.sp2);
        this.f213t3 = (TextView) findViewById(C0781R.C0783id.sp3);
        this.f214t4 = (TextView) findViewById(C0781R.C0783id.sp4);
        this.f215t5 = (TextView) findViewById(C0781R.C0783id.sp5);
        this.f216t6 = (TextView) findViewById(C0781R.C0783id.sp6);
        this.f217t7 = (TextView) findViewById(C0781R.C0783id.sp7);
        this.f218t8 = (TextView) findViewById(C0781R.C0783id.sp8);
        this.f219t9 = (TextView) findViewById(C0781R.C0783id.sp9);
        this.t10 = (TextView) findViewById(C0781R.C0783id.sp10);
        this.t11 = (TextView) findViewById(C0781R.C0783id.sp11);
        this.t12 = (TextView) findViewById(C0781R.C0783id.sp12);
        this.t13 = (TextView) findViewById(C0781R.C0783id.sp13);
        this.t14 = (TextView) findViewById(C0781R.C0783id.sp14);
        this.t15 = (TextView) findViewById(C0781R.C0783id.sp15);
        this.f193b1 = (Button) findViewById(C0781R.C0783id.sbtn1);
        this.f194b2 = (Button) findViewById(C0781R.C0783id.sbtn2);
        this.f195b3 = (Button) findViewById(C0781R.C0783id.sbtn3);
        this.f196b4 = (Button) findViewById(C0781R.C0783id.sbtn4);
        this.f197b5 = (Button) findViewById(C0781R.C0783id.sbtn5);
        this.f198b6 = (Button) findViewById(C0781R.C0783id.sbtn6);
        this.f199b7 = (Button) findViewById(C0781R.C0783id.sbtn7);
        this.f200b8 = (Button) findViewById(C0781R.C0783id.sbtn8);
        this.f201b9 = (Button) findViewById(C0781R.C0783id.sbtn9);
        this.b10 = (Button) findViewById(C0781R.C0783id.sbtn10);
        this.b11 = (Button) findViewById(C0781R.C0783id.sbtn11);
        this.b12 = (Button) findViewById(C0781R.C0783id.sbtn12);
        this.b13 = (Button) findViewById(C0781R.C0783id.sbtn13);
        this.b14 = (Button) findViewById(C0781R.C0783id.sbtn14);
        this.b15 = (Button) findViewById(C0781R.C0783id.sbtn15);
        this.f202s1.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.f202s1.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.f211t1.setText("₹29");
                } else if (str.equals("200gms")) {
                    spices.this.f211t1.setText("₹60");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f203s2.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.f203s2.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.f212t2.setText("₹35");
                } else if (str.equals("200gms")) {
                    spices.this.f212t2.setText("₹70");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f204s3.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.f204s3.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.f213t3.setText("₹25");
                } else if (str.equals("200gms")) {
                    spices.this.f213t3.setText("₹51");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f205s4.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.f205s4.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.f214t4.setText("₹18");
                } else if (str.equals("200gms")) {
                    spices.this.f214t4.setText("₹32");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f206s5.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.f206s5.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.f215t5.setText("₹20");
                } else if (str.equals("200gms")) {
                    spices.this.f215t5.setText("₹44");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f207s6.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.f207s6.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.f216t6.setText("₹12");
                } else if (str.equals("200gms")) {
                    spices.this.f216t6.setText("₹23");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f208s7.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.f208s7.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.f217t7.setText("₹20");
                } else if (str.equals("200gms")) {
                    spices.this.f217t7.setText("₹40");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f209s8.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.f209s8.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.f218t8.setText("₹49");
                } else if (str.equals("200gms")) {
                    spices.this.f218t8.setText("₹95");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f210s9.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.f210s9.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.f219t9.setText("₹25");
                } else if (str.equals("200gms")) {
                    spices.this.f219t9.setText("₹42");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.s10.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.s10.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.t10.setText("₹73");
                } else if (str.equals("200gms")) {
                    spices.this.t10.setText("₹140");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.s11.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.s11.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.t11.setText("₹33");
                } else if (str.equals("200gms")) {
                    spices.this.t11.setText("₹60");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.s12.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.s12.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.t12.setText("₹105");
                } else if (str.equals("200gms")) {
                    spices.this.t12.setText("₹200");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.s13.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.s13.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.t13.setText("₹14");
                } else if (str.equals("200gms")) {
                    spices.this.t13.setText("₹30");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.s14.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.s14.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.t14.setText("₹30");
                } else if (str.equals("200gms")) {
                    spices.this.t14.setText("₹60");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.s15.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(spices.this.s15.getSelectedItem());
                if (str.equals("100gms")) {
                    spices.this.t15.setText("₹35");
                } else if (str.equals("200gms")) {
                    spices.this.t15.setText("₹65");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f193b1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("18");
                StringBuilder sb = new StringBuilder();
                sb.append("Jeera                ");
                sb.append(String.valueOf(spices.this.f202s1.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.f211t1.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("18").setValue(spices.this.f211t1.getText().toString().substring(1));
            }
        });
        this.f194b2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("19");
                StringBuilder sb = new StringBuilder();
                sb.append("Dry Coconut          ");
                sb.append(String.valueOf(spices.this.f203s2.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.f212t2.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("19").setValue(spices.this.f212t2.getText().toString().substring(1));
            }
        });
        this.f195b3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("20");
                StringBuilder sb = new StringBuilder();
                sb.append("Dhaniya              ");
                sb.append(String.valueOf(spices.this.f204s3.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.f213t3.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("20").setValue(spices.this.f213t3.getText().toString().substring(1));
            }
        });
        this.f196b4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("21");
                StringBuilder sb = new StringBuilder();
                sb.append("Haldi Powder         ");
                sb.append(String.valueOf(spices.this.f205s4.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.f214t4.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("21").setValue(spices.this.f214t4.getText().toString().substring(1));
            }
        });
        this.f197b5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("22");
                StringBuilder sb = new StringBuilder();
                sb.append("Imli                 ");
                sb.append(String.valueOf(spices.this.f206s5.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.f215t5.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("22").setValue(spices.this.f215t5.getText().toString().substring(1));
            }
        });
        this.f198b6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("23");
                StringBuilder sb = new StringBuilder();
                sb.append("Rai                  ");
                sb.append(String.valueOf(spices.this.f207s6.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.f216t6.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("23").setValue(spices.this.f216t6.getText().toString().substring(1));
            }
        });
        this.f199b7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("24");
                StringBuilder sb = new StringBuilder();
                sb.append("Dhaniya Powder       ");
                sb.append(String.valueOf(spices.this.f208s7.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.f217t7.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("24").setValue(spices.this.f217t7.getText().toString().substring(1));
            }
        });
        this.f200b8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("25");
                StringBuilder sb = new StringBuilder();
                sb.append("Garam Masala         ");
                sb.append(String.valueOf(spices.this.f209s8.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.f218t8.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("25").setValue(spices.this.f218t8.getText().toString().substring(1));
            }
        });
        this.f201b9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("26");
                StringBuilder sb = new StringBuilder();
                sb.append("Red Chilli Powder    ");
                sb.append(String.valueOf(spices.this.f210s9.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.f219t9.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("26").setValue(spices.this.f219t9.getText().toString().substring(1));
            }
        });
        this.b10.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("27");
                StringBuilder sb = new StringBuilder();
                sb.append("Black Pepper Powder  ");
                sb.append(String.valueOf(spices.this.s10.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.t10.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("27").setValue(spices.this.t10.getText().toString().substring(1));
            }
        });
        this.b11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("28");
                StringBuilder sb = new StringBuilder();
                sb.append("Jeera Powder         ");
                sb.append(String.valueOf(spices.this.s11.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.t11.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("28").setValue(spices.this.t11.getText().toString().substring(1));
            }
        });
        this.b12.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("29");
                StringBuilder sb = new StringBuilder();
                sb.append("Hing                 ");
                sb.append(String.valueOf(spices.this.s12.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.t12.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("29").setValue(spices.this.t12.getText().toString().substring(1));
            }
        });
        this.b13.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("30");
                StringBuilder sb = new StringBuilder();
                sb.append("Methi                ");
                sb.append(String.valueOf(spices.this.s13.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.t13.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("30").setValue(spices.this.t13.getText().toString().substring(1));
            }
        });
        this.b14.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("31");
                StringBuilder sb = new StringBuilder();
                sb.append("Til                  ");
                sb.append(String.valueOf(spices.this.s14.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.t14.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("31").setValue(spices.this.t14.getText().toString().substring(1));
            }
        });
        this.b15.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = spices.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("32");
                StringBuilder sb = new StringBuilder();
                sb.append("Ginger Powder        ");
                sb.append(String.valueOf(spices.this.s15.getSelectedItem()));
                sb.append("                ");
                sb.append(spices.this.t15.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("32").setValue(spices.this.t15.getText().toString().substring(1));
            }
        });
    }
}
