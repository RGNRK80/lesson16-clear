package by.overone.lesson17.zoo.service;

import by.overone.lesson17.zoo.entity.Animal;
import by.overone.lesson17.zoo.entity.Meal;
import by.overone.lesson17.zoo.repository.BdReposytiry;
import by.overone.lesson17.zoo.repository.UserRepositoryList;

import java.util.List;

public class SeriviceImpl implements ServiceInterface{
    private final BdReposytiry userRepository = new UserRepositoryList();
    @Override
    public Animal addAnimal(Animal animal) {
        return userRepository.addAnimal(animal);
    }

    @Override
    public Animal remooveAnimal(Animal animal) {
        return userRepository.remooveAnimal(animal);
    }

    @Override
    public Animal remooveAnimalById(int regNumber) {
        return userRepository.remooveAnimalById(regNumber);
    }

    @Override
    public Animal getAnimalByInvNumber(int invNumber) {

        return userRepository.getAnimalByInvNumber(invNumber);
    }

    @Override
    public Animal[] getAnimalByName(String name) {                   // вернуть список одноименных
        return userRepository.getAnimalByName(name);
    }

    @Override
    public String feed(Animal animal, Meal meal) {
        return userRepository.feed(animal,meal);
       }

    @Override
    public List getAll() {
        return userRepository.getAll();
    }
}
