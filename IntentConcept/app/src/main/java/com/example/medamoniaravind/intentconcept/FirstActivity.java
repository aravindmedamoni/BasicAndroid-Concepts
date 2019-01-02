package com.example.medamoniaravind.intentconcept;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    EditText usremail;
    EditText usrpswd;
    String firstmail,firstpssword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        usremail=findViewById(R.id.emailF);
        usrpswd=findViewById(R.id.pswdF);

    }

    public void clickloginbtn(View view){
        firstmail=usremail.getText().toString();
        firstpssword=usrpswd.getText().toString();

        Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
        intent.putExtra("email",firstmail);
        startActivity(intent);
    }
}
