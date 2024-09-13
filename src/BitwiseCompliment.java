import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" bitwise compliment/not ");
        System.out.println("Enter your value:");
        int a = input.nextInt();
        a = ~a;
        System.out.println("bitwise Complimented value" + a);
    }
}
