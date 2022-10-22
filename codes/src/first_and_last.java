import java.util.Arrays;
import java.util.Scanner;

public class first_and_last {
    public static int first(int[] arr, int target) {
        if (arr[0] == target) return 0;

        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target && arr[mid - 1] != target) {
                return mid;
            } else end = mid - 1;
        }
        return -1;
    }

    public static int last(int[] arr, int target) {
        if (arr[arr.length - 1] == target) return arr.length - 1;

        int start = first(arr, target);
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target && arr[mid + 1] != target) {
                return mid;
            } else end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("data : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target");
        int target = sc.nextInt();
        int ans1 = first(arr, target);
        int ans2 = last(arr, target);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
