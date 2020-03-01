package com.example.eva1_5_frag_nav;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class btnFragment extends Fragment {

    private View.OnClickListener miClickLis;

    public btnFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.fragment_btn, container, false);
        Button btn = ll.findViewById(R.id.button);
        btn.setOnClickListener(miClickLis);
        // Inflate the layout for this fragment
        return ll;
    }

    public View.OnClickListener getMiClickLis() {
        return miClickLis;
    }

    public void setMiClickLis(View.OnClickListener miClickLis) {
        this.miClickLis = miClickLis;
    }
}
