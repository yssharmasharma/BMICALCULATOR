package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button button2;
    TextView tv3;
    TextView tv4;
    EditText et1;
    EditText et2;
    EditText et3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button2=(Button)findViewById(R.id.button2);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        tv3=(TextView)findViewById(R.id.tv3);
        tv4=(TextView) findViewById(R.id.tv4);
    }

    public void buBMI(View view) {
        float weight=Integer.parseInt(et1.getText().toString());
        float height=Integer.parseInt(et2.getText().toString());
        float h= height/100;
        float fh=h*h;
        float bmi=weight/fh;
        et3.setText(String.valueOf(bmi));
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
