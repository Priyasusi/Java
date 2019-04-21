class Customer{
    public void Customer_ConstructorDemo(){
        System.out.println("Welcome!!!");
    }
    //Instance Method to get customer name.
    public void getCustomerName(String cName) {
        System.out.println("Customer Name is "+cName);
    }
}
public class Customer_ConstructorDemo {
    public static void main(String args[]) {
        Customer c1 = new Customer();
        c1.getCustomerName("Billu");
    }
}

