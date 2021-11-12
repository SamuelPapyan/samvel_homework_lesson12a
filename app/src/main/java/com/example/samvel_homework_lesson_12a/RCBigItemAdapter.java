package com.example.samvel_homework_lesson_12a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RCBigItemAdapter extends RecyclerView.Adapter<RCBigItemAdapter.BigItemViewHolder>{

    private List<BigItem> bigItems = Collections.emptyList();

    @NonNull
    @Override
    public BigItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,parent,false);
        return new BigItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BigItemViewHolder holder, int position) {
        holder.initData(bigItems.get(position));
    }

    @Override
    public int getItemCount() {
        return bigItems.size();
    }

    class BigItemViewHolder extends RecyclerView.ViewHolder{

        public BigItemViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        void initData(BigItem data){
            AppCompatTextView textView = itemView.findViewById(R.id.category_info);
            ChipGroup chipGroup = itemView.findViewById(R.id.chipGroup);

            textView.setText(data.getTitle());
            textView.setCompoundDrawablesWithIntrinsicBounds(data.getImage(),0,0,0);
            for(String item : data.getItems()){
                Chip chip = new Chip(chipGroup.getContext());
                chip.setText(item);
                chipGroup.addView(chip);
            }
        }
    }
    public void setBigItems(ArrayList<BigItem> list){
        this.bigItems = list;
    }
}
