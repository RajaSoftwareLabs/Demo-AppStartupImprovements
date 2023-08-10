package com.example.userauthentication_tests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.userauthentication.UserAuthenticationActivity;
import com.example.userauthentication_prod.R;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;

public class UserAuthenticationInstrumentedTests {

    @Rule
    public ActivityScenarioRule<UserAuthenticationActivity> mActivityRule = new ActivityScenarioRule<>(UserAuthenticationActivity.class);

    @Test
    public void testLaunchUserAuthenticationActivity() {
        onView(withId(R.id.user_authentication_title))
                .check(matches(Matchers.allOf(isCompletelyDisplayed(), ViewMatchers.withText(R.string.user_authentication_title_text))));
        onView(withId(R.id.user_authentication_button))
                .check(matches(Matchers.allOf(isCompletelyDisplayed(), ViewMatchers.withText(R.string.user_authentication_button_text))));
    }
}
