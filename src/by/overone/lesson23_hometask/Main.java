package by.overone.lesson23_hometask;

public class Main {
    public static void main(String[] args) {
        Num xNum=new Num(50.15);
        short x=10;
        System.out.println(xNum.multiplikate(0.5f));
        var z=xNum.multiplikate(x);
        System.out.println(z);
        short z2;
        z2 = xNum.division(x);
        System.out.println(z2);
        z2=xNum.addTo(x);

        Num yNum=new Num((float)4000);
        Num zNum=xNum.multiplikate(yNum);
        System.out.println(zNum.getVal().getClass());



    }
}
