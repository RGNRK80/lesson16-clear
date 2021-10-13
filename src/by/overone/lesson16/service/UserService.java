package by.overone.lesson16.service;

import by.overone.lesson16.entity.User;

public interface UserService {

    User[] getAllUsers();

    User removeUserById(long id);
    User getUserById(long id);
    User[] getUserByFullName(String fullName);
}
