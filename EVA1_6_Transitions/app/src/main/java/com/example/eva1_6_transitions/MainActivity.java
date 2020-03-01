package com.example.eva1_6_transitions;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    Intent inCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setExitTransition(new Fade().setDuration(500));
        setContentView(R.layout.activity_main);
        inCall = new Intent(this, Secundaria.class);
    }

    public void miClick2(View view){

        startActivity(inCall, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}
