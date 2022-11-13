import java.util.Arrays;
import java.util.Scanner;

public class InsertAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int size =sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter data");
        for (int i =0 ; i<arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
        for (int i =0 ; i<size-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        for (int i=arr.length-1 ; i<arr.length ; i++){
            arr[i] = target;
        }
        System.out.println(Arrays.toString(arr));
    }
}
