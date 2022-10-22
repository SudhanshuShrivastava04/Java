import java.util.Scanner;

class avg {
    public static float average(float a , float b , float c){
        float Average = (a+b+c)/3;
        return Average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        System.out.print("Avg : " +average(a,b,c));
    }
}
