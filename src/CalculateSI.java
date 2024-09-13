import java.util.Scanner;

public class CalculateSI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(".... Simple Interest Calculator .... ");
        System.out.print(" Enter the value of Principle :");
        float P = input.nextFloat();
        System.out.print(" Enter the value of Rate :");
        float R = input.nextFloat();
        System.out.print(" Enter the value of Time :");
        int T = input.nextInt();

        float SI = (P * T * R) / 100;
        System.out.print(" Simple Interest :" + SI);
    }
}
