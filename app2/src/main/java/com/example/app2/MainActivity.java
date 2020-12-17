package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.app2.base.BaseView;

public class MainActivity extends AppCompatActivity implements BaseView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}