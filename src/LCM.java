import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = input.nextInt();
        System.out.println("Enter your second number:");
        int num2 = input.nextInt();
        int finalResult = LeastCommonMultiple(num1,num2);
        System.out.print(" your LCM is :" + finalResult);

    }
    public static int LeastCommonMultiple(int num1, int num2){
        int i = 1;
        while (i <= num2){
            int factor = num1 * i;
            if (factor % num2 ==0){
                return factor;
            }
            i++;
        }
          return 0; // unreachable
    }
}
