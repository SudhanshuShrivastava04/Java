import java.util.Scanner;

public class integer_triangle {
    public static void patter(int a){
        for (int i =1 ; i<=a ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n = sc.nextInt();
        patter(n);
    }
}
