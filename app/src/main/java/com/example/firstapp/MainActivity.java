package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Btn1;
    private Button Btn2;
    private TextView TV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn1=findViewById(R.id.btn1);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV1.setText("btn1\n");
                Intent intent = new Intent(MainActivity.this,Fuction1_Activity.class);
                startActivity(intent);
            }
        });

        Btn2=findViewById(R.id.btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV1.setText("btn2\n");
                Intent intent = new Intent(MainActivity.this,Fuction2_Activity.class);
                startActivity(intent);
            }
        });
        TV1=findViewById(R.id.tv1);


    }
}

