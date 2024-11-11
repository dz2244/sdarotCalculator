package com.example.sdarotcalculator.;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Switch typeSwich;
    EditText etMult, etFirst;
    Button btnNext;

    int frstNum, multNum;
    String temp;
    boolean isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeSwich = findViewById(R.id.seriesTypeSwitch);
        etMult = findViewById(R.id.etMult);
        etFirst = findViewById(R.id.etFirst);
        btnNext = findViewById(R.id.btnNext);
    }

    public void nxt(View view) {
        temp = etFirst.getText().toString();
        if (checkNum(temp))
        {
            firstNum = Integer.parseInt(temp);

            temp = etMult.getText().toString();
            if (checkNum(temp))
            {
                multNum = Integer.parseInt(temp);

                isChecked = typeSwich.isChecked();

                Toast.makeText(this, "Valid", Toast.LENGTH_SHORT).show();
                Intent si = new Intent(this,resultActivity.class);
                si.putExtra("first", firstNum);
                si.putExtra("mult", multNum);
                si.putExtra("seriesChoice", isChecked);
                startActivity(si);
            }
            else Toast.makeText(this, "Invalid number!", Toast.LENGTH_SHORT).show();
        }
        else Toast.makeText(this, "Invalid number!", Toast.LENGTH_SHORT).show();
    }

    public boolean checkNum(String x)
    {
        if (x.isEmpty()) return false;
        return true;
    }
}