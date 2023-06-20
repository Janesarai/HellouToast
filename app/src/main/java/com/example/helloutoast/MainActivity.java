package com.example.helloutoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();

    }

    public void  initListeners(){
        Button showToast= findViewById(R.id.showToast);
        Button counter= findViewById(R.id.count);
        TextView textView= findViewById(R.id.textView);

    }
}