package ClassesAndObjects;

public class Accounts {
    private int Accnum;
    private String Name = null;
    private float amount =0;
    public Accounts(int Accnum , String Name , float balance){
        this.Accnum = Accnum;
        this.Name = Name;
        amount = balance;
        System.out.println("Holder's name : "+Name);
        System.out.println("Account no. : "+Accnum);
        System.out.println("Balance : "+amount);
    }
    public float deposit(float money){
        amount+=money;
        System.out.println("amount deposited : "+money);
        return amount;
    }
    public float withdraw(float money){
        if (amount<money){
            System.out.println("Insufficient balance");
        }
        else {
        amount-=money;
        System.out.println("amount deducted : "+money);
        }
        return amount;
    }
    public void statement(){
        System.out.println("balance left : "+amount);
    }

}
