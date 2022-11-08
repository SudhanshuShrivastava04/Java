package ClassesAndObjects;

import java.util.Scanner;

public class ConstructorUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Constructor c1 = new Constructor("Sudhanshu" , 19);
        Constructor c2 = new Constructor("Ankush" , 18);
        Constructor c3 = new Constructor("Satwik" , 17);
        c1.print();
        c2.print();
        c3.print();
        // here I consider 0 as null
    }
}
