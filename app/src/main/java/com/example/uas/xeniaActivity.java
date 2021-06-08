package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class xeniaActivity extends AppCompatActivity {

    private ImageView imageView86;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xenia);

        imageView86 = findViewById(R.id.imageView86);

        imageView86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DaihatsuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}