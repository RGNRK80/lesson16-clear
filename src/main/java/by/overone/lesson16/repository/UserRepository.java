package by.overone.lesson16.repository;

import by.overone.lesson16.entity.User;

public interface UserRepository {

    User[] getAllUsers();

    User getUserById(long id);

    User[] getUserByFullName(String fullName);

    User removeUserById(long id);

    User addUser(User user);

}
