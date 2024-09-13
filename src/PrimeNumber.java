import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" !! Welcome to find Either number is Prime number or Not");
        System.out.println(" Enter your number :");
        int num = input.nextInt();
        boolean prime = prime(num);
        if (prime==true){
            System.out.println("number is prime");
        } else System.out.println(" number is not prime");


    }
    public static boolean prime(int num){
        int i = 2;
        while (i < num){
            if (num % i == 0){
              return (false);
            }
            i++;
        }
   return true;
    }

}
