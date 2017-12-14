package com.example.markodonovski.recyclerview1;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by markodonovski on 12/7/17.
 */

public class CustomStudentAdapter extends RecyclerView.Adapter<CustomStudentAdapter.ViewHolder>{


    Context context;
    List<Student> studentList =  new ArrayList<>();

    public void setItems(List<Student> students){
        studentList = students;
    }

    public CustomStudentAdapter(Context context1) {
        context = context1;

    }

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
        if (student.issOnline()){
            holder.textView2.setText("Is Online");
            holder.textView2.setTextColor(Color.GREEN);
            Picasso.with(context).load("http://pngimg.com/uploads/lighter/lighter_PNG11188.png").centerInside().fit().into(holder.slika1);

        }
        else {
            holder.textView2.setText("Is Offline");
            holder.textView2.setTextColor(Color.RED);
            Picasso.with(context).load("http://imagenpng.com/wp-content/uploads/2015/03/cigarette-150153_640.png").centerInside().fit().into(holder.slika1);

        }




    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.text)
        TextView textView;
        @BindView(R.id.text2)
        TextView textView2;
        @BindView(R.id.slika)
        ImageView slika1;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
