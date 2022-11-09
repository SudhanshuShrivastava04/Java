package ClassesAndObjects;

public class Constructor {
    public String Name;
    public final int Age;
    // final keyword is used to set the value non-mutable further
    public Constructor(String name , int age){
        Name = name;
        if (age>=18){Age = age;}
        else Age = 0;
    }
    public void print(){
        System.out.println(Name+ " : " +Age);
    }
}
