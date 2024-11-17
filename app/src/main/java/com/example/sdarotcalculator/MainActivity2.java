package com.example.sdarotcalculator;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView tvFirstItem,tvMult,tvIndex,tvSum;
    ListView lv;

    boolean type;
    double firstNum,d,num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvFirstItem = findViewById(R.id.tvFirstItem);
        tvMult = findViewById(R.id.tvMult);
        tvIndex = findViewById(R.id.tvIndex);
        tvSum = findViewById(R.id.tvSum);
        lv = findViewById(R.id.lv);

        Intent get = getIntent();
        firstNum = get.getDoubleExtra("first", 1);
        d = get.getDoubleExtra("d", 1);
        type = get.getBooleanExtra("seriesChoice",false);
        ArrayAdapter<ListView> adp = new ArrayAdapter<ListView>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        if(type){
            for(int i =0;i<20 ;i++) {
                num = firstNum * (Math.pow(d, num - 1));

            }
        }
        else{

        }


    }
}