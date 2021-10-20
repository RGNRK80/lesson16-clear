package by.overone.lesson17.zoo.repository;

import by.overone.lesson17.zoo.entity.Animal;
import by.overone.lesson17.zoo.entity.Meal;

import java.util.List;

public interface BdReposytiry {
    Animal addAnimal(Animal animal);
    Animal remooveAnimal(Animal animal);
    Animal remooveAnimalById(int regNumber);
    Animal getAnimalById(int regNumber);

    List getAnimalByName(String name);
    String feed(Animal animal, Meal meal);
    List getAll();
}
