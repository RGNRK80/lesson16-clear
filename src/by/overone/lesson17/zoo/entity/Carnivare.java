package by.overone.lesson17.zoo.entity;

public class Carnivare extends Animal{
    private int agroLevel;
    String emotion;

    public Carnivare(String type, String name,String sex, int age, int agroLevel) { //инициализация
        super(type,name,sex,age);
        this.agroLevel = agroLevel;
    }
    public Carnivare(){ //создание

    }
    public Carnivare(Carnivare carnivare){   //клон
        super(carnivare.regNumber, carnivare.type, carnivare.name, carnivare.sex, carnivare.age);
        this.agroLevel = carnivare.agroLevel;
    }

    public Carnivare(Animal carnivare){   //клон
        super(carnivare.regNumber, carnivare.type, carnivare.name, carnivare.sex, carnivare.age);
        this.agroLevel = ((Carnivare)carnivare).agroLevel;

    }
    @Override
    public String feed(Meal meal) {
        if (meal.getType().equals("meat")) {emotion=name + "is rumble :)";} else {emotion=name + " is angry :/";}
        return emotion;
    }

    @Override
    public int compareTo(Animal o) {
        if (this.age==o.age) {return 0;}
        if (this.age<o.age) {return -1;}
        return 1;
    }
}
