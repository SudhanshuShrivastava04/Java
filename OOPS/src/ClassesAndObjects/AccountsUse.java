package ClassesAndObjects;

public class AccountsUse {
    public static void main(String[] args) {
        Accounts a1 = new Accounts(211230053 ,"sudhanshu" , 10000);
        a1.statement();
        a1.deposit(2000);
        a1.withdraw(12000);
        a1.statement();
        a1.withdraw(1000);
        a1.statement();
    }
}
