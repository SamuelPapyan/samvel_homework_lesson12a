package com.example.samvel_homework_lesson_12a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.util.Objects;

public class Lesson18Fragment1 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.lesson18_edit_text_layout, container, false);
        AppCompatButton button = view.findViewById(R.id.send_message_button);
        AppCompatEditText editText = view.findViewById(R.id.lesson18editText);
        SharedPreferences sp = view.getContext().getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);

        button.setOnClickListener(v->{
            SharedPreferences.Editor edit = sp.edit();
            String text = Objects.requireNonNull(editText.getText()).toString();
            edit.putString("my_message",text);
            edit.apply();
            Lesson18Fragment2 nextFragment = new Lesson18Fragment2();
            Lesson17GalleryActivity activity = (Lesson17GalleryActivity)getActivity();
            FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.lesson17fragment,nextFragment);
            ft.addToBackStack(null);
            ft.commit();
        });
        return view;
    }
}
