package com.soojin.newcomparejob;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User{
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name="title")
    private String title;
    @ColumnInfo(name="company")
    private String company;
    @ColumnInfo(name="location")
    private String location;
    @ColumnInfo(name="living_cost")
    private int living_cost;
    @ColumnInfo(name="yearly_salary")
    private double yearly_salary;
    @ColumnInfo(name="yearly_bonus")
    private double yearly_bonus;
    @ColumnInfo(name="RSUA")
    private double RSUA;
    @ColumnInfo(name="stipend")
    private double stipend;
    @ColumnInfo(name="holiday")
    private int holiday;

    @ColumnInfo(name="isCurrentJob")
    private boolean isCurrentJob;

    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLiving_cost() {
        return living_cost;
    }

    public void setLiving_cost(int living_cost) {
        this.living_cost = living_cost;
    }

    public double getYearly_salary() {
        return yearly_salary;
    }

    public void setYearly_salary(double yearly_salary) {
        this.yearly_salary = yearly_salary;
    }

    public double getYearly_bonus() {
        return yearly_bonus;
    }

    public void setYearly_bonus(double yearly_bonus) {
        this.yearly_bonus = yearly_bonus;
    }

    public double getRSUA() {
        return RSUA;
    }

    public void setRSUA(double RSUA) {
        this.RSUA = RSUA;
    }

    public double getStipend() {
        return stipend;
    }

    public void setStipend(double stipend) {
        this.stipend = stipend;
    }

    public int getHoliday() {
        return holiday;
    }

    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }

    public boolean isCurrentJob() {
        return isCurrentJob;
    }

    public void setCurrentJob(boolean currentJob) {
        isCurrentJob = currentJob;
    }

    public User(int id, String title, String company, String location, int living_cost, double yearly_salary, double yearly_bonus, double RSUA, double stipend, int holiday, boolean isCurrentJob) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.location = location;
        this.living_cost = living_cost;
        this.yearly_salary = yearly_salary;
        this.yearly_bonus = yearly_bonus;
        this.RSUA = RSUA;
        this.stipend = stipend;
        this.holiday = holiday;
        this.isCurrentJob = isCurrentJob;
    }
}
