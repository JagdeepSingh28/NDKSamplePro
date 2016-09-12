package com.infogain.jagdeepsingh.ndkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_android);

        ((TextView)findViewById(R.id.textView)).setText(getMsgFromJni());
    }

    static {
        System.loadLibrary("hello-android-jni");
    }
    public native String getMsgFromJni();
}
