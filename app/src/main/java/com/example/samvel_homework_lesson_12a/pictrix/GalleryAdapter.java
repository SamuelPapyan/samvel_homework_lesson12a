package com.example.samvel_homework_lesson_12a.pictrix;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.samvel_homework_lesson_12a.GalleryPage1Fragment;

public class GalleryAdapter extends FragmentStateAdapter {
    public GalleryAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0:
                return new GalleryPage1Fragment();
            case 1:
                return new GalleryPage1Fragment();
        }
        return new GalleryPage1Fragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
