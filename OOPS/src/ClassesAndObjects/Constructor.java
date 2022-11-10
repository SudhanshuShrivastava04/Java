package ClassesAndObjects;

public class Constructor {
    public String Name;
    public final int Age;
    private static int numStudents=0;
    // static means it is same from the reference of any object
    public Constructor(String name , int age){
        Name = name;
        if (age>=18){Age = age;}
        else Age = 0;
        numStudents++;
    }
    public void print(){
        System.out.println(Name+ " : " +Age);
    }
    public int getNumStudents(){
        return numStudents;
    }
}
