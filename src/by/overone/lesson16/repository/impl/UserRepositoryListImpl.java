package by.overone.lesson16.repository.impl;

import by.overone.lesson16.DB;
import by.overone.lesson16.DBList;
import by.overone.lesson16.entity.User;
import by.overone.lesson16.repository.UserRepository;
import by.overone.lesson16.utils.UserWrapper;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryListImpl implements UserRepository {
    @Override

    public User[] getAllUsers() {
        List<User> users= new ArrayList<>();
        for (String strUser: DBList.users){
            users.add(UserWrapper.stringToUser(strUser));}
        return users.toArray(new User[0]);
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public User[] getUserByFullName(String fullName) {
        return new User[0];
    }

    @Override
    public User removeUserById(long id) {

       // String[] users = new String[DB.users.length - 1];
        String idProp = "id: " + id+",";
       // String removed=null;
        for (String strUser: DBList.users){
            if(strUser.startsWith(idProp)) {
                DBList.users.remove(strUser);
                return UserWrapper.stringToUser(strUser);
            }
        }

        return new User();
    }

    @Override
    public User addUser(User user) {
        return null;
    }
}
