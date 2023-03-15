package com.soojin.newcomparejob;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.io.Serializable;

public class CurrentActivity extends AppCompatActivity {

    UserDatabase db;

    private EditText title;
    private EditText company;
    private EditText livingCost;
    private EditText loction;
    private EditText salary;
    private EditText bonus;
    private EditText RSUA;
    private EditText stipend;
    private EditText holiday;

    private Button save_btn;
    private Button cancel_btn;

    private UserDao dao;
    private User currentjob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current);

        db= Room.databaseBuilder(getApplicationContext(),UserDatabase.class,
                "job").allowMainThreadQueries().build();

        title=(EditText) findViewById(R.id.title_et);
        company=(EditText) findViewById(R.id.company_et);
        livingCost=(EditText) findViewById(R.id.livingCost_et);
        loction=(EditText) findViewById(R.id.loction_et);
        salary=(EditText) findViewById(R.id.salary_et);
        bonus=(EditText) findViewById(R.id.bonus_et);
        RSUA=(EditText) findViewById(R.id.RSUA_et);
        stipend=(EditText) findViewById(R.id.stipend_et);
        holiday=(EditText) findViewById(R.id.holiday_et);

        save_btn=(Button)findViewById(R.id.save_btn);
        cancel_btn=(Button)findViewById(R.id.canel_btn);

        dao=db.userDao();
        currentjob=dao.getCurrentJob();

        if(currentjob!=null){  //null 이 아니라면 비어있지 않다면 이거
            title.setText(currentjob.getTitle());
            company.setText(currentjob.getCompany());
            loction.setText(currentjob.getLocation());
            livingCost.setText(Integer.toString(currentjob.getLiving_cost()));
            salary.setText(Double.toString(currentjob.getYearly_salary()));
            bonus.setText(Double.toString(currentjob.getYearly_bonus()));
            RSUA.setText(Double.toString(currentjob.getRSUA()));
            stipend.setText(Double.toString(currentjob.getStipend()));
            holiday.setText(Integer.toString(currentjob.getHoliday()));
        }
        else{
            //boolean current job 이 0 이면 ?? 비어있으면
            Toast.makeText(CurrentActivity.this, "입력해주세요", Toast.LENGTH_SHORT).show();

        }
        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });
    }


    private void Blank(){
        String title_str=title.getText().toString();
        String company_str=company.getText().toString();
        String livingCost_str=livingCost.getText().toString();
        String loction_str=loction.getText().toString();
        String salary_str=salary.getText().toString();
        String bonus_str=bonus.getText().toString();
        String RSUA_str=RSUA.getText().toString();
        String stipend_str=stipend.getText().toString();
        String holiday_str=holiday.getText().toString();

        if(TextUtils.isEmpty(title_str)||TextUtils.isEmpty(company_str)||TextUtils.isEmpty(livingCost_str)||TextUtils.isEmpty(loction_str)||
                TextUtils.isEmpty(salary_str)||TextUtils.isEmpty(bonus_str)||TextUtils.isEmpty(RSUA_str)||TextUtils.isEmpty(stipend_str)||
                TextUtils.isEmpty(holiday_str)){
            Toast.makeText(CurrentActivity.this, "비어있음", Toast.LENGTH_SHORT).show();
        }

    }
    public void save(){
        Blank();
        User user=new User();
        user.setTitle(title.getText().toString());
        user.setCompany(company.getText().toString());
        user.setLocation(loction.getText().toString());
        user.setLiving_cost(Integer.parseInt(livingCost.getText().toString()));
        user.setYearly_salary(Double.parseDouble(salary.getText().toString()));
        user.setYearly_bonus(Double.parseDouble(bonus.getText().toString()));
        user.setRSUA(Double.parseDouble(RSUA.getText().toString()));
        user.setStipend(Double.parseDouble(stipend.getText().toString()));
        user.setHoliday(Integer.parseInt(holiday.getText().toString()));

        dao=db.userDao();
        dao.setInsertUser(user);
        Toast.makeText(CurrentActivity.this, "save", Toast.LENGTH_LONG).show();

        Intent intent=new Intent(CurrentActivity.this, CompareJob.class);
        startActivity(intent);
    }

}