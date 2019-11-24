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

public class pulses extends AppCompatActivity {

    /* renamed from: b1 */
    Button f148b1;
    Button b10;
    Button b11;
    Button b12;
    Button b13;

    /* renamed from: b2 */
    Button f149b2;

    /* renamed from: b3 */
    Button f150b3;

    /* renamed from: b4 */
    Button f151b4;

    /* renamed from: b5 */
    Button f152b5;

    /* renamed from: b6 */
    Button f153b6;

    /* renamed from: b7 */
    Button f154b7;

    /* renamed from: b8 */
    Button f155b8;

    /* renamed from: b9 */
    Button f156b9;
    private FirebaseDatabase mydatabase;
    /* access modifiers changed from: private */
    public DatabaseReference mydbref;

    /* renamed from: p1 */
    Spinner f157p1;
    Spinner p10;
    Spinner p11;
    Spinner p12;
    Spinner p13;

    /* renamed from: p2 */
    Spinner f158p2;

    /* renamed from: p3 */
    Spinner f159p3;

    /* renamed from: p4 */
    Spinner f160p4;

    /* renamed from: p5 */
    Spinner f161p5;

    /* renamed from: p6 */
    Spinner f162p6;

    /* renamed from: p7 */
    Spinner f163p7;

    /* renamed from: p8 */
    Spinner f164p8;

    /* renamed from: p9 */
    Spinner f165p9;

    /* renamed from: t1 */
    TextView f166t1;
    TextView t10;
    TextView t11;
    TextView t12;
    TextView t13;

    /* renamed from: t2 */
    TextView f167t2;

    /* renamed from: t3 */
    TextView f168t3;

    /* renamed from: t4 */
    TextView f169t4;

    /* renamed from: t5 */
    TextView f170t5;

    /* renamed from: t6 */
    TextView f171t6;

    /* renamed from: t7 */
    TextView f172t7;

    /* renamed from: t8 */
    TextView f173t8;

    /* renamed from: t9 */
    TextView f174t9;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0781R.layout.activity_pulses);
        this.mydatabase = FirebaseDatabase.getInstance();
        this.mydbref = this.mydatabase.getReference();
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        this.f157p1 = (Spinner) findViewById(C0781R.C0783id.psp1);
        this.f158p2 = (Spinner) findViewById(C0781R.C0783id.psp2);
        this.f159p3 = (Spinner) findViewById(C0781R.C0783id.psp3);
        this.f160p4 = (Spinner) findViewById(C0781R.C0783id.psp4);
        this.f161p5 = (Spinner) findViewById(C0781R.C0783id.psp5);
        this.f162p6 = (Spinner) findViewById(C0781R.C0783id.psp6);
        this.f163p7 = (Spinner) findViewById(C0781R.C0783id.psp7);
        this.f164p8 = (Spinner) findViewById(C0781R.C0783id.psp8);
        this.f165p9 = (Spinner) findViewById(C0781R.C0783id.psp9);
        this.p10 = (Spinner) findViewById(C0781R.C0783id.psp10);
        this.p11 = (Spinner) findViewById(C0781R.C0783id.psp11);
        this.p12 = (Spinner) findViewById(C0781R.C0783id.psp12);
        this.p13 = (Spinner) findViewById(C0781R.C0783id.psp13);
        this.f166t1 = (TextView) findViewById(C0781R.C0783id.pp1);
        this.f167t2 = (TextView) findViewById(C0781R.C0783id.pp2);
        this.f168t3 = (TextView) findViewById(C0781R.C0783id.pp3);
        this.f169t4 = (TextView) findViewById(C0781R.C0783id.pp4);
        this.f170t5 = (TextView) findViewById(C0781R.C0783id.pp5);
        this.f171t6 = (TextView) findViewById(C0781R.C0783id.pp6);
        this.f172t7 = (TextView) findViewById(C0781R.C0783id.pp7);
        this.f173t8 = (TextView) findViewById(C0781R.C0783id.pp8);
        this.f174t9 = (TextView) findViewById(C0781R.C0783id.pp9);
        this.t10 = (TextView) findViewById(C0781R.C0783id.pp10);
        this.t11 = (TextView) findViewById(C0781R.C0783id.pp11);
        this.t12 = (TextView) findViewById(C0781R.C0783id.pp12);
        this.t13 = (TextView) findViewById(C0781R.C0783id.pp13);
        this.f148b1 = (Button) findViewById(C0781R.C0783id.pbtn1);
        this.f149b2 = (Button) findViewById(C0781R.C0783id.pbtn2);
        this.f150b3 = (Button) findViewById(C0781R.C0783id.pbtn3);
        this.f151b4 = (Button) findViewById(C0781R.C0783id.pbtn4);
        this.f152b5 = (Button) findViewById(C0781R.C0783id.pbtn5);
        this.f153b6 = (Button) findViewById(C0781R.C0783id.pbtn6);
        this.f154b7 = (Button) findViewById(C0781R.C0783id.pbtn7);
        this.f155b8 = (Button) findViewById(C0781R.C0783id.pbtn8);
        this.f156b9 = (Button) findViewById(C0781R.C0783id.pbtn9);
        this.b10 = (Button) findViewById(C0781R.C0783id.pbtn10);
        this.b11 = (Button) findViewById(C0781R.C0783id.pbtn11);
        this.b12 = (Button) findViewById(C0781R.C0783id.pbtn12);
        this.b13 = (Button) findViewById(C0781R.C0783id.pbtn13);
        this.f157p1.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.f157p1.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.f166t1.setText("₹72");
                } else if (str.equals("1kg")) {
                    pulses.this.f166t1.setText("₹144");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f158p2.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.f158p2.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.f167t2.setText("₹54");
                } else if (str.equals("1kg")) {
                    pulses.this.f167t2.setText("₹108");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f159p3.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.f159p3.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.f168t3.setText("₹52");
                } else if (str.equals("1kg")) {
                    pulses.this.f168t3.setText("₹104");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f160p4.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.f160p4.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.f169t4.setText("₹59");
                } else if (str.equals("1kg")) {
                    pulses.this.f169t4.setText("₹105");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f161p5.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.f161p5.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.f170t5.setText("₹41");
                } else if (str.equals("1kg")) {
                    pulses.this.f170t5.setText("₹80");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f162p6.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.f162p6.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.f171t6.setText("₹40");
                } else if (str.equals("1kg")) {
                    pulses.this.f171t6.setText("₹80");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f163p7.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.f163p7.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.f172t7.setText("₹46");
                } else if (str.equals("1kg")) {
                    pulses.this.f172t7.setText("₹90");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f164p8.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.f164p8.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.f173t8.setText("₹70");
                } else if (str.equals("1kg")) {
                    pulses.this.f173t8.setText("₹130");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f165p9.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.f165p9.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.f174t9.setText("₹35");
                } else if (str.equals("1kg")) {
                    pulses.this.f174t9.setText("₹68");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.p10.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.p10.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.t10.setText("₹52");
                } else if (str.equals("1kg")) {
                    pulses.this.t10.setText("₹100");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.p11.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.p11.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.t11.setText("₹59");
                } else if (str.equals("1kg")) {
                    pulses.this.t11.setText("₹110");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.p12.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.p12.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.t12.setText("₹45");
                } else if (str.equals("1kg")) {
                    pulses.this.t12.setText("₹90");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.p13.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(pulses.this.p13.getSelectedItem());
                if (str.equals("500gms")) {
                    pulses.this.t13.setText("₹35");
                } else if (str.equals("1kg")) {
                    pulses.this.t13.setText("₹70");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.f148b1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("5");
                StringBuilder sb = new StringBuilder();
                sb.append("Groundnut            ");
                sb.append(String.valueOf(pulses.this.f157p1.getSelectedItem()));
                sb.append("                ");
                sb.append(pulses.this.f166t1.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("5").setValue(pulses.this.f166t1.getText().toString().substring(1));
            }
        });
        this.f149b2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("6");
                StringBuilder sb = new StringBuilder();
                sb.append("Whole Moong          ");
                sb.append(String.valueOf(pulses.this.f158p2.getSelectedItem()));
                sb.append("                ");
                sb.append(pulses.this.f167t2.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("6").setValue(pulses.this.f167t2.getText().toString().substring(1));
            }
        });
        this.f150b3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("7");
                StringBuilder sb = new StringBuilder();
                sb.append("Chickpeas            ");
                sb.append(String.valueOf(pulses.this.f159p3.getSelectedItem()));
                sb.append("                ");
                sb.append(pulses.this.f168t3.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("7").setValue(pulses.this.f168t3.getText().toString().substring(1));
            }
        });
        this.f151b4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("8");
                StringBuilder sb = new StringBuilder();
                sb.append("White Peas           ");
                sb.append(String.valueOf(pulses.this.f160p4.getSelectedItem()));
                sb.append("                ");
                sb.append(pulses.this.f169t4.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("8").setValue(pulses.this.f169t4.getText().toString().substring(1));
            }
        });
        this.f152b5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("9");
                StringBuilder sb = new StringBuilder();
                sb.append("Small Channa         ");
                sb.append(String.valueOf(pulses.this.f161p5.getSelectedItem()));
                sb.append("                ");
                sb.append(pulses.this.f170t5.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("9").setValue(pulses.this.f170t5.getText().toString().substring(1));
            }
        });
        this.f153b6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("10");
                StringBuilder sb = new StringBuilder();
                sb.append("Matki                ");
                sb.append(String.valueOf(pulses.this.f162p6.getSelectedItem()));
                sb.append("                ");
                sb.append(pulses.this.f171t6.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("10").setValue(pulses.this.f171t6.getText().toString().substring(1));
            }
        });
        this.f154b7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("11");
                StringBuilder sb = new StringBuilder();
                sb.append("Rajma Red            ");
                sb.append(String.valueOf(pulses.this.f163p7.getSelectedItem()));
                sb.append("                ");
                sb.append(pulses.this.f172t7.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("11").setValue(pulses.this.f172t7.getText().toString().substring(1));
            }
        });
        this.f155b8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("12");
                StringBuilder sb = new StringBuilder();
                sb.append("White Rajma          ");
                sb.append(String.valueOf(pulses.this.f164p8.getSelectedItem()));
                sb.append("                ");
                sb.append(pulses.this.f173t8.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("12").setValue(pulses.this.f173t8.getText().toString().substring(1));
            }
        });
        this.f156b9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("13");
                StringBuilder sb = new StringBuilder();
                sb.append("Masoor Whole         ");
                sb.append(String.valueOf(pulses.this.f165p9.getSelectedItem()));
                sb.append("                ");
                sb.append(pulses.this.f174t9.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("13").setValue(pulses.this.f174t9.getText().toString().substring(1));
            }
        });
        this.b10.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("14");
                StringBuilder sb = new StringBuilder();
                sb.append("Big Channa           ");
                sb.append(String.valueOf(pulses.this.p10.getSelectedItem()));
                sb.append("               ");
                sb.append(pulses.this.t10.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("14").setValue(pulses.this.t10.getText().toString().substring(1));
            }
        });
        this.b11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("15");
                StringBuilder sb = new StringBuilder();
                sb.append("Green Peas(Dry)      ");
                sb.append(String.valueOf(pulses.this.p11.getSelectedItem()));
                sb.append("               ");
                sb.append(pulses.this.t11.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("15").setValue(pulses.this.t11.getText().toString().substring(1));
            }
        });
        this.b12.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("16");
                StringBuilder sb = new StringBuilder();
                sb.append("Green Channa         ");
                sb.append(String.valueOf(pulses.this.p12.getSelectedItem()));
                sb.append("               ");
                sb.append(pulses.this.t12.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("16").setValue(pulses.this.t12.getText().toString().substring(1));
            }
        });
        this.b13.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatabaseReference mchild = pulses.this.mydbref.child("users").child(user.getUid());
                DatabaseReference child = mchild.child("Items").child("17");
                StringBuilder sb = new StringBuilder();
                sb.append("Soyabean             ");
                sb.append(String.valueOf(pulses.this.p13.getSelectedItem()));
                sb.append("               ");
                sb.append(pulses.this.t13.getText());
                child.setValue(sb.toString());
                mchild.child("Price").child("17").setValue(pulses.this.t13.getText().toString().substring(1));
            }
        });
    }
}
