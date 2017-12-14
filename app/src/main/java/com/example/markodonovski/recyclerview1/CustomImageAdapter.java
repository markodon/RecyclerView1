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

public class CustomImageAdapter extends RecyclerView.Adapter<CustomImageAdapter.ViewHolder>{


    Context context;
    List<ImageData> imageDataArrayList =  new ArrayList<>();

    public void setItems(List<ImageData> students){
        imageDataArrayList = students;
    }

    public CustomImageAdapter(Context context1) {
        context = context1;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contacView = inflater.inflate(R.layout.recyclerview_image_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(contacView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageData imageData = imageDataArrayList.get(position);

        holder.textView.setText(imageData.getTags());

        Picasso.with(context).load(imageData.getWebformatURL()).centerInside().fit().into(holder.slika);




    }

    @Override
    public int getItemCount() {
        return imageDataArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.text)
        TextView textView;

        @BindView(R.id.slika1)
        ImageView slika;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
