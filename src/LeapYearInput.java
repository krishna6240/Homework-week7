public class LeapYearInput {
/*
    Write a java program to input any year like (ex.2007) and find out if it is leap year or
not
 */
public static void main(String[] args) {
    int year = 2007;
    boolean leap = false;
    if(year % 4 == 0) {

        if (year % 100 == 0) {
            if (year % 400 == 0)
                leap = true;
            else
                leap = false;
        } else
            leap = true;
    }
    else
        leap = false;
    if(leap)
        System.out.println(year + "is a leap year.");
    else
        System.out.println(year + "is not a leap year");
    }
}












