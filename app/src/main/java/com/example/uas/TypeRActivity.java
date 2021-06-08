package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TypeRActivity extends AppCompatActivity {

    private ImageView imageView56;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_r);

        imageView56 = findViewById(R.id.imageView56);

        imageView56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HondaActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}