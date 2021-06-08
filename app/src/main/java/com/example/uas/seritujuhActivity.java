package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class seritujuhActivity extends AppCompatActivity {

    private ImageView imageView64;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seritujuh);

        imageView64 = findViewById(R.id.imageView64);

        imageView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BMWActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}