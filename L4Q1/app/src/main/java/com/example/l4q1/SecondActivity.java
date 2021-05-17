package com.example.l4q1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    String final_score;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        text = (TextView)findViewById(R.id.score);
        Intent intent = getIntent();
        final_score = intent.getStringExtra("score");
        text.setText(final_score);
    }
}
