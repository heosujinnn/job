package com.soojin.newcomparejob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CurrentResult extends AppCompatActivity {

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
        setContentView(R.layout.activity_current_result);

        menu_btn=findViewById(R.id.menu_btn);
        title_tv2=findViewById(R.id.title_tv2);
        company_tv2=findViewById(R.id.company_tv2);
        loction_tv2=findViewById(R.id.loction_tv2);
        LivingCost_tv2=findViewById(R.id.livingCost_tv2);
        salary_tv2=findViewById(R.id.salary_tv2);
        bonus_tv2=findViewById(R.id.bonus_tv2);
        RSUA_tv2=findViewById(R.id.RSUA_tv2);
        stipend_tv2=findViewById(R.id.stipend_tv2);
        holiday_tv2=findViewById(R.id.holiday_tv2);

        UserDatabase userDatabase=UserDatabase.getAppDatabase(this);

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

        title_tv2.setText(title_str);
        company_tv2.setText(company_str);
        loction_tv2.setText(loction_str);
        LivingCost_tv2.setText(String.valueOf(cost_str));
        salary_tv2.setText(String.valueOf(salary_str));
        bonus_tv2.setText(String.valueOf( bonus_str));
        RSUA_tv2.setText(String.valueOf(RSUA_str));
        stipend_tv2.setText(String.valueOf(stipend_str));
        holiday_tv2.setText(String.valueOf(holiday_str));

        menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(CurrentResult.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
