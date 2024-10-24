import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        int age = 0;
        double salary = 0;
        /*

        firstName = getNonZeroLenString(in, "Enter your first name");

        System.out.println("Fname is " + firstName);


            age  = getInt(in,"Enter your age");
            System.out.println("You said your age is " + age);

         */
        salary = getDouble(in, "Enter your salary");
        System.out.println("Salary is " + salary);
    }



    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if(retVal.isEmpty())
                System.out.println("You must enter at least one character");

        }while(retVal.isEmpty());

        return retVal;
    }



}