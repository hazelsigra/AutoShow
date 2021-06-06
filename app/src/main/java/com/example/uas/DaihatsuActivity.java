package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DaihatsuActivity extends AppCompatActivity {

    private ImageView imageView16, imageView44, imageView50, imageView46, imageView47, imageView48, imageView49;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_UAS);
        setContentView(R.layout.activity_daihatsu);

        imageView16 = findViewById(R.id.imageView16);
        imageView44 = findViewById(R.id.imageView44);
        imageView50 = findViewById(R.id.imageView50);
        imageView46 = findViewById(R.id.imageView46);
        imageView47 = findViewById(R.id.imageView47);
        imageView48 = findViewById(R.id.imageView48);
        imageView49 = findViewById(R.id.imageView49);

        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}