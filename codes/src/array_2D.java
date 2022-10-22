import java.util.Arrays;
import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows : ");
        int rows = sc.nextInt();
        System.out.print("enter col : ");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        /*
        for ex : arr[3][3]
        { {1,2,3} ,
          {4,5,6} ,
          {7,8,9}
                   }
         */
        //for rows
        // arr.length ====> length of arr in terms of rows
        for (int i = 0 ; i<arr.length ; i++){
            //for columns
            // arr[rows].length ====> length of array of rows
            for (int j = 0 ; j<arr[i].length ; j++){
                // input
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
