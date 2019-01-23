package com.aravi.passvaluesfromintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edititext);
        editText2=findViewById(R.id.mbnum);
    }

    public void movetosecondactivity(View view) {

        String s=editText.getText().toString();
        String phnum=editText2.getText().toString();
        if (s.length()==0){
            editText.setError("Please enter information");

        }else if (phnum.length()==0){
            editText2.setError("please enter mobile number");
        }
        else {
            Intent intent=new Intent(this,SecondActivity.class);
           /* intent.putExtra("name",s);
            intent.putExtra("mobilenum",phnum);*/

           Bundle bundle=new Bundle();
           bundle.putString("name",s);
           bundle.putString("mobilenum",phnum);
           intent.putExtras(bundle);
            startActivity(intent);
        }


    }
}
