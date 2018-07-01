package com.example.android.cookies;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView Score, Question;

    Random r;
    private Questions mQuestions = new Questions();
    private String mAnswers;
    private int mScore = 0;
    private int mQuestionsLenght = mQuestions.mQuestion.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);

        Score = findViewById(R.id.Score);
        Question = findViewById(R.id.Question);

        Score.setText("Score:" + mScore);


        updateQuestion(r.nextInt(mQuestionsLenght));


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == mAnswers) {
                    mScore++;
                    Score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    tryAgain();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswers) {
                    mScore++;
                    Score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answer3.getText() == mAnswers) {
                    mScore++;
                    Score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText() == mAnswers) {
                    mScore++;
                    Score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }
            }
        });
    }

    private void updateQuestion(int num) {

        Question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswers = mQuestions.getCorrectAnswer(num);
    }

    private  void tryAgain() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Wrong Answer Try Again! Your score is " + mScore + " Points.")
                .setCancelable(false)
                .setPositiveButton("Try Again",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

}

