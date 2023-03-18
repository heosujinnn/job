package com.soojin.newcomparejob;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {
    @Insert
    void setInsertUser(User user);

    @Update
    void setUpdateUser(User user);

    @Delete
    void setDeleteUser(User user);

    @Query("SELECT * FROM User") //유저테이블 조회
    List<User> getUserAll();

    @Query("SELECT * FROM User WHERE isCurrentJob==1") // 1이면=참
    User getCurrentJob();

    @Query("SELECT title from User")
    String getTitleAll();

    @Query("SELECT company from User")
    String getCompanyAll();

    @Query("SELECT location from User")
    String getLoctionAll();

    @Query("SELECT living_cost from User")
    int getLivingCostAll();

    @Query("SELECT yearly_salary from User")
    double getSalaryAll();

    @Query("SELECT yearly_bonus from User")
    double getBonusAll();

    @Query("SELECT RSUA from User")
    double getRsuaAll();

    @Query("SELECT stipend from User")
    double getStipendAll();

    @Query("SELECT holiday from User")
    int getHolidayAll();

}