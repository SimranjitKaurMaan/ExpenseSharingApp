package com.simran.services;

import com.simran.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserService
{
    Map<String,User> userMap = new HashMap<>();

    public void AddUser(User user)
    {
        userMap.put(user.getUser_name(),user);
    }

    public void DeleteUser(String username)
    {
        userMap.remove(username);
    }

    public User GetUser(String username)
    {
        return userMap.get(username);
    }
}
