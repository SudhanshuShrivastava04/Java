public class string_comparison {
    public static void main(String[] args) {
        String a = "Sudhanshu";
        String b = "Sudhanshu";
        // a and b pointing to same object
        System.out.println(a == b);
        // c is a diff object here
        String c = "sudhanshu";
        System.out.println(a == c);
        // here d and e are identical but we forced heap to create a new object irrespective of duplication
        String e = new String("Shrivastava");
        String d = new String("Shrivastava");
        //this checks whether d and e are pointing to same object or not
        System.out.println(e == d);
        // .equals() function checks the values of both the objects
        System.out.println(e.equals(d));
        //string is an array of char
        // .charAt(i) is used to get the element stored at 0 index
        System.out.println(e.charAt(0));

    }
}
