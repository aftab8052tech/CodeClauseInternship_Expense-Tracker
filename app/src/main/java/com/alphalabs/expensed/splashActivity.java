package com.alphalabs.expensed;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

import com.alphalabs.expensed.databinding.ActivitySplashBinding;


public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
Handler handler=new Handler();
handler.postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent intent=new Intent(splashActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
},3000);

    }
}