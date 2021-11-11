package by.overone.lesson16.service.impl;

import by.overone.lesson16.entity.User;
import by.overone.lesson16.repository.UserRepository;
import by.overone.lesson16.repository.impl.UserRepositoryArrayImpl;
import by.overone.lesson16.repository.impl.UserRepositoryListImpl;
import by.overone.lesson16.service.UserService;

public class UserServiceImpl implements UserService {

    //private final UserRepository userRepository = new UserRepositoryArrayImpl();
    private final UserRepository userRepository = new UserRepositoryListImpl();

    @Override
    public User[] getAllUsers() {
        return userRepository.getAllUsers();
    }


    @Override
    public User removeUserById(long id) {
        User[] users = getAllUsers();
        for (User user: users) {
            if (user.getId()==id){
                return userRepository.removeUserById(id);
            }
        }
        return new User();
    }

    @Override
    public User getUserById(long id) {
        if (userRepository.getUserById(id)!=null) {
            return userRepository.getUserById(id);
        } else {return new User();}
    }

    @Override
    public User[] getUserByFullName(String fullName) {
        String rezult=fullName.trim();
        return userRepository.getUserByFullName(rezult);
    }

    @Override
    public User addUser(User user) {
        User[] arrayOfUsers=getAllUsers();
        for (User userCheck: arrayOfUsers) {
            if (userCheck.getName().equals(user.getName()) && userCheck.getSurname().equals(user.getSurname())
                    && userCheck.getAge()== user.getAge() && userCheck.getPhoneNumber().equals(user.getPhoneNumber()) )
            {
               // System.out.println("user is exist");
                return null;
            }
        }
        userRepository.addUser(user);
        return user;
    }


}
