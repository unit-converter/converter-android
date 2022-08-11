package com.unitconverter.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class wieghts extends AppCompatActivity {

    EditText editText;
    TextView valueinpounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wieghts);

        valueinpounds = findViewById(R.id.textView7);
        editText = findViewById(R.id.editTextNumber);
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    convert_kilo_to_pound();
                } catch (NumberFormatException emptyString) {
                }
            }
        };
        editText.addTextChangedListener(textWatcher);
    }

    private void convert_kilo_to_pound() {
        String valueEntered = editText.getText().toString();
        double Kilo = Double.parseDouble(valueEntered);
        double pounds = Kilo * 2.205;
        valueinpounds.setText("" + pounds);
    }
}