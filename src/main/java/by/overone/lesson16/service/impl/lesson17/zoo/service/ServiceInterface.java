package by.overone.lesson16.service.impl.lesson17.zoo.service;

import by.overone.lesson16.service.impl.lesson17.zoo.entity.Animal;
import by.overone.lesson16.service.impl.lesson17.zoo.entity.Meal;

import java.util.List;

public interface ServiceInterface {

    Animal addAnimal(Animal animal);
    Animal remooveAnimal(Animal animal);
    Animal remooveAnimalById(int regNumber);
    Animal getAnimalById(int regNumber);

    List getAnimalByName(String name);
    String feed(Animal animal, Meal meal);
    List getAll();
    List  getSortedBDByAge();
    List getSortedBDByClass();

}
