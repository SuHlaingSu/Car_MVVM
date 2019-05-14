package com.sh.vmr_retro.model.entity;

import com.google.gson.annotations.SerializedName;

public class Content {
    @SerializedName("type")
    public String type;
    @SerializedName("subject")
    public String subject;
    @SerializedName("description")
    public String description;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
