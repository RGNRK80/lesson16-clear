package by.overone.lesson16;

import by.overone.lesson16.entity.User;
import by.overone.lesson16.service.UserService;
import by.overone.lesson16.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        User removedUser = userService.removeUserById(1);


        if (removedUser.getId() > 0) {
            System.out.println("REMOVED: "+removedUser);
        } else {
            System.out.println("User not found");
        }

        System.out.println("-----------------------");
        User[] users = userService.getAllUsers();


        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("-----------------------");

        System.out.println(userService.getUserById(10));
        System.out.println(userService.getUserById(11));

    }
}
