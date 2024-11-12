package com.example.sdarotcalculator;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView tvFirstItem,tvMult,tvIndex,tvSum;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvFirstItem = findViewById(R.id.tvFirstItem);
        tvMult = findViewById(R.id.tvMult);
        tvIndex = findViewById(R.id.tvIndex);
        tvSum = findViewById(R.id.tvSum);
        lv = findViewById(R.id.lv);



    }
}