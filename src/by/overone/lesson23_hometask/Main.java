package by.overone.lesson23_hometask;

public class Main {
    public static void main(String[] args) {
        Num<Float> xNum=new Num(50.15);
        short x=10;
        System.out.println(xNum.multiplikate(0.5f));
        var z=xNum.multiplikate(x);
        System.out.println(z);
        short z2;
        z2 = xNum.division(x);
        System.out.println(z2);
        z2=xNum.addTo(x);

        Num<Float> yNum=new Num(4000);
        Num zNum=xNum.multiplikate(yNum);
        System.out.println(zNum.getVal().getClass());
        zNum=xNum.addTo(yNum);

// 2 метод
        System.out.println("----2----");

        Num<Integer> numInt1=new Num<>(150);
        System.out.println(numInt1);  //+
        Num<Integer> numInt2=new Num<>(500);
        System.out.println(numInt2);  //+
        Num<Double> numDou1=new Num<>(50.50);
        System.out.println(numDou1);  //+

      Num<Integer> numInt3=numInt1.sum(numInt2);
        System.out.println(numInt3);




    }
}
