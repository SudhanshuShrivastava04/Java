import java.util.Scanner;

public class string {
    public static void main(String[] args){
        char ch;
        String series = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter : ");
        char letter = sc.next().toCharArray()[0];
        for (char i = letter; i<='z' ; i++){
            System.out.print(i);
        }
    }
}
