package com.example.myapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Mainscreen extends AppCompatActivity {
    TextView display;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainscreen);
        display = findViewById(R.id.display);
        display.setText("welcome to our homepage");
        display.setTextColor(getResources().getColor(R.color.limegreen));


    }
}
