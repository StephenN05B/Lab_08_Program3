import java.util.Scanner;

public class CToFTableDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = SafeInput.getRangedDouble(scanner, "Enter a Celsius temperature", -100.0, 100.0);

        double fahrenheit = CtoF(celsius);

        System.out.printf("%.1f Celsius is %.1f Fahrenheit.%n", celsius, fahrenheit);

        scanner.close();
    }


    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}
