package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.intentsproj.FirstActivity.EXTRA_MESSAGE1;
import static com.example.intentsproj.FirstActivity.EXTRA_MESSAGE2;

public class SecondActivity extends AppCompatActivity {

    //private int num1, num2;
    private Button addBtn, subBtn, mulBtn, divBtn;
    private TextView result;
    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent1 = getIntent();
        String val1 = intent1.getStringExtra(EXTRA_MESSAGE1);
        String val2 = intent1.getStringExtra(EXTRA_MESSAGE2);

        result = (TextView) findViewById(R.id.textView3);

        et1 = (EditText) findViewById(R.id.editText3);
        et2 = (EditText) findViewById(R.id.editText4);
        addBtn = (Button) findViewById(R.id.button);
        subBtn = (Button) findViewById(R.id.button3);
        mulBtn =(Button) findViewById(R.id.button4);
        divBtn= (Button) findViewById(R.id.button5);


        et1.setText(val1);
        et2.setText(val2);



        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              int  num1 = Integer.parseInt(et1.getText().toString());// we can only send final variables to the inner class others can't
              int num2 = Integer.parseInt(et2.getText().toString());
                int sum = num1 + num2;
                result.setText(Integer.toString(num1)+"+"+Integer.toString(num2)+" = "+Integer.toString(sum));
            }
        });


        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(et1.getText().toString());
                int num2= Integer.parseInt(et2.getText().toString());
                int difference = num1-num2;
                result.setText(Integer.toString(num1)+"-"+Integer.toString(num2)+" = "+Integer.toString(difference));
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(et1.getText().toString());
                int num2= Integer.parseInt(et2.getText().toString());
                int product = num1*num2;
                result.setText(Integer.toString(num1)+"*"+Integer.toString(num2)+" = "+Integer.toString(product));
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get data which is in edittext, convert it to string
                // using parseInt convert it to Integer type
                int num1= Integer.parseInt(et1.getText().toString());
                int num2= Integer.parseInt(et2.getText().toString());
                double div = num1/(double)num2;
                // set it ot result textview
                result.setText(Integer.toString(num1)+"/"+Integer.toString(num2)+" = "+Double.toString(div));
            }
        });

    }

}
