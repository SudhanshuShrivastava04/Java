package ClassesAndObjects;

import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        fractionClass f1 = new fractionClass(20,30);
        f1.ans();
        f1.setNumerator(12);
        f1.ans();
        f1.setDenominator(20);
        f1.ans();
        fractionClass f2 = new fractionClass(4,5);
        f1.add(f2);
        f1.ans();
        fractionClass f3 = fractionClass.Add(f1,f2);
        f3.ans();
        f1.ans();
        f2.ans();
    }
}
