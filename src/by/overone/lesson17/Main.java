package by.overone.lesson17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<String> countries =new ArrayList<>();
    public static List<String> countr =new LinkedList<>();

    public static void main(String[] args) {
        countries.add("Sweden");
        countries.add("Norway");
        countries.add("Finland");
        countries.add("Denmark");

        System.out.println(countries);

        countries.set(1,"New Norway");
        countries.remove(1);
        countries.remove("Sweden");

        countries.indexOf("Finland");
        System.out.println( countries.contains("Finland"));
        System.out.println(countries);

        countr.add("Belarus");
        countr.add("Russia");
        System.out.println(countr);



    }
}
