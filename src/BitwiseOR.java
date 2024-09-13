import java.util.Scanner;
public class BitwiseOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" .. Welcome to Bitwise OR Calculator ..");
        System.out.println("Enter your first Value: ");
        int first = input.nextInt();
        System.out.println(" Enter your second value :");
        int second = input.nextInt();

        int result = first | second;
        System.out.println(" bitwise OR result :" + result);
    }
}
