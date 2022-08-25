package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void changeScreen(View view){
        startActivity(new Intent(getApplicationContext(),SecondActivity.class));
    }

    public void calc(View view){
        EditText baseET = findViewById(R.id.baseET);

        EditText expoET = findViewById(R.id.ExponentET);

        TextView numSumTV = findViewById(R.id.numDisTV);

        int base = Integer.parseInt((baseET.getText().toString()));
        int expo = Integer.parseInt((expoET.getText().toString()));
        double total = base ^ expo;

        numSumTV.setText("" + total);
    }

}