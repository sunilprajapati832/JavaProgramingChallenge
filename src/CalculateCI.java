import java.util.Scanner;

public class CalculateCI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(".... Calculator CI .....");
        System.out.print(" Enter the Value of Principle :");
        float P = input.nextFloat();
        System.out.print(" Enter the Value of Rate :");
        float R = input.nextFloat();
        System.out.print(" Enter the Value of Time :");
        int T = input.nextInt();

        float CI = P * (1 + (R/100))*T;
        System.out.print("Compound Interest : "+ CI);
    }
}
