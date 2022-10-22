import java.util.Scanner;

class power {
    public static int  exponential(int x , int n){
        int value=1;
       for (int i =0 ; i<n ; i++){
           value = value*x;
       }
       return  value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x , n ;
        System.out.print("X = ");
        x = sc.nextInt();
        System.out.print("N = ");
        n = sc.nextInt();
        System.out.print("value of x^n = "+exponential(x,n) );
    }
}
