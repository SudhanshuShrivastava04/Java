import java.util.Scanner;

public class minimum {
    public static int min(int[] arr){
        int ans = arr[0];
        for (int i =1 ; i<arr.length ; i++){
            if (ans>arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter data : ");
        for (int i =0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(min(arr));
    }
}
