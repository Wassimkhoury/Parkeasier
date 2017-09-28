package com.example.hp1.parkeasier;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button[] btn = new Button[16];
    int[] ids = {R.id.BT1, R.id.BT2, R.id.BT3, R.id.BT4, R.id.BT5, R.id.BT6, R.id.BT7, R.id.BT8, R.id.BT9, R.id.BT10, R.id.BT11, R.id.BT12, R.id.BT13, R.id.BT14, R.id.BT15, R.id.BT16};

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

        for(int i=0;i<btn.length;i++){
            btn[i] = (Button) findViewById(ids[i]);
            btn[i].setOnClickListener(this);
        }

        spCoffee1=(Spinner) findViewById(R.id.spCoffee1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spList);
        spCoffee1.setAdapter(adapter1);
        spCoffee1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        spCoffee2=(Spinner) findViewById(R.id.spCoffee2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spList2);
        spCoffee2.setAdapter(adapter2);
        spCoffee2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        spCoffee3=(Spinner) findViewById(R.id.spCoffee3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spList3);
        spCoffee3.setAdapter(adapter3);
        spCoffee3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        for(int i=0;i<btn.length;i++){
            btn[i].setBackgroundColor(Color.RED);
        }
    }
}
