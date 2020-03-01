package com.example.eva1_1_fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class RedFragment extends Fragment {
    Context context;
    public RedFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.wtf("Red", "onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
        Log.wtf("Red", "onAttach");
        Toast.makeText(context, "onAttach", Toast.LENGTH_SHORT);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.wtf("Red", "onCreate");
        Toast.makeText(context, "onCreate", Toast.LENGTH_SHORT);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.wtf("Red", "onResume");
        Toast.makeText(context, "onResume", Toast.LENGTH_SHORT);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.wtf("Red", "onStart");
        Toast.makeText(context, "onStart", Toast.LENGTH_SHORT);
    }
}
