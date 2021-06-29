package com.example.folkquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SimpleQuestionActivity extends AppCompatActivity {

    private Questions AllQuestions = new Questions();
    private Random random = new Random();
    Set<Integer> ShownQuestions = new HashSet<>();

    private String[] Questions;
    private String[] CorrectAnswers;
    private String[][] Choices;
    private int CurrentQuestion;
    private int CorrectAnswersCount = 0;
    private int QuestionCount = 10;
    private int QuestionsLeft = QuestionCount;

    private Button ansOneButton, ansTwoButton, ansThreeButton, nextQuestionButton, gobackButton;
    private TextView questionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_simple_question);

        questionTextView = (TextView) findViewById((R.id.QuestionTextView));
        ansOneButton = (Button) findViewById(R.id.AnswerOneButton);
        ansTwoButton = (Button) findViewById(R.id.AnswerTwoButton);
        ansThreeButton = (Button) findViewById(R.id.AnswerThreeButton);
        nextQuestionButton = (Button) findViewById(R.id.NextQuestionButton);
        gobackButton = (Button) findViewById(R.id.GobackButton);

        LoadQuestions(getIntent().getStringExtra("quiz_type"));

        LoadNextQuestion();

        ansOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAnswer(ansOneButton);
            }
        });

        ansTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAnswer(ansTwoButton);
            }
        });

        ansThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAnswer(ansThreeButton);
            }
        });

        nextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoadNextQuestion();
            }
        });

        gobackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowResults();
            }
        });

    }

    private void LoadQuestions(String quiz_type) {

        if (quiz_type.equals("clothes")) {
            Questions = AllQuestions.ClothesQuestions;
            Choices = AllQuestions.ClothesChoices;
            CorrectAnswers = AllQuestions.ClothesCorrectAnswers;
        } else if (quiz_type.equals("music")) {
            Questions = AllQuestions.MusicQuestions;
            Choices = AllQuestions.MusicChoices;
            CorrectAnswers = AllQuestions.MusicCorrectAnswers;
        } else if (quiz_type.equals("dances")) {
            Questions = AllQuestions.DancesQuestions;
            Choices = AllQuestions.DancesChoices;
            CorrectAnswers = AllQuestions.DancesCorrectAnswers;
        }
    }

    private void CheckAnswer(Button clickedButton) {
        if(clickedButton.getText().equals(CorrectAnswers[CurrentQuestion])) {
            CorrectAnswersCount++;
            clickedButton.setBackgroundResource(R.drawable.button_correct);
        }
        else
            clickedButton.setBackgroundResource(R.drawable.button_incorrect);

        EnableButtons(false);
    }

    private void LoadNextQuestion() {
        if (QuestionsLeft > 0) {
            QuestionsLeft--;

                CurrentQuestion = random.nextInt(Questions.length);
                while (ShownQuestions.contains(CurrentQuestion))
                    CurrentQuestion = random.nextInt(Questions.length);

                ShownQuestions.add(CurrentQuestion);

                ShuffleChoices(Choices[CurrentQuestion]);

                questionTextView.setText(Questions[CurrentQuestion]);
                ansOneButton.setText(Choices[CurrentQuestion][0]);
                ansTwoButton.setText(Choices[CurrentQuestion][1]);
                ansThreeButton.setText(Choices[CurrentQuestion][2]);

                EnableButtons(true);
        }
        else {
            ShowResults();
        }
    }

    private void ShuffleChoices (String[] choices) {
        List<String> strList = Arrays.asList(choices);
        Collections.shuffle(strList);
        choices = strList.toArray(new String[strList.size()]);
    }

    private void EnableButtons(boolean enable)
    {
        ansOneButton.setEnabled(enable);
        ansTwoButton.setEnabled(enable);
        ansThreeButton.setEnabled(enable);

        if(enable)
        {
            ansOneButton.setBackgroundResource(R.drawable.button_blank);
            ansTwoButton.setBackgroundResource(R.drawable.button_blank);
            ansThreeButton.setBackgroundResource(R.drawable.button_blank);
        }
    }

    private void ShowResults()
    {
        ConstraintLayout lyt = (ConstraintLayout) findViewById(R.id.ConstLayoutQuestions);
        lyt.removeView(questionTextView);
        lyt.removeView(ansOneButton);
        lyt.removeView(ansTwoButton);
        lyt.removeView(ansThreeButton);

        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.popup_window, null);
        TextView tv = (TextView) popupView.findViewById(R.id.popupTextView);
        String result = "Вие отбелязахте " + Integer.toString(CorrectAnswersCount) + " верни от общо "
                                           + Integer.toString(QuestionCount) + " въпроса!";

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = false;
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        popupWindow.showAtLocation(getWindow().getDecorView().getRootView(), Gravity.CENTER, 0, 0);
        tv.setText(result);

        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                finish();
                return true;
            }
        });
    }
}