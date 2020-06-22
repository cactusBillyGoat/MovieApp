package com.wikitech.movieapp.week3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wikitech.movieapp.R;

public class FrameLayoutActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_challenge_week_3_frame_layout);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.CenteredFrameLayout, new ViewsFragment3());
        ft.commit();
    }

    public void onNextButtonClick(View view) {
        Intent intent = new Intent(this, SpinnerActivity3.class);
        startActivity(intent);
    }
}