package com.unitconverter.converter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;


import androidx.appcompat.app.AppCompatActivity;

public class manual extends AppCompatActivity {

    GridLayout manualGrid;
    Button button = new Button(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual);
        manualGrid = findViewById(R.id.gridlayout1);
        manualGrid.addView(button);
    }
}