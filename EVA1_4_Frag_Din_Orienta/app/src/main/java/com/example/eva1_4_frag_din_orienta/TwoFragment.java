package com.example.eva1_4_frag_din_orienta;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */

public class TwoFragment extends Fragment {

    TextView txt;
    private String data;


    public TwoFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.fragment_two, container, false);
        txt = ll.findViewById(R.id.txtView);
        txt.setText(data);
        return ll;

    }

    public void onMessageFromMainToFrag(String param){
        txt.setText(param);
    }

    public String getData(){
        return this.data;
    }

    public void setData(String data){
        this.data = data;
    }



}
