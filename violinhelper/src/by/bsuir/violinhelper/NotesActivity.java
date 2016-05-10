package by.bsuir.violinhelper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import by.bsuir.myfullviolin.R;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NotesActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        Button buttonNotes1 = (Button)findViewById(R.id.buttonNotes1);
        buttonNotes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CopyReadPDFFromAssets("theswan.pdf");
            }
        });
        Button buttonNotes2 = (Button)findViewById(R.id.buttonNotes2);
        buttonNotes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CopyReadPDFFromAssets("bashsonata4.pdf");
            }
        });
        Button buttonNotes3 = (Button)findViewById(R.id.buttonNotes3);
        buttonNotes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CopyReadPDFFromAssets("derbenkopolka.pdf");
            }
        });
        Button buttonNotes4 = (Button)findViewById(R.id.buttonNotes4);
        buttonNotes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CopyReadPDFFromAssets("vivaldiconcertam.pdf");
            }
        });
        Button buttonNotes5 = (Button)findViewById(R.id.buttonNotes5);
        buttonNotes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CopyReadPDFFromAssets("lulligavot.pdf");
            }
        });
        Button buttonNotes6 = (Button)findViewById(R.id.buttonNotes6);
        buttonNotes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CopyReadPDFFromAssets("lovelendsecretgarden.pdf");
            }
        });
        Button buttonNotes7 = (Button)findViewById(R.id.buttonNotes7);
        buttonNotes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CopyReadPDFFromAssets("metallidivals.pdf");
            }
        });

        //view toast with now selected spinner
//        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
//        nowSelectedSpinner(spinner);
//
//        ArrayAdapter<Beats> arrayMenu =
//                new ArrayAdapter<Beats>(this,
//                        android.R.layout.simple_spinner_item, values());
//        spinner.setAdapter(arrayMenu);
//        arrayMenu.setDropDownViewResource(R.layout.spinner_dropdown);
//        spinner.setOnItemSelectedListener(beatsSpinnerListener);


    }

    private void nowSelectedSpinner(Spinner spinner){
        String selected = spinner.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_SHORT).show();
    }

    private void CopyReadPDFFromAssets(String pdfPath) {
        AssetManager assetManager = getAssets();

        InputStream in = null;
        OutputStream out = null;
        File file = new File(getFilesDir(), pdfPath);
        try
        {
            in = assetManager.open(pdfPath);
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

            copyPdfFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e)
        {
            Log.e("exception", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/" + pdfPath),
                "application/pdf");

        startActivity(intent);
    }

    private void copyPdfFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }
    
}
