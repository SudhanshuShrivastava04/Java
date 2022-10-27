import java.util.Scanner;

public class butterfly_pattern {
    static void pattern1(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            for (int k =1 ; k<=2*(n-i) ; k++){
                System.out.print(" ");
            }
            for (int l =1 ; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 1 ; i<n ; i++){
            for (int j=1 ; j<=n-i ; j++){
                System.out.print("*");
            }
            for (int k=1 ; k<=2*i; k++){
                System.out.print(" ");
            }
            for (int l =1 ; l<=n-i ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
    }
}
