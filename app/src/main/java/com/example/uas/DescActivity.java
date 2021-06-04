package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import model.harga;

public class DescActivity extends AppCompatActivity {

    private TextView harga1;
    private harga listHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UAS);
        setContentView(R.layout.activity_desc);

        harga1 = findViewById(R.id.textView3);

        harga1.setText(listHarga.getHarga1());
    }
}