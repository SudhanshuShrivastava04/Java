import java.util.Scanner;

public class MaxCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,2,3,4,2,1,3,5};
        System.out.print("target:");
        int target = sc.nextInt();
        Max(target,arr);
    }
    public static void Max(int target, int[] array){
        int count =0;
        for (int i =0 ; i< array.length ; i++){
            if (array[i] == target){
                count++;
            }
        }
        System.out.println("count:"+count);
    }
}

