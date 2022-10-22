import java.util.Arrays;
import java.util.Scanner;

public class linear_search_in_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows:");
        int rows = sc.nextInt();
        System.out.print("enter column : ");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        System.out.print("enter data : ");
        for (int i =0 ; i<rows ; i++){
            for (int j =0 ; j<col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.print("key : ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i =0 ; i<rows ; i++){
            for (int j =0 ; j<col ; j++){
                if (arr[i][j] == key){
                    System.out.println("index : "+i+"x"+j);
                    found  =true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("not found");
        }
    }
}
