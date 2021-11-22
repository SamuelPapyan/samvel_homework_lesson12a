package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class SingleImageFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.image_single_fragment_layout,container,false);
        Bundle args = getArguments();
        if(args != null){
            AppCompatImageView image = view.findViewById(R.id.single_image);
            Glide.with(getActivity()).load(args.getString("imageSrc")).into(image);
        }
        return view;
    }
}
