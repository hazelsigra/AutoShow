package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class YarisActivity extends AppCompatActivity {

    private ImageView imageView58;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yaris);

        imageView58 = findViewById(R.id.imageView58);

        imageView58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ToyotaActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}