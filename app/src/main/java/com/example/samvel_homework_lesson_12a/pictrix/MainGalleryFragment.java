package com.example.samvel_homework_lesson_12a.pictrix;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.samvel_homework_lesson_12a.R;

public class MainGalleryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lesson_20_gallery, container, false);
        RecyclerView rcView = view.findViewById(R.id.gallery2rcView);
        MainGalleryAdapter rcAdapter = new MainGalleryAdapter();
        LinearLayoutManager llm = new LinearLayoutManager(view.getContext(),RecyclerView.VERTICAL,false);
        rcView.setLayoutManager(llm);
        rcAdapter.setItems(Image.getItems());
        rcView.setAdapter(rcAdapter);
        rcAdapter.setItemClick(new ItemClick() {
            @Override
            public void onImageClick(String src) {
                SingleImageFragment secondFragment = new SingleImageFragment();
                Bundle args = new Bundle();
                args.putString("imageSrc",src);
                secondFragment.setArguments(args);
                MainActivity activity = (MainActivity)getActivity();
                FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container,secondFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return view;
    }
}
