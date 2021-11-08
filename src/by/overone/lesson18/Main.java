package by.overone.lesson18;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> roles=new ArrayList<>();
        roles.add("tester");
        roles.add("tester1");
        roles.add("tester2");
        roles.add("tester3");
        roles.add("tester4");

        Iterator<String> iterator=roles.iterator();
        while (iterator.hasNext()) {
           String check=iterator.next();
           if (check=="tester")  {
              iterator.remove();
               System.out.println(check+ " dell");}
        }

        System.out.println("_____reset________");
         iterator=roles.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        Set<String> set1 = new TreeSet<>();
        set1.add("t1");
        set1.add("t2");
        set1.add("t5");
        set1.add("t4");
        set1.add("t3");

        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("t1");
        set2.add("t2");
        set2.add("t5");
        set2.add("t4");
        set2.add("t3");

        System.out.println(set2);


        Person per1=new Person("I1",16);
        Person per2=new Person("I2",17);
        Person per3=new Person("I3",18);
        Person per4=new Person("I4",19);
        Person per5=new Person("I5",20);

        Set<Person> personSet=new HashSet<>();
        personSet.add(per1);
        personSet.add(per2);
        personSet.add(per3);
        personSet.add(per4);
        personSet.add(per5);
        System.out.println("____________________");

        Iterator<Person> it = personSet.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (Person unit: personSet) {
            System.out.println("---" + unit.toString());
        }

        personSet.remove(per1);
        personSet.remove(per2);
        personSet.remove(per3);

        while (it.hasNext()){
            System.out.println(it.next());
        }

        if (personSet.contains(per4)) {System.out.println(per4);}
        System.out.println(personSet.contains(per1));









    }
}
