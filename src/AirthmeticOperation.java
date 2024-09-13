import java.util.Scanner;

public class AirthmeticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Value :");
        int a = input.nextInt();
        System.out.println("Enter Second Value :");
        int b = input.nextInt();

        double addition = a+b;
        double subtraction = a-b;
        double multiplication = a*b;
        int divide = a/b;
        double mode = a%b;

        System.out.println("addition of a and b:" + addition);
        System.out.println("subtraction of a and b:" + subtraction);
        System.out.println("multiplication of a and b:" + multiplication);
        System.out.println("divide of a and b:" + divide);
        System.out.println("mode of a and b:" + mode);

    }
}
