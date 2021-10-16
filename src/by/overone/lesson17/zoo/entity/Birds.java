package by.overone.lesson17.zoo.entity;

public class Birds extends Animal{
    private int wingMeasure;
    String emotion;

    public Birds(String type, String name,String sex, int age, int wingMeasure) { //инициализация

        this.type=type;
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.wingMeasure = wingMeasure;
    }
    public Birds(){ //создание

    }
    public Birds(Birds bird){   //клон
        this.regNumber=bird.regNumber;
        this.type=bird.type;
        this.name=bird.name;
        this.sex=bird.sex;
        this.age=bird.age;
        this.wingMeasure = bird.wingMeasure;
    }
    public Birds(Animal bird){   //клон
        this.regNumber=bird.regNumber;
        this.type=bird.type;
        this.name=bird.name;
        this.sex=bird.sex;
        this.age=bird.age;
        this.wingMeasure = ((Birds)bird).wingMeasure;
    }

    @Override
    public String feed(Meal meal) {
        if (meal.getType().equals("birdFood")) {emotion="sings :)";} else {emotion="outraged :/";}
        return emotion;
    }
}


