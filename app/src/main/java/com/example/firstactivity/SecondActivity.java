package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView TextViewResult;
    EditText TextViewNumber1;
    EditText TextViewNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("SecondActivity");

        TextViewResult = findViewById(R.id.result);
        TextViewNumber1 = findViewById(R.id.Fb1);
        TextViewNumber2 = findViewById(R.id.Fb2);

        Intent intent = getIntent();
        final int number1 = intent.getIntExtra("number1", 0);
        final int number2 = intent.getIntExtra("number2", 0);

        TextViewNumber1.setText(String.valueOf(number1));
        TextViewNumber2.setText(String.valueOf(number2));

        Button buttonAdd = findViewById(R.id.Addition);
        Button buttonSubtract = findViewById(R.id.Subtraction);
        Button buttonMultiplication = findViewById(R.id.Multiplication);
        Button buttonDev = findViewById(R.id.Devision);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = number1 + number2;
                TextViewResult.setText(String.valueOf(sum));
            }
        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = number1 - number2;
                TextViewResult.setText(String.valueOf(sum));
            }
        });
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = number1 * number2;
                TextViewResult.setText(String.valueOf(sum));
            }
        });

        buttonDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int sum = number1 / number2;
                TextViewResult.setText(String.valueOf(sum));
            }
        });
    }

}