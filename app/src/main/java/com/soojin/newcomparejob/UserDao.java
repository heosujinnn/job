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




}