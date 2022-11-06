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
        s1.setrollnumber(211230053);
        student s2 = new student();
        s2.name  = "shivansh";
        s1.setrollnumber(211230050);
        student s3 = new student();
        s3.name = "Satwik";
        s1.setrollnumber(-211230049);

        System.out.println("addresses are -->");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
        System.out.println("Student s1 -->");
        System.out.println(s1.name);
        System.out.println(s1.getrollnumber());
        System.out.println();
        System.out.println("Student s2 -->");
        System.out.println(s2.name);
        System.out.println(s2.getrollnumber());
        System.out.println("Student s3 -->");
        System.out.println(s3.name);
        System.out.println(s3.getrollnumber());
    }
}
