package by.overone.lesson17.zoo.entity;

public class Carnivare extends Animal{
    private int agroLevel;
    String emotion;

    public Carnivare(String type, String name,String sex, int age, int agroLevel) { //инициализация

        this.type=type;
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.agroLevel = agroLevel;
    }
    public Carnivare(){ //создание

    }
    public Carnivare(Carnivare carnivare){   //клон
        this.regNumber=carnivare.regNumber;
        this.type=carnivare.type;
        this.name=carnivare.name;
        this.sex=carnivare.sex;
        this.age=carnivare.age;
        this.agroLevel = carnivare.agroLevel;
    }


    @Override
    public String feed(Meal meal) {
        if (meal.getType().equals("meat")) {emotion="rumble :)";} else {emotion="angry :/";}
        return null;
    }
}
