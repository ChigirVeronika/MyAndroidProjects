package by.bsuir.myfullviolin.controller;

import android.annotation.TargetApi;
import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import by.bsuir.myfullviolin.tests.R;

/**
 * Created by Вероника on 19.12.2015.
 */
@TargetApi(Build.VERSION_CODES.CUPCAKE)
public class AboutActivityTest extends ActivityInstrumentationTestCase2<AboutActivity> {
    private AboutActivity activity;
    private TextView textViewBig;
    private TextView textViewSmall;

    @TargetApi(Build.VERSION_CODES.FROYO)
    public AboutActivityTest() {
        super(AboutActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(true);

        activity = getActivity();
        textViewBig =
                (TextView) activity
                        .findViewById(R.id.textView1);
        textViewSmall =
                (TextView) activity
                        .findViewById(R.id.textView2);
    }

    @MediumTest
    public void testBigTextViewLayout() {
        String expectedInfoText = activity.getString(R.string.head_about_text);
        assertTrue(View.VISIBLE == textViewBig.getVisibility());
        assertEquals(expectedInfoText, textViewBig.getText());
    }

    @MediumTest
    public void testSmallTextViewLayout() {
        String expectedInfoText = activity.getString(R.string.about_text);
        assertTrue(View.VISIBLE == textViewSmall.getVisibility());
        assertEquals(expectedInfoText, textViewSmall.getText());
    }
}
