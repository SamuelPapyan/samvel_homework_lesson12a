package com.example.samvel_homework_lesson_12a.pictrix;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.samvel_homework_lesson_12a.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainGalleryAdapter extends RecyclerView.Adapter<MainGalleryAdapter.GalleryItemViewHolder>{
    List<Image> items = Collections.emptyList();
    ItemClick itemClick;
    @NonNull
    @Override
    public GalleryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_list_2_item,parent,false);
        return new GalleryItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryItemViewHolder holder, int position) {
        holder.initView(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void setItemClick(ItemClick itemClick){
        this.itemClick = itemClick;
    }
    class GalleryItemViewHolder extends RecyclerView.ViewHolder{

        public GalleryItemViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        void initView(Image image){
            AppCompatImageView profilePhoto = itemView.findViewById(R.id.gallery2ProfileImage);
            AppCompatTextView profileName = itemView.findViewById(R.id.gallery2ProfileName);
            AppCompatImageView imageView = itemView.findViewById(R.id.gallery2Image);
            AppCompatImageView like = itemView.findViewById(R.id.imageLike);

            Glide.with(itemView.getContext()).load(image.getProfileImage()).centerCrop().circleCrop().into(profilePhoto);
            Glide.with(itemView.getContext()).load(image.getImageSrc()).centerCrop().into(imageView);
            profileName.setText(image.getProfileName());
            like.setOnClickListener(v->{
                image.setLiked(!image.getIsLiked());
                if(image.getIsLiked())
                    like.setImageResource(R.drawable.like_off);
                else
                    like.setImageResource(R.drawable.like_on);
                notifyDataSetChanged();
            });
            imageView.setOnClickListener(v->{
                itemClick.onImageClick(image.getImageSrc());
            });
        }
    }
    public void setItems(ArrayList<Image> items){
        this.items = items;
        notifyDataSetChanged();
    }
}
