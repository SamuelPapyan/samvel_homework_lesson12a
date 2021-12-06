package com.example.samvel_homework_lesson_12a.pictrix;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.Glide;
import com.example.samvel_homework_lesson_12a.R;
import com.google.android.material.tabs.TabLayout;

public class ProfileViewFragment extends Fragment {

    GalleryAdapter galleryAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lesson_23_layout,container, false);
        AppCompatImageView profileImage = view.findViewById(R.id.profileImage);
        TabLayout tabLayout;
        ViewPager2 viewPager2;
        Glide.with(this)
                .load("https://img.freepik.com/free-photo/this-is-beautiful-landscape-emerald-lake-canada-s-youhe-national-park_361746-26.jpg?size=626&ext=jpg")
                .centerCrop()
                .circleCrop()
                .into(profileImage);

        return view;
    }
}
