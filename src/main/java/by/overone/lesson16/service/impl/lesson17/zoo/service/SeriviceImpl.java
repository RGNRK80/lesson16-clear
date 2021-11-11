package by.overone.lesson16.service.impl.lesson17.zoo.service;

import by.overone.lesson16.service.impl.lesson17.zoo.entity.Animal;
import by.overone.lesson16.service.impl.lesson17.zoo.entity.Meal;
import by.overone.lesson16.service.impl.lesson17.zoo.repository.BdReposytiry;
import by.overone.lesson16.service.impl.lesson17.zoo.repository.UserRepositoryList;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SeriviceImpl implements ServiceInterface{
    ClassComparator classComparator=new ClassComparator();
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
    public Animal getAnimalById(int regNumber) {
        return userRepository.getAnimalById(regNumber);
    }


    @Override
    public List getAnimalByName(String name) {                   // вернуть список одноименных
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

    @Override
    public List getSortedBDByAge() {
        Set<Animal> sorted=new TreeSet<>();
        List<Animal> bdList=userRepository.getAll();
        for (Animal unit: bdList) {
            sorted.add(unit);
            }
        List<Animal> result=new ArrayList<>();
        for (Animal unit: sorted) {result.add(unit);}
        return result;
    }

    @Override
    public List getSortedBDByClass() {
        List<Animal> bdList=userRepository.getAll();
        bdList.sort(classComparator);

        return bdList;
    }
}
