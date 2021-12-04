package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryPage2Fragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.lesson_23_page_2,container,false);
        RecyclerView rcView = view.findViewById(R.id.imagesRCView);
        GradleImageRCAdapter rcAdapter = new GradleImageRCAdapter();
        GridLayoutManager glm = new GridLayoutManager(getContext(),3, LinearLayoutManager.VERTICAL,false);
        rcView.setLayoutManager(glm);
        rcAdapter.setImageClick(new ImageClick() {
            @Override
            public void onImageClick(String src) {
                SingleImageFragment secondFragment = new SingleImageFragment();
                Bundle args = new Bundle();
                args.putString("imageSrc",src);
                secondFragment.setArguments(args);
                Lesson23Activity activity = (Lesson23Activity)getActivity();
                FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.otherFragmentContainer,secondFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        rcView.setAdapter(rcAdapter);
        return view;
    }
}
