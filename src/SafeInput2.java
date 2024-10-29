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
    /**
     * Gets a Y or N from the user (yes or no) and returns the equivalent  true or false
     *
     * @param pipe scanner to use for input
     * @param prompt tells the user what to enter
     * @return true or false
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String YNResponse = "";
        boolean retVal = false;
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            YNResponse = pipe.nextLine();

            if(!YNResponse.matches("[YyNn]"))
            {
                System.out.println("You must enter [Y/N]: ");
            }
            else
            {
                done = true;
                switch(YNResponse)
                {
                    case "Y":
                    case "y":
                        retVal = true;
                        break;
                    case "N":
                    case "n":
                        retVal = false;
                        break;

                }

            }

        }while(!done);

        return retVal;
    }

        /**
         * Prints a pretty header with a centered message.
         *
         * @param msg The message to center in the header
         */
        public static void prettyHeader(String msg) {
            final int totalWidth = 60;
            final int padding = 3; // Number of asterisks on either side
            int messageLength = msg.length();

            int availableWidth = totalWidth - 2 * padding; // Minus padding for asterisks
            String formattedMsg;

            if (messageLength > availableWidth) {
                formattedMsg = msg.substring(0, availableWidth - 3) + "..."; // Truncate with ellipsis
            } else {
                int spacesBefore = (availableWidth - messageLength) / 2;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < spacesBefore; i++) {
                    sb.append(" ");
                }
                formattedMsg = sb.toString() + msg;
            }

            for (int i = 0; i < totalWidth; i++) {
                System.out.print("*");
            }
            System.out.println();

            System.out.print("***");
            System.out.print(formattedMsg);
            System.out.println("                         ***");


            for (int i = 0; i < totalWidth; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



