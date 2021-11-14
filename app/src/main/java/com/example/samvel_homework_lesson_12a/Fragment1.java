package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment1 extends Fragment {
    Fragment1RCAdapter rcAdapter1;
    Fragment2RCAdapter rcAdapter2;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_layout_1, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.fragRcView1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        rcAdapter1.setItems(Fragment1Item.getItems());
        recyclerView.setAdapter(rcAdapter1);

        RecyclerView recyclerView2 = view.findViewById(R.id.fragRcView2);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        rcAdapter2.setItems(Fragment2Item.getItems());
        recyclerView2.setAdapter(rcAdapter2);

        return view;
    }
}
