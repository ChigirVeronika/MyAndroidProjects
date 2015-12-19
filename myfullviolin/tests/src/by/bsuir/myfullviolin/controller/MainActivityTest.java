package by.bsuir.myfullviolin.controller;

import android.annotation.TargetApi;
import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.ViewAsserts;
import android.test.suitebuilder.annotation.MediumTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import by.bsuir.myfullviolin.tests.R;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class by.bsuir.myfullviolin.controller.MainActivityTest \
 * by.bsuir.myfullviolin.tests/android.test.InstrumentationTestRunner
 */
@TargetApi(Build.VERSION_CODES.CUPCAKE)
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity;
    private Button buttonPlay;
    private Button buttonExit;

    @TargetApi(Build.VERSION_CODES.FROYO)
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(true);

        activity = getActivity();
        buttonPlay =
                (Button) activity
                        .findViewById(R.id.buttonPlay);
        buttonExit =
                (Button) activity
                        .findViewById(R.id.buttonExit);
    }

    @MediumTest
    public void testClickPlayButton_layout() {
        final View decorView = activity.getWindow().getDecorView();

        ViewAsserts.assertOnScreen(decorView, buttonPlay);

        final ViewGroup.LayoutParams layoutParams =
                buttonPlay.getLayoutParams();
        assertNotNull(layoutParams);
    }

}
