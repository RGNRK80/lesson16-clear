package by.overone.lesson16;

import by.overone.lesson16.entity.User;
import by.overone.lesson16.service.UserService;
import by.overone.lesson16.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.getAllUsersPrint(); // удобнее пользоваться поскольку у на 1 статичная бд
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
        System.out.println("-----------------------");

        User[] userFIO = userService.getUserByFullName("Kate    Katovalova");
        for (User user : userFIO) {
            System.out.println(user);
        }

        System.out.println("user delete: "+userService.removeUserById(11));
        System.out.println("-----------------------");

        User[] users1=userService.getAllUsers();
        for (User user : users1) {
            System.out.println(user);
        }
        User newUser=new User("John","Smith",31,"+74951085622");
        System.out.println(userService.addUser(newUser));
        System.out.println(" ####### try to add dublicate: John Smith");
        User newUser1=new User("John","Smith",31,"+74951085622");
        System.out.println(userService.addUser(newUser));

        userService.getAllUsersPrint();









    }
}
