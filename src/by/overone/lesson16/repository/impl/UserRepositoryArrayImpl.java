package by.overone.lesson16.repository.impl;

import by.overone.lesson16.DB;
import by.overone.lesson16.entity.User;
import by.overone.lesson16.repository.UserRepository;
import by.overone.lesson16.utils.UserWrapper;

import java.util.Arrays;


public class UserRepositoryArrayImpl implements UserRepository {
    @Override
    public User[] getAllUsers() {
        User[] users = new User[DB.users.length];
        for (int i = 0; i < users.length; i++) {
            User user = UserWrapper.stringToUser(DB.users[i]);
            users[i] = user;
        }
        return users;
    }

    @Override
    public User getUserById(long id) {
        User[] users = new User[DB.users.length];
            for (int i = 0; i < users.length; i++) {
            User user = UserWrapper.stringToUser(DB.users[i]);
            users[i] = user;
            if (user.getId()==id) {return user;}
        }
        return null;
    }

    @Override
    public User getUserByFullName(String fullName) {
        return null;
    }

    @Override
    public User removeUserById(long id) {
        String[] users = new String[DB.users.length - 1];
        String idProp = "id: " + id+",";
        String removed=null;
        for (int i = 0, j = 0; i < DB.users.length; i++, j++) {
            if (!DB.users[i].startsWith(idProp)) {
                users[j] = DB.users[i];
                continue;
            }
            removed=DB.users[i];
            j--;
          //  break;
        }
        DB.users = users;
        return UserWrapper.stringToUser(removed);
    }

    @Override
    public User addUser(User user) {
        return null;
    }
}
