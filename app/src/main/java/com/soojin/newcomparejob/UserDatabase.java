package com.soojin.newcomparejob;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class},version=4,exportSchema=false)
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao userDao();

    private static UserDatabase INSTANCE;
    public static UserDatabase getAppDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, UserDatabase.class , "user")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return  INSTANCE;
    }
}