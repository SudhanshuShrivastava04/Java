import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        System.out.println("1)ADD\n2)REMOVE\n3)SEARCH\n4)SET\n5)DISPLAY\n6)ADD at INDEX\n7)EXIT");
        System.out.println();
        do {
            System.out.println("enter choice : ");
            n = sc.nextInt();
            switch(n){
                case 1:
                    list.add(sc.nextInt());
                    break;
                case 2:
                    list.remove(sc.nextInt());
                    break;
                case 3:
                    System.out.println(list.contains(sc.nextInt()));
                    break;
                case 4:
                    list.set(sc.nextInt() , sc.nextInt());
                    break;
                case 5:
                    System.out.println(list);
                    break;
                case 6:
                    list.add(sc.nextInt(), sc.nextInt());
                    break;
                case 7:
                    System.out.println("**EXIT**");
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }

        }
        while (n!=7);
    }
}
