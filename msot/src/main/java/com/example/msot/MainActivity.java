package com.example.msot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import idl.baidu.page.MultiplyDemo;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int  msot  = MultiplyDemo.multiply(100,200);

        Toast.makeText(MainActivity.this,String.valueOf(msot),Toast.LENGTH_LONG).show();

        Log.i("MainActivity", String.valueOf(msot));
    }
}
