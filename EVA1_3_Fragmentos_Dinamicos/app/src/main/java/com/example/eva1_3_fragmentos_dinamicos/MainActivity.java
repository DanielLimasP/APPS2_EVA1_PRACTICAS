package com.example.eva1_3_fragmentos_dinamicos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v){
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        OneFragment one = new OneFragment();
        ft.replace(R.id.frameLayout, one);
        ft.commit();
    }

    public void click2(View v){
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        TwoFragment two = new TwoFragment();
        ft.replace(R.id.frameLayout, two);
        ft.commit();
    }

}
