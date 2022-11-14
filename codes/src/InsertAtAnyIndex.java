import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertAtAnyIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,54,12,34};
        int n = array.length;
        System.out.println(Arrays.toString(array));
        System.out.print("index:");
        int index = sc.nextInt();
        System.out.print("target: ");
        int target = sc.nextInt();
        insert(n,array,index,target);
    }
    public static void insert(int size,int[] arr ,int index , int target){
        int[] newArr = new int[size+1];
        for (int i=0 ; i<size+1 ; i++){
            if (i<index){
                newArr[i] = arr[i];
            } else if (i==index){
                newArr[i] = target;
            }
            else{
                newArr[i] = arr[i-1];}
        }
        System.out.println(Arrays.toString(newArr));
    }
}
