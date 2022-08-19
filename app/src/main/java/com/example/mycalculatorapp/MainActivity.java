package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view){
        //Takes the first number entered and puts it into an editText
        EditText number1ET = findViewById(R.id.num1ET);
        //Takes the second number entered and puts it into an editText
        EditText number2ET = findViewById(R.id.num2ET);
        //Takes the symbol entered and puts it into an editText
        EditText number3ET = findViewById(R.id.num3ET);
        //Takes the textView and sets it in the java
        TextView numberSumTV = findViewById(R.id.resultTV);

        //Modified the numbers to accept doubles
        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum;



        //Create try catch method or limit user input to only numbers

        //Uncomment this line when you finished the try catch
        //numberSumTV.setText("" + sum);
    }
}