import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("height : ");
        int height = sc.nextInt();
        for (int i =0 ; i<height ; i++){
            for (int j = 1 ; j<i+2 ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = height ; i<2*height-1 ; i++){
            for (int j = i-1 ; j>0 ; j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
