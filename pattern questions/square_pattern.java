import java.util.Scanner;

public class square_pattern {
    public static void pattern(int a, int b){
        for (int i=0 ; i<a ; i++){
            System.out.print("*\t");
            for (int j=1 ; j<b ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        int m;
        /* n --> rows
        m --> coloumns*/
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        n = sc.nextInt();
        System.out.println("enter coloumns");
        m = sc.nextInt();
        System.out.println("pattern is here");
        pattern(n,m);
    }
}
