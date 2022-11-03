package ClassesAndObjects;

import java.util.Scanner;
//no need to import student class because both are in same package
//otherwise we need to import like this
// import package_name.class_name;

public class studentuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        s1.name = "sudhanshu";
        s1.roll_num = 211230053;
        student s2 = new student();
        s2.name  = "shivansh";
        s2.roll_num = 211230050;

        System.out.println("addresses are -->");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
        System.out.println("Student s1 -->");
        System.out.println(s1.name);
        System.out.println(s1.roll_num);
        System.out.println();
        System.out.println("Student s2 -->");
        System.out.println(s2.name);
        System.out.println(s2.roll_num);
    }
}
