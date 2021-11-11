package by.overone.lesson24_hometask;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String datestr="";
        String month="";
        int date;

        while (true){
        System.out.println("enter date and month of birth");
        System.out.println("date: ");
        if (scanner.hasNext()) {datestr=scanner.nextLine();}
        date=Integer.parseInt(datestr);

        System.out.println("month: ");
        if (scanner.hasNext()) {month=scanner.nextLine();}


        // проверяем месяц

                try {
                System.out.println(" "+Month.valueOf(month.toUpperCase(Locale.ROOT)).days);
                }
                catch (Exception e) {
                    System.out.println("wrong month");
                }










        }

    }
}
