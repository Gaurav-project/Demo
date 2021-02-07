package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText e1,e2;

    //private static final String tag = "This";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.Get);
        e1 =findViewById(R.id.Movie);
        e2 =findViewById(R.id.Date);
       // e3 =findViewById(R.id.Movie);
        final Intent i=new Intent(MainActivity.this,MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText("Hello gaurav");
                i.putExtra("msg1",e1.getText().toString());
                i.putExtra("msg2",e2.getText().toString());
                startActivity(i);
            }
        });
    }
}
