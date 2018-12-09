package com.example.asus.mcteoridualayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tombolshare, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombolshare = (TextView) findViewById(R.id.tvhal);
        isi = (TextView) findViewById(R.id.TextViewHello);

        tombolshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i;
            i = new Intent(Intent.ACTION_SEND);
            i.putExtra(Intent.EXTRA_TEXT, isi.getText().toString());
            i.setType("text/plain");
            startActivity(i);
        }
    });
    }
}
