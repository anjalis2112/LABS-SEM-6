package com.example.q2;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText phone;
    EditText pwd;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pwd = (EditText)findViewById(R.id.password);
        email = (EditText)findViewById(R.id.email);
        phone = (EditText)findViewById(R.id.phone);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isEmpty(email)) {
                    System.out.println("HELLo");
                    Toast t = Toast.makeText(getApplicationContext(), "Enter email!", Toast.LENGTH_LONG);
                    t.show();
                }

                else if (isEmail(email) == false) {
                    Toast t = Toast.makeText(getApplicationContext(), "Enter valid Email!", Toast.LENGTH_LONG);
                    t.show();
                }

                else if (isEmpty(phone)) {
                    Toast t = Toast.makeText(getApplicationContext(), "Enter number!", Toast.LENGTH_LONG);
                    t.show();
                }

                else if (isPhone(phone) == false) {
                    Toast t = Toast.makeText(getApplicationContext(), "Enter valid number", Toast.LENGTH_LONG);
                    t.show();
                }

                else if (isEmpty(pwd)) {
                    Toast t = Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_LONG);
                    t.show();
                }

                else {
                    Toast t = Toast.makeText(getApplicationContext(), "Registered Successfully!", Toast.LENGTH_LONG);
                    t.show();

                }


            }
        });
    }

    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isPhone(EditText text) {
        CharSequence phone = text.getText().toString();
        return (!TextUtils.isEmpty(phone) && Patterns.PHONE.matcher(phone).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        System.out.println(str);
        if(TextUtils.isEmpty(str))
            System.out.println("EMPTY");
        return TextUtils.isEmpty(str);
    }

    void checkDataEntered() {




    }
}
