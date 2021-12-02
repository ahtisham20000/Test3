package com.downloader.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tostertos.toster.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.To(this,"hy");
    }
}