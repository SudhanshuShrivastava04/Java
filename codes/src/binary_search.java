import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
   public static int binarysearch(int[] arr , int target){
       int start = 0;
       int end = arr.length-1;
       if(arr[start]<arr[end]) {
           while (start <= end) {
               int mid = start + (end - start) / 2;
               if (arr[mid] < target) {
                   start = mid + 1;
               } else if (arr[mid] > target) {
                   end = mid - 1;
               } else return mid;
           }
           return -1;
       }
       else{
           while (start <= end) {
               int mid = start + (end - start) / 2;
               if (arr[mid] < target) {
                   end = mid - 1;
               } else if (arr[mid] > target) {
                   start = mid + 1;
               } else return mid;
           }
           return -1;
       }
   }

    public static void main(String[] args) {
        int[] arr = {2,3,5,5,5,5,6,7,9};
        int target = 5;
        int ans = binarysearch(arr , target);
        System.out.println(ans);
    }
}
