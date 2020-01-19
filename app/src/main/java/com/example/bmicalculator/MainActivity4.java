package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button button3;
    TextView tv5;
    TextView tv6;
    EditText et4;
    EditText et5;
    EditText et6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button3 = (Button) findViewById(R.id.button3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        et6 = (EditText) findViewById(R.id.et6);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
    }

    public void buBMI(View view) {
        float weight = Integer.parseInt(et4.getText().toString());
        float height = Integer.parseInt(et5.getText().toString());
        float h = height / 100;
        float fh2 = h * h;
        float bmi = weight / fh2;
        et6.setText(String.valueOf(bmi));
        if (bmi < 18.5) {
            Toast.makeText(this, "you are underweight, so you may need to put on some weight. You are recommended to ask your doctor or a dietitian for advice.\n" +
                    "\n", Toast.LENGTH_LONG).show();

        }
        if (bmi >= 30) {
            Toast.makeText(this, "you are heavily overweight. Your health may be at risk if you do not lose weight. \n You are recommended to talk to your doctor or a dietitian for advice." +
                    "\n", Toast.LENGTH_LONG).show();

        }
        if (bmi >= 18.5 && bmi <= 24.9) {
            Toast.makeText(this, "you are at a healthy weight for your height.\n By maintaining a healthy weight, you lower your risk of developing serious health problems." +
                    "\n", Toast.LENGTH_LONG).show();


        }
        if (bmi >= 25 && bmi <= 29.9) {
            Toast.makeText(this, " you are slightly overweight. You may be advised to lose some weight for health reasons. \n You are recommended to talk to your doctor or a dietitian for advice." +
                    "\n", Toast.LENGTH_LONG).show();
        }

    }
}
