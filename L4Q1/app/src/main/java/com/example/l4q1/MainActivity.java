package com.example.l4q1;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_one, btn_two, btn_three, btn_four;
    TextView tv_question,questnum;
    int score = 0;
    int i=0;

    private Question question = new Question();

    private String answer;
    private int questionLength = question.questions.length;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();



        btn_one = (Button)findViewById(R.id.btn1);
        btn_one.setOnClickListener(this);
        btn_two = (Button)findViewById(R.id.btn2);
        btn_two.setOnClickListener(this);
        btn_three = (Button)findViewById(R.id.btn3);
        btn_three.setOnClickListener(this);
        btn_four = (Button)findViewById(R.id.btn4);
        btn_four.setOnClickListener(this);

        tv_question = (TextView)findViewById(R.id.question);
        questnum = (TextView)findViewById(R.id.questnum);
        NextQuestion(0);
    }

    @Override
    public void onClick(View v) {
        i++;

        switch (v.getId()){
            case R.id.btn1:
                if(btn_one.getText() == answer){
                    score++;
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                if(i == 5){
                    FinishQuiz();
                    return;
                }
                NextQuestion(i);
                break;

            case R.id.btn2:
                if(btn_two.getText() == answer){
                    score++;
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                if(i == 5){
                    FinishQuiz();
                    return;
                }
                NextQuestion(i);
                break;

            case R.id.btn3:
                if(btn_three.getText() == answer){
                    score++;
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                if(i == 5){
                    FinishQuiz();
                    return;
                }
                NextQuestion(i);
                break;

            case R.id.btn4:
                if(btn_four.getText() == answer){
                    score++;
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                if(i == 5){
                    FinishQuiz();
                    return;
                }
                NextQuestion(i);

                break;
        }




    }

    private void FinishQuiz(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Submit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String val = String.valueOf(score);
                        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                        intent.putExtra("score", val);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        alertDialogBuilder.show();

    }

    private void NextQuestion(int num){
        tv_question.setText(question.getQuestion(num));
        btn_one.setText(question.getchoice1(num));
        btn_two.setText(question.getchoice2(num));
        btn_three.setText(question.getchoice3(num));
        btn_four.setText(question.getchoice4(num));
        questnum.setText(question.getQuestionNumber(num));
        answer = question.getCorrectAnswer(num);
    }

}