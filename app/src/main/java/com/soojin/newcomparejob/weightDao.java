package com.soojin.newcomparejob;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface weightDao {
    @Query("SELECT * FROM weight")
    List<weight> getweightAll();

    @Insert
    void setInsertweight(weight weight);

    @Update
    void setUpdateweight(weight weight);

    @Delete
    void setDeleteweight(weight weight);

    @Query("UPDATE weight SET salary =:msalary")
    void setUpdatesalary(int msalary);
    @Query("UPDATE weight SET bonus =:mbonus")
    void setUpdatembonus(int mbonus);
    @Query("UPDATE weight SET RSUA =:mRSUA")
    void setUpdatemRSUA(int mRSUA);
    @Query("UPDATE weight SET stipend =:mstipend")
    void setUpdatestipend(int mstipend);
    @Query("UPDATE weight SET hoilday =:mhoilday")
    void setUpdatehoilday(int mhoilday);

}
