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
        stock_et = findViewById(R.id.RSUA_et);
        loction_et = findViewById(R.id.stipend_et);
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
    //가중치계산
    public void weight(){
        //1. 총 가중치 계산하기 editText 에 있는 값 더하기..?
         double total=0;

        //2. 백분율 치환( 가중치 / 총 가중치 )
        // 가중치 / editText 에 있는 값 더하기..?

        //3. 문서에 나와있는 식대로 쓰기 AYS+AYB...어쩌구
        //DB talbe이 필요한가/?????????/




    }
}
