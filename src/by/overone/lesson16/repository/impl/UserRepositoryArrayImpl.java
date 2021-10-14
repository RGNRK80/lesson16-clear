package by.overone.lesson16.repository.impl;

import by.overone.lesson16.DB;
import by.overone.lesson16.entity.User;
import by.overone.lesson16.repository.UserRepository;
import by.overone.lesson16.utils.UserWrapper;


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
    public User[] getUserByFullName(String fullName) {
        User[] users = new User[DB.users.length];
        User userToFind=UserWrapper.stringToFIO(fullName);

        int counter=0;
        for (int i = 0; i < users.length; i++) {
            User user = UserWrapper.stringToUser(DB.users[i]);
            if (user.getName().equals(userToFind.getName()) && user.getSurname().equals(userToFind.getSurname())) {counter+=1;}
            }

        User[] rezult=null;
        if (counter>0) {
            rezult=new User[counter];
            int k=0;
            for (int i = 0; i < users.length; i++) {
                User user = UserWrapper.stringToUser(DB.users[i]);
                if (user.getName().equals(userToFind.getName()) && user.getSurname().equals(userToFind.getSurname())) {
                    rezult[k]=user;
                k++;
                }

            }
        }
        return rezult;
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

        }
        DB.users = users;
        return UserWrapper.stringToUser(removed);
    }

    @Override
    public User addUser(User user) {
        DB.id += 1;
        user.setId(DB.id);
        String[] users = new String[DB.users.length + 1];
        for (int i = 0; i < DB.users.length ; i++) {
            users[i] = DB.users[i];
        }
        users[DB.users.length] = user.toString();
        DB.users=users;                                   //// проверить
        return user;
    }
}
