import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        int age = 0;
        int favNum = 0;
        double salary = 0;
        double constrained = 0; // must between 100 and 10000
        /*

        firstName = getNonZeroLenString(in, "Enter your first name");

        System.out.println("Fname is " + firstName);


            age  = getInt(in,"Enter your age");
            System.out.println("You said your age is " + age);


        salary = getDouble(in, "Enter your salary");
        System.out.println("Salary is " + salary);



            favNum = getRangedInt(in, "Enter your favorite number", 1, 10);
            System.out.println("Fav num is " + favNum);

         */
        constrained = getRangedDouble(in, "Enter the constrained double", 100, 10000);
        System.out.println("Constrained is " + constrained);
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

    /**
     * Gets an integer from the user via the console within a specified range
     *
     *
     * @param pipe the scanner to use for input
     * @param prompt the prompt to tell the user what is required
     * @param low the inclusive low bound
     * @param high the inclusive high bound
     * @return an int within the specified bounds
     */


    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: ");
                }
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
     * Gets an integer from the user via the console within a specified range
     *
     *
     * @param pipe the scanner to use for input
     * @param prompt the prompt to tell the user what is required
     * @param low the inclusive low bound
     * @param high the inclusive high bound
     * @return a double within the specified bounds
     */


    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: ");
                }
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