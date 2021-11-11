package by.overone.lesson24_hometask;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    {
        String datestr="";
        String month=null;
        int date=0;

    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String datestr="";
        String month=null;
        int date=0;



        System.out.println("enter date and month of birth");

            while (true) {
                System.out.print("month: ");
                if (scanner.hasNext()) {
                    month = scanner.nextLine().trim().toUpperCase(Locale.ROOT);
                }
                // проверяем месяц
                try {
                    System.out.println(" quantity days in month is " + Month.valueOf(month).days);
                    break;
                } catch (Exception e) {
                    System.out.println("wrong month");
                }
            }


        boolean ch=true;
        while (ch) {
            System.out.println("date: ");
            if (scanner.hasNextInt()) {
                date = scanner.nextInt();

                int check=Month.valueOf(month).days;
                if (date<check && date >0)  {
               ;
                   ch=false;} else {System.out.println("wrong date");}

            } else {scanner.nextLine(); System.out.println("wrong date");}


        }


         class Zodiak {
            int zdate;
            String zmonth;
            String first;
            String last;

             public Zodiak(int zdate, String zmonth) {
                 this.zdate = zdate;
                 this.zmonth = zmonth;
                 findFL();
             }

             public void findFL() {
                 switch (Month.valueOf(zmonth)) {
                     case JANUARY -> {
                         first=Zod.CAPRICORN.toString();
                         last=Zod.AQUARIUS.toString();
                     }

                     case FEBRUARY -> {
                         first=Zod.AQUARIUS.toString();
                         last=Zod.PISCES.toString();
                     }
                     case MARCH -> {
                         first=Zod.PISCES.toString();
                         last=Zod.ARIES.toString();
                     }
                     case APRIL -> {
                         first=Zod.ARIES.toString();
                         last=Zod.TAURUS.toString();
                     }
                     case MAY -> {
                         first=Zod.TAURUS.toString();
                         last=Zod.GEMINI.toString();
                     }
                     case JUNE -> {
                         first=Zod.GEMINI.toString();
                         last=Zod.CANCER.toString();
                     }
                     case JULY -> {
                         first=Zod.CANCER.toString();
                         last=Zod.LEO.toString();
                     }
                     case AUGUST -> {
                         first=Zod.LEO.toString();
                         last=Zod.VIRGO.toString();
                     }
                     case SEPTEMBER -> {
                         first=Zod.VIRGO.toString();
                         last=Zod.LIBRA.toString();
                     }
                     case OCTOBER -> {
                         first=Zod.LIBRA.toString();
                         last=Zod.SCORPIO.toString();
                     }
                     case NOVEMBER -> {
                         first=Zod.SCORPIO.toString();
                         last=Zod.SAGITTARIUS.toString();
                     }
                     case DECEMBER -> {
                         first=Zod.SAGITTARIUS.toString();
                         last=Zod.CAPRICORN.toString();
                     }
                 }
             }
         }  //end zodiak

          Zodiak zz=new Zodiak(date,month);
          if (date >= Month.valueOf(month).dayToTransfer) {
              System.out.println( "your zodiak is: " + zz.last);
          } else {
              System.out.println("your zodiak is: " + zz.first);
          }





    }  // psvm
}
