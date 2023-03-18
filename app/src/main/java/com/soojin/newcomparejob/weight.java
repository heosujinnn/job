package com.soojin.newcomparejob;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class weight {
    @PrimaryKey
    public int id=1;

    @ColumnInfo(name="salary")
    private int salary=1;
    @ColumnInfo(name="bonus")
    private int bonus=1;
    @ColumnInfo(name="RSUA")
    private int RSUA=1;
    @ColumnInfo(name="stipend")
    private int stipend=1;
    @ColumnInfo(name="hoilday")
    private int hoilday=1;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getRSUA() {
        return RSUA;
    }

    public void setRSUA(int RSUA) {
        this.RSUA = RSUA;
    }

    public int getStipend() {
        return stipend;
    }

    public void setStipend(int stipend) {
        this.stipend = stipend;
    }

    public int getHoilday() {
        return hoilday;
    }

    public void setHoilday(int hoilday) {
        this.hoilday = hoilday;
    }
}
