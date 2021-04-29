package com.simran.models;

import java.util.UUID;

public class User
{
    String user_id;
    String user_name;
    String emailAddress;
    String phoneNumber;

    public User(String user_name, String emailAddress, String phoneNumber) {
        this.user_id = UUID.randomUUID().toString();
        this.user_name = user_name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
