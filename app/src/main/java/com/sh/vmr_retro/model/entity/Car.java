package com.sh.vmr_retro.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.google.gson.annotations.SerializedName;
import com.sh.vmr_retro.converter.ContentCarConverter;

import java.util.List;

@Entity (tableName = "car")
public class Car {

    @PrimaryKey

    @ColumnInfo(name = "id")
    @SerializedName(value = "id")
    public Integer mId;

    @ColumnInfo(name = "title")
    @SerializedName(value = "title")
    public String mTitle;

    @ColumnInfo(name = "dateTime")
    @SerializedName(value = "dateTime")
    public String mDatetime;

    @ColumnInfo(name = "ingress")
    @SerializedName(value = "ingress")
    public String mIngress;

    @ColumnInfo(name = "image")
    @SerializedName(value = "image")
    public String mImage;

    @ColumnInfo(name = "created")
    @SerializedName(value = "created")
    public Integer mCreated;

    @ColumnInfo(name = "changed")
    @SerializedName(value = "changed")
    public Integer mChanged;

    @TypeConverters(ContentCarConverter.class)
    @ColumnInfo(name = "content")
    @SerializedName(value = "content")
    public List<Content> content;

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDatetime() {
        return mDatetime;
    }

    public void setmDatetime(String mDatetime) {
        this.mDatetime = mDatetime;
    }

    public String getmIngress() {
        return mIngress;
    }

    public void setmIngress(String mIngress) {
        this.mIngress = mIngress;
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public Integer getmCreated() {
        return mCreated;
    }

    public void setmCreated(Integer mCreated) {
        this.mCreated = mCreated;
    }

    public Integer getmChanged() {
        return mChanged;
    }

    public void setmChanged(Integer mChanged) {
        this.mChanged = mChanged;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        Car car = (Car) obj;

        return car.getmId() == this.getmId() && car.getmTitle() == this.getmTitle();
    }
}
