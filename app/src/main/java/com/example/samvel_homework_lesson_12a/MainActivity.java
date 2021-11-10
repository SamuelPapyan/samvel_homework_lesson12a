package com.example.samvel_homework_lesson_12a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RCArtsAdapter rcArtsAdapter = new RCArtsAdapter();
    RCAutoAdapter rcAutoAdapter = new RCAutoAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initArtsRecyclerView();
        initAutoRecyclerView();
    }

    private void initArtsRecyclerView(){
        RecyclerView rcView = findViewById(R.id.rcView1);
        GridLayoutManager glm = new GridLayoutManager(this, 2);
        rcView.setLayoutManager(glm);
        rcView.setAdapter(rcArtsAdapter);
    }
    private void initAutoRecyclerView(){
        RecyclerView rcView = findViewById(R.id.rcView2);
        GridLayoutManager glm = new GridLayoutManager(this, 2);
        rcView.setLayoutManager(glm);
        rcView.setAdapter(rcAutoAdapter);
    }
}