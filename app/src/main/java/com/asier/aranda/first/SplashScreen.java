package com.asier.aranda.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import android.view.animation.AnimationUtils;
import android.view.animation.Animation;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // openApp(true);
        //implementar animacion
        ImageView mBolt = findViewById(R.id.bolt);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        mBolt.startAnimation(myanim);




    } public void pulsarLogo(View view){
        Intent intent=new Intent(SplashScreen.this, LoginActivity.class);
        startActivity(intent);

    }
}