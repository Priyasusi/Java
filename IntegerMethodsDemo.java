public class IntegerMethodsDemo {
    public static void main(String args[]) {
        Integer i1 = 100;
        Integer i2 = 75;
        Integer i3 = 50;
        Integer i4 = 100;
        System.out.println(i1.intValue());//Returns the integer value of i1.
        System.out.println(i2.doubleValue());//Returns the double value of i2.
        System.out.println(i3.floatValue());//Returns the float value of i3.
        System.out.println(Integer.parseInt("280508"));//Returns the integer value of the mentioned string.
        System.out.println(Integer.compare(i1, i4));//Returns 0 if  i1 = i2.
        System.out.println(Integer.compare(i4, i2));//Returns 1 if  i1 > i2.
        System.out.println(Integer.compare(i3, i4));//Returns -1 if i1 < i2.
        System.out.println(i1.equals(i4));//Returns true if i1 = i4 else returns false.
        System.out.println(i2.equals(i3));//Returns true if i2 = i3 else returns false.
    }
}

