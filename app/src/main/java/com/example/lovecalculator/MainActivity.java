package com.example.lovecalculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button btn;
    String s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editText1);
        et2 = findViewById(R.id.editText2);
        btn = findViewById(R.id.button);
        SharedPreferences sp = getSharedPreferences("Tushar", MODE_PRIVATE);
        String data = sp.getString("MSG", "");

        et1.setText(data);
        et2.setText(data);

        btn.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        s1 = et1.getText().toString();
        s2 = et2.getText().toString();
        Intent intent = new Intent(MainActivity.this, Result.class);
        intent.putExtra("B", s1);
        intent.putExtra("G", s2);
        startActivity(intent);
    }
    });

}

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sp = getSharedPreferences("rcp1", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("MSG", et1.getText().toString());
        editor.putString("MSG", et2.getText().toString());
        editor.commit();
    }


}



