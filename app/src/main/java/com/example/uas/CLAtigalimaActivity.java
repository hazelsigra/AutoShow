package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CLAtigalimaActivity extends AppCompatActivity {

    private ImageView imageView72;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_l_atigalima);

        imageView72 = findViewById(R.id.imageView72);

        imageView72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MercyActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}