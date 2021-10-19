import java.util.Scanner;
/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 */
public class GrossSalary {
    String EmployeeId;
    String empname;
    int BasicSalary;
    int HRA, DA, GS, TD, PF;

    public void read() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the employee id : ");//taking all the inputs from the user
        EmployeeId = scan.next();
        System.out.println("Enter the employee name: ");
        empname = scan.next();
        System.out.println("Enter the basic salary of an employee");
        BasicSalary = scan.nextInt();
        calculate();

    }

    public void calculate() {
        HRA =  BasicSalary * 10/100;
        DA = BasicSalary * 8/100;
        TD = BasicSalary * 9 /100;
        PF = BasicSalary * 20 /100;
        GS = BasicSalary + DA + HRA + TD - PF;



        // incometax=(30/100)*GS;

    }

    public void display() {
        System.out.println("|--------------------------------|");
        System.out.println("|      Salary Slip               |");
        System.out.println("|--------------------------------|");
        System.out.println("|Employee ID   :" + EmployeeId+"              |" );
        System.out.println("|Employee Name :" + empname +"          |" );
        System.out.println("|--------------------------------|");
        System.out.println("|Basic Salary  :" + BasicSalary+"            |");
        System.out.println("|HRA 10%       :" + HRA+"             |" );
        System.out.println("|TD 8%         :" + TD+"             |" );
        System.out.println("|DA 9%         :" + DA+"             |" );
        System.out.println("|PF - 20&      :" + PF+"             |" );
        System.out.println("|--------------------------------|");
        System.out.println("|Gross Salary  :" +  GS+"            |");
        System.out.println("|================================|");
    }

    public static void main(String[] args) {


        GrossSalary empobj = new GrossSalary();
        empobj.read();
        empobj.display();



    }
}