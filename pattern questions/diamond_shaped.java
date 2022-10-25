import java.util.Scanner;

public class diamond_shaped {
    static void pattern(int N){
        for (int i =1 ; i<N ; i++){
            for (int j = 1 ; j<=N-i ; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k<=i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i<=N ; i++){
            for (int k = 1 ; k<=i-1 ; k++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=N-i+1 ; j++){
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
