import java.util.Scanner;

public class SafeInput2
{

    /**
     * Gets a string from the user using the console, must be at least one character
     *
     *
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt tells the user what to enter
     * @return a String of at least character
     */
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

    /**
     * get an int value from the user at the console with no constraint
     *
     *
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt tells the user what to enter
     * @return an int of any value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }



        }while(!done);

        return retVal;
    }

    /**
     * get a double value from the user at the console with no constraint
     *
     *
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt tells the user what to enter
     * @return a double of any value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }



        }while(!done);

        return retVal;
    }

}

