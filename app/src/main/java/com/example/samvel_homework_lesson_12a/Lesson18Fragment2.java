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

public class Lesson18Fragment2 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.lesson18_share_preference_result_layout, container, false);
        @SuppressLint("WrongConstant") SharedPreferences sp = view.getContext().getSharedPreferences("MySharedPref", Context.MODE_APPEND);

        AppCompatTextView message = view.findViewById(R.id.share_preferences_message);
        String text = sp.getString("my_message","No message");
        message.setText(text);
        return view;
    }
}