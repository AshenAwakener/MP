package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Country extends AppCompatActivity {
    TextView CountryN, Capital, CDescription, Details;
    ImageView Flag, TSpot;
    String continent = "";
    String[] desc, cap, tspot;
    SQLiteDatabase database;
    Cursor c1,c2,c3;
    int ctr=0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        CountryN = (TextView) findViewById(R.id.CountryN);
        Capital = (TextView) findViewById(R.id.Capital);
        CDescription = (TextView) findViewById(R.id.CDescription);
        Details = (TextView) findViewById(R.id.Details);
        Flag = (ImageView) findViewById(R.id.Flag);
        TSpot = (ImageView) findViewById(R.id.TSpot);
        database = openOrCreateDatabase("USER", Context.MODE_PRIVATE, null);
        continent = World.Continent.trim();
        set();
    }
    public void set(){
        desc = new String[10];
        cap = new String[10];
        tspot = new String[10];
        c1 = database.rawQuery("SELECT DISTINCT(DESCRIPTION) FROM DESCRIPTION WHERE CONTINENT IN ('"+continent+"');",null);
        c2 = database.rawQuery("SELECT DISTINCT(COUNTRY_NAME) FROM COUNTRIES WHERE CONTINENT IN ('"+continent+"');",null);
        c3 = database.rawQuery("SELECT DISTINCT(DESC_TSPOT) FROM DESCRIPTION WHERE CONTINENT IN ('"+continent+"');",null);
        if (c1.getCount() == 0 || c2.getCount() == 0 || c3.getCount() == 0) {
            Toast.makeText(this, "Database is empty...", Toast.LENGTH_SHORT).show();
            return;
        } else {
            StringBuffer buff1 = new StringBuffer();
            StringBuffer buff2 = new StringBuffer();
            StringBuffer buff3 = new StringBuffer();
            int i = 0;
            while(c1.moveToNext()&&c2.moveToNext()&&c3.moveToNext()) {
                buff1.append(c1.getString(0));
                buff2.append(c2.getString(0));
                buff3.append(c3.getString(0));
                desc[i] = buff1.toString();
                cap[i] = buff2.toString();
                tspot[i] = buff3.toString();
                buff1 = new StringBuffer();
                buff2 = new StringBuffer();
                buff3 = new StringBuffer();
                i++;
            }
        } ctr++;
        c1.close();
        c2.close();
        c3.close();
        database.close();
        if(continent=="ASIA"){
            if(Countries.Country=="CHINA"){
                CountryN.setText("CHINA");
                Flag.setImageResource(R.drawable.china);
                Capital.setText("Capital: "+ cap[0]);
                CDescription.setText(desc[0]);
                TSpot.setImageResource(R.drawable.china_tspot);
                Details.setText(tspot[0]);
            }
            else if(Countries.Country=="INDIA"){
                CountryN.setText("INDIA");
                Flag.setImageResource(R.drawable.india);
                Capital.setText("Capital: "+ cap[1]);
                CDescription.setText(desc[1]);
                TSpot.setImageResource(R.drawable.india_tspot);
                Details.setText(tspot[1]);
            }
            else if(Countries.Country=="INDONESIA"){
                CountryN.setText("INDONESIA");
                Flag.setImageResource(R.drawable.indonesia);
                Capital.setText("Capital: "+ cap[2]);
                CDescription.setText(desc[2]);
                TSpot.setImageResource(R.drawable.indonesia_tspot);
                Details.setText(tspot[2]);
            }
            else if(Countries.Country=="PAKISTAN"){
                CountryN.setText("PAKISTAN");
                Flag.setImageResource(R.drawable.pakistan);
                Capital.setText("Capital: "+ cap[3]);
                CDescription.setText(desc[3]);
                TSpot.setImageResource(R.drawable.pakistan_tspot);
                Details.setText(tspot[3]);
            }
            else if(Countries.Country=="BANGLADESH"){
                CountryN.setText("BANGLADESH");
                Flag.setImageResource(R.drawable.bangladesh);
                Capital.setText("Capital: "+ cap[4]);
                CDescription.setText(desc[4]);
                TSpot.setImageResource(R.drawable.bangladesh_tspot);
                Details.setText(tspot[4]);
            }
            else if(Countries.Country=="MALAYSIA"){
                CountryN.setText("MALAYSIA");
                Flag.setImageResource(R.drawable.malaysia);
                Capital.setText("Capital: "+ cap[5]);
                CDescription.setText(desc[5]);
                TSpot.setImageResource(R.drawable.malaysia_tspot);
                Details.setText(tspot[5]);
            }
            else if(Countries.Country=="PHILIPPINES"){
                CountryN.setText("PHILIPPINES");
                Flag.setImageResource(R.drawable.philippines);
                Capital.setText("Capital: Manila, Philippines");
                CDescription.setText(desc[6]);
                TSpot.setImageResource(R.drawable.philippines_tspot);
                Details.setText(tspot[6]);
            }
            else if(Countries.Country=="JAPAN"){
                CountryN.setText("JAPAN");
                Flag.setImageResource(R.drawable.japan);
                Capital.setText("Capital: "+ cap[6]);
                CDescription.setText(desc[7]);
                TSpot.setImageResource(R.drawable.japan_tspot);
                Details.setText(tspot[7]);
            }
            else if(Countries.Country=="THAILAND"){
                CountryN.setText("THAILAND");
                Flag.setImageResource(R.drawable.thailand);
                Capital.setText("Capital: "+ cap[7]);
                CDescription.setText(desc[8]);
                TSpot.setImageResource(R.drawable.thailand_tspot);
                Details.setText(tspot[8]);
            }
            else if(Countries.Country=="SOUTHKOREA"){
                CountryN.setText("SOUTH KOREA");
                Flag.setImageResource(R.drawable.southkorea);
                Capital.setText("Capital: "+ cap[8]);
                CDescription.setText(desc[9]);
                TSpot.setImageResource(R.drawable.southkorea_tspot);
                Details.setText(tspot[9]);
            }
        }
        else if(continent=="EUROPE"){
            if(Countries.Country=="RUSSIA"){
                CountryN.setText("RUSSIA");
                Flag.setImageResource(R.drawable.russia);
                Capital.setText("Capital: "+ cap[0]);
                CDescription.setText(desc[0]);
                TSpot.setImageResource(R.drawable.russia_tspot);
                Details.setText(tspot[0]);
            }
            else if(Countries.Country=="GERMANY"){
                CountryN.setText("GERMANY");
                Flag.setImageResource(R.drawable.germany);
                Capital.setText("Capital: "+ cap[1]);
                CDescription.setText(desc[1]);
                TSpot.setImageResource(R.drawable.germany_tspot);
                Details.setText(tspot[1]);
            }
            else if(Countries.Country=="TURKEY"){
                CountryN.setText("TURKEY");
                Flag.setImageResource(R.drawable.turkey);
                Capital.setText("Capital: "+ cap[2]);
                CDescription.setText(desc[2]);
                TSpot.setImageResource(R.drawable.turkey_tspot);
                Details.setText(tspot[2]);
            }
            else if(Countries.Country=="UK"){
                CountryN.setText("UNITED KINGDOM");
                Flag.setImageResource(R.drawable.uk);
                Capital.setText("Capital: "+ cap[3]);
                CDescription.setText(desc[3]);
                TSpot.setImageResource(R.drawable.uk_tspot);
                Details.setText(tspot[3]);
            }
            else if(Countries.Country=="FRANCE"){
                CountryN.setText("FRANCE");
                Flag.setImageResource(R.drawable.france);
                Capital.setText("Capital: "+ cap[4]);
                CDescription.setText(desc[4]);
                TSpot.setImageResource(R.drawable.france_tspot);
                Details.setText(tspot[4]);
            }
            else if(Countries.Country=="ITALY"){
                CountryN.setText("ITALY");
                Flag.setImageResource(R.drawable.italy);
                Capital.setText("Capital: "+ cap[5]);
                CDescription.setText(desc[5]);
                TSpot.setImageResource(R.drawable.italy_tspot);
                Details.setText(tspot[5]);
            }
            else if(Countries.Country=="SPAIN"){
                CountryN.setText("SPAIN");
                Flag.setImageResource(R.drawable.spain);
                Capital.setText("Capital: "+ cap[6]);
                CDescription.setText(desc[6]);
                TSpot.setImageResource(R.drawable.spain_tspot);
                Details.setText(tspot[6]);
            }
            else if(Countries.Country=="UKRAINE"){
                CountryN.setText("UKRAINE");
                Flag.setImageResource(R.drawable.ukraine);
                Capital.setText("Capital: "+ cap[7]);
                CDescription.setText(desc[7]);
                TSpot.setImageResource(R.drawable.ukraine_tspot);
                Details.setText(tspot[7]);
            }
            else if(Countries.Country=="POLAND"){
                CountryN.setText("POLAND");
                Flag.setImageResource(R.drawable.poland);
                Capital.setText("Capital: "+ cap[8]);
                CDescription.setText(desc[8]);
                TSpot.setImageResource(R.drawable.poland_tspot);
                Details.setText(tspot[8]);
            }
            else if(Countries.Country=="ROMANIA"){
                CountryN.setText("ROMANIA");
                Flag.setImageResource(R.drawable.romania);
                Capital.setText("Capital: "+ cap[9]);
                CDescription.setText(desc[9]);
                TSpot.setImageResource(R.drawable.romania_tspot);
                Details.setText(tspot[9]);
            }
        }
        else if(continent=="NORTHA"){
            if(Countries.Country=="USA"){
                CountryN.setText("UNITED STATES OF AMERICA");
                Flag.setImageResource(R.drawable.usa);
                Capital.setText("Capital: "+ cap[0]);
                CDescription.setText(desc[0]);
                TSpot.setImageResource(R.drawable.usa_tspot);
                Details.setText(tspot[0]);
            }
            else if(Countries.Country=="CANADA"){
                CountryN.setText("CANADA");
                Flag.setImageResource(R.drawable.canada);
                Capital.setText("Capital: "+ cap[1]);
                CDescription.setText(desc[1]);
                TSpot.setImageResource(R.drawable.canada_tspot);
                Details.setText(tspot[1]);
            }
            else if(Countries.Country=="MEXICO"){
                CountryN.setText("MEXICO");
                Flag.setImageResource(R.drawable.mexico);
                Capital.setText("Capital: "+ cap[2]);
                CDescription.setText(desc[2]);
                TSpot.setImageResource(R.drawable.mexico_tspot);
                Details.setText(tspot[2]);
            }
            else if(Countries.Country=="GUATEMALA"){
                CountryN.setText("GUATEMALA");
                Flag.setImageResource(R.drawable.guatemala);
                Capital.setText("Capital: "+ cap[3]);
                CDescription.setText(desc[3]);
                TSpot.setImageResource(R.drawable.guatemala_tspot);
                Details.setText(tspot[3]);
            }
            else if(Countries.Country=="CUBA"){
                CountryN.setText("CUBA");
                Flag.setImageResource(R.drawable.cuba);
                Capital.setText("Capital: "+ cap[4]);
                CDescription.setText(desc[4]);
                TSpot.setImageResource(R.drawable.cuba_tspot);
                Details.setText(tspot[4]);
            }
            else if(Countries.Country=="HAITI"){
                CountryN.setText("HAITI");
                Flag.setImageResource(R.drawable.haiti);
                Capital.setText("Capital: "+ cap[5]);
                CDescription.setText(desc[5]);
                TSpot.setImageResource(R.drawable.haiti_tspot);
                Details.setText(tspot[5]);
            }
            else if(Countries.Country=="DR"){
                CountryN.setText("DOMINICAN REPUBLIC");
                Flag.setImageResource(R.drawable.dr);
                Capital.setText("Capital: "+ cap[6]);
                CDescription.setText(desc[6]);
                TSpot.setImageResource(R.drawable.dr_tspot);
                Details.setText(tspot[6]);
            }
            else if(Countries.Country=="HONDURAS"){
                CountryN.setText("HONDURAS");
                Flag.setImageResource(R.drawable.honduras);
                Capital.setText("Capital: "+ cap[7]);
                CDescription.setText(desc[7]);
                TSpot.setImageResource(R.drawable.honduras_tspot);
                Details.setText(tspot[7]);
            }
            else if(Countries.Country=="ES"){
                CountryN.setText("EL SALVADOR");
                Flag.setImageResource(R.drawable.es);
                Capital.setText("Capital: "+ cap[8]);
                CDescription.setText(desc[8]);
                TSpot.setImageResource(R.drawable.es_tspot);
                Details.setText(tspot[8]);
            }
            else if(Countries.Country=="NICARAGUA"){
                CountryN.setText("NICARAGUA");
                Flag.setImageResource(R.drawable.nicaragua);
                Capital.setText("Capital: "+ cap[9]);
                CDescription.setText(desc[9]);
                TSpot.setImageResource(R.drawable.nicaragua_tspot);
                Details.setText(tspot[9]);
            }
        }
        else if(continent=="AFRICA"){
            if(Countries.Country=="NIGERIA"){
                CountryN.setText("NIGERIA");
                Flag.setImageResource(R.drawable.nigeria);
                Capital.setText("Capital: "+ cap[0]);
                CDescription.setText(desc[0]);
                TSpot.setImageResource(R.drawable.nigeria_tspot);
                Details.setText(tspot[0]);
            }
            else if(Countries.Country=="ETHIOPIA"){
                CountryN.setText("ETHIOPIA");
                Flag.setImageResource(R.drawable.ethiopia);
                Capital.setText("Capital: "+ cap[1]);
                CDescription.setText(desc[1]);
                TSpot.setImageResource(R.drawable.ethiopia_tspot);
                Details.setText(tspot[1]);
            }
            else if(Countries.Country=="EGYPT"){
                CountryN.setText("EGYPT");
                Flag.setImageResource(R.drawable.egypt);
                Capital.setText("Capital: "+ cap[2]);
                CDescription.setText(desc[2]);
                TSpot.setImageResource(R.drawable.egypt_tspot);
                Details.setText(tspot[2]);
            }
            else if(Countries.Country=="DRC"){
                CountryN.setText("DEMOCRATIC REPUBLIC OF CONGO");
                Flag.setImageResource(R.drawable.drc);
                Capital.setText("Capital: "+ cap[3]);
                CDescription.setText(desc[3]);
                TSpot.setImageResource(R.drawable.drc_tspot);
                Details.setText(tspot[3]);
            }
            else if(Countries.Country=="SOUTHAFRICA"){
                CountryN.setText("SOUTH AFRICA");
                Flag.setImageResource(R.drawable.southafrica);
                Capital.setText("Capital: "+ cap[4]);
                CDescription.setText(desc[4]);
                TSpot.setImageResource(R.drawable.southafrica_tspot);
                Details.setText(tspot[4]);
            }
            else if(Countries.Country=="TANZANIA"){
                CountryN.setText("TANZANIA");
                Flag.setImageResource(R.drawable.tanzania);
                Capital.setText("Capital: "+ cap[5]);
                CDescription.setText(desc[5]);
                TSpot.setImageResource(R.drawable.tanzania_tspot);
                Details.setText(tspot[5]);
            }
            else if(Countries.Country=="KENYA"){
                CountryN.setText("KENYA");
                Flag.setImageResource(R.drawable.kenya);
                Capital.setText("Capital: "+ cap[6]);
                CDescription.setText(desc[6]);
                TSpot.setImageResource(R.drawable.kenya_tspot);
                Details.setText(tspot[6]);
            }
            else if(Countries.Country=="UGANDA"){
                CountryN.setText("UGANDA");
                Flag.setImageResource(R.drawable.uganda);
                Capital.setText("Capital: "+ cap[7]);
                CDescription.setText(desc[7]);
                TSpot.setImageResource(R.drawable.uganda_tspot);
                Details.setText(tspot[7]);
            }
            else if(Countries.Country=="ALGERIA"){
                CountryN.setText("ALGERIA");
                Flag.setImageResource(R.drawable.algeria);
                Capital.setText("Capital: "+ cap[8]);
                CDescription.setText(desc[8]);
                TSpot.setImageResource(R.drawable.algeria_tspot);
                Details.setText(tspot[8]);
            }
            else if(Countries.Country=="SUDAN"){
                CountryN.setText("SUDAN");
                Flag.setImageResource(R.drawable.sudan);
                Capital.setText("Capital: "+ cap[9]);
                CDescription.setText(desc[9]);
                TSpot.setImageResource(R.drawable.sudan_tspot);
                Details.setText(tspot[9]);
            }
        }
        else if(continent=="SOUTHA"){
            if(Countries.Country=="ARGENTINA"){
                CountryN.setText("ARGENTINA");
                Flag.setImageResource(R.drawable.argentina);
                Capital.setText("Capital: "+ cap[0]);
                CDescription.setText(desc[0]);
                TSpot.setImageResource(R.drawable.argentina_tspot);
                Details.setText(tspot[0]);
            }
            else if(Countries.Country=="BOLIVIA"){
                CountryN.setText("BOLIVIA");
                Flag.setImageResource(R.drawable.bolivia);
                Capital.setText("Capital: "+ cap[1]);
                CDescription.setText(desc[1]);
                TSpot.setImageResource(R.drawable.bolivia_tspot);
                Details.setText(tspot[1]);
            }
            else if(Countries.Country=="BRAZIL"){
                CountryN.setText("BRAZIL");
                Flag.setImageResource(R.drawable.brazil);
                Capital.setText("Capital: "+ cap[2]);
                CDescription.setText(desc[2]);
                TSpot.setImageResource(R.drawable.brazil_tspot);
                Details.setText(tspot[2]);
            }
            else if(Countries.Country=="CHILE"){
                CountryN.setText("CHILE");
                Flag.setImageResource(R.drawable.chile);
                Capital.setText("Capital: "+ cap[3]);
                CDescription.setText(desc[3]);
                TSpot.setImageResource(R.drawable.chile_tspot);
                Details.setText(tspot[3]);
            }
            else if(Countries.Country=="COLOMBIA"){
                CountryN.setText("COLOMBIA");
                Flag.setImageResource(R.drawable.colombia);
                Capital.setText("Capital: "+ cap[4]);
                CDescription.setText(desc[4]);
                TSpot.setImageResource(R.drawable.colombia_tspot);
                Details.setText(tspot[4]);
            }
            else if(Countries.Country=="ECUADOR"){
                CountryN.setText("ECUADOR");
                Flag.setImageResource(R.drawable.ecuador);
                Capital.setText("Capital: "+ cap[5]);
                CDescription.setText(desc[5]);
                TSpot.setImageResource(R.drawable.ecuador_tspot);
                Details.setText(tspot[5]);
            }
            else if(Countries.Country=="GUYANA"){
                CountryN.setText("GUYANA");
                Flag.setImageResource(R.drawable.guyana);
                Capital.setText("Capital: "+ cap[6]);
                CDescription.setText(desc[6]);
                TSpot.setImageResource(R.drawable.guyana_tspot);
                Details.setText(tspot[6]);
            }
            else if(Countries.Country=="PARAGUAY"){
                CountryN.setText("PARAGUAY");
                Flag.setImageResource(R.drawable.paraguay);
                Capital.setText("Capital: "+ cap[7]);
                CDescription.setText(desc[7]);
                TSpot.setImageResource(R.drawable.paraguay_tspot);
                Details.setText(tspot[7]);
            }
            else if(Countries.Country=="PERU"){
                CountryN.setText("PERU");
                Flag.setImageResource(R.drawable.peru);
                Capital.setText("Capital: "+ cap[8]);
                CDescription.setText(desc[8]);
                TSpot.setImageResource(R.drawable.peru_tspot);
                Details.setText(tspot[8]);
            }
            else if(Countries.Country=="SURINAME"){
                CountryN.setText("SURINAME");
                Flag.setImageResource(R.drawable.suriname);
                Capital.setText("Capital: "+ cap[9]);
                CDescription.setText(desc[9]);
                TSpot.setImageResource(R.drawable.suriname_tspot);
                Details.setText(tspot[9]);
            }
        }
        else if(continent=="AUSTRALIA"){
            if(Countries.Country=="AUSTRALIA"){
                CountryN.setText("AUSTRALIA");
                Flag.setImageResource(R.drawable.australia);
                Capital.setText("Capital: "+ cap[0]);
                CDescription.setText(desc[0]);
                TSpot.setImageResource(R.drawable.australia_tspot);
                Details.setText(tspot[0]);
            }
            else if(Countries.Country=="FIJI"){
                CountryN.setText("FIJI");
                Flag.setImageResource(R.drawable.fiji);
                Capital.setText("Capital: "+ cap[1]);
                CDescription.setText(desc[1]);
                TSpot.setImageResource(R.drawable.fiji_tspot);
                Details.setText(tspot[1]);
            }
            else if(Countries.Country=="KIRIBATI"){
                CountryN.setText("KIRIBATI");
                Flag.setImageResource(R.drawable.kiribati);
                Capital.setText("Capital: "+ cap[2]);
                CDescription.setText(desc[2]);
                TSpot.setImageResource(R.drawable.kiribati_tspot);
                Details.setText(tspot[2]);
            }
            else if(Countries.Country=="MI"){
                CountryN.setText("MARSHALL ISLANDS");
                Flag.setImageResource(R.drawable.mi);
                Capital.setText("Capital: "+ cap[3]);
                CDescription.setText(desc[3]);
                TSpot.setImageResource(R.drawable.mi_tspot);
                Details.setText(tspot[3]);
            }
            else if(Countries.Country=="MICRONESIA"){
                CountryN.setText("MICRONESIA");
                Flag.setImageResource(R.drawable.micronesia);
                Capital.setText("Capital: "+ cap[4]);
                CDescription.setText(desc[4]);
                TSpot.setImageResource(R.drawable.micronesia_tspot);
                Details.setText(tspot[4]);
            }
            else if(Countries.Country=="NAURU"){
                CountryN.setText("NAURU");
                Flag.setImageResource(R.drawable.nauru);
                Capital.setText("Capital: "+ cap[5]);
                CDescription.setText(desc[5]);
                TSpot.setImageResource(R.drawable.nauru_tspot);
                Details.setText(tspot[5]);
            }
            else if(Countries.Country=="NZ"){
                CountryN.setText("NEW ZEALAND");
                Flag.setImageResource(R.drawable.nz);
                Capital.setText("Capital: "+ cap[6]);
                CDescription.setText(desc[6]);
                TSpot.setImageResource(R.drawable.nz_tspot);
                Details.setText(tspot[6]);
            }
            else if(Countries.Country=="PALAU"){
                CountryN.setText("PALAU");
                Flag.setImageResource(R.drawable.palau);
                Capital.setText("Capital: "+ cap[7]);
                CDescription.setText(desc[7]);
                TSpot.setImageResource(R.drawable.palau_tspot);
                Details.setText(tspot[7]);
            }
            else if(Countries.Country=="PNG"){
                CountryN.setText("PAPAU NEW GUINEA");
                Flag.setImageResource(R.drawable.png);
                Capital.setText("Capital: "+ cap[8]);
                CDescription.setText(desc[8]);
                TSpot.setImageResource(R.drawable.png_tspot);
                Details.setText(tspot[8]);
            }
            else if(Countries.Country=="SAMOA") {
                CountryN.setText("SAMOA");
                Flag.setImageResource(R.drawable.samoa);
                Capital.setText("Capital: "+ cap[9]);
                CDescription.setText(desc[9]);
                TSpot.setImageResource(R.drawable.samoa_tspot);
                Details.setText(tspot[9]);
            }
        }
    }
    public void back(View v){
        intent = new Intent(Country.this, Countries.class);
        startActivity(intent);
    }
}
