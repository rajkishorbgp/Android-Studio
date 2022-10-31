package com.rajkishorbgp.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView one,two,three,four,five,six;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Two", Toast.LENGTH_SHORT).show();
            }
        });

        three.setOnClickListener(this);
        four.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.four:
                Toast.makeText(this, "four", Toast.LENGTH_SHORT).show();
                break;

            case R.id.three:
                Toast.makeText(this, "Three", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public void third(View view) {
        Toast.makeText(this, "Five", Toast.LENGTH_SHORT).show();
    }

    public void thirdWay(View view) {
        Toast.makeText(this, "Six", Toast.LENGTH_SHORT).show();
    }
}