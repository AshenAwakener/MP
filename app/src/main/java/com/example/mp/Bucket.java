package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class Bucket extends AppCompatActivity {
    SQLiteDatabase database;
    String name;
    Cursor c, cc;
    String[][] Listing;
    ArrayList<String> List;
    int ctr = 0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket);
        database = openOrCreateDatabase("USER", Context.MODE_PRIVATE, null);
        c = database.rawQuery("SELECT DISTINCT(LISTING) FROM BUCKETLIST;",null);
        cc = database.rawQuery("SELECT DISTINCT(LISTING) FROM BUCKET_DATA WHERE USER IN ('"+MainActivity.user+"')", null);
        set1();
        set2();
    }

    public void onCheck(View v) {
        CheckBox chk = (CheckBox) findViewById(v.getId());
        name = chk.getText().toString().trim();
        if(chk.isChecked()){
            ctr++;
            database.execSQL("INSERT INTO BUCKET_DATA(LISTING,USER)VALUES('"+name+"','"+MainActivity.user+"');");
        } else{
            ctr--;
            database.execSQL("DELETE FROM BUCKET_DATA WHERE LISTING IN ('"+name+"') AND USER IN ('"+MainActivity.user+"');");
        }
    }
    public void set1(){
        Listing = new String[6][10];
        List = new ArrayList<String>();
        if (c.getCount() == 0) {
            Toast.makeText(this, "Database is empty...", Toast.LENGTH_SHORT).show();
            return;
        } else {
            StringBuffer buff = new StringBuffer();
            for (int i=0;i<6;i++) {
                for (int j=0;j<10;j++) {
                    c.moveToNext();
                    buff.append(c.getString(0));
                    Listing[i][j] = buff.toString();
                    buff = new StringBuffer();
                }
            }
        } if(cc.getCount()==0) {
            return;
        } else {
            StringBuffer bufff = new StringBuffer();
            while(cc.moveToNext()){
                bufff.append(cc.getString(0));
                List.add(bufff.toString());
                bufff = new StringBuffer();
            }
        }
        ctr++;
        c.close();
    }
    public void set2(){
        CheckBox Asia1 = (CheckBox) findViewById(R.id.Asia1); Asia1.setText(Listing[0][0]); if(List.contains(Asia1.getText().toString())) Asia1.setChecked(true);
        CheckBox Asia2 = (CheckBox) findViewById(R.id.Asia2); Asia2.setText(Listing[0][1]); if(List.contains(Asia2.getText().toString())) Asia2.setChecked(true);
        CheckBox Asia3 = (CheckBox) findViewById(R.id.Asia3); Asia3.setText(Listing[0][2]); if(List.contains(Asia3.getText().toString())) Asia3.setChecked(true);
        CheckBox Asia4 = (CheckBox) findViewById(R.id.Asia4); Asia4.setText(Listing[0][3]); if(List.contains(Asia4.getText().toString())) Asia4.setChecked(true);
        CheckBox Asia5 = (CheckBox) findViewById(R.id.Asia5); Asia5.setText(Listing[0][4]); if(List.contains(Asia5.getText().toString())) Asia5.setChecked(true);
        CheckBox Asia6 = (CheckBox) findViewById(R.id.Asia6); Asia6.setText(Listing[0][5]); if(List.contains(Asia6.getText().toString())) Asia6.setChecked(true);
        CheckBox Asia7 = (CheckBox) findViewById(R.id.Asia7); Asia7.setText(Listing[0][6]); if(List.contains(Asia7.getText().toString())) Asia7.setChecked(true);
        CheckBox Asia8 = (CheckBox) findViewById(R.id.Asia8); Asia8.setText(Listing[0][7]); if(List.contains(Asia8.getText().toString())) Asia8.setChecked(true);
        CheckBox Asia9 = (CheckBox) findViewById(R.id.Asia9); Asia9.setText(Listing[0][8]); if(List.contains(Asia9.getText().toString())) Asia9.setChecked(true);
        CheckBox Asia10 = (CheckBox) findViewById(R.id.Asia10); Asia10.setText(Listing[0][9]); if(List.contains(Asia10.getText().toString())) Asia10.setChecked(true);
        // NEXT
        CheckBox Europe1 = (CheckBox) findViewById(R.id.Europe1); Europe1.setText(Listing[1][0]); if(List.contains(Europe1.getText().toString())) Europe1.setChecked(true);
        CheckBox Europe2 = (CheckBox) findViewById(R.id.Europe2); Europe2.setText(Listing[1][1]); if(List.contains(Europe2.getText().toString())) Europe2.setChecked(true);
        CheckBox Europe3 = (CheckBox) findViewById(R.id.Europe3); Europe3.setText(Listing[1][2]); if(List.contains(Europe3.getText().toString())) Europe3.setChecked(true);
        CheckBox Europe4 = (CheckBox) findViewById(R.id.Europe4); Europe4.setText(Listing[1][3]); if(List.contains(Europe4.getText().toString())) Europe4.setChecked(true);
        CheckBox Europe5 = (CheckBox) findViewById(R.id.Europe5); Europe5.setText(Listing[1][4]); if(List.contains(Europe5.getText().toString())) Europe5.setChecked(true);
        CheckBox Europe6 = (CheckBox) findViewById(R.id.Europe6); Europe6.setText(Listing[1][5]); if(List.contains(Europe6.getText().toString())) Europe6.setChecked(true);
        CheckBox Europe7 = (CheckBox) findViewById(R.id.Europe7); Europe7.setText(Listing[1][6]); if(List.contains(Europe7.getText().toString())) Europe7.setChecked(true);
        CheckBox Europe8 = (CheckBox) findViewById(R.id.Europe8); Europe8.setText(Listing[1][7]); if(List.contains(Europe8.getText().toString())) Europe8.setChecked(true);
        CheckBox Europe9 = (CheckBox) findViewById(R.id.Europe9); Europe9.setText(Listing[1][8]); if(List.contains(Europe9.getText().toString())) Europe9.setChecked(true);
        CheckBox Europe10 = (CheckBox) findViewById(R.id.Europe10); Europe10.setText(Listing[1][9]); if(List.contains(Europe10.getText().toString())) Europe10.setChecked(true);
        // NEXT
        CheckBox North1 = (CheckBox) findViewById(R.id.North1); North1.setText(Listing[2][0]); if(List.contains(North1.getText().toString())) North1.setChecked(true);
        CheckBox North2 = (CheckBox) findViewById(R.id.North2); North2.setText(Listing[2][1]); if(List.contains(North2.getText().toString())) North2.setChecked(true);
        CheckBox North3 = (CheckBox) findViewById(R.id.North3); North3.setText(Listing[2][2]); if(List.contains(North3.getText().toString())) North3.setChecked(true);
        CheckBox North4 = (CheckBox) findViewById(R.id.North4); North4.setText(Listing[2][3]); if(List.contains(North4.getText().toString())) North4.setChecked(true);
        CheckBox North5 = (CheckBox) findViewById(R.id.North5); North5.setText(Listing[2][4]); if(List.contains(North5.getText().toString())) North5.setChecked(true);
        CheckBox North6 = (CheckBox) findViewById(R.id.North6); North6.setText(Listing[2][5]); if(List.contains(North6.getText().toString())) North6.setChecked(true);
        CheckBox North7 = (CheckBox) findViewById(R.id.North7); North7.setText(Listing[2][6]); if(List.contains(North7.getText().toString())) North7.setChecked(true);
        CheckBox North8 = (CheckBox) findViewById(R.id.North8); North8.setText(Listing[2][7]); if(List.contains(North8.getText().toString())) North8.setChecked(true);
        CheckBox North9 = (CheckBox) findViewById(R.id.North9); North9.setText(Listing[2][8]); if(List.contains(North9.getText().toString())) North9.setChecked(true);
        CheckBox North10 = (CheckBox) findViewById(R.id.North10); North10.setText(Listing[2][9]); if(List.contains(North10.getText().toString())) North10.setChecked(true);
        // NEXT
        CheckBox Africa1 = (CheckBox) findViewById(R.id.Africa1); Africa1.setText(Listing[3][0]); if(List.contains(Africa1.getText().toString())) Africa1.setChecked(true);
        CheckBox Africa2 = (CheckBox) findViewById(R.id.Africa2); Africa2.setText(Listing[3][1]); if(List.contains(Africa2.getText().toString())) Africa2.setChecked(true);
        CheckBox Africa3 = (CheckBox) findViewById(R.id.Africa3); Africa3.setText(Listing[3][2]); if(List.contains(Africa3.getText().toString())) Africa3.setChecked(true);
        CheckBox Africa4 = (CheckBox) findViewById(R.id.Africa4); Africa4.setText(Listing[3][3]); if(List.contains(Africa4.getText().toString())) Africa4.setChecked(true);
        CheckBox Africa5 = (CheckBox) findViewById(R.id.Africa5); Africa5.setText(Listing[3][4]); if(List.contains(Africa5.getText().toString())) Africa5.setChecked(true);
        CheckBox Africa6 = (CheckBox) findViewById(R.id.Africa6); Africa6.setText(Listing[3][5]); if(List.contains(Africa6.getText().toString())) Africa6.setChecked(true);
        CheckBox Africa7 = (CheckBox) findViewById(R.id.Africa7); Africa7.setText(Listing[3][6]); if(List.contains(Africa7.getText().toString())) Africa7.setChecked(true);
        CheckBox Africa8 = (CheckBox) findViewById(R.id.Africa8); Africa8.setText(Listing[3][7]); if(List.contains(Africa8.getText().toString())) Africa8.setChecked(true);
        CheckBox Africa9 = (CheckBox) findViewById(R.id.Africa9); Africa9.setText(Listing[3][8]); if(List.contains(Africa9.getText().toString())) Africa9.setChecked(true);
        CheckBox Africa10 = (CheckBox) findViewById(R.id.Africa10); Africa10.setText(Listing[3][9]); if(List.contains(Africa10.getText().toString())) Africa10.setChecked(true);
        // NEXT
        CheckBox South1 = (CheckBox) findViewById(R.id.South1); South1.setText(Listing[4][0]); if(List.contains(South1.getText().toString())) South1.setChecked(true);
        CheckBox South2 = (CheckBox) findViewById(R.id.South2); South2.setText(Listing[4][1]); if(List.contains(South2.getText().toString())) South2.setChecked(true);
        CheckBox South3 = (CheckBox) findViewById(R.id.South3); South3.setText(Listing[4][2]); if(List.contains(South3.getText().toString())) South3.setChecked(true);
        CheckBox South4 = (CheckBox) findViewById(R.id.South4); South4.setText(Listing[4][3]); if(List.contains(South4.getText().toString())) South4.setChecked(true);
        CheckBox South5 = (CheckBox) findViewById(R.id.South5); South5.setText(Listing[4][4]); if(List.contains(South5.getText().toString())) South5.setChecked(true);
        CheckBox South6 = (CheckBox) findViewById(R.id.South6); South6.setText(Listing[4][5]); if(List.contains(South6.getText().toString())) South6.setChecked(true);
        CheckBox South7 = (CheckBox) findViewById(R.id.South7); South7.setText(Listing[4][6]); if(List.contains(South7.getText().toString())) South7.setChecked(true);
        CheckBox South8 = (CheckBox) findViewById(R.id.South8); South8.setText(Listing[4][7]); if(List.contains(South8.getText().toString())) South8.setChecked(true);
        CheckBox South9 = (CheckBox) findViewById(R.id.South9); South9.setText(Listing[4][8]); if(List.contains(South9.getText().toString())) South9.setChecked(true);
        CheckBox South10 = (CheckBox) findViewById(R.id.South10); South10.setText(Listing[4][9]); if(List.contains(South10.getText().toString())) South10.setChecked(true);
        // NEXT
        CheckBox Aus1 = (CheckBox) findViewById(R.id.Aus1); Aus1.setText(Listing[5][0]); if(List.contains(Aus1.getText().toString())) Aus1.setChecked(true);
        CheckBox Aus2 = (CheckBox) findViewById(R.id.Aus2); Aus2.setText(Listing[5][1]); if(List.contains(Aus2.getText().toString())) Aus2.setChecked(true);
        CheckBox Aus3 = (CheckBox) findViewById(R.id.Aus3); Aus3.setText(Listing[5][2]); if(List.contains(Aus3.getText().toString())) Aus3.setChecked(true);
        CheckBox Aus4 = (CheckBox) findViewById(R.id.Aus4); Aus4.setText(Listing[5][3]); if(List.contains(Aus4.getText().toString())) Aus4.setChecked(true);
        CheckBox Aus5 = (CheckBox) findViewById(R.id.Aus5); Aus5.setText(Listing[5][4]); if(List.contains(Aus5.getText().toString())) Aus5.setChecked(true);
        CheckBox Aus6 = (CheckBox) findViewById(R.id.Aus6); Aus6.setText(Listing[5][5]); if(List.contains(Aus6.getText().toString())) Aus6.setChecked(true);
        CheckBox Aus7 = (CheckBox) findViewById(R.id.Aus7); Aus7.setText(Listing[5][6]); if(List.contains(Aus7.getText().toString())) Aus7.setChecked(true);
        CheckBox Aus8 = (CheckBox) findViewById(R.id.Aus8); Aus8.setText(Listing[5][7]); if(List.contains(Aus8.getText().toString())) Aus8.setChecked(true);
        CheckBox Aus9 = (CheckBox) findViewById(R.id.Aus9); Aus9.setText(Listing[5][8]); if(List.contains(Aus9.getText().toString())) Aus9.setChecked(true);
        CheckBox Aus10 = (CheckBox) findViewById(R.id.Aus10); Aus10.setText(Listing[5][9]); if(List.contains(Aus10.getText().toString())) Aus10.setChecked(true);
    }
    public void back(View v){
        intent = new Intent(Bucket.this, Menu.class);
        startActivity(intent);
    }
    public void changeuser(View v){
        intent = new Intent(Bucket.this, MainActivity.class);
        startActivity(intent);
    }
}
