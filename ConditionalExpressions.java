public class ConditionalExpressions {
    public static void main(String args[])
    {
        ConditionalExpressions ce=new ConditionalExpressions();
        int balance=1000000;
        int age=65;
        //OR ConditionalExpressions
        if(balance>=1000000 || age>=65)
        {
            System.out.println("You reached the retirement age.Good luck.");
        }
        else
        {
            System.out.println("You are still young to work. ");
        }
        //AND ConditionalExpressions
        double grade=8.95;
        if(grade>9)
        {
            System.out.println("You are a awesome student");
        }
        else if (grade>8.5 && grade<9)
        {
            System.out.println("You are a great student");
        }
        //Switch ConditionalExpressions
        char grade1='A';
        switch (grade1)
        {
            case 'A': System.out.println("You are a awesome student");
            break;
            case 'B':System.out.println("You are a great student");
            break;
            case 'C':System.out.println("You are a average student");
            break;
            default:System.out.println("Failed");
            break;
        }
        }

    }

