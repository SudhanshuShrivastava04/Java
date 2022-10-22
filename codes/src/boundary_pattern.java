import java.util.*;

class boundary_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("rows : ");
        int rows = sc.nextInt();
        System.out.print("columns : ");
        int col = sc.nextInt();
        for (int i=0 ; i<rows ; i++){
            for (int j =0 ; j<col ; j++){
                if (i==0 || i==rows-1 || j==0 || j==col-1){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
