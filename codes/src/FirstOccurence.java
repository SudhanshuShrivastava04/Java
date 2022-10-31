import java.util.Arrays;
import java.util.Scanner;
// we need to find the first occurence of any repeated number in the sorted array!!
public class FirstOccurence {
    static int first(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        //for ascending sorted array
        if (arr[start]<arr[end]){
            while(start<=end){
                int mid = start +(end-start)/2;
                if (arr[mid]<target)
                    start=mid+1;
                else if(arr[mid]==target && arr[mid-1]!=target)
                    return mid;
                else
                    end = mid-1;
            }
            return -1;
        }
        //for descending sorted array
        else{
            while (start<=end){
                int mid = start + (end-start)/2;
                if (arr[mid]<target)
                    end = mid -1;
                else if (arr[mid]==target && arr[mid-1]!=target)
                    return mid;
                else
                    start = mid+1;
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter data");
        for (int i =0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("target");
        int target = sc.nextInt();
        int ans = first(arr,target);
        System.out.println(ans);
    }
}
