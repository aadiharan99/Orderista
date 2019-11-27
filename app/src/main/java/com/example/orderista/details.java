package com.example.orderista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class details extends AppCompatActivity {

    Spinner time;
    Button btn;
    TextView tim;

    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        time=(Spinner) findViewById(R.id.sp1);
        btn=(Button) findViewById(R.id.btn1);
        tim=(TextView) findViewById(R.id.tt1);
        time.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str=String.valueOf(time.getSelectedItem());
                if(str.equals("Morning(10am-1pm)"))
                {
                    tim.setText("Morning(10am-1pm)");
                }
                else if (str.equals("Afternoon(1pm-4pm)"))
                {
                    tim.setText("Afternoon(1pm-4pm)");
                }
                else if (str.equals("Evening(4pm-7pm)"))
                {
                    tim.setText("Evening(4pm-7pm)");
                }
                else if (str.equals("Night(7pm-9pm)"))
                {
                    tim.setText("Night(7pm-9pm)");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(details.this,"Your details have been saved!!", Toast.LENGTH_LONG).show();
            }
        });
    }
}



