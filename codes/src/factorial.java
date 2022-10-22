import java.util.Scanner;
class factorial {
    public static int fact(int number){
        int fac=1;
        for(int i=1 ; i <= number ; i++) {
            fac = fac * i;
        }
    return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        System.out.print("Factorial : " + fact(number));
    }
}
