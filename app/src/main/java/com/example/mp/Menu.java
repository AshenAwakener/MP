package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void timezone(View v){
        intent = new Intent(Menu.this, Timezone.class);
        startActivity(intent);
    }

    public void currency (View v){
        intent = new Intent(Menu.this, Currency.class);
        startActivity(intent);
    }

    public void world (View v){
        intent = new Intent(Menu.this, World.class);
        startActivity(intent);
    }

    public void bucket (View v){
        intent = new Intent(Menu.this, Bucket.class);
        startActivity(intent);
    }

    public void logout(View v){
        intent = new Intent(Menu.this, MainActivity.class);
        startActivity(intent);
    }


}