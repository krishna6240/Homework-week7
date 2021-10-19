import java.util.Scanner;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
 */

public class Commission {


    public static void main(String[] args) {
        double TotalSales;
        double CommissionRate = 0.0;
        double Commission;
        Scanner Read = new Scanner(System.in);
        //Commission s1 = new Commission();
        //s1.Commission = 0.0;
        //  System.out.println("Please enter  sale Id:");
        //System.out.println("Eneter seller's Name : ");
        System.out.println("Enetr the sales amount:");
        TotalSales = Read.nextDouble();
        if (TotalSales >= 50000) {
            CommissionRate = 0.35;
        } else if (TotalSales >= 30000)
            CommissionRate = 0.20;
        else if (TotalSales >= 20000)
            CommissionRate = 0.10;
        else if (TotalSales >= 10000)
            CommissionRate = 0.05;
        else if (TotalSales < 10000)
            CommissionRate = 0.02;
        Commission = CommissionRate * TotalSales;
        System.out.println("The Commission is : " + Commission);

    }

}






