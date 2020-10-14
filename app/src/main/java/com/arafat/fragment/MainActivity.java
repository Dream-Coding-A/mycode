package com.arafat.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonHome,buttonProfile,buttonMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewID);
        buttonHome = findViewById(R.id.btnHome);
        buttonProfile = findViewById(R.id.btnProfile);
        buttonMore = findViewById(R.id.btnMore);
    }
}
