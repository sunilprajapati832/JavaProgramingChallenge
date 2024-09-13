import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value :");
        int first = input.nextInt();
        System.out.println("Enter second value :");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("result of bitwise XOR " + result);
    }
}
