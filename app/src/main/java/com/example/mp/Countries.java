package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Countries extends AppCompatActivity implements View.OnClickListener{
    public static String Country = "";
    Intent intent;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10, backB;
    String continent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
        intent = getIntent();
        bt1 = (Button) findViewById(R.id.bt1); bt1.setOnClickListener(this);
        bt2 = (Button) findViewById(R.id.bt2); bt2.setOnClickListener(this);
        bt3 = (Button) findViewById(R.id.bt3); bt3.setOnClickListener(this);
        bt4 = (Button) findViewById(R.id.bt4); bt4.setOnClickListener(this);
        bt5 = (Button) findViewById(R.id.bt5); bt5.setOnClickListener(this);
        bt6 = (Button) findViewById(R.id.bt6); bt6.setOnClickListener(this);
        bt7 = (Button) findViewById(R.id.bt7); bt7.setOnClickListener(this);
        bt8 = (Button) findViewById(R.id.bt8); bt8.setOnClickListener(this);
        bt9 = (Button) findViewById(R.id.bt9); bt9.setOnClickListener(this);
        bt10 = (Button) findViewById(R.id.bt10); bt10.setOnClickListener(this);
        backB = (Button) findViewById(R.id.backB); backB.setOnClickListener(this);
        set();

    }
    public void set(){
        continent = World.Continent.trim();
        if(continent=="ASIA"){
            bt1.setBackgroundResource(R.drawable.china); bt1.setText("CHINA");
            bt2.setBackgroundResource(R.drawable.india); bt2.setText("INDIA");
            bt3.setBackgroundResource(R.drawable.indonesia); bt3.setText("INDONESIA");
            bt4.setBackgroundResource(R.drawable.pakistan); bt4.setText("PAKISTAN");
            bt5.setBackgroundResource(R.drawable.bangladesh); bt5.setText("BANGLADESH");
            bt6.setBackgroundResource(R.drawable.malaysia); bt6.setText("MALAYSIA");
            bt7.setBackgroundResource(R.drawable.philippines); bt7.setText("PHILIPPINES");
            bt8.setBackgroundResource(R.drawable.japan); bt8.setText("JAPAN");
            bt9.setBackgroundResource(R.drawable.thailand); bt9.setText("THAILAND");
            bt10.setBackgroundResource(R.drawable.southkorea); bt10.setText("SOUTH KOREA");
        }
        else if(continent=="EUROPE"){
            bt1.setBackgroundResource(R.drawable.russia); bt1.setText("RUSSIA");
            bt2.setBackgroundResource(R.drawable.germany); bt2.setText("GERMANY");
            bt3.setBackgroundResource(R.drawable.turkey); bt3.setText("TURKEY");
            bt4.setBackgroundResource(R.drawable.uk); bt4.setText("UNITED KINGDOM");
            bt5.setBackgroundResource(R.drawable.france); bt5.setText("FRANCE");
            bt6.setBackgroundResource(R.drawable.italy); bt6.setText("ITALY");
            bt7.setBackgroundResource(R.drawable.spain); bt7.setText("SPAIN");
            bt8.setBackgroundResource(R.drawable.ukraine); bt8.setText("UKRAINE");
            bt9.setBackgroundResource(R.drawable.poland); bt9.setText("POLAND");
            bt10.setBackgroundResource(R.drawable.romania); bt10.setText("ROMANIA");
        }
        else if(continent=="NORTHA"){
            bt1.setBackgroundResource(R.drawable.usa); bt1.setText("UNITED STATES OF AMERICA");
            bt2.setBackgroundResource(R.drawable.canada); bt2.setText("CANADA");
            bt3.setBackgroundResource(R.drawable.mexico); bt3.setText("MEXICO");
            bt4.setBackgroundResource(R.drawable.guatemala); bt4.setText("GUATEMALA");
            bt5.setBackgroundResource(R.drawable.cuba); bt5.setText("CUBA");
            bt6.setBackgroundResource(R.drawable.haiti); bt6.setText("HAITI");
            bt7.setBackgroundResource(R.drawable.dr); bt7.setText("DOMINICAN REPUBLIC");
            bt8.setBackgroundResource(R.drawable.honduras); bt8.setText("HONDURAS");
            bt9.setBackgroundResource(R.drawable.es); bt9.setText("EL SALVADOR");
            bt10.setBackgroundResource(R.drawable.nicaragua); bt10.setText("NICARAGUA");
        }
        else if(continent=="AFRICA"){
            bt1.setBackgroundResource(R.drawable.nigeria); bt1.setText("NIGERIA");
            bt2.setBackgroundResource(R.drawable.ethiopia); bt2.setText("ETHIOPIA");
            bt3.setBackgroundResource(R.drawable.egypt); bt3.setText("EGYPT");
            bt4.setBackgroundResource(R.drawable.drc); bt4.setText("DEMOCRATIC REPUBLIC OF CONGO");
            bt5.setBackgroundResource(R.drawable.southafrica); bt5.setText("SOUTH AFRICA");
            bt6.setBackgroundResource(R.drawable.tanzania); bt6.setText("TANZANIA");
            bt7.setBackgroundResource(R.drawable.kenya); bt7.setText("KENYA");
            bt8.setBackgroundResource(R.drawable.uganda); bt8.setText("UGANDA");
            bt9.setBackgroundResource(R.drawable.algeria); bt9.setText("ALGERIA");
            bt10.setBackgroundResource(R.drawable.sudan); bt10.setText("SUDAN");
        }
        else if(continent=="SOUTHA"){
            bt1.setBackgroundResource(R.drawable.argentina); bt1.setText("ARGENTINA");
            bt2.setBackgroundResource(R.drawable.bolivia); bt2.setText("BOLIVIA");
            bt3.setBackgroundResource(R.drawable.brazil); bt3.setText("BRAZIL");
            bt4.setBackgroundResource(R.drawable.chile); bt4.setText("CHILE");
            bt5.setBackgroundResource(R.drawable.colombia); bt5.setText("COLOMBIA");
            bt6.setBackgroundResource(R.drawable.ecuador); bt6.setText("ECUADOR");
            bt7.setBackgroundResource(R.drawable.guyana); bt7.setText("GUYANA");
            bt8.setBackgroundResource(R.drawable.paraguay); bt8.setText("PARAGUAY");
            bt9.setBackgroundResource(R.drawable.peru); bt9.setText("PERU");
            bt10.setBackgroundResource(R.drawable.suriname); bt10.setText("SURINAME");
        }
        else if(continent=="AUSTRALIA"){
            bt1.setBackgroundResource(R.drawable.australia); bt1.setText("AUSTRALIA");
            bt2.setBackgroundResource(R.drawable.fiji); bt2.setText("FIJI");
            bt3.setBackgroundResource(R.drawable.kiribati); bt3.setText("KIRIBATI");
            bt4.setBackgroundResource(R.drawable.mi); bt4.setText("MARSHALL ISLANDS");
            bt5.setBackgroundResource(R.drawable.micronesia); bt5.setText("MICRONESIA");
            bt6.setBackgroundResource(R.drawable.nauru); bt6.setText("NAURU");
            bt7.setBackgroundResource(R.drawable.nz); bt7.setText("NEW ZEALAND");
            bt8.setBackgroundResource(R.drawable.palau); bt8.setText("PALAU");
            bt9.setBackgroundResource(R.drawable.png); bt9.setText("PAPAU NEW GINEA");
            bt10.setBackgroundResource(R.drawable.samoa); bt10.setText("SAMOA");
        }
    }

    @Override
    public void onClick(View v) {
        intent = new Intent(Countries.this, Country.class);
        if(continent=="ASIA"){
            switch(v.getId()){
                case R.id.bt1:
                    Country = "CHINA";
                    startActivity(intent);
                    break;
                case R.id.bt2:
                    Country = "INDIA";
                    startActivity(intent);
                    break;
                case R.id.bt3:
                    Country = "INDONESIA";
                    startActivity(intent);
                    break;
                case R.id.bt4:
                    Country = "PAKISTAN";
                    startActivity(intent);
                    break;
                case R.id.bt5:
                    Country = "BANGLADESH";
                    startActivity(intent);
                    break;
                case R.id.bt6:
                    Country = "MALAYSIA";
                    startActivity(intent);
                    break;
                case R.id.bt7:
                    Country = "PHILIPPINES";
                    startActivity(intent);
                    break;
                case R.id.bt8:
                    Country = "JAPAN";
                    startActivity(intent);
                    break;
                case R.id.bt9:
                    Country = "THAILAND";
                    startActivity(intent);
                    break;
                case R.id.bt10:
                    Country = "SOUTHKOREA";
                    startActivity(intent);
                    break;
                case R.id.backB:
                    intent = new Intent(Countries.this, World.class);
                    startActivity(intent);
                    break;
            }
        }
        else if(continent=="EUROPE"){
            switch(v.getId()){
                case R.id.bt1:
                    Country = "RUSSIA";
                    startActivity(intent);
                    break;
                case R.id.bt2:
                    Country = "GERMANY";
                    startActivity(intent);
                    break;
                case R.id.bt3:
                    Country = "TURKEY";
                    startActivity(intent);
                    break;
                case R.id.bt4:
                    Country = "UK";
                    startActivity(intent);
                    break;
                case R.id.bt5:
                    Country = "FRANCE";
                    startActivity(intent);
                    break;
                case R.id.bt6:
                    Country = "ITALY";
                    startActivity(intent);
                    break;
                case R.id.bt7:
                    Country = "SPAIN";
                    startActivity(intent);
                    break;
                case R.id.bt8:
                    Country = "UKRAINE";
                    startActivity(intent);
                    break;
                case R.id.bt9:
                    Country = "POLAND";
                    startActivity(intent);
                    break;
                case R.id.bt10:
                    Country = "ROMANIA";
                    startActivity(intent);
                    break;
                case R.id.backB:
                    intent = new Intent(Countries.this, World.class);
                    startActivity(intent);
                    break;
            }
        }
        else if(continent=="NORTHA"){
            switch(v.getId()){
                case R.id.bt1:
                    Country = "USA";
                    startActivity(intent);
                    break;
                case R.id.bt2:
                    Country = "CANADA";
                    startActivity(intent);
                    break;
                case R.id.bt3:
                    Country = "MEXICO";
                    startActivity(intent);
                    break;
                case R.id.bt4:
                    Country = "GUATEMALA";
                    startActivity(intent);
                    break;
                case R.id.bt5:
                    Country = "CUBA";
                    startActivity(intent);
                    break;
                case R.id.bt6:
                    Country = "HAITI";
                    startActivity(intent);
                    break;
                case R.id.bt7:
                    Country = "DR";
                    startActivity(intent);
                    break;
                case R.id.bt8:
                    Country = "HONDURAS";
                    startActivity(intent);
                    break;
                case R.id.bt9:
                    Country = "ES";
                    startActivity(intent);
                    break;
                case R.id.bt10:
                    Country = "NICARAGUA";
                    startActivity(intent);
                    break;
                case R.id.backB:
                    intent = new Intent(Countries.this, World.class);
                    startActivity(intent);
                    break;
            }
        }
        else if(continent=="AFRICA"){
            switch(v.getId()){
                case R.id.bt1:
                    Country = "NIGERIA";
                    startActivity(intent);
                    break;
                case R.id.bt2:
                    Country = "ETHIOPIA";
                    startActivity(intent);
                    break;
                case R.id.bt3:
                    Country = "EGYPT";
                    startActivity(intent);
                    break;
                case R.id.bt4:
                    Country = "DRC";
                    startActivity(intent);
                    break;
                case R.id.bt5:
                    Country = "SOUTHAFRICA";
                    startActivity(intent);
                    break;
                case R.id.bt6:
                    Country = "TANZANIA";
                    startActivity(intent);
                    break;
                case R.id.bt7:
                    Country = "KENYA";
                    startActivity(intent);
                    break;
                case R.id.bt8:
                    Country = "UGANDA";
                    startActivity(intent);
                    break;
                case R.id.bt9:
                    Country = "ALGERIA";
                    startActivity(intent);
                    break;
                case R.id.bt10:
                    Country = "SUDAN";
                    startActivity(intent);
                    break;
                case R.id.backB:
                    intent = new Intent(Countries.this, World.class);
                    startActivity(intent);
                    break;
            }
        }
        else if(continent=="SOUTHA"){
            switch(v.getId()){
                case R.id.bt1:
                    Country = "ARGENTINA";
                    startActivity(intent);
                    break;
                case R.id.bt2:
                    Country = "BOLIVIA";
                    startActivity(intent);
                    break;
                case R.id.bt3:
                    Country = "BRAZIL";
                    startActivity(intent);
                    break;
                case R.id.bt4:
                    Country = "CHILE";
                    startActivity(intent);
                    break;
                case R.id.bt5:
                    Country = "COLOMBIA";
                    startActivity(intent);
                    break;
                case R.id.bt6:
                    Country = "ECUADOR";
                    startActivity(intent);
                    break;
                case R.id.bt7:
                    Country = "GUYANA";
                    startActivity(intent);
                    break;
                case R.id.bt8:
                    Country = "PARAGUAY";
                    startActivity(intent);
                    break;
                case R.id.bt9:
                    Country = "PERU";
                    startActivity(intent);
                    break;
                case R.id.bt10:
                    Country = "SURINAME";
                    startActivity(intent);
                    break;
                case R.id.backB:
                    intent = new Intent(Countries.this, World.class);
                    startActivity(intent);
                    break;
            }
        }
        else if(continent=="AUSTRALIA"){
            switch(v.getId()){
                case R.id.bt1:
                    Country = "AUSTRALIA";
                    startActivity(intent);
                    break;
                case R.id.bt2:
                    Country = "FIJI";
                    startActivity(intent);
                    break;
                case R.id.bt3:
                    Country = "KIRIBATI";
                    startActivity(intent);
                    break;
                case R.id.bt4:
                    Country = "MI";
                    startActivity(intent);
                    break;
                case R.id.bt5:
                    Country = "MICRONESIA";
                    startActivity(intent);
                    break;
                case R.id.bt6:
                    Country = "NAURU";
                    startActivity(intent);
                    break;
                case R.id.bt7:
                    Country = "NZ";
                    startActivity(intent);
                    break;
                case R.id.bt8:
                    Country = "PALAU";
                    startActivity(intent);
                    break;
                case R.id.bt9:
                    Country = "PNG";
                    startActivity(intent);
                    break;
                case R.id.bt10:
                    Country = "SAMOA";
                    startActivity(intent);
                    break;
                case R.id.backB:
                    intent = new Intent(Countries.this, World.class);
                    startActivity(intent);
                    break;
            }
        }
    }
}
