import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter data:");
        for (int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted array:");
        sort(arr);
    }
    public static void sort(int[] arr){
        for (int j=0 ; j<arr.length-1 ; j++){
            //assuming that integer at j is min
            int minIndex = j;
            for (int i =j+1 ; i<arr.length ; i++){
                if (arr[i]<arr[minIndex]){
                    minIndex = i;
                }
            }
            //swaping
            int temp=arr[minIndex];
            arr[minIndex]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
