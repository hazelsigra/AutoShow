package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class teriosActivity extends AppCompatActivity {

    private ImageView imageView85;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terios);

        imageView85 = findViewById(R.id.imageView85);

        imageView85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DaihatsuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}