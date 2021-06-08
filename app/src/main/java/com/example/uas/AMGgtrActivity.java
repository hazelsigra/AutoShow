package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AMGgtrActivity extends AppCompatActivity {

    private ImageView imageView70;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_m_ggtr);

        imageView70 = findViewById(R.id.imageView70);

        imageView70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MercyActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}