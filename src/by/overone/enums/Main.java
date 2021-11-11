package by.overone.enums;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(HeroDC.SUPERMAN.isPower());
      //  String str=scanner.nextLine();
        boolean check=true;


        while (check) {
            try {

                String str=scanner.nextLine();
                System.out.println(HeroDC.valueOf(str.toUpperCase(Locale.ROOT)).isPower());
                check=false;
            } catch (Exception e) {
                System.out.println("нет такого героя");
            }
        }
    }
}
