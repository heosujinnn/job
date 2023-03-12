package com.soojin.newcomparejob;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CompareJob extends AppCompatActivity {

    private ArrayList<String> userList;
    private TextView title_tv;
    private TextView company_tv;
    private TextView loction_tv;
    private TextView LivingCost_tv;
    private TextView salary_tv;
    private TextView bonus_tv;
    private TextView RSUA_tv;
    private TextView stipend_tv;
    private TextView holiday_tv;

    private TextView title_tv2;
    private TextView company_tv2;
    private TextView loction_tv2;
    private TextView LivingCost_tv2;
    private TextView salary_tv2;
    private TextView bonus_tv2;
    private TextView RSUA_tv2;
    private TextView stipend_tv2;
    private TextView holiday_tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);
        title_tv=findViewById(R.id.title_tv);

        Intent intent = getIntent();
        ArrayList<User> list = (ArrayList<User>) intent.getSerializableExtra("user");




    }
}
