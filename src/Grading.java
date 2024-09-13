import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("......Welcome to the Grading Calculator.....");
        System.out.println("Enter the Marks in % value");
        float m = input.nextFloat();

        if (m >= 90) {
            System.out.println("You got 'A' Grade");
        } else if ((m >= 75) && (m < 90)) {
            System.out.println("You got 'B' Grade");
        } else if ((m >= 60) && (m < 75)) {
            System.out.println("You got 'C' Grade");
        } else if ((m >= 30) && (m < 60)) {
            System.out.println("You got 'D' Grade");
        } else System.out.println("Yor got 'F' Grade");

    }
}
