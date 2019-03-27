public class ForLoopInArrays {
    public static void main(String args[])
    {
        int[] numArray={12,11,23,43,54,76};
        //Printing the Array Elements
        for(int i=0;i<numArray.length;i++)
        {
            System.out.print(numArray[i]+" ");
        }
        System.out.println();
        //Printing the Sum of the  Array Elements
        int sum=0;
        for(int i=0;i<numArray.length;i++) {
            sum += numArray[i];
        }
        System.out.println("Sum of the Array Elements is "+sum);
        //Printing the Largest Number of the  Array Elements
        int max=numArray[0];
        for(int i=0;i<numArray.length;i++) {
            if(numArray[i]>max)
            {
                max=numArray[i];
            }
        }
        System.out.println("Largest Number of the Array Elements is "+max);
        //Printing the Smallest Number of the  Array Elements
        int min=numArray[0];
        for(int i=0;i<numArray.length;i++) {
            if(numArray[i]<min)
            {
                min=numArray[i];
            }
        }
        System.out.println(" Smallest Number of the Array Elements is "+min);



    }
}
