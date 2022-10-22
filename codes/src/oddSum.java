import java.util.Scanner;

class oddSum {
    public static int OddSum(int n){
        int sum = (n*(2+(n-1)*2))/2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Sum = " +OddSum(n));
    }
}
