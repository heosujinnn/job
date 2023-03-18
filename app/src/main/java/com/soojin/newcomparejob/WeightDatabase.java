package com.soojin.newcomparejob;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {weight.class},version=1,exportSchema=false)
public abstract class WeightDatabase extends RoomDatabase {
    public abstract weightDao weightDao();

    private static WeightDatabase INSTANCE;
    public static WeightDatabase getAppDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, WeightDatabase.class , "user")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return  INSTANCE;
    }
}