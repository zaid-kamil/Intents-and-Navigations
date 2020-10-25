package com.digipodium.intentsandnavigations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnAbout = findViewById(R.id.btnAbout);

        btnLogin.setOnClickListener(v1 -> {
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        });

        btnAbout.setOnClickListener(v2 -> {
            startActivity(new Intent(this, AboutActivity.class));
        });
    }
}