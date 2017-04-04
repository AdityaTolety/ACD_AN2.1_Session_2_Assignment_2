package com.android.adityatolety.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        String info = getIntent().getStringExtra("INFO");
    }
}
