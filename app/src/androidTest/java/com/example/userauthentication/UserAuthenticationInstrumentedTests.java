package com.example.userauthentication;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.quickcart.UserAuthenticationActivity;
import com.example.quickcart.R;

import org.junit.Rule;
import org.junit.Test;

public class UserAuthenticationInstrumentedTests {

    @Rule
    public ActivityScenarioRule<UserAuthenticationActivity> mActivityRule = new ActivityScenarioRule<>(UserAuthenticationActivity.class);

    @Test
    public void testLaunchUserAuthenticationActivity() {
        onView(withId(R.id.user_authentication_title))
                .check(matches(allOf(isCompletelyDisplayed(), withText(R.string.user_authentication_title_text))));
        onView(withId(R.id.user_authentication_button))
                .check(matches(allOf(isCompletelyDisplayed(), withText(R.string.user_authentication_button_text))));
    }
}
