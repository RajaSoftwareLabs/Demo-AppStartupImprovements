package com.example.quickcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ShoppingCartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        findViewById(R.id.shopping_cart_button).setOnClickListener(v -> {
            Intent intent = new Intent(ShoppingCartActivity.this, PaymentGatewayActivity.class);
            startActivity(intent);
        });
    }
}
