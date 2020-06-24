package com.wikitech.movieapp.week4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wikitech.movieapp.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity4 extends AppCompatActivity {

    private RecyclerView recyclerViewStudents;
    private List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_challenge_week_4_recycler_view);
        setTitle("Students");

        getStudents();
        recyclerViewStudents = this.findViewById(R.id.RecyclerViewStudents);
        setLayoutManager(recyclerViewStudents);
        setAdapter(recyclerViewStudents);
        setItemDecoration(recyclerViewStudents);
    }

    private void getStudents() {
        students = new ArrayList<>();
        for(int i = 0; i<15; i++){
            students.add(new Student("FirstName " + (i+1), "LastName " + (i+1)));
        }
    }

    private void setLayoutManager(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void setAdapter(RecyclerView recyclerView) {
        StudentsAdapter studentsAdapter = new StudentsAdapter(students);
        recyclerView.setAdapter(studentsAdapter);
    }

    private void setItemDecoration(RecyclerView recyclerView) {
        RecyclerView.ItemDecoration itemDecoration = new
                DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
    }
}