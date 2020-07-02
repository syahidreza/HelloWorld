package com.syahidreza.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("debug","ini log debug");
        Log.e("error", "ini log error");
        Log.w("warning","ini log warning");
        Log.i("info","ini log info");
    }
}
