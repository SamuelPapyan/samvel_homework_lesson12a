package com.example.samvel_homework_lesson_12a;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class GalleryAdapter extends FragmentStateAdapter {
    public GalleryAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new GalleryPage1Fragment();
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
