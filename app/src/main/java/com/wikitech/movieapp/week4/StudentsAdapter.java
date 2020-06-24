package com.wikitech.movieapp.week4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.wikitech.movieapp.R;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsViewHolder> {
    private List<Student> students;
    private ViewGroup parent;

    public StudentsAdapter(List<Student> students){
        this.students = students;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.parent = parent;
        View studentItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.code_challenge_week_4_student_item, parent, false);
        return new StudentsViewHolder(studentItem);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, int position) {
        Student currentEvent = students.get(position);
        holder.getFirstNameTextView().setText(currentEvent.getFirstName());
        holder.getLastNameTextView().setText(currentEvent.getLastName());
        if(position % 2 == 0){
            holder.getCellViewGroup().setBackgroundColor(ContextCompat.getColor(parent.getContext(), R.color.light_gray));
        }
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
