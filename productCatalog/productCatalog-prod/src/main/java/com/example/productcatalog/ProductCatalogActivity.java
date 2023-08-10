package com.example.productcatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.productcatalog_prod.R;
import com.example.shoppingcart.ShoppingCartActivity;

public class ProductCatalogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_catalog);

        findViewById(R.id.product_catalog_button).setOnClickListener(v -> {
            Intent intent = new Intent(ProductCatalogActivity.this, ShoppingCartActivity.class);
            startActivity(intent);
        });
    }
}
