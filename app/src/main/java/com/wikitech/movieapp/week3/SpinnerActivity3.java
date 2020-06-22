package com.wikitech.movieapp.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.wikitech.movieapp.R;

public class SpinnerActivity3 extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    private Spinner androidVersionsSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_challenge_week_3_spinner);

        androidVersionsSpinner = findViewById(R.id.AndroidVersionsSpinner);

        setSpinner();
    }

    private void setSpinner() {
        androidVersionsSpinner.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item, getAndroidVersions());
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        androidVersionsSpinner.setAdapter(aa);
    }

    private String[] getAndroidVersions() {
        return new String[]{"Cupcake", "Donut", "Eclair", "KitKat", "Pie"};
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),getAndroidVersions()[position] , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}