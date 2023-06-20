package com.example.helloutoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        TextView textVieww= findViewById(R.id.textView);

        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "hellou toas", Toast.LENGTH_SHORT).show();
            }
        });

        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer numero = Integer.parseInt(textVieww.getText().toString());
                numero++;
                textVieww.setText(numero.toString());
            }
        });

    }
}