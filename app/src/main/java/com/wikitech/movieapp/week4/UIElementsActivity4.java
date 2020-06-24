package com.wikitech.movieapp.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wikitech.movieapp.R;
import com.wikitech.movieapp.week3.FrameLayoutActivity3;

public class UIElementsActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_challenge_week_4_recap);
    }

    public void onNextButtonClick(View view) {
        Intent intent = new Intent(this, RecyclerViewActivity4.class);
        startActivity(intent);
    }
}