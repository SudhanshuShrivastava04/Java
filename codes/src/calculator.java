import java.util.*;
class calculator {
    public static void main(String[] args) {
        System.out.println("\t\t**CALCULATOR**");
        System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Remainder");
        System.out.println("6) EXIT");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a :");
        float a = sc.nextFloat();
        System.out.print("enter b :");
            float b = sc.nextFloat();
            int operation;
            do{
            System.out.println("enter the operation");
            operation = sc.nextInt();
                switch (operation) {
                    case 1 -> {
                        float sum = a + b;
                        System.out.println(sum);
                    }
                    case 2 -> {
                        float diff = a - b;
                        System.out.println(diff);
                    }
                    case 3 -> {
                        float product = a * b;
                        System.out.println(product);
                    }
                    case 4 -> {
                        float div = a / b;
                        System.out.println(div);
                    }
                    case 5 -> {
                        float rem = a % b;
                        System.out.println(rem);
                    }
                    case 6 -> System.out.println("**EXIT**");
                    default -> System.out.println("INVALID");
                }
        } while (operation != 6);
    }
}
