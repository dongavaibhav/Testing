package com.example.testing;

import com.google.gson.annotations.SerializedName;

public class RetroUsers {
    @SerializedName("title")
    private String name;

    public RetroUsers(String name) {
        this.name = name;
    }

//Retrieve the data using setter/getter methods//

    public String getUser() {
        return name;
    }

    public void setUser(String name) {
        this.name = name;
    }
}
