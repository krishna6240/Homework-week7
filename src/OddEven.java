import java.util.Scanner;

public class OddEven {
    /*
    Write a java program to input any number and find out if it’s odd or even
     */
    public static void main(String[] args) {
        int num;
        System.out.println("Enter an Integer number:");
        //The input provied by user is stored in num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        /*if number is divisible by 2 then it is an even number
        else odd number
         */
        if(num % 2==0)
            System.out.println("Enter number is even");
        else
            System.out.println("Enter number is odd.");

    }
}
