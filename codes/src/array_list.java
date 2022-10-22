import java.util.ArrayList;
class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        // adding data to list
        {
            list.add(2);
            list.add(4);
            list.add(6);
            list.add(8);
            System.out.println(list);
            System.out.println(list.contains(8));
            list.set(3,5);
            System.out.println(list);
            System.out.println(list.contains(8));
            list.remove(3);
            System.out.println(list);
            list.add(0,0);
            System.out.println(list);
            System.out.println(list.lastIndexOf(5));
        }
    }

}
