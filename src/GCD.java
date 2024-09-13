import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" !! Welcome to GCD finder !! ");
        System.out.print(" Enter first number :");
        int num1 = input.nextInt();
        System.out.print(" Enter second number :");
        int num2 = input.nextInt();
        int gcd = gcd(num1, num2);
        System.out.println(" your number's gcd is: " + gcd);

    }
    public static int gcd(int num1, int num2){
        int i = 2;
        int gcd = 1;
        int least = least(num1, num2);
            while (i <= least){
              if ((num1 % i == 0) && (num2 % i ==0)){
                    gcd = i;
                }
              i++;

             }

        return gcd;
    }
    public static int least(int num1, int num2){
        if (num1 < num2){
            return num1;
        } else return num2;
    }


}
