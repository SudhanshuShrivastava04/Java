import java.util.*;
class conditional_statements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = sc.nextInt();
        System.out.print("enter b : ");
        int b = sc.nextInt();
        if (a==b){
            System.out.println("EQUAL");
        }
        else if(a>b){
            System.out.println("a is greater tha b");
        }
        else{
            System.out.println("a is smaller than b");
        }
    }
}
