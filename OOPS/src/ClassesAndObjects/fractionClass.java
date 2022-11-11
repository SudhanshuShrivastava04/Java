package ClassesAndObjects;

public class fractionClass {
    private int numerator;
    private int denominator;
    public fractionClass(int n , int d){
        numerator = n;
        if (d == 0){
            System.out.println("error");}
        else {denominator = d;
        simplify();}
    }
    public void setNumerator(int n){
        numerator = n;
        simplify();
    }
    public void setDenominator(int d){
        if (d ==0)
            return;
        denominator = d;
        simplify();
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void add(fractionClass f2){
        this.numerator = this.numerator* f2.denominator + this.denominator*f2.numerator;
        this.denominator = this.denominator* f2.denominator;
        simplify();
    }
    public static fractionClass Add(fractionClass f1 , fractionClass f2){
        int newnumerator = f1.numerator* f2.denominator + f1.denominator*f2.numerator;
        int newdenominator = f1.denominator* f2.denominator;
        fractionClass f = new fractionClass(newnumerator,newdenominator);
        return f;
    }
    public void ans(){
        if (denominator == 1){
            System.out.println(numerator);
        }
        else if (denominator ==0){
            return;
        }
        else
            System.out.println(numerator+"/"+denominator);
    }
    private void simplify(){
        int gcd =1;     // greatest common divisor
        int smallest = Math.min(numerator,denominator);
        for (int i = 1 ; i<=smallest ; i++){
            if (numerator % i == 0 && denominator % i==0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
}
