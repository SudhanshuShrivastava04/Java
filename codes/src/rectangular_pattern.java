import java.util.*;

class rectangular_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rows : ");
        int rows = sc.nextInt();
        System.out.println("column : ");
        int col = sc.nextInt();
        for (int i = 0 ; i<rows; i++){
            System.out.print("\n");
            for (int j = 0 ; j<col ; j++){
                System.out.print("*\t");
            }
        }
    }
}
