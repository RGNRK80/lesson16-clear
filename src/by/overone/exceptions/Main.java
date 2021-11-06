package by.overone.exceptions;

public class Main {
    public static void main(String[] args) {
        String xx;
        int d,a;
        int[] arr=new int[5];
        d=0;
        try {
            a = 42 / d;
            arr[6] = 4;
            // вариант 1 раздельно писать
            //  } catch (ArithmeticException ex) {System.out.println("деление на 0");}
            //  catch (IndexOutOfBoundsException ex) {System.out.println("array !!");}


            // вариант 2 через "или"
        } catch (ArithmeticException | IndexOutOfBoundsException ex) {
            System.out.println("поймали парную ошибку:   "+ ex);
            System.out.println(ex.getClass()); // является классом java.lang.ArithmeticException
        }

        System.out.println();

        // можно писать суперкласс-ошибку catch (Exception ex), но он должен быть или единственным или после всех детей





        System.out.println(" выход ");
    }

}
