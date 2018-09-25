package com.example.sadrisya.fragmentsex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
Button bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        bn=(Button)findViewById(R.id.button1);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                finish();
                Intent returnBtn = new Intent(getApplicationContext(),
                        MainActivity.class);

                startActivity(returnBtn);

            }
        });

    }
    public void onStart(){
        super.onStart();
        TextView tv=(TextView)findViewById(R.id.textView1);
        //show text in the Intent object in the TextView
        tv.setText(getIntent().getStringExtra("text"));
    }
}
