package com.example.orderista;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p002v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.ArrayList;

public class cart extends AppCompatActivity {
    public static final String TAG = "cart";
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList = new ArrayList<>();

    /* renamed from: b1 */
    Button f97b1;
    public ListView mlist;
    FirebaseDatabase mydb;
    DatabaseReference mydbref;
    ArrayList<String> plist = new ArrayList<>();

    /* renamed from: pp */
    TextView f98pp;

    /* renamed from: t1 */
    private TextView f99t1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0781R.layout.activity_cart);
        this.f98pp = (TextView) findViewById(C0781R.C0783id.cp2);
        this.f97b1 = (Button) findViewById(C0781R.C0783id.cbtn1);
        this.mlist = (ListView) findViewById(C0781R.C0783id.list1);
        this.mydb = FirebaseDatabase.getInstance();
        this.mydbref = this.mydb.getReference();
        DatabaseReference r3 = this.mydbref.child("users").child(FirebaseAuth.getInstance().getCurrentUser().getUid());
        DatabaseReference r4 = r3.child("Items");
        DatabaseReference r5 = r3.child("Price");
        r4.addChildEventListener(new ChildEventListener() {
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                cart.this.arrayList.add((String) dataSnapshot.getValue(String.class));
                cart cart = cart.this;
                cart.adapter = new ArrayAdapter<>(cart, 17367043, cart.arrayList);
                cart.this.mlist.setAdapter(cart.this.adapter);
            }

            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
            }

            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
            }

            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
            }

            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        r5.addChildEventListener(new ChildEventListener() {
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                cart.this.plist.add((String) dataSnapshot.getValue(String.class));
                double total = 0.0d;
                for (int i = 0; i < cart.this.plist.size(); i++) {
                    total += Double.parseDouble((String) cart.this.plist.get(i));
                }
                if (total >= 1500.0d) {
                    double total2 = total - (0.1d * total);
                    TextView textView = cart.this.f98pp;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Total:  ₹ ");
                    sb.append(String.valueOf(total2));
                    textView.setText(sb.toString());
                } else if (total >= 2000.0d) {
                    double total3 = total - (0.15d * total);
                    TextView textView2 = cart.this.f98pp;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Total:  ₹ ");
                    sb2.append(String.valueOf(total3));
                    textView2.setText(sb2.toString());
                } else {
                    TextView textView3 = cart.this.f98pp;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Total:  ₹ ");
                    sb3.append(String.valueOf(total));
                    textView3.setText(sb3.toString());
                }
            }

            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
            }

            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
            }

            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
            }

            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        this.f97b1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                cart.this.startActivity(new Intent(cart.this.getApplicationContext(), details.class));
            }
        });
    }
}
