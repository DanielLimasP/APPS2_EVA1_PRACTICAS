package com.example.eva1_4_frag_din_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    Intent inSecun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMessageFromFragToMain(){
        frameLayout = findViewById(R.id.frameLay);
        if(frameLayout != null){
            //Landscape
            //Crear el fragmento 2 dinamicamente
            Toast.makeText(this, "Landscape", Toast.LENGTH_LONG);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            TwoFragment two = new TwoFragment();
            two.setData("Este es el mensaje...");
            ft.replace(R.id.frameLay, two);
            ft.commit();


        }else{
            //Portrait
            Toast.makeText(this, "Portrait", Toast.LENGTH_LONG);
            inSecun = new Intent(this, Secundaria.class);
            inSecun.putExtra("Mensaje", "Este es el mensaje...");
            startActivity(inSecun);
        }
            //Lanzar la actividad secundaria con intentos


    }

}
