package com.example.l2_q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText val;
    private Button encrypt;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encrypt = (Button) findViewById(R.id.encrypt);
        val = (EditText) findViewById(R.id.input);
        et = (EditText) findViewById(R.id.et);
        encrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = val.getText().toString();
                et.setText(encrypt_string(s));

            }
        });

    }

    String encrypt_string(String s) {

        char[] arr = s.toCharArray();

        for(int i=0; i< arr.length; i++)
        {
            arr[i] = (char) (arr[i] + 5);
        }

        s = String.valueOf(arr);
        return s;

    }
}