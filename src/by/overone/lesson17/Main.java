package by.overone.lesson17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> countries =new ArrayList<>();

    public static void main(String[] args) {
        countries.add("Sweeden");
        countries.add("Norway");
        countries.add("Finland");

        System.out.println(countries);

        countries.set(1,"New Norway");
        countries.remove(1);
        countries.remove("Sweeden");

        countries.indexOf("Finland");
        System.out.println( countries.contains("Finland"));
        System.out.println(countries);

    }
}
