package com.sh.vmr_retro.jsonResponse;

import com.google.gson.annotations.SerializedName;
import com.sh.vmr_retro.model.entity.Car;

import java.util.List;

public class ApiResponse {
    @SerializedName("status")
    private String status;
    @SerializedName("content")
    private List<Car> content ;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Car> getContent() {
        return content;
    }

    public void setContent(List<Car> content) {
        this.content = content;
    }
}
