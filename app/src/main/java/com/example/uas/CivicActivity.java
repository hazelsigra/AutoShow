package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CivicActivity extends AppCompatActivity {

    private ImageView imageView51;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civic);

        imageView51 = findViewById(R.id.imageView51);

        imageView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HondaActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}