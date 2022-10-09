package com.example.musicplayerplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LauncherMainActivity extends AppCompatActivity {

    Button local, jango;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher_main);

        local = findViewById(R.id.local);
        jango = findViewById(R.id.jango);

        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauncherMainActivity.this, MainActivity.class));
            }
        });

        jango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauncherMainActivity.this, OnlineMusicActivity.class));
            }
        });
    }
}