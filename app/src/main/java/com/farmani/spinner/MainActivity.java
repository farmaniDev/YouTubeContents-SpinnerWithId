package com.farmani.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1, spinner2;
    TextView textView1, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner1);
        textView1 = findViewById(R.id.textView1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView1.setText(spinner1.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2 = findViewById(R.id.spinner2);
        textView2 = findViewById(R.id.textView2);

        ArrayAdapter<Number> adapter2 = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, new Number[] {
                        new Number(1, "One"),
                        new Number(2, "Two"),
                        new Number(3, "Three"),
                        new Number(4, "Four"),
                        new Number(5, "Five"),
                        new Number(6, "Six"),
                        new Number(7, "Seven"),
                        new Number(8, "Eight"),
                        new Number(9, "Nine"),
                        new Number(10, "Ten")
        });

        spinner2.setAdapter(adapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Number number = (Number) spinner2.getSelectedItem();
                textView2.setText(String.valueOf(number.value));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}