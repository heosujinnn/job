package com.soojin.newcomparejob;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CompareJob extends AppCompatActivity {

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
        company_tv=findViewById(R.id.company_tv);
        loction_tv=findViewById(R.id.loction_tv);
        LivingCost_tv=findViewById(R.id.livingCost_tv);
        salary_tv=findViewById(R.id.salary_tv);
        bonus_tv=findViewById(R.id.bonus_tv);
        RSUA_tv=findViewById(R.id.RSUA_tv);
        stipend_tv=findViewById(R.id.stipend_tv);
        holiday_tv=findViewById(R.id.holiday_tv);

        UserDatabase userDatabase=UserDatabase.getAppDatabase(this);
        //db가져옴

        //db에 저장된 값을 가져오기
        String title_str=userDatabase.userDao().getTitleAll();
        String company_str=userDatabase.userDao().getCompanyAll();
        String loction_str=userDatabase.userDao().getLoctionAll();
        int cost_str=userDatabase.userDao().getLivingCostAll();
        double salary_str=userDatabase.userDao().getSalaryAll();
        double bonus_str=userDatabase.userDao().getBonusAll();
        double RSUA_str=userDatabase.userDao().getRsuaAll();
        double stipend_str=userDatabase.userDao().getStipendAll();
        int holiday_str=userDatabase.userDao().getHolidayAll();

        title_tv.setText(title_str);
        company_tv.setText(company_str);
        loction_tv.setText(loction_str);
        LivingCost_tv.setText(String.valueOf(cost_str));
        salary_tv.setText(String.valueOf(salary_str));
        bonus_tv.setText(String.valueOf( bonus_str));
        RSUA_tv.setText(String.valueOf(RSUA_str));
        stipend_tv.setText(String.valueOf(stipend_str));
        holiday_tv.setText(String.valueOf(holiday_str));









    }
}
