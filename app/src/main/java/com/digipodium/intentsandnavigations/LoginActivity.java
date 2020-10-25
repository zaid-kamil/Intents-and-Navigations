package com.digipodium.intentsandnavigations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btnContinue = findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(v1 -> {
            EditText editEmail = findViewById(R.id.editEmail);
            String email = editEmail.getText().toString();
            if (email.length() > 10) {
                Intent i = new Intent(this, HomeActivity.class);
                i.putExtra("email", email);
                startActivity(i);
            }else{
                editEmail.setError("enter a valid email");
                editEmail.requestFocus();
            }
        });
    }
}