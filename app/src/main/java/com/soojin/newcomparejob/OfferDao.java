package com.soojin.newcomparejob;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface OfferDao {
    @Insert
    void setInsertUser(Offer offer);

    @Update
    void setUpdateUser(Offer offer);

    @Delete
    void setDeleteUser(Offer offer);

    @Query("SELECT * FROM Offer") //유저테이블 조회
    List<Offer> getUserAll();

    @Query("SELECT * FROM Offer WHERE isCurrentJob==1") // 1이면=참
    User getCurrentJob();

    @Query("SELECT title from Offer")
    String getTitleAll2();

    @Query("SELECT company from Offer")
    String getCompanyAll();

    @Query("SELECT location from Offer")
    String getLoctionAll();

    @Query("SELECT living_cost from Offer")
    int getLivingCostAll();

    @Query("SELECT yearly_salary from Offer")
    double getSalaryAll();

    @Query("SELECT yearly_bonus from Offer")
    double getBonusAll();

    @Query("SELECT RSUA from Offer")
    double getRsuaAll();

    @Query("SELECT stipend from Offer")
    double getStipendAll();

    @Query("SELECT holiday from Offer")
    int getHolidayAll();




}