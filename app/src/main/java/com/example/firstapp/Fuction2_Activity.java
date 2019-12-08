package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Fuction2_Activity extends AppCompatActivity {
    private CheckBox cb1,cb2,cb3,cb4,cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuction2_);

        cb1=findViewById(R.id.f2_cb1);
        cb2=findViewById(R.id.f2_cb2);
        cb3=findViewById(R.id.f2_cb3);
        cb4=findViewById(R.id.f2_cb4);
        cb5=findViewById(R.id.f2_cb5);

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb1.setText("屎");
                }else{
                    cb1.setText("饭");
                }
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb2.setText("屎");
                }else{
                    cb2.setText("肉");
                }
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb3.setText("屎");
                }else{
                    cb3.setText("面");
                }
            }
        });
        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb4.setText("屎");
                }else{
                    cb4.setText("菜");
                }
            }
        });
        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb5.setText("屎");
                }else{
                    cb5.setText("水果");
                }
            }
        });
    }
}
