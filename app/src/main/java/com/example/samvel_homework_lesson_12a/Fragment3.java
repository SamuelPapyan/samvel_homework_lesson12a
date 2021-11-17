package com.example.samvel_homework_lesson_12a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.location.FusedLocationProviderClient;

public class Fragment3 extends Fragment {

    FusedLocationProviderClient fusedLocationProviderClient;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_layout_3,container,false);
        AppCompatButton button = view.findViewById(R.id.fragment3EditText);
        if(button != null){
            button.setOnClickListener(v->openSecondFragment());
        }
        return view;
    }
    private void openSecondFragment(){
        FragmentHostActivity activity = (FragmentHostActivity)getActivity();
        if(activity != null){
            FragmentManager manager = activity.getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            View view = getView();
            AppCompatEditText editText = (AppCompatEditText)view.findViewById(R.id.fragment3EditText);
            String text = editText.getText().toString();
            Fragment4 nextFragment = new Fragment4();
            Bundle bundle = new Bundle();

            bundle.putString("message",text);
            nextFragment.setArguments(bundle);
            transaction.replace(R.id.fragment_switcher,nextFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
