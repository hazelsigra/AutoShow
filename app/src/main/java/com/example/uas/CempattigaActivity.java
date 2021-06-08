package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CempattigaActivity extends AppCompatActivity {

    private ImageView imageView71;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cempattiga);

        imageView71 = findViewById(R.id.imageView71);

        imageView71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MercyActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}