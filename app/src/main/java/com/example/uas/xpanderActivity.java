package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class xpanderActivity extends AppCompatActivity {

    private ImageView imageView79;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xpander);

        imageView79 = findViewById(R.id.imageView79);

        imageView79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MitsubishiActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}