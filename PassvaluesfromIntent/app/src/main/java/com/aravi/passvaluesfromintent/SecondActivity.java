package com.aravi.passvaluesfromintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        String gotvalue=getIntent().getStringExtra("name");
        String gotnum=getIntent().getStringExtra("mobilenum");
        textView.setText(gotvalue);
        textView2.setText("Your mobile number is:"+gotnum);
    }

    public void goback(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
