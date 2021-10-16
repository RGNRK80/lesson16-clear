package by.overone.lesson17.zoo.service;

import by.overone.lesson17.zoo.entity.Animal;
import by.overone.lesson17.zoo.entity.Meal;

import java.util.List;

public interface ServiceInterface {

    Animal addAnimal(Animal animal);
    Animal remooveAnimal(Animal animal);
    Animal remooveAnimalById(int regNumber);
    Animal getAnimalByInvNumber(int invNumber);
    Animal[] getAnimalByName(String name);
    String feed(Animal animal, Meal meal);
    public List getAll();


}
