package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.bumptech.glide.Glide;

public class Lesson23Activity extends AppCompatActivity {
    GalleryFragment fragment1 = new GalleryFragment();
    MyDialogFragment dialogFragment = new MyDialogFragment();
    AppCompatButton dialogButton;
    AppCompatImageView profilePhoto;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_23_layout);
        dialogButton = findViewById(R.id.dialog_button);
        profilePhoto = findViewById(R.id.profileImage);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.otherFragmentContainer, fragment1);
        ft.addToBackStack(null);
        ft.commit();

        Glide.with(this)
                .load("https://img.freepik.com/free-photo/this-is-beautiful-landscape-emerald-lake-canada-s-youhe-national-park_361746-26.jpg?size=626&ext=jpg")
                .centerCrop()
                .circleCrop()
                .into(profilePhoto);
        if(dialogButton != null){
            dialogButton.setOnClickListener(v->{
                FragmentManager fm = getSupportFragmentManager();
                dialogFragment.show(fm,null);
            });
        }
    }

}
