package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

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

        ArrayAdapter<CharSequence> arrayAdapterMarka = ArrayAdapter.createFromResource(this, R.array.marki, android.R.layout.simple_spinner_item);
        spinnerMarka.setAdapter(arrayAdapterMarka);

        spinnerMarka.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int arrayResId = 0;
                switch (i) {
                    case 0:
                        arrayResId = R.array.modeleVolkswagen;
                        break;
                    case 1:
                        arrayResId = R.array.modeleAudi;
                        break;
                    case 2:
                        arrayResId = R.array.modeleSkoda;
                        break;
                }

                if (arrayResId != 0) {
                    ArrayAdapter<CharSequence> adapterModel = ArrayAdapter.createFromResource(
                            adapterView.getContext(),
                            arrayResId,
                            android.R.layout.simple_spinner_item
                    );
                    adapterModel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerModel.setAdapter(adapterModel);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}