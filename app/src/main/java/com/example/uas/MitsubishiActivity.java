package com.example.uas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MitsubishiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UAS);
        setContentView(R.layout.activity_mitsubishi);
    }
}