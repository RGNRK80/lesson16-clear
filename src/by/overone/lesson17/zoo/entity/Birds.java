package by.overone.lesson17.zoo.entity;

public class Birds extends Animal{
    private int wingMeasure;
    String emotion;

    public Birds(String type, String name,String sex, int age, int wingMeasure) {
        super(type,name,sex,age); //инициализация
        this.wingMeasure = wingMeasure;
    }
    public Birds(){ //создание

    }
    public Birds(Birds bird){   //клон
        super(bird.regNumber,bird.type, bird.name, bird.sex, bird.age);
        this.wingMeasure = bird.wingMeasure;
    }
    public Birds(Animal bird){   //клон
        super(bird.regNumber, bird.type, bird.name, bird.sex, bird.age);
        this.wingMeasure = ((Birds)bird).wingMeasure;
    }

    @Override
    public String feed(Meal meal) {
        if (meal.getType().equals("birdFood")) {emotion=name + " is sings :)";} else {emotion=name + " is outraged :/";}
        return emotion;
    }
}


