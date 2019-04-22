public class StringMethodsDemo2 {
    public static void main(String args[]){
        String s1="Priyadharshini";
        String s2="Poovendhan";
        String s3="priya";
        String s4="POOVENDHAN";
        String s5="       BilluSusi      ";
        int age=24;
        String nameArray="Priya Poovendhan Keerthi";
        String[] nameSplit=nameArray.split("\\s+");
        System.out.println(s1.concat(s2));
        System.out.println(s1.replace("dharshini","vendhan"));
        System.out.println(s3.toUpperCase());
        System.out.println(s4.toLowerCase());
        System.out.println(s5.trim());
        System.out.println(String.valueOf(age));
        for(String s:nameSplit){
            System.out.println("Name is "+s);
        }

    }
}
