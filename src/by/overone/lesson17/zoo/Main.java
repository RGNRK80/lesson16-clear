package by.overone.lesson17.zoo;

import by.overone.lesson17.zoo.bd.Bd;
import by.overone.lesson17.zoo.entity.Animal;
import by.overone.lesson17.zoo.entity.Carnivare;
import by.overone.lesson17.zoo.service.SeriviceImpl;
import by.overone.lesson17.zoo.service.ServiceInterface;

public class Main {
    public static void main(String[] args) {
        ServiceInterface service = new SeriviceImpl();
        Animal animal1=new Carnivare("Lion","Diablo","male",20,9);
        Animal animal2=new Carnivare("Pantera","Bagira","female",5,2);
        Animal animal3=new Carnivare("Crocodile","Alvares","male",37,7);
        service.addAnimal(animal1);
        service.addAnimal(animal2);
        service.addAnimal(animal3);


        System.out.println(Bd.animals.size());
        System.out.println(service.getAnimalByName("Diablo")[0].toString());   //работает












    }
}
