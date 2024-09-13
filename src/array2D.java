import java.util.Scanner;

public class array2D {
    public static int[][] array2d(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of  Row Element in 2D Array :");
        int sizeR = input.nextInt();
        System.out.println("Enter number of Column Element in 2D Array : ");
        int sizeC = input.nextInt();
        int[][] arr = new int[sizeR][sizeC] ;
        int i = 0;
            while (i < sizeR){
                int j =0;
                while (j < sizeC) {
                    System.out.println("Enter " + (i+1)+ "th row " + (j + 1) + "th column Element of 2D Array :");
                    arr[i][j] = input.nextInt();
                    j++;
                }
                i++;
            }
        return arr;
    }
}
