import java.util.Scanner;
/*
Same as above program-8 using switch statement.

 */

public class SwitchCityChar {

    public static void main(String[] args) {
        System.out.println("Enter a charactre:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'A':System.out.println("valid city character");
            break;
            case 'B':System.out.println("valid city character");
            break;
            case 'C':System.out.println("valid city character");
            break;
            case 'D':System.out.println("valid city character");
            break;
            case 'E':System.out.println("valid city character");
            break;
            case 'F':System.out.println("valid city character");
            break;
            default:
                System.out.println("Invalid city character");


        }

    }
    }