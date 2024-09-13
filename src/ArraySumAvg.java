
import java.util.Arrays;
import java.util.Scanner;
public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("!!Welcome to Array Sum and Array Avg Finder!!");
        int[] myArr = {12, 13 ,14 , 89, 98, 45};
        int[] myArr2 = {1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,5};
        System.out.println("""
                Enter what you want\s
                 1. you want sum of Array?\s
                 2. you want avg of Array ?\s
                 3. you want to find maximum value element in array?\s
                 4. you want minimum element value in array ?\s
                 5. you want to print all element of array ?\s
                 6. you want to reverse array ?\s
                 7. you want to find element occurrence in myArr2 array ?\s
                 8. you want to add new Array Element Dynamically ?\s
                 9. you want to see new Array from any class method ?\s
                 10. you want to short Array ?""");
        int n = input.nextInt();
        if (n==1){
            int sum = arraySum(myArr);
            System.out.println("Sum of Array is : "+ sum);
        } else if (n==2) {
            int avg = arrayAvg(myArr);
            System.out.println("Avg of Array is :" + avg);

        } else if (n==3) {
            int max = arrayMaxima(myArr);
            System.out.println("Maximum Value of Array is :"+ max);

        } else if (n==4) {
            int min = minimumArray(myArr);
            System.out.println("Minimum Value of Array is :" + min);

        } else if (n==5) {
            int i=0;
            int j=1;
            while (i < myArr.length){
                System.out.println("array's "+ j + "th element is :"+myArr[i]);
                i++;
                j++;
            }
        } else if (n==6) {
            int[] reverse = arrayReverse(myArr);
            System.out.println("Reversed array is : "+ reverse);

        } else if (n==7) {
            int occurrence = arrayOccurrence(myArr2);
            System.out.println(" Entered Element occurrence count in myArr2 is :" + occurrence);


        } else if (n==8) {
            int[] arrayShow = arrayAddElement();
            System.out.println(" Entered Array is :" + Arrays.toString(arrayShow));

        } else if (n==9) {
            int[] array = ArrayUtility.inputArray();

        } else if (n==10) {
            int[] arraySort = arraySort(ArrayUtility.inputArray());
            System.out.println(" Sorted Array is :" + Arrays.toString(arraySort));

        } else System.out.println("You enter wrong number of option! Please correct it!");
    }
    public static int arraySum( int[] array){
        int i=0;
        int sum =0;
        while (i < array.length){
            sum = sum + array[i];
            i++;
        }
        return sum;
    }

    public static int arrayAvg(int[] array){
        int i=0;
        int sum = 0;
        while (i < array.length){
            sum = sum + array[i];
            i++;
        }
        return sum / array.length;
    }

    public static int arrayMaxima(int[] array){
        int i=1;
        int max = 0;
        max = array[0];
        while (i < array.length){
            if (max >= array[i]){
               i++;
            } else {
                max = array[i];
                i++;
            }
        }

        return max;
    }

    public static int minimumArray( int[] array){
        int i = 1;
        int min = 0;
        min = array[0];
        while (i < array.length){
            if (min <= array[i]){
                i++;
            } else {
                min = array[i];
                i++;
            }
        }
        return min;
    }

    public static int[] arrayReverse(int[] array){
        int i = 0;
        int[] reverse = new int[array.length];
        int last = array.length - 1;
        while (i < array.length){
            reverse[i] = array[last];
            i++;
            last--;
        }
        return reverse;
    }

    public static int arrayOccurrence(int[] array){
        Scanner input = new Scanner(System.in);
        int i = 0;
        int count = 0;
        System.out.println("Enter Element you want find occurrence : ");
        int num = input.nextInt();
        while (i < array.length){
            if (array[i]==num){
                count++;
                i++;
            }else i++;
        }
        return count;
    }
    public static int[] arrayAddElement (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element you want in Array");
        int i = input.nextInt();
        int[] array = new int[i];
        int n = 0;
        while (n < i)
        {
            System.out.println(" Enter " + (n+1) + "th element of array :");
            array[n] = input.nextInt();
            n++;
        }
        return array;
    }
    public static int[] arraySort(int[] array){

        int i = 1;
        while ( i < array.length ){
            if ( array[i] < array[i-1] ) {
                i++;
            } else {
                int a = 0;
                a = array[i-1];
                array[i-1] = array[i];
                array[i] = a;
                i++;
            }
        }
        return array;
    }
}
