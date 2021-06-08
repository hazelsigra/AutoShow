package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class xtujuhActivity extends AppCompatActivity {

    private ImageView imageView66;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xtujuh);

        imageView66 = findViewById(R.id.imageView66);

        imageView66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BMWActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}