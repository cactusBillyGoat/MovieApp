package com.wikitech.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.wikitech.movieapp.week2.FirstControlsActivity;
import com.wikitech.movieapp.week3.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void OnCodeChallengeWeek2Clicked(View view) {
        Intent intent = new Intent(this, FirstControlsActivity.class);
        startActivity(intent);
    }

    public void OnCodeChallengeWeek3Clicked(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
