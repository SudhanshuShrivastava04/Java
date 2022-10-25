import java.util.Scanner;

public class right_angle_triangle {
    public static void pattern(int h){
        for (int i=1 ; i<=h ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("enter height");
        height = sc.nextInt();
        pattern(height);
    }
}
