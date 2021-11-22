package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Lesson17GalleryFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.lesson_17_gallery,container,false);
        RecyclerView rcView = view.findViewById(R.id.imagesRCView);
        GradleImageRCAdapter rcAdapter = new GradleImageRCAdapter();
        GridLayoutManager glm = new GridLayoutManager(getContext(),3, LinearLayoutManager.VERTICAL,false);
        rcAdapter.setGetActivityInstance(new GetActivity() {
            @Override
            public Lesson17GalleryActivity getActivity() {
                return getActivity();
            }
        });
        rcView.setLayoutManager(glm);
        rcView.setAdapter(rcAdapter);
        return view;
    }
}
