package com.example.samvel_homework_lesson_12a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;

public class RCAutoAdapter extends RecyclerView.Adapter<RCAutoAdapter.AutoViewHolder> {

    String[] autos = {"Car Dealership", "Car Rental Companies", "Car Repair Shoes","Car Washes", "Car Accessories"};
    @NonNull
    @Override
    public AutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_chip_layout,parent,false);
        return new AutoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AutoViewHolder holder, int position) {
        holder.initView(autos[position]);
    }

    @Override
    public int getItemCount() {
        return autos.length;
    }

    class AutoViewHolder extends RecyclerView.ViewHolder{

        public AutoViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        void initView(String item){
            ((Chip)itemView).setText(item);
        }
    }
}
