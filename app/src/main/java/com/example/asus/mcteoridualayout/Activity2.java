package com.example.asus.mcteoridualayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    Button btnDua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnDua = (Button) findViewById(R.id.btn02);
        btnDua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent oi2;
                oi2 = new Intent(Activity2.this, MainActivity.class);
                startActivity(oi2);
            }
        });
    }
}