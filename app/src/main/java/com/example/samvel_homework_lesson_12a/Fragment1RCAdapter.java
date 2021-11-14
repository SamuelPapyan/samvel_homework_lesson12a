package com.example.samvel_homework_lesson_12a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fragment1RCAdapter extends RecyclerView.Adapter<Fragment1RCAdapter.Fragment1ViewHolder>{

    private List<Fragment1Item> f1Items = Collections.emptyList();

    @NonNull
    @Override
    public Fragment1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item_1,parent,false);
        return new Fragment1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Fragment1ViewHolder holder, int position) {
        holder.initData(f1Items.get(position));
    }

    @Override
    public int getItemCount() {
        return f1Items.size();
    }

    class Fragment1ViewHolder extends RecyclerView.ViewHolder{

        public Fragment1ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        void initData(Fragment1Item item){
            AppCompatTextView text1 = itemView.findViewById(R.id.cooperko);
            AppCompatTextView text2 = itemView.findViewById(R.id.textView1);
            AppCompatTextView text3 = itemView.findViewById(R.id.ends_in);
            AppCompatImageView image = itemView.findViewById(R.id.android_image);

            image.setImageResource(item.getImage());
            text1.setText(item.getText1());
            text2.setText(item.getText2());
            String text3Content = "Coverage | Ends in " + item.getDays() + "d " + item.getHours() + ":" + item.getMinutes();
            text3.setText(text3Content);
        }
    }

    public void setItems(ArrayList<Fragment1Item> items){
        this.f1Items = items;
        notifyDataSetChanged();
    }

}
