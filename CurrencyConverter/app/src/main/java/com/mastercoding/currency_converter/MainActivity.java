package com.mastercoding.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText dollar = findViewById(R.id.editText4);
        TextView inr= findViewById(R.id.textView7);
        Button result= findViewById(R.id.convertbtn);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String doll= dollar.getText().toString();

                float dollarconvert= Float.parseFloat(doll);

                float converted= (dollarconvert * 82.55f);

                inr.setText("INR = "+converted);
            }
        });
    }
}