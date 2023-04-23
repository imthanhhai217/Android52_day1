package com.vndevpro.android52_day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO breakpoint
        int a = 2;
        int b = a + 1;
        Log.d(TAG, "onCreate: " + b);

        findViewById(R.id.tvHelloWorld).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newFunction();
            }
        });
    }

    public void newFunction() {
        Toast.makeText(this, "Click hello world", Toast.LENGTH_SHORT).show();
    }
}