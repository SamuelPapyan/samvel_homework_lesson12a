package com.example.samvel_homework_lesson_12a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fragment2RCAdapter extends RecyclerView.Adapter<Fragment2RCAdapter.Fragment2ViewHolder>{

    private List<Fragment2Item> items = Collections.emptyList();
    @NonNull
    @Override
    public Fragment2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item_2,parent,false);
        return new Fragment2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Fragment2ViewHolder holder, int position) {
        holder.initData(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class Fragment2ViewHolder extends RecyclerView.ViewHolder{

        public Fragment2ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        void initData(Fragment2Item item){
            AppCompatTextView commentText = itemView.findViewById(R.id.comment_text);

            commentText.setText(item.getCommentText());
        }
    }

    public void setItems(ArrayList<Fragment2Item> items){
        this.items = items;
    }

}

