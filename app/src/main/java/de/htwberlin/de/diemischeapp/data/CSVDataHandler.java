package de.htwberlin.de.diemischeapp.data;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import de.htwberlin.de.diemischeapp.R;
import de.htwberlin.de.diemischeapp.model.Bed;
import de.htwberlin.de.diemischeapp.model.Crop;

public class CSVDataHandler implements DataHandler {

    private static CSVDataHandler instance;

    private CSVDataHandler(Context context) {
        this.cropList = new ArrayList<>();
        this.context = context;
    }

    public static CSVDataHandler getInstance(Context context) {
        if (instance == null) {
            instance = new CSVDataHandler(context);
        }

        return instance;
    }

    private static final String FILE_NAME = "crops.csv";

    private Context context;

    private List<Crop> cropList;

    public void readCSV() {
        InputStream is = context.getResources().openRawResource(R.raw.crops);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8)
        );

        String line = "";
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            Log.d("line", line);
            System.out.println("Line: "+line);
        }
    }

    @Override
    public Optional<List<Crop>> fetchCrops() {
        return null;
    }

    @Override
    public Optional<List<Bed>> fetchBeds() {
        return null;
    }

    @Override
    public Optional<List<Crop>> fetchSelection() {
        return null;
    }

    @Override
    public void uploadBeds(List<Bed> beds) {

    }

    @Override
    public void uploadSelection(List<Crop> crops) {

    }
}
