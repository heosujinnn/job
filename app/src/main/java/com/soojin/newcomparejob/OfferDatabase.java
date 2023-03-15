package com.soojin.newcomparejob;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Offer.class},version=5,exportSchema=false)
public abstract class OfferDatabase extends RoomDatabase {
    public abstract OfferDao offerDao();

    private static OfferDatabase INSTANCE;

    public static OfferDatabase getAppDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, OfferDatabase.class , "user")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return  INSTANCE;
    }
}