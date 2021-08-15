package com.example.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class secondActivity extends AppCompatActivity {

    Button pay;
    Button pal;
    Button goo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        pay = findViewById(R.id.buttoncard);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        pal = findViewById(R.id.buttonpal);

        pal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                Intent intent = new Intent(secondActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });

        goo = findViewById(R.id.btngoo);

        goo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });
    }
}