package com.example.medamoniaravind.intentconcept;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView secndtextview;
    String secndmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        secndtextview=findViewById(R.id.txtvws);
        Intent intent1=getIntent();
        secndmail= intent1.getStringExtra("email");
        secndtextview.setText("welcome "+secndmail);
    }
}
