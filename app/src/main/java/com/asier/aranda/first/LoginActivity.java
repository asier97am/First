package com.asier.aranda.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;
/**
 * @author Asier97am
 *
 */


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    public void onClick(View v){
        Intent intent=new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

