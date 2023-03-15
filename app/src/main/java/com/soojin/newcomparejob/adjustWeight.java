package com.soojin.newcomparejob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class adjustWeight extends AppCompatActivity {

    private EditText salary_et;
    private EditText bonus_et;
    private EditText stock_et;
    private EditText loction_et;
    private EditText holiday_et;
    private Button adjustSave_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjust);

        salary_et = findViewById(R.id.salary_et);
        bonus_et = findViewById(R.id.bonus_et);
        stock_et = findViewById(R.id.stock_et);
        loction_et = findViewById(R.id.loction_et);
        holiday_et = findViewById(R.id.holiday_et);
        adjustSave_btn = findViewById(R.id.adjustSave_btn);


        adjustSave_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(adjustWeight.this, CompareJob.class);
                startActivity(intent);

            }
        });

    }
}
