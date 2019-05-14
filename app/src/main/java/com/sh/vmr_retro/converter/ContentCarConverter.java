package com.sh.vmr_retro.converter;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sh.vmr_retro.model.entity.Content;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class ContentCarConverter {
    static Gson gson = new Gson();

    @TypeConverter
    public static List<Content> stringToContent(String data) {
        if (data == null) {
            return Collections.emptyList();
        }
        Type listType = new TypeToken<List<Content>>() {}.getType();
        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String contentToString(List<Content> myObjects) {
        return gson.toJson(myObjects);
    }
}
