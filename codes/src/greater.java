import java.util.Scanner;

class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a = ");
        int a = sc.nextInt();
        System.out.print("enter b = ");
        int b = sc.nextInt();
        if (a>b){
            System.out.print(a);
        }
        else if(a==b){
            System.out.print("EQUAL");
        }
        else{
            System.out.print(b);
        }
    }
}
