package com.example.krupa.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void onSubmitCalculateScore(View v) {
        int Total_score = 0;
        
        RadioButton radioButtonQ1Answer2 = (RadioButton) findViewById(R.id.Q1answer2);
        if (radioButtonQ1Answer2.isChecked()) {
            Total_score++;
        }


        CheckBox checkBoxQ2Answer1 = (CheckBox) findViewById(R.id.Q2answer1);
        CheckBox checkBoxQ2Answer2 = (CheckBox) findViewById(R.id.Q2answer2);
        CheckBox checkBoxQ2Answer3 = (CheckBox) findViewById(R.id.Q2answer3);
        CheckBox checkBoxQ2Answer4 = (CheckBox) findViewById(R.id.Q2answer4);
        if (checkBoxQ2Answer1.isChecked() && !(checkBoxQ2Answer2.isChecked()) &&
                checkBoxQ2Answer3.isChecked() && !(checkBoxQ2Answer4.isChecked())) {
            Total_score++;
        }


        RadioButton radioButtonQ3Answer3 = (RadioButton) findViewById(R.id.Q3answer3);
        if (radioButtonQ3Answer3.isChecked()) {
            Total_score++;
        }

        EditText editTextQ4answer = (EditText) findViewById(R.id.Q4answer);
        String stringAnswer = editTextQ4answer.getText().toString();
        boolean correct = "AmazonGo".equals(stringAnswer);
        if (correct) {
            Total_score++;
        }


        EditText editTextQ5Answer = (EditText) findViewById(R.id.Q5answer);
        stringAnswer = editTextQ5Answer.getText().toString();
        correct = "Google".equals(stringAnswer);
        if (correct) {
            Total_score++;
        }

        RadioButton radioButtonQ6Answer2 = (RadioButton) findViewById(R.id.Q6answer2);
        if (radioButtonQ6Answer2.isChecked()) {
            Total_score++;
        }

        RadioButton radioButtonQ7Answer2 = (RadioButton) findViewById(R.id.Q7answer4);
        if (radioButtonQ7Answer2.isChecked()) {
            Total_score++;
        }

        EditText editTextQ8Answer = (EditText) findViewById(R.id.Q8answer);
        stringAnswer = editTextQ8Answer.getText().toString();
        correct = "Alan Turing".equals(stringAnswer);
        if (correct) {
            Total_score++;
        }

        CheckBox checkBoxQ9Answer1 = (CheckBox) findViewById(R.id.Q9answer1);
        CheckBox checkBoxQ9Answer2 = (CheckBox) findViewById(R.id.Q9answer2);
        CheckBox checkBoxQ9Answer3 = (CheckBox) findViewById(R.id.Q9answer3);
        CheckBox checkBoxQ9Answer4 = (CheckBox) findViewById(R.id.Q9answer4);
        if (checkBoxQ9Answer1.isChecked() && !(checkBoxQ9Answer2.isChecked()) &&
                checkBoxQ9Answer3.isChecked() && !(checkBoxQ9Answer4.isChecked())) {
            Total_score++;
        }

        CheckBox checkBoxQ10Answer1 = (CheckBox) findViewById(R.id.Q10answer1);
        CheckBox checkBoxQ10Answer2 = (CheckBox) findViewById(R.id.Q10answer2);
        CheckBox checkBoxQ10Answer3 = (CheckBox) findViewById(R.id.Q10answer3);
        CheckBox checkBoxQ10Answer4 = (CheckBox) findViewById(R.id.Q10answer4);
        if (checkBoxQ10Answer1.isChecked() && (checkBoxQ10Answer2.isChecked()) &&
                checkBoxQ10Answer3.isChecked() && !(checkBoxQ10Answer4.isChecked())) {
            Total_score++;
        }
        TextView textViewScore = (TextView) findViewById(R.id.text_score);
        textViewScore.setText("Your score is: " + Total_score + "/10");

    }
}


