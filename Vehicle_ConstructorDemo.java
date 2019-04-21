class Vehicle{
    String make;
    String model;
    int year;
    public Vehicle(String make,String model,int year){
        //this keyword is used to assign the value of parameters to the variable declared if the name is same.
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public void start() {
        System.out.println("I am Starting...");
    }
}
public class Vehicle_ConstructorDemo {
    public static void main(String args[]) {
        Vehicle v1=new Vehicle("Ford","Taurus",2012);
        v1.start();
    }
}
