package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SempatlimapuluhActivity extends AppCompatActivity {

    private ImageView imageView74;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sempatlimapuluh);

        imageView74 = findViewById(R.id.imageView74);

        imageView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MercyActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}