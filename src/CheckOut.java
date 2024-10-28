import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        int numItems = 0;
        boolean done = false;


        do{
            itemPrice = SafeInput.getRangedDouble(in, "Enter the item price", .50, 10.00);
            numItems++;
            totalPrice += itemPrice;
            done = SafeInput.getYNConfirm(in, "Are you done?");
        }while(!done);
        System.out.println("You have " + numItems + " for a total of " + totalPrice);
    }
}

