package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class Lesson17GalleryFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.lesson_17_gallery,container,false);

        AppCompatImageView profileImage = view.findViewById(R.id.profileImage);

        Glide.with(view.getContext())
                .load("https://img.freepik.com/free-photo/this-is-beautiful-landscape-emerald-lake-canada-s-youhe-national-park_361746-26.jpg?size=626&ext=jpg")
                .centerCrop()
                .circleCrop()
                .into(profileImage);

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
                Lesson17GalleryActivity activity = (Lesson17GalleryActivity)getActivity();
                FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.lesson17fragment,secondFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        rcView.setAdapter(rcAdapter);
        return view;
    }
}
