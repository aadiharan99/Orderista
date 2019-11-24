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
import android.widget.Toast;

public class details extends AppCompatActivity {
    Button btn;
    TextView tim;
    Spinner time;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0781R.layout.activity_details);
        this.time = (Spinner) findViewById(C0781R.C0783id.sp1);
        this.btn = (Button) findViewById(C0781R.C0783id.btn1);
        this.tim = (TextView) findViewById(C0781R.C0783id.tt1);
        this.time.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String str = String.valueOf(details.this.time.getSelectedItem());
                if (str.equals("Morning(10am-1pm)")) {
                    details.this.tim.setText("Morning(10am-1pm");
                } else if (str.equals("Afternoon(1pm-4pm)")) {
                    details.this.tim.setText("Afternoon(1pm-4pm)");
                } else if (str.equals("Evening(4pm-7pm)")) {
                    details.this.tim.setText("Evening(4pm-7pm)");
                } else if (str.equals("Night(7pm-9pm)")) {
                    details.this.tim.setText("Night(7pm-9pm)");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(details.this, "Your details have been saved!!", 1).show();
            }
        });
    }
}
