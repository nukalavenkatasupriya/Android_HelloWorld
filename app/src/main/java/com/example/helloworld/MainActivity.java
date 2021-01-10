package com.example.helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView data;
    Button c_button;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = findViewById(R.id.tv);
        c_button = findViewById(R.id.countBtn);

        if (savedInstanceState != null && savedInstanceState.containsKey("android")) {
            count = savedInstanceState.getInt("android");
            data.setText(String.valueOf(count));
        }
        c_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                data.setText(String.valueOf(count));
                }
            });
    }

    public void showToastMessage(View view) {
        //Toast.makeText(this,"welcome to app development",Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Welcome to app development", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("android", count);
    }
}

