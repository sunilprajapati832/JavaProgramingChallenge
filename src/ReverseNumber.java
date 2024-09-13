import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number which you want reverse : ");
        int num = input.nextInt();
        Calculation(num);

    }
    public static void Calculation(int num){
        int i =0;
        int digit = 0;
        System.out.print(" Reversed Number is:");
        while (num>0) {
            digit = num % 10;
            num = num / 10;
            System.out.print(digit);
        }

    }
}
