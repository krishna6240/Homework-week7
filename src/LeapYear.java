import java.io.IOException;
import java.util.Scanner;

/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * Write another method getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above.
 */
public class LeapYear {
    static int year;
    static int month;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any year:");
        year = input.nextInt();
        System.out.println("enter any month:");
        month = input.nextInt();
        getDayInMonth(month, year);
        isLeapYear(year);
        input.close();
    }


    public static boolean isLeapYear(int year) {
        boolean isLeap = false;

        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;//year%400==0 else
            } else
                isLeap = true;//year%100==0 else
        } else {
            isLeap = false;//year%4==0 else

        }

        if (isLeap == true)
            System.out.println(year + "True");
        else
            System.out.println(year + "False");
        return isLeap;
    }

    public static void getDayInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            System.out.println("-1");
            //return -1;
        }

        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                if (LeapYear.isLeapYear(year)) {
                    System.out.println("29");
                } else
                    System.out.println("28");
                break;

            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
        }

    }
}






