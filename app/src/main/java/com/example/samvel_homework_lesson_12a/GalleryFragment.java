package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class GalleryFragment extends Fragment {
    GalleryAdapter galleryAdapter;
    ViewPager2 viewPager;
    private int[] drawables = {
            R.drawable.images_icon,
            R.drawable.videos_icon
    };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)   {
        View view = inflater.inflate(R.layout.lesson_23_page_1, container, false);
        AppCompatImageView profileImage = view.findViewById(R.id.profileImage);
        Glide.with(view.getContext())
                .load("https://img.freepik.com/free-photo/this-is-beautiful-landscape-emerald-lake-canada-s-youhe-national-park_361746-26.jpg?size=626&ext=jpg")
                .centerCrop()
                .circleCrop()
                .into(profileImage);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        galleryAdapter = new GalleryAdapter(this);
        viewPager = view.findViewById(R.id.pager);
        viewPager.setAdapter(galleryAdapter);
        TabLayout tabLayout = view.findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout,viewPager,(tab, pos)->{
            tab.setIcon(drawables[pos]);
        }).attach();
    }
}
