package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlphardActivity extends AppCompatActivity {

    private ImageView imageView60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphard);

        imageView60 = findViewById(R.id.imageView60);

        imageView60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ToyotaActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}