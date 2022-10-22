import java.util.Arrays;
import java.util.Scanner;
// 1-D array linear search
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter data : ");
        for (int i =0 ; i< arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter key");
        int key = sc.nextInt();
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i] == key){
                System.out.println("position : " +(i+1) );
                break;
            } else if (i==arr.length) {
                System.out.print("not found");
            }
        }
    }
}
