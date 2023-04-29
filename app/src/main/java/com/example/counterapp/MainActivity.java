package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button counter;
    TextView tv_counter;
    int cur = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = findViewById(R.id.btn_counter);
        tv_counter = findViewById(R.id.tv_counter);

        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_counter.setText("" + increaseCounter());
            }
        });
    }

    public int increaseCounter() {
        return ++cur;
    }
}