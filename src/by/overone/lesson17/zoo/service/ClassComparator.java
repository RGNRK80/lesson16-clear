package by.overone.lesson17.zoo.service;

import by.overone.lesson17.zoo.entity.Animal;
import by.overone.lesson17.zoo.entity.Birds;
import by.overone.lesson17.zoo.entity.Carnivare;
import by.overone.lesson17.zoo.entity.Herbivore;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ClassComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {

       /* String class1=o1.getClass().toString().substring(37);
        String class2=o2.getClass().toString().substring(37);
        Set<String> classSort= new TreeSet<>();
        classSort.add(class1);
        classSort.add(class2);
        if (class1.equals(class2)) {return 0;};

        int count=0;
        for (String unit: classSort) { if (unit.equals(class1)&&(count==0)) {return 1;}
        }
        return -1;

*/




        int x1 = 0;
        int x2 = 0;
        if (o1 instanceof Birds) {
            x1 = 0;
        }
        if (o1 instanceof Carnivare) {
            x1 = 1;
        }
        if (o1 instanceof Herbivore) {
            x1 = 2;
        }
        if (o2 instanceof Birds) {
            x2 = 0;
        }
        if (o2 instanceof Carnivare) {
            x2 = 1;
        }
        if (o2 instanceof Herbivore) {
            x2 = 2;
        }
        if (x1 > x2) {
            return 1;
        }
        if (x1 < x2) {
            return -1;
        }
        return 0;
    }
}
