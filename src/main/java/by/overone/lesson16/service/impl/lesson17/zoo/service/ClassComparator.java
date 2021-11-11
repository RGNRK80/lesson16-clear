package by.overone.lesson16.service.impl.lesson17.zoo.service;

import by.overone.lesson16.service.impl.lesson17.zoo.entity.Animal;

import java.util.*;

public class ClassComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {

        String class1=o1.getClass().toString().substring(37);
        String class2=o2.getClass().toString().substring(37);
        ArrayList<String> classSort = new ArrayList<String>();
        classSort.add(class1);
        classSort.add(class2);
        Collections.sort(classSort);
        if (class1.equals(class2)) {return 0;}
        if (classSort.get(0).equals(class1)) {return -1;}
        if (classSort.get(1).equals(class1)) {return 1;}
        return 0;

    }
}
