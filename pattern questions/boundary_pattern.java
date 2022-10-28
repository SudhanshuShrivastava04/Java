import java.util.Scanner;

public class boundary_pattern {
    static void pattern(int n){
        for (int i = 1 ; i<= n ; i++){
            for (int j=1 ; j<=n ; j++){
                if (j==1 || j ==n || i==n || i==1){
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
                }
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
