package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Currency extends AppCompatActivity {
    DecimalFormat f = new DecimalFormat("###,###,###,###,###.00");
    EditText Peso;
    TextView Asia, Europe, NorthA, Africa, SouthA, Australia;
    SQLiteDatabase database;
    Cursor c;
    String[][] Countries;
    int ctr=0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        Peso = (EditText) findViewById(R.id.Peso);
        Asia = (TextView) findViewById(R.id.Asia);
        Europe = (TextView) findViewById(R.id.Europe);
        NorthA = (TextView) findViewById(R.id.NorthA);
        Africa = (TextView) findViewById(R.id.Africa);
        SouthA = (TextView) findViewById(R.id.SouthA);
        Australia = (TextView) findViewById(R.id.Australia);
        database = openOrCreateDatabase("USER", Context.MODE_PRIVATE, null);
        c = database.rawQuery("SELECT CURRENCY_NAME FROM COUNTRIES;",null);
    }

    public void Money_Convert(View v) {
        double peso = Double.parseDouble(Peso.getText().toString());
        double[][] Convert = {{1.6671, 0.1366, 1.4363, 280.8101, 3.0332, 23.2206, 0.082843, 2.1069, 0.6178, 827.8609},               //ASIA
                {1.3026, 0.018, 0.1201, 0.015346, 0.018, 0.018, 0.018, 0.4909, 0.4909, 0.4909},                       //EUROPE
                {0.019662, 0.026314, 0.3827, 0.1505, 0.019633, 1.9167, 1.0550, 0.4839, 0.019662, 0.6733},            //NORTH AMERICA
                {7.18823, 0.640396, 0.309083, 33.4131, 0.301997, 45.5843, 2.03462, 73.1632, 2.36538, 1.09198},    //AFRICA
                {1.23121, 1.23121, 0.0893129, 16.0250, 68.1058, 0.0197606, 4.11260, 128.623, 0.0675668, 0.147349}, //SOUTH AMERICA
                {0.0298802, 0.0438472, 0.0298802, 0.0197613, 0.0197613, 0.0298802, 0.0314322, 0.0197613, 0.0675385, 0.0534328}};   //AUSTRALIA
        if(ctr==0) {
            Countries = new String[6][10];
            if (c.getCount() == 0) {
                Toast.makeText(this, "Database is empty...", Toast.LENGTH_SHORT).show();
                return;
            } else {
                StringBuffer buff = new StringBuffer();
                for(int i=0;i<6;i++) {
                    for(int j=0;j<10;j++) {
                        c.moveToNext();
                        buff.append(c.getString(0));
                        Countries[i][j] = buff.toString();
                        buff = new StringBuffer();
                    }
                }
            }
            ctr++;
            c.close();
            database.close();
        }
        String m = "";
        for (int i=0;i<6;i++) {
            for (int j=0;j<10;j++) {
                m = (m + Countries[i][j] +" ----> " + f.format(peso * Convert[i][j]) + "\n");
            } switch(i) {
                case 0: Asia.setText(m); m = ""; break;
                case 1: Europe.setText(m); m = ""; break;
                case 2: NorthA.setText(m); m = ""; break;
                case 3: Africa.setText(m); m = ""; break;
                case 4: SouthA.setText(m); m = ""; break;
                case 5: Australia.setText(m); m = ""; break;
            }
        }
    }
    public void back(View v){
        intent = new Intent(Currency.this, Menu.class);
        startActivity(intent);
    }
}