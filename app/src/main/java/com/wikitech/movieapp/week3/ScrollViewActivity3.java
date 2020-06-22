package com.wikitech.movieapp.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wikitech.movieapp.R;

public class ScrollViewActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_challenge_week_3_scroll_view);
    }

    public void onNextButtonClick(View view) {
        Intent intent = new Intent(this, FrameLayoutActivity3.class);
        startActivity(intent);
    }
}