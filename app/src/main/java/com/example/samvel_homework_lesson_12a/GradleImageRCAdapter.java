package com.example.samvel_homework_lesson_12a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class GradleImageRCAdapter extends RecyclerView.Adapter<GradleImageRCAdapter.GradleImageViewHolder>{
    GetActivity getActivityInstance = null;
    String[] imageUrls = {

    };
    @NonNull
    @Override
    public GradleImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lesson_17_image_item,parent,false);
        return new GradleImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GradleImageViewHolder holder, int position) {
        holder.initData(imageUrls[position]);
    }

    @Override
    public int getItemCount() {
        return imageUrls.length;
    }

    class GradleImageViewHolder extends RecyclerView.ViewHolder{

        public GradleImageViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        void initData(String src){
            AppCompatImageView image = itemView.findViewById(R.id.some_image);
            if(getActivityInstance != null){
                Glide.with(getActivityInstance.getActivity())
                        .load(src)
                        .into(image);
            }
        }
    }
    public void setGetActivityInstance(GetActivity getActivityInstance){
        this.getActivityInstance = getActivityInstance;
    }
}
