import java.util.Scanner;

public class PrettyHeader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a message for the header: ");
        String userMessage = scanner.nextLine();


        SafeInput2.prettyHeader(userMessage);

        scanner.close();
    }
}
