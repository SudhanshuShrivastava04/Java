package ClassesAndObjects;

public class Constructor {
    public String Name;
    public final int Age;
    // final keyword is used to set the value non-mutable further
    static int numStudents=0;
    // static means its same from the refrence of any object 
    public Constructor(String name , int age){
        Name = name;
        if (age>=18){Age = age;}
        else Age = 0;
        numStudents++;
    }
    public void print(){
        System.out.println(Name+ " : " +Age);
    }
}
