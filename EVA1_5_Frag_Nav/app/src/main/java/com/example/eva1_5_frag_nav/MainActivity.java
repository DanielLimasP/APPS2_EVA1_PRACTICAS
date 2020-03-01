package com.example.eva1_5_frag_nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out,android.R.anim.fade_in, android.R.anim.fade_out);
        ft.setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit);
        btnFragment btnF = new btnFragment();
        btnF.setMiClickLis(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                //ft2.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out, android.R.anim.fade_in, android.R.anim.fade_out);
                ft2.setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, R.anim.anim_enter, R.anim.anim_exit);
                colorFragment cf= new colorFragment();
                ft2.replace(R.id.frameLayoutFragmentos, cf);
                ft2.addToBackStack("hola?");
                ft2.commit();
            }
        });
        ft.replace(R.id.frameLayoutFragmentos, btnF);
        ft.commit();

    }
}
