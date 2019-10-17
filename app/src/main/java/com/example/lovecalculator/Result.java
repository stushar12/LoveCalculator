package com.example.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Result extends AppCompatActivity {
TextView t,t2,t3;
String boy,girl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t=findViewById(R.id.textView);
        t2=findViewById(R.id.textView1);
        t3=findViewById(R.id.textView2);
        Bundle b=getIntent().getExtras();
        boy=b.getString("B");
        girl= b.getString("G");
        t.setText("Boy Name:"+boy);
        t2.setText("Girl Name:"+girl);
        Random r =new Random();
        int i1=r.nextInt(100 - 65) +65;
        t3.setText("Love Percentage:"+i1);
    }
}
