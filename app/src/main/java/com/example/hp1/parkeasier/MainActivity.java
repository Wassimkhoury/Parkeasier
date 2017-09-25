package com.example.hp1.parkeasier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener{
    Button BT1;
    Button BT3;
    Button BT4;
    Button BT5;
    Button BT6;
    Button BT7;
    Button BT8;
    Button BT9;
    Button BT10;
    Button BT11;
    Button BT12;
    Button BT13;
    Button BT14;
    Button BT15;
    Button BT16;

    Spinner spCoffee1;
    Spinner spCoffee2;
    Spinner spCoffee3;

    Adapter adapter3;
    Adapter adapter2;
    Adapter adapter1;
    String[] spList ={"None","disablity","pregnant"};
    String[] spList2 ={"None","Gym","shopping",};
    String[] spList3 ={"floor1","floor2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spCoffee1=(Spinner) findViewById(R.id.spCoffee1);
        spCoffee2=(Spinner) findViewById(R.id.spCoffee2);
        spCoffee3=(Spinner) findViewById(R.id.spCoffee3);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spList);
        spCoffee1.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spList);
        spCoffee2.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spList);
        spCoffee3.setAdapter(adapter3);



    }

    @Override
    public void onClick(View v) {
        if(BT1==v){
            BT1.setBackgroundColor();
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
