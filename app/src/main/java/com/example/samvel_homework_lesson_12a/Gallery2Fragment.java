package com.example.samvel_homework_lesson_12a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Gallery2Fragment extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.lesson_20_gallery, container, false);
        RecyclerView rcView = view.findViewById(R.id.gallery2rcView);
        Gallery2RCAdapter rcAdapter = new Gallery2RCAdapter();
        LinearLayoutManager llm = new LinearLayoutManager(view.getContext(),RecyclerView.VERTICAL,false);
        rcView.setLayoutManager(llm);
        rcAdapter.setItems(Image.getItems());
        rcView.setAdapter(rcAdapter);
        return view;
    }
}
