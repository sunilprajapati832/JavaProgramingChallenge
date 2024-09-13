import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("odd Even finder!");
        System.out.println("Enter your value:");
        int a = input.nextInt();
        a = a & 1;

        if (a==1){
            System.out.println(" Entered value is odd");
        } else System.out.println(" Entered value is Even");
    }
}

