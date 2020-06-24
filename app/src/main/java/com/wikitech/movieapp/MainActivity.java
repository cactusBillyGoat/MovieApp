package com.wikitech.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.wikitech.movieapp.week2.FirstControlsActivity;
import com.wikitech.movieapp.week3.LoginActivity;
import com.wikitech.movieapp.week4.UIElementsActivity4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void OnCodeChallengeWeek2Clicked(View view) {
        startActivity(FirstControlsActivity.class);
    }

    public void OnCodeChallengeWeek3Clicked(View view) {
        startActivity(LoginActivity.class);
    }

    public void OnCodeChallengeWeek4Clicked(View view) {
        startActivity(UIElementsActivity4.class);
    }

    private void startActivity (Class<?> cls){
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
