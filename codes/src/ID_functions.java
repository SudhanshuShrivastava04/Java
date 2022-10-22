import javax.sound.midi.Soundbank;
import java.util.Scanner;

class ID_functions {
    public static void ID(String name , int roll_num , int age){
        System.out.println("\t\t**YOUR DATA**");
        System.out.print("NAME");
        System.out.print("\t\t");
        System.out.print("ROLL NUMBER");
        System.out.print("\t\t");
        System.out.print("AGE");
        System.out.print("\t\t");
        System.out.println("EMAIL");
        System.out.print(name);
        System.out.print("\t");
        System.out.print(roll_num);
        System.out.print("\t\t");
        System.out.print(age);
        System.out.print("\t");
        System.out.print(roll_num);
        System.out.print("@nitdelhi.ac.in");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name : ");
        String name = sc.nextLine();
        System.out.print("enter roll num : ");
        int roll_num = sc.nextInt();
        System.out.print("enter age : ");
        int age = sc.nextInt();
        ID(name , roll_num , age);

    }
}
