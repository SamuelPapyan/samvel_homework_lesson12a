package com.example.samvel_homework_lesson_12a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;

public class RCArtsAdapter extends RecyclerView.Adapter<RCArtsAdapter.ArtsViewHolder>{

    String[] arts = {"Casinos","Art Gaslleries","Comedy Clubs","Movie Theaters","Museums","Dance Studios"};
    @NonNull
    @Override
    public ArtsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_chip_layout,parent,false);
        return new ArtsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtsViewHolder holder, int position) {
        holder.initView(arts[position]);
    }

    @Override
    public int getItemCount() {
        return arts.length;
    }

    class ArtsViewHolder extends RecyclerView.ViewHolder
    {
        public ArtsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        void initView(String data){
            ((Chip)itemView).setText(data);
        }
    }
}
