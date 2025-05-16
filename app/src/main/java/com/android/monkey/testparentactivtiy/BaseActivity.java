package com.android.monkey.testparentactivtiy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    public static final String TAG = "Test";

    private final String className = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,className+" onCreate()...");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG,className+" onNewIntent()...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,className+" onStop()...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,className+" onDestroy()...");
    }
}
