package by.overone.lesson17.zoo.repository;

import by.overone.lesson17.zoo.bd.Bd;
import by.overone.lesson17.zoo.entity.*;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryList implements BdReposytiry{
    @Override
    public Animal addAnimal(Animal animal) {
        Bd.invNumber++;
        animal.setRegNumber(Bd.invNumber);
        Bd.animals.add(animal);

        return animal;
    }

    @Override
    public Animal remooveAnimal(Animal animal) {
        if (Bd.animals.remove(animal)) {
        return animal;}
        return null;

    }



    @Override
    public Animal remooveAnimalById(int regNumber) {
        for (Animal unit: Bd.animals)
        {
            if (unit.getRegNumber()== regNumber)
            {   Bd.animals.remove(unit);
                return unit;
            }
        }
        return null;
    }

    @Override
    public Animal getAnimalById(int regNumber) {
        for (Animal animal: Bd.animals)
        {
            if (animal.getRegNumber()==regNumber)
            {return animal;           }

        }
        return null;
    }


    @Override
    public List getAnimalByName(String name) {
        List<Animal> units=new ArrayList<>();
        for (Animal animal: Bd.animals)
              {
                  if (animal.getName().equals(name))
                  {units.add(animal);
              }

        }
        //Animal[] rezult=units.toArray(new Animal[0]);
        return units;
    }

    @Override
    public String feed(Animal animal, Meal meal) {
        return animal.feed(meal);
    }

    @Override
    public List getAll() {
        return Bd.animals;
    }

   /* @Override
    public List sortByAge() {
        return null;
    }*/
}
