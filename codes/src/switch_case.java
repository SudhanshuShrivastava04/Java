import java.util.*;

class switch_case {
    public static void main(String[] args) {
        System.out.print("\t\t**PUSH BUTTON**\n");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button){
            case 1 :
                System.out.println("NAMASTE");
                break;
            case 2 :
                System.out.println("HELLO");
                break;
            case 3 :
                System.out.println("BONJOUR");
                break;
            default :
                System.out.println("INVALID");
        }
    }
}
