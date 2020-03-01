package com.example.eva1_2_frag_comm;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class ButtonFragment extends Fragment {

    Button btnSome;
    MainActivity main;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        main =(MainActivity) getActivity();
        super.onCreate(savedInstanceState);
    }

    public ButtonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_button, container, false);

        btnSome = linearLayout.findViewById(R.id.btn);

        btnSome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.onMessageFromFragmentMain("Boton", "Fragmento boton");
            }
        });

        return linearLayout;
    }


    public void onMessageFromMainToFragment(String param){
        btnSome.setText(param);
    }






}
