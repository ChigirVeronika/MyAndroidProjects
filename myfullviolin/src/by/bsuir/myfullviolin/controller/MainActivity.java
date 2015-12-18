package by.bsuir.myfullviolin.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import by.bsuir.myfullviolin.R;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button buttonExit = (Button) findViewById(R.id.buttonExit);
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });

        Button buttonPlay = (Button)findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //абстрактное описание активности, которая будет выполняться
                Intent intentPlay = new Intent();
                intentPlay.setClass(MainActivity.this, PlayActivity.class);
                startActivity(intentPlay);
            }
        });

        /*Button buttonTuner = (Button)findViewById(R.id.buttonTuner);
        buttonTuner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTuner = new Intent();
                intentTuner.setClass(MainActivity.this, TunerActivity.class);
                startActivity(intentTuner);
            }
        });*/

        Button buttonNotes = (Button)findViewById(R.id.buttonNotes);
        buttonNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNotes = new Intent();
                intentNotes.setClass(MainActivity.this, NotesActivity.class);
                startActivity(intentNotes);
            }
        });

        Button buttonSettings = (Button)findViewById(R.id.buttonSettings);
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSettings = new Intent();
                intentSettings.setClass(MainActivity.this, SettingsActivity.class);
                startActivity(intentSettings);
            }
        });

        Button buttonAbout = (Button)findViewById(R.id.buttonAbout);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTuner = new Intent();
                intentTuner.setClass(MainActivity.this, AboutActivity.class);
                startActivity(intentTuner);
            }
        });

        Button buttonMetro = (Button)findViewById(R.id.buttonMetro);
        buttonMetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTuner = new Intent();
                intentTuner.setClass(MainActivity.this, MetroActivity.class);
                startActivity(intentTuner);
            }
        });
    }
}
