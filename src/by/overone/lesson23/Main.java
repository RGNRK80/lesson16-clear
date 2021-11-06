package by.overone.lesson23;

public class Main {
    public static void main(String[] args) {
        B d=new B(7);
        System.out.println(d.a + " "+ d.b + " " + d.c);
        Apple apple=new Apple();
        Orange orange=new Orange();
        Cart<Orange> orangeCart=new Cart<>();

        Cart<Apple> cart = new Cart<>();
        Cart<Orange> cart1 = new Cart<>();
        Cart<Fruit> cart2 = new Cart<>();

        cart.setItem(apple);
        cart2.setItem(orange);



    }
}
