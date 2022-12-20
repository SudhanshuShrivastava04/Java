package ClassesAndObjects;

public class complexNumClass {
    private int real;
    private int imaginary;

    public complexNumClass(int a , int b){
        real = a;
        imaginary = b;
    }
    public void print(){
            if (imaginary<0){
                imaginary= -imaginary;
                System.out.println(real+" - i"+imaginary);
            }
            else System.out.println(real+" + i"+imaginary);
    }
    public void setReal(int n){
        real = n;
    }
    public void setImaginary(int m){
        imaginary = m;
    }
    public int getReal(){
        return real;
    }
    public int getImaginary(){
        return imaginary;
    }
    public void add(complexNumClass c){
        real = real + c.real;
        imaginary = imaginary + c.imaginary;
    }
    public void multiply(complexNumClass c){
        real = real*c.real + imaginary*c.imaginary;
        imaginary = real*c.imaginary + imaginary*c.real;
    }
    public static complexNumClass Sum(complexNumClass c1 , complexNumClass c2){
        int newreal = c1.real + c2.real;
        int newimaginary = c1.imaginary + c2.imaginary;
        complexNumClass c = new complexNumClass(newreal,newimaginary);
        return c;
    }
    public void conjugate(){
        imaginary = -imaginary;
    }
}
