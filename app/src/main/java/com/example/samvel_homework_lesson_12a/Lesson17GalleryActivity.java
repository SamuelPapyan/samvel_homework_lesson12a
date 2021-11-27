package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Lesson17GalleryActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_17_gallery_layout);
        //Fragments
        Lesson17GalleryFragment fragment = new Lesson17GalleryFragment();
        Lesson18Fragment1 fragment2 = new Lesson18Fragment1();
        Gallery2Fragment fragment3 = new Gallery2Fragment();

        //Fragment Manager with transaction
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //Main Action
        fragmentTransaction.replace(R.id.lesson17fragment,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        //Buttons
        AppCompatButton galleryButton = findViewById(R.id.galleryButton);
        AppCompatButton sendMessageButton = findViewById(R.id.sendMessageFragmentButton);
        AppCompatButton gallery2Button = findViewById(R.id.gallery_2_button);

        //Null check with onclick Listeners
        if(galleryButton != null){
            galleryButton.setOnClickListener(v->{
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.lesson17fragment,fragment);
                ft.addToBackStack(null);
                ft.commit();
            });
        }
        if(sendMessageButton != null){
            sendMessageButton.setOnClickListener(v->{
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.lesson17fragment,fragment2);
                ft.addToBackStack(null);
                ft.commit();
            });
        }
        if(gallery2Button != null){
            gallery2Button.setOnClickListener(v->{
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.lesson17fragment,fragment3);
                ft.addToBackStack(null);
                ft.commit();
            });
        }
    }
}
