package com.malpo.sliver.sample;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * k
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class, false, false);

    @Before
    public void setup() {
        TestSliverApplication.component.fakeDb().setNumberValue(0);
        activityTestRule.launchActivity(null);
    }

    @Test
    public void clickPlus_incrementsNumber() {
        onView(withText("0")).check(matches(isDisplayed()));
        onView(withText("+")).perform(click());
        onView(withText("1")).check(matches(isDisplayed()));
    }

    @Test
    public void clickMinus_decrementsNumber() {
        onView(withText("0")).check(matches(isDisplayed()));
        onView(withText("-")).perform(click());
        onView(withText("-1")).check(matches(isDisplayed()));
    }
}
