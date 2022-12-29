package ClassesAndObjects;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();

        for (int i =0 ; i<10 ; i++){
            d.add(i);
        }
        d.print();

        d.set(0,11);
        d.print();
        System.out.println(d.get(0));
        System.out.println(d.size());
        d.removeLast();
        d.print();
        System.out.println(d.size());
    }
}
