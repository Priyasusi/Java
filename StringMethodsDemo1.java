public class StringMethodsDemo1 {
    public static void main(String args[]){
        String s1="Priyadharshini";
        String s2="Poovendhan";
        String s3="";
        String s4=" ";
        System.out.println("Length of s1 is "+s1.length());//Returns Length of the String.
        System.out.println(s1.substring(5));//Return string after mentioned index.
        System.out.println(s2.substring(3,10));//Return string from starting index and the ending index.
        System.out.println(s2.contains("Poo"));//Checks if the mentioned char sequence is present in the string.
        System.out.println(s2.equals("poovendhan"));//checks if the string is equal to the mentioned string.
        System.out.println(s2.equalsIgnoreCase("poovendhan"));//checks if the string is equal to the mentioned string ignoring the cases.
        System.out.println(s3.isEmpty());//checks if the string is empty.
        System.out.println(s4.isEmpty());//returns false sine a space is there.
        System.out.println(String.format("%s", s2));//used as a format specifier to display and format the string.
    }
}
