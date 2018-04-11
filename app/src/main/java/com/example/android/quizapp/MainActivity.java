package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        score = findScore();

        Toast.makeText(MainActivity.this, "You have scored: " + score, Toast.LENGTH_SHORT).show();
        if (score < 5) {
            //call the result fail page
            Intent intent = new Intent(this, ResultFailActivity.class);
            startActivity(intent);
        } else {
            //call the results success page
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
        }

    }


    /**
     * This method calculates the score
     *
     * @return
     */
    public int findScore() {
        int score = 0;

        RadioButton question1 = (RadioButton) findViewById(R.id.option_1b);
        if (question1.isChecked()) {
            score = score + 1;
        }
        CheckBox question2a = findViewById(R.id.option_2a);
        boolean option2a = question2a.isChecked();

        CheckBox question2b = findViewById(R.id.option_2b);
        boolean option2b = question2b.isChecked();

        CheckBox question2d = findViewById(R.id.option_2d);
        boolean option2d = question2d.isChecked();

        if (option2a && option2b && option2d) {
            score = score + 1;
        }

        RadioButton question3 = (RadioButton) findViewById(R.id.option_3a);
        if (question3.isChecked()) {
            score = score + 1;
        }

        RadioButton question4 = (RadioButton) findViewById(R.id.option_4b);
        if (question4.isChecked()) {
            score = score + 1;
        }


        RadioButton question5 = (RadioButton) findViewById(R.id.option_5d);
        if (question5.isChecked()) {
            score = score + 1;
        }

        RadioButton question6 = (RadioButton) findViewById(R.id.option_6a);
        if (question6.isChecked()) {
            score = score + 1;
        }

        RadioButton question7 = (RadioButton) findViewById(R.id.option_7c);
        if (question7.isChecked()) {
            score = score + 1;
        }


        RadioButton question8 = (RadioButton) findViewById(R.id.option_8d);
        if (question8.isChecked()) {
            score = score + 1;
        }

        EditText editText2 = findViewById(R.id.question_9a);
        String frogSize = editText2.getText().toString();
        if (!frogSize.equals("") && frogSize != null) {
            frogSize = frogSize.substring(0, 1);
                if (frogSize.equals(13)) {
                    score = score + 1;
                }
        }
        RadioButton question10 = (RadioButton) findViewById(R.id.option_10a);
        if (question10.isChecked()) {
            score = score + 1;
        }

        return score;
    }


    public void reset(View view){
        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.radiogroup1);
        radioGroup1.clearCheck();


        CheckBox option2a = (CheckBox)findViewById(R.id.option_2a) ;
        option2a.setChecked(false);

        CheckBox option2b = (CheckBox)findViewById(R.id.option_2b) ;
        option2b.setChecked(false);

        CheckBox option2c = (CheckBox)findViewById(R.id.option_2c) ;
        option2c.setChecked(false);

        CheckBox option2d = (CheckBox)findViewById(R.id.option_2d) ;
        option2d.setChecked(false);


        RadioGroup radioGroup3 = (RadioGroup)findViewById(R.id.radiogroup3);
        radioGroup3.clearCheck();

        RadioGroup radioGroup4 = (RadioGroup)findViewById(R.id.radiogroup4);
        radioGroup4.clearCheck();

        RadioGroup radioGroup5 = (RadioGroup)findViewById(R.id.radiogroup5);
        radioGroup5.clearCheck();

        RadioGroup radioGroup6 = (RadioGroup)findViewById(R.id.radiogroup6);
        radioGroup6.clearCheck();

        RadioGroup radioGroup7 = (RadioGroup)findViewById(R.id.radiogroup7);
        radioGroup7.clearCheck();

        RadioGroup radioGroup8 = (RadioGroup)findViewById(R.id.radiogroup8);
        radioGroup8.clearCheck();

        EditText editText = findViewById(R.id.question_9a);
        editText.setText("");

        RadioGroup radioGroup10 = (RadioGroup)findViewById(R.id.radiogroup10);
        radioGroup10.clearCheck();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}