package by.overone.lesson23_hometask;

public class Num < T extends Number>{
    public T val;

    public Num() {};

    public Num(T val) {
        this.val = val;
    }


    public double multilpikate (double x) {
        var rezult=val.doubleValue() * x;
        if (rezult>Double.MAX_VALUE) {throw new ArithmeticException("double overflow");}
        return (double) rezult;
    }

    public  float multilpikate (float x) {
        var rezult=val.doubleValue() * x;
        if (rezult>Float.MAX_VALUE) {throw new ArithmeticException("float overflow");}
        return (float) rezult;
    }
    public  int multilpikate (int x) {
        var rezult= val.doubleValue() * x;
        if (rezult>Integer.MAX_VALUE) {throw new ArithmeticException("integer overflow");}
        return (int) rezult;
    }
    public  long multilpikate (long x) {
        var rezult= val.doubleValue() * x;
        if (rezult>Long.MAX_VALUE) {throw new ArithmeticException("long overflow");}
        return (long) rezult;
    }
    public  short multilpikate (short x) {
        var rezult=val.doubleValue() * x;
        if (rezult>Short.MAX_VALUE) {throw new ArithmeticException("short overflow");}
        return (short) rezult;
    }
    public  byte multilpikate (byte x) {
        var rezult=val.doubleValue() * x;
        if (rezult>Byte.MAX_VALUE) {throw new ArithmeticException("byte overflow");}
        return (byte) rezult;
    }





    public double division (double x) {
        var rezult=val.doubleValue() / x;
        if (rezult>Double.MAX_VALUE) {throw new ArithmeticException("double overflow");}
        return (double) rezult;
    }

    public  float division (float x) {
        var rezult=val.doubleValue() / x;
        if (rezult>Float.MAX_VALUE) {throw new ArithmeticException("float overflow");}
        return (float) rezult;
    }
    public  int division (int x) {
        var rezult= val.doubleValue() / x;
        if (rezult>Integer.MAX_VALUE) {throw new ArithmeticException("integer overflow");}
        return (int) rezult;
    }
    public  long division (long x) {
        var rezult= val.doubleValue() / x;
        if (rezult>Long.MAX_VALUE) {throw new ArithmeticException("long overflow");}
        return (long) rezult;
    }
    public  short division (short x) {
        var rezult=val.doubleValue() / x;
        if (rezult>Short.MAX_VALUE) {throw new ArithmeticException("short overflow");}
        return (short) rezult;
    }
    public  byte division (byte x) {
        var rezult=val.doubleValue() / x;
        if (rezult>Byte.MAX_VALUE) {throw new ArithmeticException("byte overflow");}
        return (byte) rezult;
    }



    public double addTo (double x) {
        var rezult=val.doubleValue() + x;
        if (rezult>Double.MAX_VALUE) {throw new ArithmeticException("double overflow");}
        return (double) rezult;
    }

    public  float addTo (float x) {
        var rezult=val.doubleValue() + x;
        if (rezult>Float.MAX_VALUE) {throw new ArithmeticException("float overflow");}
        return (float) rezult;
    }

    public  int addTo (int x) {
        var rezult= val.doubleValue() + x;
        if (rezult>Integer.MAX_VALUE) {throw new ArithmeticException("integer overflow");}
        return (int) rezult;
    }
    public  long addTo (long x) {
        var rezult= val.doubleValue() + x;
        if (rezult>Long.MAX_VALUE) {throw new ArithmeticException("long overflow");}
        return (long) rezult;
    }
    public  short addTo (short x) {
        var rezult=val.doubleValue() + x;
        if (rezult>Short.MAX_VALUE) {throw new ArithmeticException("short overflow");}
        return (short) rezult;
    }
    public  byte addTo (byte x) {
        var rezult=val.doubleValue() + x;
        if (rezult>Byte.MAX_VALUE) {throw new ArithmeticException("byte overflow");}
        return (byte) rezult;
    }




    public double subtraction (double x) {
        var rezult=val.doubleValue() - x;
        if (rezult>Double.MAX_VALUE) {throw new ArithmeticException("double overflow");}
        return (double) rezult;
    }

    public  float subtraction (float x) {
        var rezult=val.doubleValue() - x;
        if (rezult>Float.MAX_VALUE) {throw new ArithmeticException("float overflow");}
        return (float) rezult;
    }

    public  int subtraction (int x) {
        var rezult= val.doubleValue() - x;
        if (rezult>Integer.MAX_VALUE) {throw new ArithmeticException("integer overflow");}
        return (int) rezult;
    }
    public  long subtraction (long x) {
        var rezult= val.doubleValue() - x;
        if (rezult>Long.MAX_VALUE) {throw new ArithmeticException("long overflow");}
        return (long) rezult;
    }
    public  short subtraction (short x) {
        var rezult=val.doubleValue() - x;
        if (rezult>Short.MAX_VALUE) {throw new ArithmeticException("short overflow");}
        return (short) rezult;
    }
    public  byte subtraction (byte x) {
        var rezult=val.doubleValue() - x;
        if (rezult>Byte.MAX_VALUE) {throw new ArithmeticException("byte overflow");}
        return (byte) rezult;
    }
}


