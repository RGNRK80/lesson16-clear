package by.overone.lesson23_hometask;

import java.math.BigDecimal;

public class Num < T extends Number>{

    private T val;
    public Num() {};
    public Num(T val) {
        this.val = val;
    }
    public T getVal() {
        return val;
    }
    public void setVal(T val) {
        this.val = val;
    }

    public double multiplikate (double x) {
        var rezult=val.doubleValue() * x;
        if (rezult>Double.MAX_VALUE || rezult<Double.MIN_VALUE) {throw new ArithmeticException("double overflow");}
        return (double) rezult;
    }

    public  float multiplikate (float x) {
        var rezult=val.doubleValue() * x;
        if (rezult>Float.MAX_VALUE || rezult<Float.MIN_VALUE) {throw new ArithmeticException("float overflow");}
        return (float) rezult;
    }
    public  int multiplikate (int x) {
        var rezult= val.doubleValue() * x;
        if (rezult>Integer.MAX_VALUE || rezult<Integer.MIN_VALUE) {throw new ArithmeticException("integer overflow");}
        return (int) rezult;
    }
    public  long multiplikate (long x) {
        var rezult= val.doubleValue() * x;
        if (rezult>Long.MAX_VALUE || rezult<Long.MIN_VALUE) {throw new ArithmeticException("long overflow");}
        return (long) rezult;
    }
    public  short multiplikate (short x) {
        var rezult=val.doubleValue() * x;
        if (rezult>Short.MAX_VALUE || rezult<Short.MIN_VALUE) {throw new ArithmeticException("short overflow");}
        return (short) rezult;
    }
    public  byte multiplikate (byte x) {
        var rezult=val.doubleValue() * x;
        if (rezult>Byte.MAX_VALUE  || rezult<Byte.MIN_VALUE) {throw new ArithmeticException("byte overflow");}
        return (byte) rezult;
    }

    public Num multiplikate (Num x1) {
        if (x1.val instanceof Long) { Num rez=new Num(multiplikate(x1.val.longValue())); return rez;}
        if (x1.val instanceof Integer) { Num rez=new Num(multiplikate(x1.val.intValue())); return rez;}
        if (x1.val instanceof Float) { Num rez=new Num(multiplikate(x1.val.floatValue())); return rez;}
        if (x1.val instanceof Double) { Num rez=new Num(multiplikate(x1.val.doubleValue())); return rez;}
        if (x1.val instanceof Byte) { Num rez=new Num(multiplikate(x1.val.byteValue())); return rez;}
        if (x1.val instanceof Short) { Num rez=new Num(multiplikate(x1.val.shortValue())); return rez;}

        return null;
    }

    public double division (double x) {
        var rezult=val.doubleValue() / x;
        if (rezult>Double.MAX_VALUE  || rezult<Double.MIN_VALUE) {throw new ArithmeticException("double overflow");}
        return (double) rezult;
    }

    public  float division (float x) {
        var rezult=val.doubleValue() / x;
        if (rezult>Float.MAX_VALUE  || rezult<Float.MIN_VALUE) {throw new ArithmeticException("float overflow");}
        return (float) rezult;
    }
    public  int division (int x) {
        var rezult= val.doubleValue() / x;
        if (rezult>Integer.MAX_VALUE || rezult<Integer.MIN_VALUE) {throw new ArithmeticException("integer overflow");}
        return (int) rezult;
    }
    public  long division (long x) {
        var rezult= val.doubleValue() / x;
        if (rezult>Long.MAX_VALUE || rezult<Long.MIN_VALUE) {throw new ArithmeticException("long overflow");}
        return (long) rezult;
    }
    public  short division (short x) {
        var rezult=val.doubleValue() / x;
        if (rezult>Short.MAX_VALUE || rezult<Short.MIN_VALUE) {throw new ArithmeticException("short overflow");}
        return (short) rezult;
    }
    public  byte division (byte x) {
        var rezult=val.doubleValue() / x;
        if (rezult>Byte.MAX_VALUE || rezult<Byte.MIN_VALUE) {throw new ArithmeticException("byte overflow");}
        return (byte) rezult;
    }

    public Num division (Num x1) {
        if (x1.val instanceof Long) { Num rez=new Num(division(x1.val.longValue())); return rez;}
        if (x1.val instanceof Integer) { Num rez=new Num(division(x1.val.intValue())); return rez;}
        if (x1.val instanceof Float) { Num rez=new Num(division(x1.val.floatValue())); return rez;}
        if (x1.val instanceof Double) { Num rez=new Num(division(x1.val.doubleValue())); return rez;}
        if (x1.val instanceof Byte) { Num rez=new Num(division(x1.val.byteValue())); return rez;}
        if (x1.val instanceof Short) { Num rez=new Num(division(x1.val.shortValue())); return rez;}
        return null;
    }

    public double addTo (double x) {
        var rezult=val.doubleValue() + x;
        if (rezult>Double.MAX_VALUE || rezult<Double.MIN_VALUE) {throw new ArithmeticException("double overflow");}
        return (double) rezult;
    }

    public  float addTo (float x) {
        var rezult=val.doubleValue() + x;
        if (rezult>Float.MAX_VALUE || rezult<Float.MIN_VALUE) {throw new ArithmeticException("float overflow");}
        return (float) rezult;
    }

    public  int addTo (int x) {
        var rezult= val.doubleValue() + x;
        if (rezult>Integer.MAX_VALUE || rezult<Integer.MIN_VALUE) {throw new ArithmeticException("integer overflow");}
        return (int) rezult;
    }
    public  long addTo (long x) {
        var rezult= val.doubleValue() + x;
        if (rezult>Long.MAX_VALUE || rezult<Long.MIN_VALUE) {throw new ArithmeticException("long overflow");}
        return (long) rezult;
    }
    public  short addTo (short x) {
        var rezult=val.doubleValue() + x;
        if (rezult>Short.MAX_VALUE || rezult<Short.MIN_VALUE) {throw new ArithmeticException("short overflow");}
        return (short) rezult;
    }
    public  byte addTo (byte x) {
        var rezult=val.doubleValue() + x;
        if (rezult>Byte.MAX_VALUE || rezult<Byte.MIN_VALUE) {throw new ArithmeticException("byte overflow");}
        return (byte) rezult;
    }

    public Num addTo (Num x1) {
        if (x1.val instanceof Long) { Num rez=new Num(addTo(x1.val.longValue())); return rez;}
        if (x1.val instanceof Integer) { Num rez=new Num(addTo(x1.val.intValue())); return rez;}
        if (x1.val instanceof Float) { Num rez=new Num(addTo(x1.val.floatValue())); return rez;}
        if (x1.val instanceof Double) { Num rez=new Num(addTo(x1.val.doubleValue())); return rez;}
        if (x1.val instanceof Byte) { Num rez=new Num(addTo(x1.val.byteValue())); return rez;}
        if (x1.val instanceof Short) { Num rez=new Num(addTo(x1.val.shortValue())); return rez;}
        return null;
    }

    public double subtraction (double x) {
        var rezult=val.doubleValue() - x;
        if (rezult>Double.MAX_VALUE || rezult<Double.MIN_VALUE) {throw new ArithmeticException("double overflow");}
        return (double) rezult;
    }

    public  float subtraction (float x) {
        var rezult=val.doubleValue() - x;
        if (rezult>Float.MAX_VALUE || rezult<Float.MIN_VALUE) {throw new ArithmeticException("float overflow");}
        return (float) rezult;
    }

    public  int subtraction (int x) {
        var rezult= val.doubleValue() - x;
        if (rezult>Integer.MAX_VALUE || rezult<Integer.MIN_VALUE) {throw new ArithmeticException("integer overflow");}
        return (int) rezult;
    }
    public  long subtraction (long x) {
        var rezult= val.doubleValue() - x;
        if (rezult>Long.MAX_VALUE || rezult<Long.MIN_VALUE) {throw new ArithmeticException("long overflow");}
        return (long) rezult;
    }
    public  short subtraction (short x) {
        var rezult=val.doubleValue() - x;
        if (rezult>Short.MAX_VALUE || rezult<Short.MIN_VALUE) {throw new ArithmeticException("short overflow");}
        return (short) rezult;
    }
    public  byte subtraction (byte x) {
        var rezult=val.doubleValue() - x;
        if (rezult>Byte.MAX_VALUE || rezult<Byte.MIN_VALUE) {throw new ArithmeticException("byte overflow");}
        return (byte) rezult;
    }

    public Num subtraction (Num x1) {
        if (x1.val instanceof Long) { Num rez=new Num(subtraction(x1.val.longValue())); return rez;}
        if (x1.val instanceof Integer) { Num rez=new Num(subtraction(x1.val.intValue())); return rez;}
        if (x1.val instanceof Float) { Num rez=new Num(subtraction(x1.val.floatValue())); return rez;}
        if (x1.val instanceof Double) { Num rez=new Num(subtraction(x1.val.doubleValue())); return rez;}
        if (x1.val instanceof Byte) { Num rez=new Num(subtraction(x1.val.byteValue())); return rez;}
        if (x1.val instanceof Short) { Num rez=new Num(subtraction(x1.val.shortValue())); return rez;}
        return null;
    }



    // Исполнение 2




    public Num<T> getCl (T unit, Double rezult) {
        if (val instanceof Integer) {Num<Integer> rint = new Num(rezult.intValue()); return (Num<T>) rint; }
        if (val instanceof Long) {Num<Integer> rint = new Num(rezult.longValue());return (Num<T>) rint; }
        if (val instanceof Short) {Num<Integer> rint = new Num(rezult.shortValue()); return (Num<T>) rint;}
        if (val instanceof Byte) {Num<Integer> rint = new Num(rezult.byteValue());return (Num<T>) rint; }
        if (val instanceof Float) {Num<Integer> rint = new Num(rezult.floatValue());return (Num<T>) rint; }
        if (val instanceof Double) {Num<Integer> rint = new Num(rezult);return (Num<T>) rint;}

        return null;
    }


    public Num<T> sum(Num x1) {


        BigDecimal val1=new BigDecimal(val.doubleValue());
        BigDecimal val2=new BigDecimal(x1.val.doubleValue());
        BigDecimal val3=val1.add(val2);
        BigDecimal valCh1=new BigDecimal(Double.MAX_VALUE);
        BigDecimal valCh2=new BigDecimal(Double.MIN_VALUE);
        if (val3.compareTo(valCh1)>0 || val3.compareTo(valCh2)<0) {
            throw new ArithmeticException("Double overflow");}



        Double rez = val.doubleValue() + x1.val.doubleValue();
        checkToOverflow(val, rez);
        Num<T> r = getCl(val, rez);
        return r;
    }

    public Num<T> mult (Num x1) {


        BigDecimal val1=new BigDecimal(val.doubleValue());
        BigDecimal val2=new BigDecimal(x1.val.doubleValue());
        BigDecimal val3=val1.multiply(val2);
        BigDecimal valCh1=new BigDecimal(Double.MAX_VALUE);
        BigDecimal valCh2=new BigDecimal(Double.MIN_VALUE);
        if (val3.compareTo(valCh1)>0 || val3.compareTo(valCh2)<0) {
            throw new ArithmeticException("Double overflow");}


        Double rez = val.doubleValue() * x1.val.doubleValue();
        checkToOverflow(val, rez);
        Num<T> r = getCl(val, rez);
        return r;
    }
    public Num<T> divis (Num x1) {

        BigDecimal val1=new BigDecimal(val.doubleValue());
        BigDecimal val2=new BigDecimal(x1.val.doubleValue());
        BigDecimal val3=val1.divide(val2);
        BigDecimal valCh1=new BigDecimal(Double.MAX_VALUE);
        BigDecimal valCh2=new BigDecimal(Double.MIN_VALUE);
        if (val3.compareTo(valCh1)>0 || val3.compareTo(valCh2)<0) {
            throw new ArithmeticException("Double overflow");}



        Double rez = val.doubleValue() / x1.val.doubleValue();
        checkToOverflow(val, rez);
        Num<T> r = getCl(val, rez);
        return r;
    }
    public Num<T> substr (Num x1) {

        BigDecimal val1=new BigDecimal(val.doubleValue());
        BigDecimal val2=new BigDecimal(x1.val.doubleValue());
        BigDecimal val3=val1.subtract(val2);
        BigDecimal valCh1=new BigDecimal(Double.MAX_VALUE);
        BigDecimal valCh2=new BigDecimal(Double.MIN_VALUE);


        if (val3.compareTo(valCh1)>0 || val3.compareTo(valCh2)<0) {
            throw new ArithmeticException("Double overflow");}

        Double rez = val.doubleValue() - x1.val.doubleValue();
        checkToOverflow(val, rez);
        Num<T> r = getCl(val, rez);
        return r;
    }


    public void checkToOverflow (T unit, Double rezult) {
        if ((unit instanceof Integer) && (rezult>Integer.MAX_VALUE || rezult<Integer.MIN_VALUE)) {
            throw new ArithmeticException("integer overflow");}
        if ((unit instanceof Float) && (rezult>Float.MAX_VALUE || rezult<Float.MIN_VALUE)) {
            throw new ArithmeticException("float overflow");}
        if ((unit instanceof Double) && (rezult>Double.MAX_VALUE || rezult<Double.MIN_VALUE)) {
            throw new ArithmeticException("Double overflow");}
        if ((unit instanceof Byte) && (rezult>Byte.MAX_VALUE || rezult<Byte.MIN_VALUE)) {
            throw new ArithmeticException("Byte overflow");}
        if ((unit instanceof Short) && (rezult>Short.MAX_VALUE || rezult<Short.MIN_VALUE)) {
            throw new ArithmeticException("Short overflow");}

    }


    @Override
    public String toString() {
        return "Num{" +
                "val=" + val +
                '}'+ "Class" + val.getClass();
    }
}


