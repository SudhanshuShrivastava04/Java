package ClassesAndObjects;

public class student {
    String name;
    private int roll_num;
    public int DOB;
    //roll_num is private , can't usable outside these {student}
    //DOB is public , anyone can use even outside the package
    public void setrollnumber(int rn){
        if (rn<=0){
            return;
        }
        roll_num = rn;
    }
    public int getrollnumber(){
        return roll_num;
    }
}
