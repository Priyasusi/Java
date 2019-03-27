public class StringInterpolation {
    public static void main(String args[])
    {
        String studentName="Poovendhan";
        int studentAge=23;
        String studentDept="ECE";
        String studentNative="Erode";
        //Before StringInterpolation
        System.out.println("Student Details Before StringInterpolation\nName of the Student:"+studentName+"\nAge of the Student:"+studentAge+"\nDepartment of the Student:"+studentDept+"\nNative of the Student:"+studentNative);
        //After StringInterpolation
        System.out.println(String.format("Student Details After StringInterpolation\nName of the Student:%s\nAge of the Student:%d\nDepartment of the Student:%s\nNative of the Student:%s",studentName,studentAge,studentDept,studentNative));
    }
}
