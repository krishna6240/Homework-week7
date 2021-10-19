import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator.
 */


public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number:");
        int number = sc.nextInt();
        //java odd or even
        String strOutput = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + strOutput);
        sc.close();
    }
}
