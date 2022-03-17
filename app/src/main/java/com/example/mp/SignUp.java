package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText User,Pass,First,Last,Age,Birth;
    SQLiteDatabase database;
    String user,pass,first,last,age,birth;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        database = openOrCreateDatabase("USER", Context.MODE_PRIVATE, null);
        database.execSQL("CREATE TABLE IF NOT EXISTS USER_INFO(USER_ID INTEGER PRIMARY KEY AUTOINCREMENT,USER VARCHAR(100) NOT NULL,PASS VARCHAR(100) NOT NULL,FIRST VARCHAR(100),LAST VARCHAR(100),AGE INTEGER,BIRTH DATE);");
        User = (EditText) findViewById(R.id.User);
        Pass = (EditText) findViewById(R.id.Pass);
        First = (EditText) findViewById(R.id.First);
        Last = (EditText) findViewById(R.id.Last);
        Age = (EditText) findViewById(R.id.Age);
        Birth = (EditText) findViewById(R.id.Birth);
        intent = new Intent(SignUp.this, MainActivity.class);
    }
    public void signup(View v){
        user = User.getText().toString().trim();
        pass = Pass.getText().toString().trim();
        first = First.getText().toString().trim();
        last = Last.getText().toString().trim();
        age = Age.getText().toString().trim();
        birth = Birth.getText().toString().trim();
        if(user.equals("")||pass.equals("")||first.equals("")||last.equals("")||age.equals("")||birth.equals("")){
            Toast.makeText(this, "Please fill on the details...", Toast.LENGTH_SHORT).show();
        } else {
            database.execSQL("INSERT INTO USER_INFO(USER,PASS,FIRST,LAST,AGE,BIRTH)VALUES('" + user + "','" +pass+"','"+first+"','"+last+"','"+age+"','"+birth+"');");
            Toast.makeText(this, "User Created!", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }
    public void signin(View v){
        intent = new Intent(SignUp.this,MainActivity.class);
        startActivity(intent);
    }
}
