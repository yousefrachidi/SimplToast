package com.example.youraads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.youra.ads.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toasty.simpleToasty(this,"el hamdo lillah ");
    }
}