package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Lesson23Activity extends AppCompatActivity {
    GalleryFragment fragment1 = new GalleryFragment();
    MyDialogFragment dialogFragment = new MyDialogFragment();
    AppCompatButton dialogButton = findViewById(R.id.dialog_button);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_23_layout);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.otherFragmentContainer, fragment1);
        ft.addToBackStack(null);
        ft.commit();

        if(dialogButton != null){
            dialogButton.setOnClickListener(v->{
                FragmentManager fm = getSupportFragmentManager();
                dialogFragment.show(fm,null);
            });
        }
    }

}
