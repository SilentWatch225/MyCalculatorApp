package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void toCalc(View view){
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void toExpo(View view){
        startActivity(new Intent(getApplicationContext(), ThirdActivity.class));
    }

    public void root(View view){
        EditText number1ET = findViewById(R.id.exponentET);

        EditText number2ET = findViewById(R.id.bottomET);

        TextView numRootTV = findViewById(R.id.answerTV);

        try{
            int base = Integer.parseInt(number1ET.getText().toString());
            int root = Integer.parseInt(number2ET.getText().toString());
            
        }catch (Exception e){
            numRootTV.setText("Please enter numbers into the boxes");
        }
    }
}