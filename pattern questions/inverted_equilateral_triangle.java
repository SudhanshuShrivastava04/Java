import java.util.Scanner;

public class inverted_equilateral_triangle {
    static void pattern(int n){
        for (int i = 1; i<=n ; i++){
            for (int k = 1 ; k<=i-1 ; k++){
            System.out.print(" ");
        }
            for (int j =1 ; j<=n-i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        pattern(n);
    }
}
