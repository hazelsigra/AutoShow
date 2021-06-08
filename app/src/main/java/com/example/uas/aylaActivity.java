package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class aylaActivity extends AppCompatActivity {

    private ImageView imageView81;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayla);

        imageView81 = findViewById(R.id.imageView81);

        imageView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DaihatsuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}