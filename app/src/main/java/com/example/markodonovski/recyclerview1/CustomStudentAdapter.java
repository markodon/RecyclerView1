package com.example.markodonovski.recyclerview1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by markodonovski on 12/7/17.
 */

public class CustomStudentAdapter extends RecyclerView.Adapter<CustomStudentAdapter.ViewHolder>{

    List<Student> studentList =  new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contacView = inflater.inflate(R.layout.recyclerview_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(contacView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Student student = studentList.get(position);

        holder.textView.setText(student.getsName());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.text)
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
