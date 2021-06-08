package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AduaratusActivity extends AppCompatActivity {

    private ImageView imageView69;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aduaratus);

        imageView69 = findViewById(R.id.imageView69);

        imageView69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MercyActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}