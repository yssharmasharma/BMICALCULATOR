package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv2;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioGroup radioGroup;
    Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv2 = (TextView) findViewById(R.id.tv2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (radioButton1.isChecked()){
                    Intent male = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivityForResult(male, 0);


                } else if(radioButton2.isChecked()) {

                    Intent goToNo = new Intent(getApplicationContext(), MainActivity4.class);
                    startActivityForResult(goToNo, 0);

                }
            }});




    }


}

