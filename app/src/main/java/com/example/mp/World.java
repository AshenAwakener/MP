package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class World extends AppCompatActivity implements View.OnClickListener{
    public static String Continent = "";
    Button asiaB, europeB, northAB, africaB, southAB, australiaB, backB;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);
        asiaB = (Button) findViewById(R.id.asiaB); asiaB.setOnClickListener(this);
        europeB = (Button) findViewById(R.id.europeB); europeB.setOnClickListener(this);
        northAB = (Button) findViewById(R.id.northAB); northAB.setOnClickListener(this);
        africaB = (Button) findViewById(R.id.africaB); africaB.setOnClickListener(this);
        southAB = (Button) findViewById(R.id.southAB); southAB.setOnClickListener(this);
        australiaB = (Button) findViewById(R.id.australiaB); australiaB.setOnClickListener(this);
        backB = (Button) findViewById(R.id.backB); backB.setOnClickListener(this);
        intent = new Intent(World.this, Countries.class);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.asiaB:
                Continent = "ASIA";
                startActivity(intent);
                break;
            case R.id.europeB:
                Continent = "EUROPE";
                startActivity(intent);
                break;
            case R.id.northAB:
                Continent = "NORTHA";
                startActivity(intent);
                break;
            case R.id.africaB:
                Continent = "AFRICA";
                startActivity(intent);
                break;
            case R.id.southAB:
                Continent = "SOUTHA";
                startActivity(intent);
                break;
            case R.id.australiaB:
                Continent = "AUSTRALIA";
                startActivity(intent);
                break;
            case R.id.backB:
                intent = new Intent(World.this, Menu.class);
                startActivity(intent);
        }
    }

}
