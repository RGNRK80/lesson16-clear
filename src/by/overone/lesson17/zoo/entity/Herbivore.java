package by.overone.lesson17.zoo.entity;

public class Herbivore extends Animal{
    private String habitate; // проживание
    String emotion;

    public Herbivore(String type, String name,String sex, int age, String habitate) { //инициализация

        this.type=type;
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.habitate = habitate;
    }
    public Herbivore(){ //создание

    }
    public Herbivore(Herbivore herbivore){   //клон
        this.regNumber=herbivore.regNumber;
        this.type=herbivore.type;
        this.name=herbivore.name;
        this.sex=herbivore.sex;
        this.age=herbivore.age;
        this.habitate = herbivore.habitate;
    }
    public Herbivore(Animal herbivore){   //клон
        this.regNumber=herbivore.regNumber;
        this.type=herbivore.type;
        this.name=herbivore.name;
        this.sex=herbivore.sex;
        this.age=herbivore.age;
        this.habitate = ((Herbivore)herbivore).habitate;
    }

    @Override
    public String feed(Meal meal) {
        if (meal.getType().equals("grass")) {emotion="joy :)";} else {emotion="cry :/";}
        return emotion;
    }
}
