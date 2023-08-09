package com.example.productcatalog;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.quickcart.R;
import com.example.quickcart.ProductCatalogActivity;

import org.junit.Rule;
import org.junit.Test;

public class ProductCatalogInstrumentedTests {

    @Rule
    public ActivityScenarioRule<ProductCatalogActivity> mActivityRule = new ActivityScenarioRule<>(ProductCatalogActivity.class);

    @Test
    public void testLaunchProductCatalogActivity() {
        onView(withId(R.id.product_catalog_title))
                .check(matches(allOf(isCompletelyDisplayed(), withText(R.string.product_catalog_title_text))));
        onView(withId(R.id.product_catalog_button))
                .check(matches(allOf(isCompletelyDisplayed(), withText(R.string.product_catalog_button_text))));
    }
}
