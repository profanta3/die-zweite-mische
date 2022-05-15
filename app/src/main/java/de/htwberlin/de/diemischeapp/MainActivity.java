package de.htwberlin.de.diemischeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import de.htwberlin.de.diemischeapp.data.CSVDataHandler;
import de.htwberlin.de.diemischeapp.data.DataHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CSVDataHandler dataHandler = CSVDataHandler.getInstance(this);


        dataHandler.readCSV();
    }


}