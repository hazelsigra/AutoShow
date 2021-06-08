package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MduaActivity extends AppCompatActivity {

    private ImageView imageView65;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdua);

        imageView65 = findViewById(R.id.imageView65);

        imageView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BMWActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}