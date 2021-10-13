package by.overone.lesson16.service.impl;

import by.overone.lesson16.entity.User;
import by.overone.lesson16.repository.UserRepository;
import by.overone.lesson16.repository.impl.UserRepositoryArrayImpl;
import by.overone.lesson16.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new UserRepositoryArrayImpl();

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
        return userRepository.getUserByFullName(fullName);
    }
}
