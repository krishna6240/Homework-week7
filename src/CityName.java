import java.util.Scanner;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry

 */

public class CityName {
    public static void main(String[] args) {
        System.out.println("Enter a charactre:");
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='A') && ch<='F') {
            System.out.println("valid city char");
        }else{
            System.out.println("Invalid entry");
        }
    }
}
