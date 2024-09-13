import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your first value :");
    int a = input.nextInt();
    System.out.println("Enter second value: ");
    int b = input.nextInt();
    int c = 0;
    c = a;
    a = b;
    b = c;
    System.out.println("Swapped Valued: \n");
    System.out.println(a);
        System.out.println(b);

    }
}
