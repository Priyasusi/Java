class LocalVariables{
    //LocalVariables are the variables that are declared and used only inside the methods or constructors or blocks and have no accessibility outside that.
    public void getStudentName(){
        //LocalVariable
        String studentName="Priya";
        System.out.println("Student Name is "+studentName);
    }
}
class InstanceVariables{
    //InstanceVariables are the variables that are declared inside the class but outside the methods or constructors or blocks but used everywhere.
    String studentDept;
    int studentAge;
    public InstanceVariables(String studentDept){
        this.studentDept=studentDept;
    }
    public void setStudentAge(int age){
        this.studentAge=age;
    }
    public void displayStudentInfo(){
        System.out.println("Student Department is "+studentDept);
        System.out.println("Student Age is "+studentAge);
    }
}
class StaticVariables{
    //StaticVariables are the variables hat can be accessed from any classes using class name without the objects.
    //StaticVariables are declared using 'static' keyword.
    static String studentGrade;
    static String studentNative;
}
class ConstantVariables{
    //ConstantVariables are variables whose value cannot be changed if once declared.
    //ConstantVariables are declared using 'final' keyword.
    //Variable names of ConstantVariables are usually in Capital letters for simple identification.
    public static final String STUDENTCOLLEGE ="Karpagam College of Engineering.";
}
public class JavaVariablesDemo {
    public static void main(String args[]){

        //Creating instance for LocalVariable class.
        LocalVariables lv1=new LocalVariables();
        lv1.getStudentName();
        //lv1.studentName; This introduces an error since it is a local variable.

        //Creating instance for InstanceVariable class.
        InstanceVariables iv1=new InstanceVariables("ECE");
        iv1.setStudentAge(20);
        iv1.displayStudentInfo();

        //Calling StaticVariable class.
        StaticVariables.studentGrade="A";
        StaticVariables.studentNative="Pollachi";
        System.out.println("Student Grade is "+ StaticVariables.studentGrade);
        System.out.println("Student Native is "+ StaticVariables.studentNative);

        //Calling ConstantVariable class.
        System.out.println("Student College is "+ConstantVariables.STUDENTCOLLEGE);
    }
}
