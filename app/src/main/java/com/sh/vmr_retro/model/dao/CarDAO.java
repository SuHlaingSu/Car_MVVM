package com.sh.vmr_retro.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.sh.vmr_retro.model.entity.Car;

import java.util.List;

@Dao
public interface CarDAO {
    @Query("SELECT * FROM car")
    List<Car> getCarAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertCar(Car car);

    @Query("DELETE FROM car")
    abstract void deleteAllCar();
}
