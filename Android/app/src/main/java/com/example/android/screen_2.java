package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen_2 extends AppCompatActivity {

    private Button button_showqr;
    private Button button_scanqr;
    private Button button_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        button_showqr=findViewById(R.id.button_showqr);
        button_scanqr=findViewById(R.id.button_scanqr);
        button_address=findViewById(R.id.button_address);

        button_showqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(screen_2.this, screen_3_qr.class);
                startActivity(intent);
            }
        });

        button_scanqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(screen_2.this, screen_4.class);
                startActivity(intent);
            }
        });

        button_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(screen_2.this, screen_3_address.class);
                startActivity(intent);
            }
        });
    }
}