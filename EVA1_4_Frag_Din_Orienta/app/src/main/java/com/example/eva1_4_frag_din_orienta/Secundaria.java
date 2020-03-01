package com.example.eva1_4_frag_din_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class Secundaria extends AppCompatActivity {

    TwoFragment two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        //Get intent, recuperar bundle y pasar datos al fragmento
        two.onMessageFromMainToFrag(getIntent().getStringExtra("Mensaje"));
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        two = (TwoFragment)fragment;
    }

}
