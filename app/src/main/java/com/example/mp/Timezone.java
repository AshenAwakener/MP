package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Timezone extends AppCompatActivity {
    EditText Time;
    TextView Asia, Europe, NorthA, Africa, SouthA, Australia;
    String temp = "";
    String[][] AsiaC;
    SQLiteDatabase database;
    Cursor c;
    int ctr=0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timezone);
        Time = (EditText) findViewById(R.id.Time);
        Asia = (TextView) findViewById(R.id.Asia);
        Europe = (TextView) findViewById(R.id.Europe);
        NorthA = (TextView) findViewById(R.id.NorthA);
        Africa = (TextView) findViewById(R.id.Africa);
        SouthA = (TextView) findViewById(R.id.SouthA);
        Australia = (TextView) findViewById(R.id.Australia);
        database = openOrCreateDatabase("USER", Context.MODE_PRIVATE, null);
        c = database.rawQuery("SELECT DISTINCT(COUNTRY_NAME) FROM COUNTRIES;",null);
    }
    public void Time_Convert(View v){
        if(ctr==0) {
            AsiaC = new String[6][10];
            if (c.getCount() == 0) {
                Toast.makeText(this, "Database is empty...", Toast.LENGTH_SHORT).show();
                return;
            } else {
                StringBuffer buff = new StringBuffer();
                for (int i=0;i<6;i++) {
                    for (int j=0;j<10;j++) {
                        c.moveToNext();
                        buff.append(c.getString(0));
                        AsiaC[i][j] = buff.toString();
                        buff = new StringBuffer();
                    }
                }
            }
            ctr++;
            c.close();
            database.close();
        }
        String[][] time = conv();
        String t = "";
        for(int i=0;i<6;i++) {
            for(int j=0;j<10;j++) {
                t = t + (AsiaC[i][j] + ": ----> " + time[i][j] + "\n");
            } switch(i){
                case 0: Asia.setText(t); t=""; break;
                case 1: Europe.setText(t); t=""; break;
                case 2: NorthA.setText(t); t=""; break;
                case 3: Africa.setText(t); t=""; break;
                case 4: SouthA.setText(t); t=""; break;
                case 5: Australia.setText(t); t=""; break;
            }
        }
    }
    public String[][] conv(){
        String[][] arr = new String[6][10];
        int ctr=0;
        int[][] T = {{0, -2, -1, -3, -2, 0, 1, -1, 1, -4}, //ASIA
                {-5, -7, -5, -8, -7, -7, -7, -6, -7, -6}, // EUROPE
                {-13, -13, -14, -14, -13, -13, -12, -14, -14, -14}, // NORTH AMERICA
                {-7, -5, -6, -7, -6, -5, -5, -5, -7, -6}, // AFRICA
                {-11, -12, -11, -11, -13, -13, -12, -11, -13, -11}, // SOUTH AMERICA
                {3, 4, 4, 4, 3, 4, 5, 1, 2, 6}}; // AUSTRALIA
        temp = Time.getText().toString();
        for(int i=0;i<6;i++) {
            for(int j=0;j<10;j++) {
                int h = Integer.parseInt(temp.substring(0, 2));
                int m = Integer.parseInt(temp.substring(3, 5));
                if(h>23 || m>59){
                    Toast.makeText(this, "Invalid time entered...", Toast.LENGTH_SHORT).show();
                    break;
                }
                ctr = Math.abs(T[i][j]);
                while (ctr != 0) {
                    if (T[i][j] < 0) {
                        ctr--;
                        h--;
                        if (h < 1) h = 23;
                    } else {
                        ctr--;
                        h++;
                        if (h > 23) h = 0;
                    }
                } if (h >= 0 && h <= 11) {
                    if (h >= 0 && h <= 9) {
                        if (m >= 0 && m <= 9) arr[i][j] = ("0" + h + ":0" + m + "AM");
                        else arr[i][j] = ("0" + h + ":" + m + "AM");
                    } else {
                        if (m >= 0 && m <= 9) arr[i][j] = (h + ":0" + m + "AM");
                        else arr[i][j] = (h + ":" + m + "AM");
                    }
                } else {
                    if (m >= 0 && m <= 9) arr[i][j] = (h + ":0" + m + "PM");
                    else arr[i][j] = (h + ":" + m + "PM");
                }
            }
        } return(arr);
    }
    public void back(View v){
        intent = new Intent(Timezone.this, Menu.class);
        startActivity(intent);
    }
}