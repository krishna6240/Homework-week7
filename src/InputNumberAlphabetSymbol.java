import java.util.Scanner;

public class InputNumberAlphabetSymbol {
    /*
    Write a program that tells us input value is number or an alphabet or symbol
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any input number or alphabet or symbol:");
        char ch = scan.next().charAt(0);
        if((ch>= 'a' && ch<='z')  || (ch>='A' && ch<='Z')) {
            System.out.println(ch + " is a Alphabet.");

        }else if(ch>='0' && ch<='9') {
            System.out.println(ch + " is a Digit.");
        }else{
            System.out.println(ch + " is a Special Character.");

        }
    }
}