import java.util.Scanner;

class count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive =0 ; int negative =0 ; int zeros =0;
        System.out.println("press 1 or 0");
        int input = sc.nextInt();
        while (input == 1){
            System.out.println("enter number");
            int number = sc.nextInt();
            if (number<0){
                negative++;
            }
            else if(number>0){
                positive++;
            }
            else{
                zeros++;
            }
            System.out.println("press 1 or 0");
            input = sc.nextInt();
        }
        System.out.println("positives : " +positive);
        System.out.println("negatives : " +negative);
        System.out.println("zeros : "+zeros);
    }
}
