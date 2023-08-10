package com.example.shoppingcart_tests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.shoppingcart.ShoppingCartActivity;
import com.example.shoppingcart_prod.R;

import org.junit.Rule;
import org.junit.Test;

public class ShoppingCartInstrumentedTests {

    @Rule
    public ActivityScenarioRule<ShoppingCartActivity> mActivityRule = new ActivityScenarioRule<>(ShoppingCartActivity.class);

    @Test
    public void testLaunchShoppingCartActivity() {
        onView(withId(R.id.shopping_cart_title))
                .check(matches(allOf(isCompletelyDisplayed(), withText(R.string.shopping_cart_title_text))));
        onView(withId(R.id.shopping_cart_button))
                .check(matches(allOf(isCompletelyDisplayed(), withText(R.string.shopping_cart_button_text))));
    }
}
