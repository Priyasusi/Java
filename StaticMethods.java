//Static Methods Demo
//Static methods are the methods that donot need an object for calling.
//Static Methods can also be called with objects or the Class Name.
public class StaticMethods {
    public static void main(String args[]) {
        dogName("Jimmy");
        dogBark();
    }
    public static  void dogName(String name) {
        System.out.println("I am "+name);
    }
    public static  void dogBark() {
        System.out.println("I am Barking");
    }
}
