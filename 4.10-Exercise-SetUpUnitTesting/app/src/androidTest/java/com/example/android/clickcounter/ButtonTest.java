package com.example.android.clickcounter;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.MediumTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.click;

/**
 * Created by justinmae on 4/22/16.
 */
@RunWith(AndroidJUnit4.class)
@MediumTest
public class ButtonTest {

    private int mCount;

    @Rule
    public ActivityTestRule<ClickActivity> mActivityRule = new ActivityTestRule<ClickActivity>(
            ClickActivity.class);

    @Before
    public void initValidCount() {
        mCount = 0;
    }

    @Test
    public void testInitialValue() {
        onView(withId(R.id.click_count_text_view)).check(matches(withText(Integer.toString(mCount))));
    }

    @Test
    public void testClick() {
        onView(withId(R.id.click_count_text_view)).check(matches(withText(Integer.toString(mCount))));
        onView(withId(R.id.click_button)).perform(click());
        onView(withId(R.id.click_count_text_view)).check(matches(withText(Integer.toString(mCount + 1))));
    }
}
