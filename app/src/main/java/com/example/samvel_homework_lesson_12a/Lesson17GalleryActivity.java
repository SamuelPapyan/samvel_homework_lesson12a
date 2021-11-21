package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import com.bumptech.glide.Glide;

public class Lesson17GalleryActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_17_gallery);
        AppCompatImageView image = findViewById(R.id.some_image);
        Glide.with(this).load("https://img.freepik.com/free-photo/this-is-beautiful-landscape-emerald-lake-canada-s-youhe-national-park_361746-26.jpg?size=626&ext=jpg").into(image);
    }
}
