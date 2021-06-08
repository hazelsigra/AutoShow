package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HrvActivity extends AppCompatActivity {

    private ImageView imageView52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hrv);

        imageView52 = findViewById(R.id.imageView52);

        imageView52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HondaActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}