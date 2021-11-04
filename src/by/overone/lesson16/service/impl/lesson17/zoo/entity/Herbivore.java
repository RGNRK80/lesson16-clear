package by.overone.lesson16.service.impl.lesson17.zoo.entity;

public class Herbivore extends Animal{
    private String habitate; // проживание
    String emotion;

    public Herbivore(String type, String name,String sex, int age, String habitate) { //инициализация
        super(type,name,sex,age);
        this.habitate = habitate;
    }
    public Herbivore(){ //создание

    }
    public Herbivore(Herbivore herbivore){   //клон
        super(herbivore.regNumber, herbivore.type, herbivore.name, herbivore.sex, herbivore.age);
        this.habitate = herbivore.habitate;
    }
    public Herbivore(Animal herbivore){   //клон
        super(herbivore.regNumber, herbivore.type, herbivore.name, herbivore.sex, herbivore.age);
        this.habitate = ((Herbivore)herbivore).habitate;
    }

    @Override
    public String feed(Meal meal) {
        if (meal.getType().equals("grass")) {emotion=name + " is joy :)";} else {emotion=name + " is cry :/";}
        return emotion;
    }

    @Override
    public int compareTo(Animal o) {
        if (this.age==o.age) {return 0;}
        if (this.age<o.age) {return -1;}
        return 1;
    }
}
