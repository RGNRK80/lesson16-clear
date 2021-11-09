package by.overone.lesson23_hometask;

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

    // 2

    public Num<T> sum (Num x1) {
        System.out.println(val + " 1: "+val.getClass());
        Double rez= val.doubleValue() + x1.val.doubleValue();
        checkToOverflow(val,rez);

        T newval=(T) rez;  //  T вдруг становится даблом...
        System.out.println(newval+ " 2: " + newval.getClass());
        Num<T> r = new Num(newval);
        System.out.println(r.val.getClass());
        return r;

    }

    public T mult (T x1) {
        Double rez= val.doubleValue() * x1.doubleValue();
        checkToOverflow(val,rez);
        val=(T) rez;
        return (T)val;
    }
    public T divis (T x1) {
        Double rez= val.doubleValue() / x1.doubleValue();
        checkToOverflow(val,rez);
        val=(T) rez;
        return (T)val;
    }
    public T substr (T x1) {
        Double rez= val.doubleValue() - x1.doubleValue();
        checkToOverflow(val,rez);
        val=(T) rez;
        return (T)val;
    }


    public void checkToOverflow (T unit, Double rezult) {
        if ((unit instanceof Integer) && (rezult>Integer.MAX_VALUE || rezult<Integer.MIN_VALUE)) {
        throw new ArithmeticException("integer overflow");}
        if ((unit instanceof Float) && (rezult>Float.MAX_VALUE || rezult<Float.MIN_VALUE)) {
            throw new ArithmeticException("integer overflow");}
        if ((unit instanceof Double) && (rezult>Double.MAX_VALUE || rezult<Double.MIN_VALUE)) {
            throw new ArithmeticException("integer overflow");}
        if ((unit instanceof Byte) && (rezult>Byte.MAX_VALUE || rezult<Byte.MIN_VALUE)) {
            throw new ArithmeticException("integer overflow");}
        if ((unit instanceof Short) && (rezult>Short.MAX_VALUE || rezult<Short.MIN_VALUE)) {
            throw new ArithmeticException("integer overflow");}

    }


    @Override
    public String toString() {
        return "Num{" +
                "val=" + val +
                '}'+ "Class" + val.getClass();
    }
}


