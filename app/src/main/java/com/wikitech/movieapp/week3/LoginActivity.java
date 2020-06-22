package com.wikitech.movieapp.week3;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.wikitech.movieapp.R;

import java.util.concurrent.atomic.AtomicBoolean;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText phoneEditText;
    private CheckBox tAndCCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_challenge_week_3_login);

        findControls();
        subscribeToEvents();
    }

    private void subscribeToEvents() {
        emailEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (emailEditText.getText().length() > 0) {
                    emailEditText.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        phoneEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (phoneEditText.getText().length() > 0) {
                    phoneEditText.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }


    private void findControls() {
        emailEditText = findViewById(R.id.EmailEditText);
        phoneEditText = findViewById(R.id.PhoneEditText);
        tAndCCheckBox = findViewById(R.id.TAndCCheckBox);
    }

    public void onSubmitButtonClicked(View view) {
        AtomicBoolean error = new AtomicBoolean(false);
        if (emailEditText.getText().length() == 0) {
            emailEditText.setError("Fill the input with a valid email address");
            error.set(true);
        }

        if (phoneEditText.getText().length() == 0) {
            phoneEditText.setError("Fill the input with a valid phone number");
            error.set(true);
        }

        if (!tAndCCheckBox.isChecked()) {
            tAndCCheckBox.setError("Please accept the terms and conditions");
            error.set(true);
        }

        if (!error.get()) {
            Intent intent = new Intent(this, ScrollViewActivity3.class);
            startActivity(intent);
        }
    }

    public void onTAndCCheckBoxClicked(View view) {
        if (tAndCCheckBox.isChecked()) {
            tAndCCheckBox.setError(null);
        }
    }
}
