import java.util.Scanner;

class right_angled_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height = ");
        int height = sc.nextInt();
        for (int i =0 ; i<height ; i++){
            for (int j = 1 ; j<i+2 ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
