import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        greet();
        table();

    }

    public static void greet() {
        System.out.println(" Welcome to the Multiplication Table Formation ");
    }

    public static void table(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter number which table you want :");
        int number = input.nextInt();
        int i =1;
        while (i<11){
            int multiplication = number * i;
            System.out.println(multiplication);
            i++;
        }
    }
}
