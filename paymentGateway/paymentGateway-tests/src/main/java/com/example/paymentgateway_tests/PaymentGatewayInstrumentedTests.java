package com.example.paymentgateway_tests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.paymentgateway.PaymentGatewayActivity;
import com.example.paymentgateway_prod.R;

import org.junit.Rule;
import org.junit.Test;

public class PaymentGatewayInstrumentedTests {

    @Rule
    public ActivityScenarioRule<PaymentGatewayActivity> mActivityRule = new ActivityScenarioRule<>(PaymentGatewayActivity.class);

    @Test
    public void testLaunchPaymentGatewayActivity() {
        onView(withId(R.id.payment_gateway_title))
                .check(matches(allOf(isCompletelyDisplayed(), withText(R.string.payment_gateway_title_text))));
    }
}
