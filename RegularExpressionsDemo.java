public class RegularExpressionsDemo {
    public static final String STRING_TEST="This is my first RegEX Example";
    public static void main(String args[]){
        //Match any character --> .*
        //Match beginning  character --> .^
        //Match ending character --> .$
        System.out.println(STRING_TEST.matches("\\w.*"));//Returns true if the variable contains a string.
        String[] splitString = STRING_TEST.split("\\s");//Splits the string based on the white space.
        System.out.println(splitString.length);
        //for each loop
        for(String s:splitString){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(STRING_TEST.replaceAll("\\s","\t"));//Replaces the white spaces in the string with tab space.

    }
}
