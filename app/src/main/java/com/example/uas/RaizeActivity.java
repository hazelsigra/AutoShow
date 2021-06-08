package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RaizeActivity extends AppCompatActivity {

    private ImageView imageView57;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raize);

        imageView57 = findViewById(R.id.imageView57);

        imageView57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ToyotaActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}