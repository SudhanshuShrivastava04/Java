import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();
        // declaration of array in stack and then defining its size in heap
        int[] array = new int[size];
        // taking input in the array
        for (int i =0 ; i< array.length ; i++){
            array[i] = sc.nextInt();
        }
        // output in the array form
        System.out.println(Arrays.toString(array));
    }
}
