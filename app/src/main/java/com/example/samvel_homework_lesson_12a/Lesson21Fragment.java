package com.example.samvel_homework_lesson_12a;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

public class Lesson21Fragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.lesson_21_service_layout,container,false);
        AppCompatButton startServiceButton = view.findViewById(R.id.start_service_button);
        AppCompatButton stopServiceButton = view.findViewById(R.id.stop_service_button);

        startServiceButton.setOnClickListener(v->{
            view.getContext().startService(new Intent(view.getContext(), RingtoneService.class));
        });
        stopServiceButton.setOnClickListener(v->{
            view.getContext().stopService(new Intent(view.getContext(), RingtoneService.class));
        });
        return view;
    }
}
