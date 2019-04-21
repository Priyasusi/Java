//Instance Methods Demo
// Instance methods are the methods that require an instance/object for calling.
class Student {
    public void studentName(String name) {
        System.out.println("Student Name is "+name);
    }
    public void studentGrade(char grade) {
        System.out.println("Student Grade is "+grade);
    }
    //Static method
    public static void studentDept(String dep)
    {
        System.out.println("Student Department is "+dep);
    }
}
public class InstanceMethods {
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.studentName("Priya");
        s1.studentGrade('A');
        //Static Methods can also be called with objects or the Class Name.
        s1.studentDept("ECE");

        Student s2=new Student();
        s2.studentName("Keerthi");
        s2.studentGrade('O');
        //Static Methods can also be called with objects or the Class Name.
        Student.studentDept("EEE");
    }
    }

