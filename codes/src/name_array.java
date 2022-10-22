import java.util.Scanner;

class name_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no . of entries : ");
        int n = sc.nextInt();
        System.out.print("Enter the entries:\n");
        // array declaration
        String name[] = new String[n+1];
        // input in array
        for (int i=0 ; i< name.length ; i++){
            name[i] = sc.nextLine();
        }
        // output from the array
        System.out.println("entries :");
        for (int i =0 ; i< name.length ; i++){
            System.out.println(name[i]);
        }
    }
}
