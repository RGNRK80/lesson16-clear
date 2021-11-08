package by.overone.lesson23_hometask;

public class Main {
    public static void main(String[] args) {
        Num xNum=new Num(50.15);
        short x=10;
        System.out.println(xNum.multilpikate(0.5));
        var z=xNum.multilpikate(x);
        System.out.println(z);
        short z2;
        z2 = xNum.division(x);
        System.out.println(z2);
        z2=xNum.addTo(x);
        System.out.println(z2);


    }
}
