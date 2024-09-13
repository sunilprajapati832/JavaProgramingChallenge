import java.util.Scanner;

public class ConverterF2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(".......Temperature Converter.....");
        System.out.print("Enter Fahrenheit Value : ");
        float temp = input.nextFloat();
        temp = (temp - 32) * 5/9;
        System.out.println("Converted Value : " + temp + " C");
    }
}
