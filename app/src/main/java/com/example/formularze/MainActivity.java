package com.example.formularze;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextImie,editTextGatunek, editTextWaga;
    Spinner spinnerGromada;
    CheckBox checkBoxWymarle, checkBoxMieso, checkBoxRosliny;
    RadioButton radioButtonDzien, radioButtonNoc;
    Switch aSwitch;
    SeekBar seekBar;
    Button buttonDodaj;
    TextView textViewKomunikat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editTextGatunek = findViewById(R.id.editTextGatunek);
        editTextImie = findViewById(R.id.editTextImie);
        editTextWaga = findViewById(R.id.editTextImie);

        spinnerGromada = findViewById(R.id.spinnerGromada);

        checkBoxWymarle = findViewById(R.id.checkBoxWymarle);
        checkBoxMieso = findViewById(R.id.checkBoxMieso);
        checkBoxRosliny = findViewById(R.id.checkBoxRosliny);

        radioButtonDzien = findViewById(R.id.radioButtonDzien);
        radioButtonNoc = findViewById(R.id.radioButtonNoc);
        aSwitch = findViewById(R.id.aswitch);
        seekBar = findViewById(R.id.seekBar);
        buttonDodaj = findViewById(R.id.buttonDodaj);
        textViewKomunikat = findViewById(R.id.textViewKomunikat);

    }
}