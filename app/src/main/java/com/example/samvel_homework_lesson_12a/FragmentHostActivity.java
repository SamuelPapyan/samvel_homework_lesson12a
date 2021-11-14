package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentTransaction;

public class FragmentHostActivity extends AppCompatActivity {
    private AppCompatButton button1;
    private AppCompatButton button2;
    private FragmentTransaction ft;
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_layout_1);
        Fragment1 firstFragment = new Fragment1();
        Fragment2 secondFragment = new Fragment2();
        ft = getSupportFragmentManager().beginTransaction();
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);

        button1.setOnClickListener(v->{
            ft.replace(R.id.fragment_switcher, firstFragment);
            ft.commit();
            ft.addToBackStack(null);
        });

        button2.setOnClickListener(v->{
            ft.replace(R.id.fragment_switcher, secondFragment);
            ft.commit();
            ft.addToBackStack(null);
        });
    }

}
