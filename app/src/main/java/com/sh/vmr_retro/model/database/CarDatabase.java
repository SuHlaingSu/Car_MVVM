package com.sh.vmr_retro.model.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.sh.vmr_retro.model.entity.Car;

@Database(entities = {Car.class},version=1)
public abstract class CarDatabase extends RoomDatabase {
    private static CarDatabase instance;

    public static CarDatabase getInstance(Context context) {
        if(instance!= null)
        {
            instance = Room.databaseBuilder(context.getApplicationContext(),CarDatabase.class,"CarDB").build();
        }
        return instance;
    }
}
