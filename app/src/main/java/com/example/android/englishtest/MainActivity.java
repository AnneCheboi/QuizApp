package com.example.android.englishtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView ScoreView;
    private TextView QuestionView;
    private Button Choice1;
    private Button Choice2;
    private Button Choice3;
    private Button Choice4;

    private String mAnswer;
    private int mScore=0;
    private int mQuestionNmber=0;

    private Question mQuestion=new Question();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreView=findViewById(R.id.tv_score);
        QuestionView=findViewById(R.id.question);
        Choice1=findViewById(R.id.choice1);
        Choice2=findViewById(R.id.choice2);
        Choice3=findViewById(R.id.choice3);
        Choice4=findViewById(R.id.choice4);

        updateQuestion();

        //give choice buttons listeners
        Choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Choice1.getText()==mAnswer){
                    mScore=mScore+1;
                    //hint the user if answer is wrong or correct
                    updateScore(mScore);

                    Toast.makeText(MainActivity.this,"correct answer",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else{
                    Toast.makeText(MainActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Choice2.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();

                    //hint the user if answer is wrong or correct
                    Toast.makeText(MainActivity.this,"correct answer",Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Choice3.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();

                    //hint the user if answer is wrong or correct
                    Toast.makeText(MainActivity.this,"correct answer",Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                }

            }
        });
        Choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Choice4.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();

                    //hint the user if answer is wrong or correct
                    Toast.makeText(MainActivity.this,"correct answer",Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this,"wrong answer",Toast.LENGTH_SHORT).show();
                }
                startActivity(new Intent(MainActivity.this,Result.class));

            }
        });



    }
    private void updateScore(int point){
        ScoreView.setText(("" + mScore));

    }

    private void updateQuestion(){
        QuestionView.setText(Question.getQuestion(mQuestionNmber));
        Choice1.setText(mQuestion.getChoice0(mQuestionNmber));
        Choice2.setText(mQuestion.getChoice1(mQuestionNmber));
        Choice3.setText(mQuestion.getChoice2(mQuestionNmber));
        Choice4.setText(mQuestion.getChoice3(mQuestionNmber));

        mAnswer=mQuestion.getCorrectAnswers(mQuestionNmber);
        mQuestionNmber++;


    }
}
