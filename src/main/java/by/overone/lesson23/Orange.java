package by.overone.lesson23;

public class Orange extends Fruit {
    public void print() {
        System.out.println(" Orange");
    }

    @Override
    public void clear() {
        System.out.println(" clear Orange");
    }

    @Override
    public void wash() {
        System.out.println(" w Orange");

    }

    @Override
    public void eat() {
        System.out.println(" e Orange");

    }


}
