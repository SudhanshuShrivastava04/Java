package ClassesAndObjects;

public class Constructor {
    public String Name;
    public int Age;
    public Constructor(String name , int age){
        Name = name;
        if (age>=18){Age = age;}
        else Age = 0;
    }
    public void print(){
        System.out.println(Name+ " : " +Age);
    }
}
