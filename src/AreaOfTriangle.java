import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area Calculator of Triangle");
        System.out.print("Enter the Height of Triangle:");
        float Height = input.nextFloat();
        System.out.print("Enter the Base of Triangle:");
        float Base = input.nextFloat();

        double Area = 0.5 * Height * Base;
        System.out.println("Area of Triangle is :" + Area);


    }
}
