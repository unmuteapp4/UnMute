package com.unmuteapp4gmail.unmute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sentence extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.learn.MESSAGE";
    private SentenceQuestionLibrary mQuestionLibrary = new SentenceQuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);

        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if(mQuestionNumber>10){
                    Intent intent = new Intent(Sentence.this, EndSentence.class);
                    String message = "Your final Score = "+Integer.toString(mScore)+"/"+Integer.toString(mQuestionNumber-1);
                    intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }

                else {

                    if (mButtonChoice1.getText() == mAnswer){
                        mScore = mScore + 1;
                        updateScore(mScore);


                        updateQuestion();


                        //This line of code is optiona
                        //Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                    }else {
                        // Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();

                        updateQuestion();

                    }}
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if(mQuestionNumber>10){
                    Intent intent = new Intent(Sentence.this, EndSentence.class);
                    String message = "Your final Score = "+Integer.toString(mScore)+"/"+Integer.toString(mQuestionNumber-1);
                    intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }

                else {

                    if (mButtonChoice2.getText() == mAnswer){
                        mScore = mScore + 1;
                        updateScore(mScore);



                        updateQuestion();




                        //This line of code is optiona
                        // Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                    }else {
                        //  Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();

                        updateQuestion();

                    }}


            }
        });

        //End of Button Listener for Button2

//Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if(mQuestionNumber>10){
                    Intent intent = new Intent(Sentence.this, EndSentence.class);
                    String message = "Your final Score = "+Integer.toString(mScore)+"/"+Integer.toString(mQuestionNumber-1);
                    intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }

                else {

                    if (mButtonChoice3.getText() == mAnswer){
                        mScore = mScore + 1;
                        updateScore(mScore);



                        updateQuestion();


                        //This line of code is optiona
                        //Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                    }else {
                        //Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();

                        updateQuestion();

                    }}
            }
        });

        //End of Button Listener for Button3

    }

    private void updateQuestion(){

        if(mQuestionNumber<10) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        }
        mQuestionNumber++;



    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }

    public void exitTest(View view){
        Intent intent = new Intent(this,Tests.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Sentence.this,Tests.class);
        startActivity(intent);

    }


}
