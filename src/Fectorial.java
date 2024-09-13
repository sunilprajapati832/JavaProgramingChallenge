import java.util.Scanner;

public class Fectorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter number which number's fectorial you want :");
        int f = input.nextInt();
        int fect = calculation(f);
        System.out.println(" fectorial of number is :" + fect);
    }
    public static int calculation(int f){
        int multiplication = 1;
        int i = 1;
        if (f<2){
            return 1;
        }     else {
            while (i <= f) {
                multiplication = multiplication * i;
                i += 1;
            }
            return multiplication;
        }
    }
}

