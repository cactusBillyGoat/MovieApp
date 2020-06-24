package com.wikitech.movieapp.week4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wikitech.movieapp.R;

public class StudentsViewHolder extends RecyclerView.ViewHolder {

    private TextView firstNameTextView;
    private TextView lastNameTextView;
    private ViewGroup cellViewGroup;

    public StudentsViewHolder(@NonNull View itemView) {
        super(itemView);

        firstNameTextView = itemView.findViewById(R.id.FirstNameTextView);
        lastNameTextView = itemView.findViewById(R.id.LastNameTextView);
        cellViewGroup = itemView.findViewById(R.id.CellViewGroup);
    }


    public TextView getFirstNameTextView() {
        return firstNameTextView;
    }

    public TextView getLastNameTextView() {
        return lastNameTextView;
    }

    public ViewGroup getCellViewGroup() {
        return cellViewGroup;
    }
}

