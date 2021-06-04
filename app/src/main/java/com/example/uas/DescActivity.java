package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DescActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UAS);
        setContentView(R.layout.activity_desc);
    }
}