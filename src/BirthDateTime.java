import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int lowMonth = 1;
        int highMonth = 0;

        year = SafeInput.getRangedInt(in, "Enter your year of birth", 1950, 2015 );
        month = SafeInput.getRangedInt(in, "Enter your month", 1, 12);

        switch (month)

        {
            case 2:
                highMonth = 29;
                break;
            case 1, 3, 5, 7, 9, 10, 12:
                highMonth = 31;
                break;
            case 4, 6, 8, 11:
                highMonth = 30;
        }

            day = SafeInput.getRangedInt(in, "Enter your day of birth", lowMonth, highMonth);
            hour = SafeInput.getRangedInt(in, "Enter your hour of birth", 1, 12);
            minute = SafeInput.getRangedInt(in, "Enter your minute of birth", 0, 59);

        System.out.println("You said you were born on " + month + "/" + day + "/" + year + " at " + hour + ":" + minute);

    }


}
