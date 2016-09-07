package com.colors.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.colors.android.mylibrary.QLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QLog.d("colors");
    }
}
