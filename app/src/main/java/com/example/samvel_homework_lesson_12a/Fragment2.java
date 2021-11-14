package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstancState){
        return layoutInflater.inflate(R.layout.fragment_layout_2, container, false);
    }

}
