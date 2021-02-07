package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t,t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent I=getIntent();
        t=findViewById(R.id.MovieName);
        t.setText(I.getStringExtra("msg1"));
        t1=findViewById(R.id.MovieDate);
        t1.setText(I.getStringExtra("msg2"));



    }
}