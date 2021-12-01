package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

public class DemoObjectFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.lesson_22_viewpager_item_layout,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();
        if(args != null){
            AppCompatTextView textView = view.findViewById(R.id.text_view_fragment);
            textView.setText(Integer.toString(args.getInt(ARG_OBJECT)));
        }
    }
}
