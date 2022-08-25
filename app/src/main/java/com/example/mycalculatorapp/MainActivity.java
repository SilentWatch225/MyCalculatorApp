package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchScreen(View view) {
        startActivity(new Intent(getApplicationContext(),SecondActivity.class));
    }

    public void findSum(View view){

            //Takes the first number entered and puts it into an editText
            EditText number1ET = findViewById(R.id.num1ET);
            //Takes the second number entered and puts it into an editText
            EditText number2ET = findViewById(R.id.num2ET);
            //Takes the textView and sets it in the java
            TextView numberSumTV = findViewById(R.id.resultTV);
        try {
            //Modified the numbers to accept doubles
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 + num2;

            numberSumTV.setText("" + sum);
        }catch(Exception e){
            numberSumTV.setText("Please enter numbers inside the calculator");
        }

    }

    public void findSub(View view){
        //Takes the first number entered and puts it into an editText
        EditText number1ET = findViewById(R.id.num1ET);
        //Takes the second number entered and puts it into an editText
        EditText number2ET = findViewById(R.id.num2ET);
        //Takes the textView and sets it in the java
        TextView numberSumTV = findViewById(R.id.resultTV);

        //Modified the numbers to accept doubles
        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sub = num1 - num2;

        numberSumTV.setText("" + sub);
    }

    public void findMult(View view){
        //Takes the first number entered and puts it into an editText
        EditText number1ET = findViewById(R.id.num1ET);
        //Takes the second number entered and puts it into an editText
        EditText number2ET = findViewById(R.id.num2ET);
        //Takes the textView and sets it in the java
        TextView numberSumTV = findViewById(R.id.resultTV);

        //Modified the numbers to accept doubles
        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double mult = num1 * num2;

        numberSumTV.setText("" + mult);
    }

    public void findDiv(View view){
        //Takes the first number entered and puts it into an editText
        EditText number1ET = findViewById(R.id.num1ET);
        //Takes the second number entered and puts it into an editText
        EditText number2ET = findViewById(R.id.num2ET);
        //Takes the textView and sets it in the java
        TextView numberSumTV = findViewById(R.id.resultTV);

        //Modified the numbers to accept doubles
        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double div = num1 / num2;

        numberSumTV.setText("" + div);
    }

    public void findMod(View view){
        //Takes the first number entered and puts it into an editText
        EditText number1ET = findViewById(R.id.num1ET);
        //Takes the second number entered and puts it into an editText
        EditText number2ET = findViewById(R.id.num2ET);
        //Takes the textView and sets it in the java
        TextView numberSumTV = findViewById(R.id.resultTV);

        //Modified the numbers to accept doubles
        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double mod = num1 % num2;

        numberSumTV.setText("" + mod);
    }
}