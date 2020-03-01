package com.example.eva1_2_frag_comm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ButtonFragment btnFragment;
    ListFragment lstFragment;

    TextView txtMensa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMensa = findViewById(R.id.txtMensa);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if(fragment.getClass() == ButtonFragment.class){
            btnFragment = (ButtonFragment)fragment;
        }else if(fragment.getClass() == ListFragment.class){
            lstFragment = (ListFragment)fragment;
        }
    }

    public void onMessageFromFragmentMain(String sender, String param){
        if(sender.equals("Lista")){
            txtMensa.setText("Lista "+param);
            btnFragment.onMessageFromMainToFragment(param);
        }else if(sender.equals("Boton")){
            txtMensa.setText("Boton "+param);
        }
    }


}
