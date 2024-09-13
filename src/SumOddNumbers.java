import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number till you want odd sum:");
        int number = input.nextInt();
        int add = odd(number);
        System.out.println(" Odd Sum till number " + number + " is : " + add);
    }

    public static int odd(int number) {
       int i = 1;
       int add = 0;
       while ( i <= number){
           add += i;
           i += 2;
       }
        return add;
    }
}

