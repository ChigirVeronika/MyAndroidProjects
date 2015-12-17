package by.bsuir.myfullviolin.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import by.bsuir.myfullviolin.R;

/**
 * Created by Вероника on 12.12.2015.
 */
public class SettingsActivity extends Activity {
    Button buttonChangeBgColor;
    LinearLayout settingsLayout;
    LinearLayout aboutLayout;
    LinearLayout notesLayout;
    LinearLayout playLayout;
    LinearLayout tunerLayout;

    private RadioGroup radioGroup;
    private RadioButton c_blue, c_grey, c_pink, c_black;

    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        settingsLayout=(LinearLayout)findViewById(R.id.settingsLayout);
        aboutLayout=(LinearLayout)findViewById(R.id.aboutLayout);
        notesLayout=(LinearLayout)findViewById(R.id.notesLayout);
        playLayout=(LinearLayout)findViewById(R.id.playLayout);
        tunerLayout=(LinearLayout)findViewById(R.id.tunerLayout);

        radioGroup = (RadioGroup) findViewById(R.id.settingsRadioGroup);
        radioGroup.setOnCheckedChangeListener
                (new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        // find which radio button is selected
                        switch (checkedId){
                            case R.id.c_black:{
                                Toast.makeText(getApplicationContext(), "choice: Black",
                                        Toast.LENGTH_SHORT).show();
                            }break;
                            case R.id.c_blue:{
                                Toast.makeText(getApplicationContext(), "choice: Blue",
                                        Toast.LENGTH_SHORT).show();
                            }break;
                            case R.id.c_grey:{
                                Toast.makeText(getApplicationContext(), "choice: Grey",
                                        Toast.LENGTH_SHORT).show();
                            }break;
                            case R.id.c_pink:{
                                Toast.makeText(getApplicationContext(), "choice: Pink",
                                        Toast.LENGTH_SHORT).show();
                            }break;
                        }

                    }
                });

        c_blue=(RadioButton)findViewById(R.id.c_blue);
        c_black=(RadioButton)findViewById(R.id.c_black);
        c_grey=(RadioButton)findViewById(R.id.c_grey);
        c_pink=(RadioButton)findViewById(R.id.c_pink);
        textView=(TextView)findViewById(R.id.text);


        buttonChangeBgColor = (Button) findViewById(R.id.buttonChangeBgColor);
        buttonChangeBgColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId=radioGroup.getCheckedRadioButtonId();

                if(selectedId==c_black.getId()) {
                    settingsLayout.setBackgroundColor(Color.BLACK);
                    aboutLayout.setBackgroundColor(Color.BLACK);
                    notesLayout.setBackgroundColor(Color.BLACK);
                    playLayout.setBackgroundColor(Color.BLACK);
                    tunerLayout.setBackgroundColor(Color.BLACK);
                    textView.setText("You chose Black color.");
                }else if(selectedId==c_blue.getId()){
                    settingsLayout.setBackgroundColor(Color.BLUE);
                    aboutLayout.setBackgroundColor(Color.BLUE);
                    notesLayout.setBackgroundColor(Color.BLUE);
                    playLayout.setBackgroundColor(Color.BLUE);
                    tunerLayout.setBackgroundColor(Color.BLUE);
                    textView.setText("You chose Blue color.");
                }else if(selectedId==c_blue.getId()){
                    settingsLayout.setBackgroundColor(Color.GRAY);
                    aboutLayout.setBackgroundColor(Color.GRAY);
                    notesLayout.setBackgroundColor(Color.GRAY);
                    playLayout.setBackgroundColor(Color.GRAY);
                    tunerLayout.setBackgroundColor(Color.GRAY);
                    textView.setText("You chose Gray color.");
                }else{
                    settingsLayout.setBackgroundColor(Color.RED);
                    aboutLayout.setBackgroundColor(Color.RED);
                    notesLayout.setBackgroundColor(Color.RED);
                    playLayout.setBackgroundColor(Color.RED);
                    tunerLayout.setBackgroundColor(Color.RED);
                    textView.setText("You chose Pink color.");
                }




            }
        });
    }
}
