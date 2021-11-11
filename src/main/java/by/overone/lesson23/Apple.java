package by.overone.lesson23;

public class Apple extends Fruit{
    @Override
    public void clear() {
        System.out.println(" clear apple");
    }

    @Override
    public void wash() {
        System.out.println(" w apple");

    }

    @Override
    public void eat() {
        System.out.println(" e apple");

    }
}
