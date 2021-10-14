package by.overone.lesson16.service;

import by.overone.lesson16.entity.User;

public interface UserService {

    User[] getAllUsers();

    void getAllUsersPrint();

    User removeUserById(long id);
    User getUserById(long id);
    User[] getUserByFullName(String fullName);
    User addUser(User user);
}
