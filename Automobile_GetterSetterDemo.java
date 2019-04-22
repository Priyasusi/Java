class Automobile {
    String make;
    String model;
    int year;
    public Automobile(){}
    //Parameterised Constructor
    public Automobile( String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    //Getter Methods
    //Getter Methods are the methods used to get the value of the private variable.
    //Getter Methods are instance methods(cannot be static).
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    //Setter Methods
    //Setter Methods are the methods used to set the value of the private variable.
    //Setter Methods do not have a returntype and are parameterized.
    public  void setMake(String make) {
        this.make=make;
    }
    public  void setModel(String model) {
        this.model=model;
    }
    public  void setYear(int year) {
        this.year=year;
    }
}
public class Automobile_GetterSetterDemo {
    public  static void main(String args[]){
        //The values to the variable can be assinged by parameterised constructor or setter methods.
        Automobile a1=new Automobile("Ford","Taurus",2015);
        System.out.println(a1.getMake());
        System.out.println(a1.getModel());
        System.out.println(a1.getYear());
        Automobile a2=new Automobile();
        a2.setMake("Maruti");
        a2.setModel("maruti 800");
        a2.setYear(2008);
        System.out.println(a2.getMake());
        System.out.println(a2.getModel());
        System.out.println(a2.getYear());
    }
}
