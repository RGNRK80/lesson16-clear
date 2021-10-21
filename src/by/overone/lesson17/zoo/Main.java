package by.overone.lesson17.zoo;

import by.overone.lesson17.zoo.bd.Bd;
import by.overone.lesson17.zoo.entity.*;
import by.overone.lesson17.zoo.service.SeriviceImpl;
import by.overone.lesson17.zoo.service.ServiceInterface;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceInterface service = new SeriviceImpl();
        // БД животных
        Animal animal1=new Carnivare("Lion","Diablo","male",20,9);
        Animal animal2=new Carnivare("Lion","Diablo","male",15,2);
        Animal animal3=new Carnivare("Panther","Bagira","female",5,2);
        Animal animal4=new Carnivare("Crocodile","Alvares","male",37,7);

        Animal animal5=new Birds("Parrot Ara","Gosha","male",3,100);
        Animal animal6=new Birds("Parrot Ara","Lara","female",2,92);
        Animal animal7=new Birds("Kiwi","Jo","male",5,15);
        Animal animal8=new Birds("Kiwi","Maya","female",3,15);

        Animal animal9=new Herbivore("Zebra","Max","male",10,"Africa");
        Animal animal10=new Herbivore("Beaver","Earflap","male",2,"Europe");
        Animal animal11=new Herbivore("Koala","Sleepyhead","female",5,"China");
        Animal animal12=new Herbivore("Deer","Sokha","male",1,"Siberia");

        // заполняем зоопарк
        service.addAnimal(animal1);
        service.addAnimal(animal2);
        service.addAnimal(animal3);
        service.addAnimal(animal4);

        service.addAnimal(animal5);
        service.addAnimal(animal6);
        service.addAnimal(animal7);
        service.addAnimal(animal8);

        service.addAnimal(animal9);
        service.addAnimal(animal10);
        service.addAnimal(animal11);
        service.addAnimal(animal12);

        getAllAnimals(service.getAll());

        // Еда
        Meal mealForCarnivare=new Meal("meat");
        Meal mealForBirds=new Meal("birdFood");
        Meal mealForHerbivore=new Meal("grass");

        // кормим
        System.out.println(service.feed(service.getAnimalById(2),mealForCarnivare));       // из бд по инв номеру
        System.out.println(service.feed((Animal) service.getAnimalByName("Diablo").get(0),mealForBirds)); // из бд по имени
        System.out.println(service.feed(animal5,mealForBirds));           // просто покормить
        System.out.println(service.feed(animal9,mealForHerbivore));           // просто покормить


        service.remooveAnimal(animal1);
        service.remooveAnimal(animal1);
        getAllAnimals(service.getAll());
        System.out.println(service.remooveAnimalById(3)); //+
        System.out.println(Bd.animals.size());
        System.out.println(service.getAnimalByName("Diablo"));

        System.out.println(animal5.compareTo(animal6));
        System.out.println("-----------sorted1-----------------");
        System.out.println(service.getSortedBDByAge());
        System.out.println("-----------sorted2-----------------");
        List<Animal> sortedClass= new ArrayList<>();
        sortedClass=service.getSortedBDByClass();

        for (Animal unit: sortedClass)
              {
                  System.out.println(unit.getClass().toString().substring(37) + "     " + unit);

        }


    }

    public static void getAllAnimals(List<Animal> units){
        for (Animal animal: units) {
            System.out.println(animal);
        }
    }

}
