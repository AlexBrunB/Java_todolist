package com.abrunberaud.java_todolist_2016;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainTest {

    @Rule
    public ActivityTestRule<SplashScreenActivity> mActivityTestRule = new ActivityTestRule<>(SplashScreenActivity.class);

    @Test
    public void mainTest() {
        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnAddItem), withText("New task"),
                        withParent(allOf(withId(R.id.activity_main),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.addTitle),
                        withParent(allOf(withId(R.id.add_task),
                                withParent(withId(R.id.custom)))),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("Foo"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.addContent),
                        withParent(allOf(withId(R.id.add_task),
                                withParent(withId(R.id.custom)))),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("Bar"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.editText2),
                        withParent(allOf(withId(R.id.add_task),
                                withParent(withId(R.id.custom)))),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("12/08/1950"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(android.R.id.button1), withText("Add")));
        appCompatButton2.perform(scrollTo(), click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(android.R.id.button2), withText("Delete")));
        appCompatButton3.perform(scrollTo(), click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btnAddItem), withText("New task"),
                        withParent(allOf(withId(R.id.activity_main),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.addTitle),
                        withParent(allOf(withId(R.id.add_task),
                                withParent(withId(R.id.custom)))),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("Papap"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.addContent),
                        withParent(allOf(withId(R.id.add_task),
                                withParent(withId(R.id.custom)))),
                        isDisplayed()));
        appCompatEditText5.perform(replaceText("Maman"), closeSoftKeyboard());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.editText2),
                        withParent(allOf(withId(R.id.add_task),
                                withParent(withId(R.id.custom)))),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("10/01/39"), closeSoftKeyboard());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(android.R.id.button1), withText("Add")));
        appCompatButton5.perform(scrollTo(), click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(android.R.id.button2), withText("Delete")));
        appCompatButton6.perform(scrollTo(), click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.btnAddItem), withText("New task"),
                        withParent(allOf(withId(R.id.activity_main),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.addTitle),
                        withParent(allOf(withId(R.id.add_task),
                                withParent(withId(R.id.custom)))),
                        isDisplayed()));
        appCompatEditText7.perform(replaceText("Foo"), closeSoftKeyboard());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.addContent),
                        withParent(allOf(withId(R.id.add_task),
                                withParent(withId(R.id.custom)))),
                        isDisplayed()));
        appCompatEditText8.perform(replaceText("Bar"), closeSoftKeyboard());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.editText2),
                        withParent(allOf(withId(R.id.add_task),
                                withParent(withId(R.id.custom)))),
                        isDisplayed()));
        appCompatEditText9.perform(replaceText("12/08/50"), closeSoftKeyboard());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(android.R.id.button1), withText("Add")));
        appCompatButton8.perform(scrollTo(), click());

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.editContent), withText("Bar"), isDisplayed()));
        appCompatEditText10.perform(replaceText("Foo"), closeSoftKeyboard());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(android.R.id.button1), withText("Save")));
        appCompatButton9.perform(scrollTo(), click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(android.R.id.button2), withText("Delete")));
        appCompatButton10.perform(scrollTo(), click());

    }

}
