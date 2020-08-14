package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText TextViewNumber1;
    EditText TextViewNumber2;
Button button;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickButtonLister();

        TextViewNumber1 = findViewById(R.id.Fb1);
        TextViewNumber2 = findViewById(R.id.Fb2);



    }
    public void OnclickButtonLister(){
        button = (Button)findViewById(R.id.Okbutton);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      int number1 = Integer.parseInt(TextViewNumber1.getText().toString());
                      int number2 = Integer.parseInt(TextViewNumber2.getText().toString());
                        Context context = getApplicationContext();
                        CharSequence text = "You just clicked the OK button";
                        int duration = Toast.LENGTH_SHORT;

                        toast = Toast.makeText(context , text, duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.BOTTOM, 0 , 0 );
                        toast.show();

                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        intent.putExtra("number1", number1);
                        intent.putExtra("number2", number2);
                        startActivity(intent);


                    }
                }
        );
    }

}