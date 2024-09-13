import java.util.Scanner;

public class CalculateSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number :");
        float number = input.nextFloat();
        if (number == 0){
            System.out.println("Your Entered value is zero!");
        } else if (number >= 0){
            System.out.println("Your Entered Value is Positive");
        } else System.out.println("Your Entered Value is Negative");
    }
}
