import java.util.Scanner;
public class Leftshift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your value:");
        int a = input.nextInt();
        a = a << 1;
        System.out.println("result: "+ a);
    }
}
