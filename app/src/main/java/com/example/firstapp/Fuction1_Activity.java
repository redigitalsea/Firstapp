package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.RadialGradient;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Fuction1_Activity extends AppCompatActivity {

    private RadioGroup rg1;
    private RadioButton rb1;
    private RadioButton rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuction1_);
        rg1 = findViewById(R.id.f1_rg1);
        rb1=findViewById(R.id.f1_rb1);
        rb2=findViewById(R.id.f1_rb2);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String temp = rb1.getText().toString();
                rb1.setText(rb2.getText());
                rb2.setText(temp);
            }
        });





    }

}
