package com.example.folkquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Button clothesButton = (Button) findViewById(R.id.ClothesQuizButton);
        Button dancesButton = (Button) findViewById(R.id.DancesQuizButton);
        Button musicButton = (Button) findViewById(R.id.MusicQuizButton);

        clothesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
												SimpleQuestionActivity.class);

                myIntent.putExtra("quiz_type", "clothes");
                MainActivity.this.startActivity(myIntent);
            }
        });

        dancesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
												SimpleQuestionActivity.class);

                myIntent.putExtra("quiz_type", "dances");
                MainActivity.this.startActivity(myIntent);
            }
        });

        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
												SimpleQuestionActivity.class);

                myIntent.putExtra("quiz_type", "music");
                MainActivity.this.startActivity(myIntent);
            }
        });
    }




}