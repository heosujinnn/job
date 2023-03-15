package com.soojin.newcomparejob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.List;

public class CompareJob extends AppCompatActivity {
    UserDatabase userDatabase;
    OfferDatabase offerDatabase;

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

    private Button menu_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);

        menu_btn=findViewById(R.id.menu_btn);
        title_tv=findViewById(R.id.title_tv);
        company_tv=findViewById(R.id.company_tv);
        loction_tv=findViewById(R.id.loction_tv);
        LivingCost_tv=findViewById(R.id.livingCost_tv);
        salary_tv=findViewById(R.id.salary_tv);
        bonus_tv=findViewById(R.id.bonus_tv);
        RSUA_tv=findViewById(R.id.RSUA_tv);
        stipend_tv=findViewById(R.id.stipend_tv);
        holiday_tv=findViewById(R.id.holiday_tv);

        title_tv2=findViewById(R.id.title_tv2);
        company_tv2=findViewById(R.id.company_tv2);
        loction_tv2=findViewById(R.id.loction_tv2);
        LivingCost_tv2=findViewById(R.id.livingCost_tv2);
        salary_tv2=findViewById(R.id.salary_tv2);
        bonus_tv2=findViewById(R.id.bonus_tv2);
        RSUA_tv2=findViewById(R.id.RSUA_tv2);
        stipend_tv2=findViewById(R.id.stipend_tv2);
        holiday_tv2=findViewById(R.id.holiday_tv2);

        userDatabase=UserDatabase.getAppDatabase(this);
        offerDatabase=OfferDatabase.getAppDatabase(this);


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



        //db에 저장된 값을 가져오기
        String title_str2=offerDatabase.offerDao().getTitleAll2();
        String company_str2=offerDatabase.offerDao().getCompanyAll();
        String loction_str2=offerDatabase.offerDao().getLoctionAll();
        int cost_str2=offerDatabase.offerDao().getLivingCostAll();
        double salary_str2=offerDatabase.offerDao().getSalaryAll();
        double bonus_str2=offerDatabase.offerDao().getBonusAll();
        double RSUA_str2=offerDatabase.offerDao().getRsuaAll();
        double stipend_str2=offerDatabase.offerDao().getStipendAll();
        int holiday_str2=offerDatabase.offerDao().getHolidayAll();

        title_tv2.setText(title_str2);
        company_tv2.setText(company_str2);
        loction_tv2.setText(loction_str2);
        LivingCost_tv2.setText(String.valueOf(cost_str2));
        salary_tv2.setText(String.valueOf(salary_str2));
        bonus_tv2.setText(String.valueOf( bonus_str2));
        RSUA_tv2.setText(String.valueOf(RSUA_str2));
        stipend_tv2.setText(String.valueOf(stipend_str2));
        holiday_tv2.setText(String.valueOf(holiday_str2));

        menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompareJob.this,MainActivity.class);
                startActivity(intent);

            }
        });


    }
}
