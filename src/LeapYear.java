import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Leap Year Calculator :");
        System.out.print(" Enter year :");
        int year = input.nextInt();
        int a = year%4;
        int c = year%400;

        if (a==0){
            System.out.println("Entered Year is Leap year");
        } else if (c==0) {
            System.out.println(" Entered year is Leap year");
        } else System.out.println(" Entered year is non Leap Year");
    }


}
