import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the number of element in Array :");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Enter " + (i+1) + "th element of Array :");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
}
