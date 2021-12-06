package com.example.samvel_homework_lesson_12a.pictrix;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.samvel_homework_lesson_12a.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //Startup
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_app_layout);
        //Fragments
        MainGalleryFragment fragment1 = new MainGalleryFragment();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, fragment1);
        ft.addToBackStack(null);
        ft.commit();

    }
}
