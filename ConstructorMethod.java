//Constructor Method Demo.
//Constructor Method is a method that has same as the class name.
//Constructor Method may be a Parameterised  Constructor or Non-Parameterised  Constructor.
//Constructor Method should not have a return type.
class ConstructorMethod1 {
     //Default Constructor.
     public ConstructorMethod1() {
         System.out.println("This is the Constructor Method");
     }
     //Parameterised  Constructor.
     public ConstructorMethod1(String param) {
         System.out.println("This is the Constructor Method with "+param);
     }
     public static void instanceMethod(){
         System.out.println("This is an Instance Method");
     }

}
public class ConstructorMethod{

    public static void main(String args[])
    {
        ConstructorMethod1 cm1= new ConstructorMethod1();//Calling the Default Constructor.
        cm1.instanceMethod();
        ConstructorMethod1 cm2= new ConstructorMethod1("Parameter");//Calling the Parameterised  Constructor.

    }
}
