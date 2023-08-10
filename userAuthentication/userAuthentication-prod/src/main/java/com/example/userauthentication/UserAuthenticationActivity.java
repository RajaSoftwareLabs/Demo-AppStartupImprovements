package com.example.userauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.productcatalog.ProductCatalogActivity;
import com.example.userauthentication_prod.R;

public class UserAuthenticationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_authentication);

        findViewById(R.id.user_authentication_button).setOnClickListener(v -> {
            Intent intent = new Intent(UserAuthenticationActivity.this, ProductCatalogActivity.class);
            startActivity(intent);
        });
    }
}