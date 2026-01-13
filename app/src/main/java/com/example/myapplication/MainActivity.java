package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerMarka;
    private Spinner spinnerModel;
    private SeekBar seekBarRocznik;
    private CheckBox checkBoxWlasciciel;
    private RadioGroup radioGroupHistoria;
    private Button buttonDodaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spinnerMarka = findViewById(R.id.spinnerMarka);
        spinnerModel = findViewById(R.id.spinnerModel);
        seekBarRocznik = findViewById(R.id.seekBarRocznik);
        checkBoxWlasciciel = findViewById(R.id.checkBoxWlasciciel);
        radioGroupHistoria = findViewById(R.id.radioGroupHistoria);
        buttonDodaj = findViewById(R.id.buttonDodaj);
    }
}