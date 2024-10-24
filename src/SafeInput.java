import java.util.Scanner;

public class SafeInput
{



    /**
     * Get a non-zero length String from the user
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString (Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    /**
     * Get any integer from the user with input validation
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a valid integer
     */
    public static int getInt (Scanner pipe, String prompt){
        int retValue = 0;
        boolean valid = false;
        String trash = "";

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                valid = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer! You entered: " + trash);
            }
            pipe.nextLine(); // clear the buffer
        } while (!valid);

        return retValue;
    }

    /**
     * Get any double value from the user with input validation
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a valid double
     */
    public static double getDouble (Scanner pipe, String prompt){
        double retValue = 0;
        boolean valid = false;
        String trash = "";

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                valid = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double! You entered: " + trash);
            }
            pipe.nextLine(); // clear the buffer
        } while (!valid);

        return retValue;
    }

    /**
     * Get an integer within a specified range from the user
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low the lowest acceptable value
     * @param high the highest acceptable value
     * @return a valid integer within the range
     */
    public static int getRangedInt (Scanner pipe, String prompt,int low, int high){
        int retValue = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                if (retValue >= low && retValue <= high) {
                    valid = true;
                } else {
                    System.out.println("The number must be between " + low + " and " + high);
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a valid integer! You entered: " + trash);
            }
            pipe.nextLine(); // clear the buffer
        } while (!valid);

        return retValue;
    }

    /**
     * Get a double within a specified range from the user
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low the lowest acceptable value
     * @param high the highest acceptable value
     * @return a valid double within the range
     */
    public static double getRangedDouble (Scanner pipe, String prompt,double low, double high){
        double retValue = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                if (retValue >= low && retValue <= high) {
                    valid = true;
                } else {
                    System.out.println("The number must be between " + low + " and " + high);
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("You must enter a valid double! You entered: " + trash);
            }
            pipe.nextLine(); // clear the buffer
        } while (!valid);

        return retValue;
    }

    /**
     * Get a yes or no (Y/N) confirmation from the user
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return true for "Y" and false for "N"
     */
    public static boolean getYNConfirm (Scanner pipe, String prompt){
        boolean retValue = false;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            String response = pipe.nextLine().trim();
            if (response.equalsIgnoreCase("Y")) {
                retValue = true;
                valid = true;
            } else if (response.equalsIgnoreCase("N")) {
                retValue = false;
                valid = true;
            } else {
                System.out.println("You must enter Y or N. You entered: " + response);
            }
        } while (!valid);

        return retValue;
    }

    /**
     * Get a string that matches a specific regular expression
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx the regular expression the input must match
     * @return a String that matches the regular expression
     */
    public static String getRegExString (Scanner pipe, String prompt, String regEx){
        String retString = "";
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
            if (retString.matches(regEx)) {
                valid = true;
            } else {
                System.out.println("The input does not match the required format: " + regEx);
            }
        } while (!valid);

        return retString;
    }
}
