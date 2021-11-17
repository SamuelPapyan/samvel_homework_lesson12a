package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

public class Fragment4 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_layout_4,container,false);
        Bundle arguments = getArguments();
        if(arguments != null){
            String text = arguments.getString("message");
            ((AppCompatTextView)view.findViewById(R.id.fragment_text)).setText(text);
        }
        return view;
    }
}
