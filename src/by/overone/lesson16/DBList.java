package by.overone.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DBList {
    public static List<String> users=new ArrayList<>();

    public static void main(String[] args) {
        users.add("id: 1, name: Ivan, surname: Ivanov, age: 34, phoneNumber: +123456781212");
        users.add("id: 2, name: Igor, surname: Iganov, age: 12, phoneNumber: +123456321212");
        users.add("id: 3, name: Irina, surname: Ichkina, age: 18, phoneNumber: +123126781212");

        System.out.println(users);
        System.out.println(users.size());
        System.out.println(users.get(0));
        System.out.println(users.contains("id: 3, name: Irina, surname: Ichkina, age: 18, phoneNumber: +123126781212"));

        String[] list=users.toArray(new String[0]);
        System.out.println(Arrays.toString(list));
        System.out.println(list.length);







    }



}
