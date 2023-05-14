package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView UId;
    String incUId;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        UId=findViewById(R.id.UId);
        Intent incIntent=getIntent(); //aktiviteler arası veri alış-verişi(3)
        incUId=incIntent.getStringExtra("intentUId");
        UId.setText(incUId);
    }
}