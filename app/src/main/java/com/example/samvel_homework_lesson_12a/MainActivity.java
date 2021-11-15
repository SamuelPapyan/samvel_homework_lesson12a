package com.example.samvel_homework_lesson_12a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RCBigItemAdapter rcBigItemAdapter = new RCBigItemAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBigItemRecyclerView();
    }

    private void initBigItemRecyclerView(){
        RecyclerView rcView = findViewById(R.id.rcView);
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rcView.setLayoutManager(llm);
        rcBigItemAdapter.setBigItems(BigItem.getBigItems());
        rcView.setAdapter(rcBigItemAdapter);
    }
}