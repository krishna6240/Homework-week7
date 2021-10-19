import java.util.Scanner;

public class SwitchDays {
    /*
    Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number between 1-7");
        {
            int n = in.nextInt();
            switch (n) {

                case 1:
                    System.out.println("Day corresponding to 1 is Sunday");

                    break;

                case 2:
                    System.out.println(" Day corresponding to 2 is Monday");

                    break;

                case 3:
                    System.out.println(" Day corresponding to 3 is Tuesday");

                    break;

                case 4:
                    System.out.println(" Day corresponding to 4 is Wednesday");

                    break;

                case 5:
                    System.out.println(" Day corresponding to 5 is Thursday");

                    break;

                case 6:
                    System.out.println(" Day corresponding to 6 is Friday");

                    break;

                case 7:
                    System.out.println(" Day corresponding to 8 is Saturday");

                    break;

                default:
                    System.out.println("Week contains 1 to 7 days”\n");

            }


        }

    }
}

