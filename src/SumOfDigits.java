import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number which digit's addition you want :");
        int num = input.nextInt();
        int sum = Calculation(num);
        System.out.println(" Sum of all digits of given number:" + sum);

    }
    public static int Calculation(int num){
        int digit = 0;
        int addition =0;
        while (num>0) {
            digit = num % 10;
            addition = addition + digit;
            num = num / 10;
        }

        return addition;
    }
}
// 
