import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to Bitwise AND Calculator ");
        System.out.print("Enter your first Integer Valuse :");
        int firstInt = input.nextInt();
        System.out.print("Enter your Second Integer Valuse :");
        int secondInt = input.nextInt();

        int bitwiseAND = firstInt & secondInt ;
        System.out.print(" Your bitwiseAnd Calculation result :" + bitwiseAND);
    }
}
