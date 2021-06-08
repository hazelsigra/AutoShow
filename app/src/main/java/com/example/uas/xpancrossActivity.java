package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class xpancrossActivity extends AppCompatActivity {

    private ImageView imageView80;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xpancross);

        imageView80 = findViewById(R.id.imageView80);

        imageView80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MitsubishiActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}