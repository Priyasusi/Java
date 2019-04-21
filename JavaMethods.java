public class JavaMethods {
    //Method that returns empty value.
    public static void greet(String name)
    {
        System.out.println("Hello "+name+"!!!");
    }
    //Method that returns String value.
    public static String displayName(String  name)
    {
        return name;
    }
    //Method that returns int value.
    public static int numAddition(int num1,int num2)
    {
        int sum=num1+num2;
        return sum;
    }
    //Method that returns double value.
    public static double displayCGPA(double cgpa)
    {
        return cgpa;
    }
    //Method that returns boolean value.
    public static boolean checkEvenOdd(int num)
    {
        if(num%2==0)
            return true;
        else
            return false;
    }

    //Main method
    public static void main(String args[])
    {
        greet("Priya");
        System.out.println("Sum of num1 and num2 is "+numAddition(10,8)+".");
        System.out.println("The Name of the student is "+displayName("Priya"));
        System.out.println("The CGPA of the student is "+displayCGPA(9.0));
        System.out.println(checkEvenOdd(10));
    }

}
