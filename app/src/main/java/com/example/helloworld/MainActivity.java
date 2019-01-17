package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d("MainActivity", "Hello World");
        }
        catch(Exception e){
            Log.d("app","Exception on Hello World! ",e);
        }
    }
}
