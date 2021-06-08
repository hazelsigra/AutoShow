package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EclipseActivity extends AppCompatActivity {

    private ImageView imageView75;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eclipse);

        imageView75 = findViewById(R.id.imageView75);

        imageView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MitsubishiActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}