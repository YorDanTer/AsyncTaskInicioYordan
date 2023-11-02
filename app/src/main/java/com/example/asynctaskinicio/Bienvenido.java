package com.example.asynctaskinicio;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Bienvenido extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        String username = getIntent().getStringExtra("username");

        TextView welcomeMessage = findViewById(R.id.txt_Bienvenido);


        String welcomeText = getString(R.string.welcome_message, username);
        welcomeMessage.setText(welcomeText);
    }
}
