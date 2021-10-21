package by.overone.lesson17.zoo.service;

import by.overone.lesson17.zoo.entity.Animal;
import by.overone.lesson17.zoo.entity.Birds;
import by.overone.lesson17.zoo.entity.Carnivare;
import by.overone.lesson17.zoo.entity.Herbivore;

import java.util.Comparator;

public class ClassComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
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
