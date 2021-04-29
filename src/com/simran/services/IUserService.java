package com.simran.services;

import com.simran.models.User;

public interface IUserService
{
    void AddUser(User user);

    void DeleteUser(String username);

    User GetUser(String username);
}
