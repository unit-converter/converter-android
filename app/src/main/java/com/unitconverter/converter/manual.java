package com.unitconverter.converter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import androidx.gridlayout.widget.GridLayout;


import androidx.appcompat.app.AppCompatActivity;

public class manual extends AppCompatActivity {

    GridLayout manualGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        final Button massButton = (Button) findViewById(R.id.button2);
        massButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                        startActivity(new Intent(manual.this, wieghts.class));
                        finish();
            }
        });
    }
}