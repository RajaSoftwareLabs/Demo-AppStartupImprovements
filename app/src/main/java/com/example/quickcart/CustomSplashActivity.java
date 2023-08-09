package com.example.quickcart;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CustomSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_splash_activity);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(CustomSplashActivity.this, MainActivity.class));
            finish();
        }, 3000);
    }

    @Override
    protected void onResume() {
        super.onResume();
        reportFullyDrawn();
    }
}
