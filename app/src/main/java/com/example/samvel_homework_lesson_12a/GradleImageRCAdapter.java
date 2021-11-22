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
        "https://img.freepik.com/free-photo/this-is-beautiful-landscape-emerald-lake-canada-s-youhe-national-park_361746-26.jpg?size=626&ext=jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Beautiful-landscape.png/800px-Beautiful-landscape.png",
            "https://m.media-amazon.com/images/I/71UgxcPWW3L._AC_SL1000_.jpg",
            "https://wallscloud.net/uploads/cache/627289375/10000%D1%854558_%D0%BF%D1%80%D0%B8%D1%80%D0%BE%D0%B4%D0%B0-%D0%BF%D0%B0%D0%BD%D0%BE%D1%80%D0%B0%D0%BC%D0%B0-1024x576-MM-90.jpg",
            "https://img2.goodfon.com/wallpaper/nbig/2/dc/beautiful-landscape-scenery.jpg",
            "https://img5.goodfon.ru/wallpaper/nbig/2/3c/gene-raz-von-edler-by-gene-raz-von-edler-vault-of-heaven.jpg",
            "https://diamondpaintingsell.com/wp-content/uploads/2020/07/purple-beautiful-landscape-waterfalls-1.jpg",
            "https://photographycourse.net/wp-content/uploads/2014/11/Landscape-Photography-steps.jpg",
            "https://photographylife.com/wp-content/uploads/2020/03/Dan-Ballard-Landscapes-6.jpg"

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
