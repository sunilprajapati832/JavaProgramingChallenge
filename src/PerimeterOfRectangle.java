import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perimeter Calculator of Rectangle :");
        System.out.println("Enter the all side of Rectangle : ");
        float side1 = input.nextFloat();
        float side2 = input.nextFloat();
        float side3 = input.nextFloat();
        float side4 = input.nextFloat();

        double perimeter = side1+side2+side3+side4;
        System.out.println("Perimeter of Rectangle is :"+ perimeter);
    }
}
