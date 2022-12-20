package ClassesAndObjects;

public class complexNum {
    public static void main(String[] args) {
        complexNumClass c1 = new complexNumClass(1,3);
        c1.print();
        c1.setReal(2);
        c1.setImaginary(4);
        c1.print();
        complexNumClass c2 = new complexNumClass(3,5);
        c1.add(c2);
        c1.print();
        c2.print();
        complexNumClass c3 = complexNumClass.Sum(c1,c2);
        c3.print();
        c1.multiply(c2);
        c1.print();
        c1.conjugate();
        c1.print();
        complexNumClass c4 = new complexNumClass(3,6);
        c4.print();
        c4.conjugate();
        c4.print();
    }
}
