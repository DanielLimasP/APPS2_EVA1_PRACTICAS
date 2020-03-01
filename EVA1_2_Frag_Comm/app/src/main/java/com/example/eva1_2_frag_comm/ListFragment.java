package com.example.eva1_2_frag_comm;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

public class ListFragment extends Fragment {

    String[] datos = {
            "Erick",
            "Karla",
            "Karmen",
            "Karzo",
            "Kiki",
            "Kike",
            "Karamel",
            "Keke Pankeke",
            "Kevin",
            "Kuak"
            };

    MainActivity main;



    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        LinearLayout frameLayout = (LinearLayout) inflater.inflate(R.layout.fragment_list, container, false);

        ListView listView = frameLayout.findViewById(R.id.lstVw);

        listView.setAdapter(new ArrayAdapter<String>(
                main,
                android.R.layout.simple_list_item_1,
                datos
        ));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                main.onMessageFromFragmentMain("Lista", datos[position]);
            }
        });

        return frameLayout;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = (MainActivity)getActivity();
        //main.onMessageFromFragmentMain("Lista", "Datos");
    }
}
