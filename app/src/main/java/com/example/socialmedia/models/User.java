package com.example.socialmedia.models;

public class User {

    private String id;
    private String email;
    private String username;
    private String phone;
    private long timeStamp;

    public User()
    {

    }

    public User(String id, String email, String username, String phone, long timeStamp) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.phone = phone;
        this.timeStamp = timeStamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
