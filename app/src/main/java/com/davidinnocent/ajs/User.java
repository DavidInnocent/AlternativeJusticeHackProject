package com.davidinnocent.ajs;


import java.io.Serializable;

public class User implements Serializable {

    String username,id;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
